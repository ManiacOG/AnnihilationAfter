
package net.mcreator.annimath.item;

@AnnimathModElements.ModElement.Tag
public class AmethystPickaxeItem extends AnnimathModElements.ModElement {

	@ObjectHolder("annimath:amethyst_pickaxe")
	public static final Item block = null;

	public AmethystPickaxeItem(AnnimathModElements instance) {
		super(instance, 67);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
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
		}, 1, -1f, new Item.Properties().group(AftermathItemGroup.tab)) {

			@Override
			@OnlyIn(Dist.CLIENT)
			public boolean hasEffect(ItemStack itemstack) {
				return true;
			}

		}.setRegistryName("amethyst_pickaxe"));
	}

}
