package com.bebehp.mc.projectillya.client;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class ModCreativeTab extends CreativeTabs {

	public ModCreativeTab(final String lable) {
		super(lable);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		return Items.lava_bucket;
	}
}
