package com.bebehp.mc.projectillya.proxy;

import com.bebehp.mc.projectillya.client.ModCreativeTab;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;

public class ClientProxy extends CommonProxy {

	public static CreativeTabs tabIllya = new ModCreativeTab("Project-illyatab");

	@Override
	public void preInit(final FMLPreInitializationEvent event) {
		super.preInit(event);
	}
	@Override
	public void init (final FMLInitializationEvent event) {
		super.init(event);
	}

	@Override
	public void postInit(final FMLPostInitializationEvent event) {
		super.postInit(event);
	}
}
