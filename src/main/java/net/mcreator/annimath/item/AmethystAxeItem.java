
package net.mcreator.annimath.item;

@AnnimathModElements.ModElement.Tag
public class AmethystAxeItem extends AnnimathModElements.ModElement {

	@ObjectHolder("annimath:amethyst_axe")
	public static final Item block = null;

	public AmethystAxeItem(AnnimathModElements instance) {
		super(instance, 68);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 2380;
			}

			public float getEfficiency() {
				return 16f;
			}

			public float getAttackDamage() {
				return 28f;
			}

			public int getHarvestLevel() {
				return 10;
			}

			public int getEnchantability() {
				return 70;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(AftermathItemGroup.tab)) {

		}.setRegistryName("amethyst_axe"));
	}

}
