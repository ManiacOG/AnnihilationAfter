
package net.mcreator.annimath.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.annimath.item.ObsidianarmorItem;
import net.mcreator.annimath.AnnimathModElements;

@AnnimathModElements.ModElement.Tag
public class AftermathItemGroup extends AnnimathModElements.ModElement {
	public AftermathItemGroup(AnnimathModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabaftermath") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(ObsidianarmorItem.helmet, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
