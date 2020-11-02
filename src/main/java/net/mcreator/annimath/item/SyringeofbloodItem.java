
package net.mcreator.annimath.item;

@AnnimathModElements.ModElement.Tag
public class SyringeofbloodItem extends AnnimathModElements.ModElement {

	@ObjectHolder("annimath:syringeofblood")
	public static final Item block = null;

	public SyringeofbloodItem(AnnimathModElements instance) {
		super(instance, 62);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(AftermathItemGroup.tab).maxStackSize(64));
			setRegistryName("syringeofblood");
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
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Blood"));
		}

	}

}
