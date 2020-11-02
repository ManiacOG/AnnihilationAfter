package net.mcreator.annimath.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.util.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.annimath.item.SyringeofbloodItem;
import net.mcreator.annimath.item.SyringeItem;
import net.mcreator.annimath.AnnimathModElements;

import java.util.Map;

@AnnimathModElements.ModElement.Tag
public class SyringeRightClickedInAirProcedure extends AnnimathModElements.ModElement {
	public SyringeRightClickedInAirProcedure(AnnimathModElements instance) {
		super(instance, 62);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure SyringeRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.CACTUS, (float) 2);
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(SyringeofbloodItem.block, (int) (1));
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).inventory.clearMatchingItems(p -> new ItemStack(SyringeItem.block, (int) (1)).getItem() == p.getItem(), (int) 1);
	}
}
