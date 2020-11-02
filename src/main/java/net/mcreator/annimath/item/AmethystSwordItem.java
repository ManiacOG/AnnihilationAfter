
package net.mcreator.annimath.item;

@AnnimathModElements.ModElement.Tag
public class AmethystSwordItem extends AnnimathModElements.ModElement {

	@ObjectHolder("annimath:amethyst_sword")
	public static final Item block = null;

	public AmethystSwordItem(AnnimathModElements instance) {
		super(instance, 69);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
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
		}, 3, -3f, new Item.Properties().group(AftermathItemGroup.tab)) {

		}.setRegistryName("amethyst_sword"));
	}

}
