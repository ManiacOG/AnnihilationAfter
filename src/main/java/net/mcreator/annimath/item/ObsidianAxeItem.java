
package net.mcreator.annimath.item;

@AnnimathModElements.ModElement.Tag
public class ObsidianAxeItem extends AnnimathModElements.ModElement {

	@ObjectHolder("annimath:obsidian_axe")
	public static final Item block = null;

	public ObsidianAxeItem(AnnimathModElements instance) {
		super(instance, 83);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
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
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {

		}.setRegistryName("obsidian_axe"));
	}

}