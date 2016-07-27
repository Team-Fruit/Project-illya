package com.bebehp.mc.projectillya.proxy;

import com.bebehp.mc.projectillya.block.ModBlocks;
import com.bebehp.mc.projectillya.block.ModOreGenerator;
import com.bebehp.mc.projectillya.handler.ConfigurationHandler;
import com.bebehp.mc.projectillya.item.ModItems;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.event.FMLServerStoppingEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {

	public void preInit(final FMLPreInitializationEvent event) {
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());

		ModBlocks.init();
		ModItems.init();
	}

	public void init(final FMLInitializationEvent event) {
		GameRegistry.registerWorldGenerator(new ModOreGenerator(), 1);

	}

	public void postInit(final FMLPostInitializationEvent event) {

	}

	public void serverStarting(final FMLServerStartingEvent event) {

	}

	public void serverStopping(final FMLServerStoppingEvent event) {

	}

}
