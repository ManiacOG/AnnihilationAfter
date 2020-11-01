
package net.mcreator.annimath.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.annimath.itemgroup.AftermathItemGroup;
import net.mcreator.annimath.AnnimathModElements;

@AnnimathModElements.ModElement.Tag
public class RubyShovelItem extends AnnimathModElements.ModElement {
	@ObjectHolder("annimath:ruby_shovel")
	public static final Item block = null;
	public RubyShovelItem(AnnimathModElements instance) {
		super(instance, 39);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(AftermathItemGroup.tab)) {
		}.setRegistryName("ruby_shovel"));
	}
}
