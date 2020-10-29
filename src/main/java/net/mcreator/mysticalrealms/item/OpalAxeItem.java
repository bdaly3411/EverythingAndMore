
package net.mcreator.mysticalrealms.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.mysticalrealms.MysticalrealmsModElements;

@MysticalrealmsModElements.ModElement.Tag
public class OpalAxeItem extends MysticalrealmsModElements.ModElement {
	@ObjectHolder("mysticalrealms:opal_axe")
	public static final Item block = null;
	public OpalAxeItem(MysticalrealmsModElements instance) {
		super(instance, 95);
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
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("opal_axe"));
	}
}
