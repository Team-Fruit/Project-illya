package com.bebehp.mc.projectillya.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ModItems {

	public static Item gem;

	public static final String[] GEM = new String[] {
			"gemRuby", "gemSapphire", "gemPeridot", "gemTopaz"
	};

	public static void init() {

		gem = new ItemGem();
		GameRegistry.registerItem(gem, "gem");

		for (int i = 0; i < 4; i++)
			OreDictionary.registerOre(GEM[i],  new ItemStack(gem, 1, i));
	}
}
