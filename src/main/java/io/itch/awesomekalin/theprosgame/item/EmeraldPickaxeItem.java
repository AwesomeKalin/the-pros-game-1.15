
package io.itch.awesomekalin.theprosgame.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import io.itch.awesomekalin.theprosgame.TheProsGameModElements;

@TheProsGameModElements.ModElement.Tag
public class EmeraldPickaxeItem extends TheProsGameModElements.ModElement {
	@ObjectHolder("the_pros_game:emerald_pickaxe")
	public static final Item block = null;
	public EmeraldPickaxeItem(TheProsGameModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1500;
			}

			public float getEfficiency() {
				return 7f;
			}

			public float getAttackDamage() {
				return 1.2f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 9;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, 0.7f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("emerald_pickaxe"));
	}
}
