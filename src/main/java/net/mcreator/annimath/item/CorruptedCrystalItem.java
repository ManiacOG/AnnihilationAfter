
package net.mcreator.annimath.item;

@AnnimathModElements.ModElement.Tag
public class CorruptedCrystalItem extends AnnimathModElements.ModElement {

	@ObjectHolder("annimath:corrupted_crystal")
	public static final Item block = null;

	public CorruptedCrystalItem(AnnimathModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(AftermathItemGroup.tab).maxDamage(1));
			setRegistryName("corrupted_crystal");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public boolean hitEntity(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
			boolean retval = super.hitEntity(itemstack, entity, sourceentity);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			World world = entity.world;
			{
				Map<String, Object> $_dependencies = new HashMap<>();

				$_dependencies.put("entity", entity);

				CorruptedCrystalRightClickedInAirProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}

	}

}
