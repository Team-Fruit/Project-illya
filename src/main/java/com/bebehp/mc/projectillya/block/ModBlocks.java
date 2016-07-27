package com.bebehp.mc.projectillya.block;

import com.bebehp.mc.projectillya.item.block.ItemOre;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ModBlocks {

	public static Block ore;

	public static final String[] ORE = new String[] {
			"oreRuby", "oreSapphire", "orePeridot", "oreTopaz"
	};

	public static void init() {

		ore = new BlockModOre();
		GameRegistry.registerBlock(ore, ItemOre.class, "ore");

		for (int i = 0; i < 4; i++)
			OreDictionary.registerOre(ORE[i], new ItemStack(ore, 1, i));
	}
}
