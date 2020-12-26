
package io.itch.awesomekalin.theprosgame.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import io.itch.awesomekalin.theprosgame.TheProsGameModElements;

@TheProsGameModElements.ModElement.Tag
public class GlowstoneAxeItem extends TheProsGameModElements.ModElement {
	@ObjectHolder("the_pros_game:glowstone_axe")
	public static final Item block = null;
	public GlowstoneAxeItem(TheProsGameModElements instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1000;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return -1f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 13;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, 2f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("glowstone_axe"));
	}
}
