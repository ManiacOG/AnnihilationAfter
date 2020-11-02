
package net.mcreator.annimath.item;

@AnnimathModElements.ModElement.Tag
public class ObsidianSwordItem extends AnnimathModElements.ModElement {

	@ObjectHolder("annimath:obsidian_sword")
	public static final Item block = null;

	public ObsidianSwordItem(AnnimathModElements instance) {
		super(instance, 84);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
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
		}, 3, -3f, new Item.Properties().group(ItemGroup.COMBAT)) {

		}.setRegistryName("obsidian_sword"));
	}

}
