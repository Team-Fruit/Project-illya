package com.bebehp.mc.projectillya.proxy;

import com.bebehp.mc.projectillya.handler.ConfigurationHandler;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.event.FMLServerStoppingEvent;

public class CommonProxy {

	public void preInit(final FMLPreInitializationEvent event) {
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
	}

	public void init(final FMLInitializationEvent event) {

	}

	public void postInit(final FMLPostInitializationEvent event) {

	}

	public void serverStarting(final FMLServerStartingEvent event) {

	}

	public void serverStopping(final FMLServerStoppingEvent event) {

	}

}
