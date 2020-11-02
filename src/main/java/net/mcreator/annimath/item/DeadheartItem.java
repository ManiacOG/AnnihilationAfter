
package net.mcreator.annimath.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.LivingEntity;

import net.mcreator.annimath.procedures.DeadheartFoodEatenProcedure;
import net.mcreator.annimath.itemgroup.AftermathItemGroup;
import net.mcreator.annimath.AnnimathModElements;

import java.util.Map;
import java.util.HashMap;

@AnnimathModElements.ModElement.Tag
public class DeadheartItem extends AnnimathModElements.ModElement {
	@ObjectHolder("annimath:deadheart")
	public static final Item block = null;
	public DeadheartItem(AnnimathModElements instance) {
		super(instance, 58);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(AftermathItemGroup.tab).maxStackSize(1).food((new Food.Builder()).hunger(0).saturation(0.3f).build()));
			setRegistryName("deadheart");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 240;
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}

		@Override
		public ItemStack onItemUseFinish(ItemStack itemStack, World world, LivingEntity entity) {
			ItemStack retval = super.onItemUseFinish(itemStack, world, entity);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				DeadheartFoodEatenProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
