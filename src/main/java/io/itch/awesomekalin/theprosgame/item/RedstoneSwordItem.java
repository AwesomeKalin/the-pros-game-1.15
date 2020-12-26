
package io.itch.awesomekalin.theprosgame.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import io.itch.awesomekalin.theprosgame.TheProsGameModElements;

@TheProsGameModElements.ModElement.Tag
public class RedstoneSwordItem extends TheProsGameModElements.ModElement {
	@ObjectHolder("the_pros_game:redstone_sword")
	public static final Item block = null;
	public RedstoneSwordItem(TheProsGameModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 1700;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 3f;
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
		}, 3, -2.9f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("redstone_sword"));
	}
}
