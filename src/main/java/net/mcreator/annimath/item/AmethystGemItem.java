
package net.mcreator.annimath.item;

@AnnimathModElements.ModElement.Tag
public class AmethystGemItem extends AnnimathModElements.ModElement {

	@ObjectHolder("annimath:amethyst_gem")
	public static final Item block = null;

	public AmethystGemItem(AnnimathModElements instance) {
		super(instance, 61);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(AftermathItemGroup.tab).maxStackSize(64));
			setRegistryName("amethyst_gem");
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
