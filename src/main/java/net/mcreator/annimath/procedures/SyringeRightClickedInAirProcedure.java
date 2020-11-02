package net.mcreator.annimath.procedures;

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

		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).inventory.clearMatchingItems(p -> new ItemStack(SyringeItem.block, (int) (1)).getItem() == p.getItem(), (int) 1);
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(SyringeofbloodItem.block, (int) (1));
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}

	}

}
