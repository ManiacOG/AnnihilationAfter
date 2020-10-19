
package net.mcreator.annimath.item;

@AnnimathModElements.ModElement.Tag
public class PewpewItem extends AnnimathModElements.ModElement {

	@ObjectHolder("annimath:pewpew")
	public static final Item block = null;

	public PewpewItem(AnnimathModElements instance) {
		super(instance, 22);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(null).maxStackSize(64));
			setRegistryName("pewpew");
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
