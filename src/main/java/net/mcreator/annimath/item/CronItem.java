
package net.mcreator.annimath.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.annimath.itemgroup.AftermathItemGroup;
import net.mcreator.annimath.AnnimathModElements;

@AnnimathModElements.ModElement.Tag
public class CronItem extends AnnimathModElements.ModElement {
	@ObjectHolder("annimath:cron")
	public static final Item block = null;
	public CronItem(AnnimathModElements instance) {
		super(instance, 34);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(AftermathItemGroup.tab).maxStackSize(24).food((new Food.Builder()).hunger(3).saturation(0.3f).build()));
			setRegistryName("cron");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 60;
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}
	}
}
