
package net.mcreator.annimath.item;

@AnnimathModElements.ModElement.Tag
public class ObsidianHoeItem extends AnnimathModElements.ModElement {

	@ObjectHolder("annimath:obsidian_hoe")
	public static final Item block = null;

	public ObsidianHoeItem(AnnimathModElements instance) {
		super(instance, 86);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 1164;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 4f;
			}

			public int getHarvestLevel() {
				return 6;
			}

			public int getEnchantability() {
				return 42;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {

		}.setRegistryName("obsidian_hoe"));
	}

}
