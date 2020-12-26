
package io.itch.awesomekalin.theprosgame.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import io.itch.awesomekalin.theprosgame.TheProsGameModElements;

@TheProsGameModElements.ModElement.Tag
public class ObsidianAxeItem extends TheProsGameModElements.ModElement {
	@ObjectHolder("the_pros_game:obsidian_axe")
	public static final Item block = null;
	public ObsidianAxeItem(TheProsGameModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 2000;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 7;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -0.5f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("obsidian_axe"));
	}
}
