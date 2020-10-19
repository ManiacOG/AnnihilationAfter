
package net.mcreator.annimath.item;

@AnnimathModElements.ModElement.Tag
public class EnergyCapsuleItem extends AnnimathModElements.ModElement {

	@ObjectHolder("annimath:energy_capsule")
	public static final Item block = null;

	public EnergyCapsuleItem(AnnimathModElements instance) {
		super(instance, 21);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(4));
			setRegistryName("energy_capsule");
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

	}

}
