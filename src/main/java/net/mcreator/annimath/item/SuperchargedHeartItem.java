
package net.mcreator.annimath.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.annimath.itemgroup.AftermathItemGroup;
import net.mcreator.annimath.AnnimathModElements;

@AnnimathModElements.ModElement.Tag
public class SuperchargedHeartItem extends AnnimathModElements.ModElement {
	@ObjectHolder("annimath:supercharged_heart")
	public static final Item block = null;
	public SuperchargedHeartItem(AnnimathModElements instance) {
		super(instance, 59);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(AftermathItemGroup.tab).maxStackSize(1).food((new Food.Builder()).hunger(10).saturation(0.3f).build()));
			setRegistryName("supercharged_heart");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 240;
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}
	}
}
