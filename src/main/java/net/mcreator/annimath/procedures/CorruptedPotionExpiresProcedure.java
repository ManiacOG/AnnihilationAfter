package net.mcreator.annimath.procedures;

@AnnimathModElements.ModElement.Tag
public class CorruptedPotionExpiresProcedure extends AnnimathModElements.ModElement {

	public CorruptedPotionExpiresProcedure(AnnimathModElements instance) {
		super(instance, 4);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure CorruptedPotionExpires!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof PlayerEntity && !entity.world.isRemote) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("You have survived the corruption."), (false));
		}

	}

}
