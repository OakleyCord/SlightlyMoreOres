
package net.mcreator.slightlymoreores.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.slightlymoreores.init.SlightlymoreoresModItems;

public class RubyhoeItem extends HoeItem {
	public RubyhoeItem() {
		super(new Tier() {
			public int getUses() {
				return 2032;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return -1f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 13;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(SlightlymoreoresModItems.RUBY.get()));
			}
		}, 0, -4E-16f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).fireResistant());
	}
}
