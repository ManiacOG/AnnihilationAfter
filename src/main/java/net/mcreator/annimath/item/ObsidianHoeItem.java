
package net.mcreator.annimath.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.annimath.AnnimathModElements;

@AnnimathModElements.ModElement.Tag
public class ObsidianHoeItem extends AnnimathModElements.ModElement {
	@ObjectHolder("annimath:obsidian_hoe")
	public static final Item block = null;
	public ObsidianHoeItem(AnnimathModElements instance) {
		super(instance, 86);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 1164;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 4f;
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
		}, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("obsidian_hoe"));
	}
}
