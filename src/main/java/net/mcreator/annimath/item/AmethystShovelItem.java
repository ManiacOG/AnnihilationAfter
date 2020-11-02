
package net.mcreator.annimath.item;

@AnnimathModElements.ModElement.Tag
public class AmethystShovelItem extends AnnimathModElements.ModElement {

	@ObjectHolder("annimath:amethyst_shovel")
	public static final Item block = null;

	public AmethystShovelItem(AnnimathModElements instance) {
		super(instance, 70);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 2380;
			}

			public float getEfficiency() {
				return 16f;
			}

			public float getAttackDamage() {
				return 8f;
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

		}.setRegistryName("amethyst_shovel"));
	}

}
