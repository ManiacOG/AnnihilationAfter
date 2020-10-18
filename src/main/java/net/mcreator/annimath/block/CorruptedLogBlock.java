
package net.mcreator.annimath.block;

import net.minecraft.block.material.Material;

@AnnimathModElements.ModElement.Tag
public class CorruptedLogBlock extends AnnimathModElements.ModElement {

	@ObjectHolder("annimath:corrupted_log")
	public static final Block block = null;

	public CorruptedLogBlock(AnnimathModElements instance) {
		super(instance, 3);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(AftermathItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(

					Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(3f, 10f).lightValue(0).harvestLevel(3)
							.harvestTool(ToolType.AXE));

			setRegistryName("corrupted_log");
		}

		@Override
		public ItemStack getPickBlock(BlockState state, RayTraceResult target, IBlockReader world, BlockPos pos, PlayerEntity player) {
			return new ItemStack(CorruptedCrystalItem.block, (int) (1));
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(CorruptedCrystalItem.block, (int) (1)));
		}

	}

}
