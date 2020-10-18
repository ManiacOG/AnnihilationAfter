
package net.mcreator.annimath.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.annimath.itemgroup.AftermathItemGroup;
import net.mcreator.annimath.item.CorruptedCrystalItem;
import net.mcreator.annimath.AnnimathModElements;

import java.util.List;
import java.util.Collections;

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
			super(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(3f, 10f).lightValue(0).harvestLevel(3)
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
