
package net.mcreator.annimath.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.annimath.itemgroup.AftermathItemGroup;
import net.mcreator.annimath.AnnimathModElements;

@AnnimathModElements.ModElement.Tag
public class AmethystHoeItem extends AnnimathModElements.ModElement {
	@ObjectHolder("annimath:amethyst_hoe")
	public static final Item block = null;
	public AmethystHoeItem(AnnimathModElements instance) {
		super(instance, 71);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 2380;
			}

			public float getEfficiency() {
				return 16f;
			}

			public float getAttackDamage() {
				return 8f;
			}

			public int getHarvestLevel() {
				return 10;
			}

			public int getEnchantability() {
				return 70;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, -3f, new Item.Properties().group(AftermathItemGroup.tab)) {
		}.setRegistryName("amethyst_hoe"));
	}
}
