
package net.mcreator.annimath.block;

import net.minecraft.block.material.Material;

@AnnimathModElements.ModElement.Tag
public class DeadgrassBlock extends AnnimathModElements.ModElement {

	@ObjectHolder("annimath:deadgrass")
	public static final Block block = null;

	public DeadgrassBlock(AnnimathModElements instance) {
		super(instance, 2);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(AftermathItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(

					Block.Properties.create(Material.ORGANIC).sound(SoundType.GROUND).hardnessAndResistance(1f, 10f).lightValue(0).harvestLevel(0)
							.harvestTool(ToolType.SHOVEL));

			setRegistryName("deadgrass");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

	}

}
