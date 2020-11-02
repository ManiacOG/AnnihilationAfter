
package net.mcreator.annimath.item;

@AnnimathModElements.ModElement.Tag
public class ObsidianPickaxeItem extends AnnimathModElements.ModElement {

	@ObjectHolder("annimath:obsidian_pickaxe")
	public static final Item block = null;

	public ObsidianPickaxeItem(AnnimathModElements instance) {
		super(instance, 82);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
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

		}.setRegistryName("obsidian_pickaxe"));
	}

}
