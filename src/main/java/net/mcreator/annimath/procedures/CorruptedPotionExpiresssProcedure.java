package net.mcreator.annimath.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.annimath.item.InfectedTouchItem;
import net.mcreator.annimath.AnnimathModElements;

import java.util.Map;

@AnnimathModElements.ModElement.Tag
public class CorruptedPotionExpiresssProcedure extends AnnimathModElements.ModElement {
	public CorruptedPotionExpiresssProcedure(AnnimathModElements instance) {
		super(instance, 19);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure CorruptedPotionExpiresss!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).inventory.clearMatchingItems(p -> new ItemStack(InfectedTouchItem.block, (int) (1)).getItem() == p.getItem(),
					(int) 1);
	}
}
