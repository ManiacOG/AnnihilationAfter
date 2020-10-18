package net.mcreator.annimath.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.annimath.potion.CorruptedPotion;
import net.mcreator.annimath.AnnimathModElements;

import java.util.Map;

@AnnimathModElements.ModElement.Tag
public class RadioactiveObsidianEntityWalksOnTheBlockProcedure extends AnnimathModElements.ModElement {
	public RadioactiveObsidianEntityWalksOnTheBlockProcedure(AnnimathModElements instance) {
		super(instance, 16);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure RadioactiveObsidianEntityWalksOnTheBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(CorruptedPotion.potion, (int) 60, (int) 1, (false), (false)));
	}
}
