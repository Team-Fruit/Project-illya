package com.bebehp.mc.projectillya.item.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class ItemOre extends ItemBlockWithMetadata {

	public ItemOre(final Block block) {
		super(block, block);
	}

	@Override
	public String getUnlocalizedName(final ItemStack itemStack) {
		return this.getUnlocalizedName() + "." + itemStack.getItemDamage();
	}
}
