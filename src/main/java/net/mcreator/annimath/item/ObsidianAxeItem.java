
package net.mcreator.annimath.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.annimath.AnnimathModElements;

@AnnimathModElements.ModElement.Tag
public class ObsidianAxeItem extends AnnimathModElements.ModElement {
	@ObjectHolder("annimath:obsidian_axe")
	public static final Item block = null;
	public ObsidianAxeItem(AnnimathModElements instance) {
		super(instance, 83);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1164;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 7.5f;
			}

			public int getHarvestLevel() {
				return 6;
			}

			public int getEnchantability() {
				return 42;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -2.5f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("obsidian_axe"));
	}
}
