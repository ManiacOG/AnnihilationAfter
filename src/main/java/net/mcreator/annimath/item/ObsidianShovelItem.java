
package net.mcreator.annimath.item;

@AnnimathModElements.ModElement.Tag
public class ObsidianShovelItem extends AnnimathModElements.ModElement {

	@ObjectHolder("annimath:obsidian_shovel")
	public static final Item block = null;

	public ObsidianShovelItem(AnnimathModElements instance) {
		super(instance, 85);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
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

		}.setRegistryName("obsidian_shovel"));
	}

}
