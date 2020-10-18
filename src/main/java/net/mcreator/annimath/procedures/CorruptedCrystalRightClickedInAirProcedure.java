package net.mcreator.annimath.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.annimath.potion.CorruptedPotion;
import net.mcreator.annimath.AnnimathModElements;

import java.util.Map;

@AnnimathModElements.ModElement.Tag
public class CorruptedCrystalRightClickedInAirProcedure extends AnnimathModElements.ModElement {
	public CorruptedCrystalRightClickedInAirProcedure(AnnimathModElements instance) {
		super(instance, 3);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure CorruptedCrystalRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(CorruptedPotion.potion, (int) 600, (int) 1));
	}
}
