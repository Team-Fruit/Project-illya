package com.bebehp.mc.projectillya;

import com.bebehp.mc.projectillya.proxy.CommonProxy;
import com.bebehp.mc.projectillya.reference.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.event.FMLServerStoppingEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Projectillya {

	@Instance(Reference.MODID)
	public static Projectillya instance;

	@SidedProxy(serverSide = Reference.PROXY_SERVER, clientSide = Reference.PROXY_CLIENT)
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(final FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}

	@EventHandler
	public void init(final FMLInitializationEvent event) {
		proxy.init(event);
	}

	@EventHandler
	public void postInit(final FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}

	@EventHandler
	public void serverStarting(final FMLServerStartingEvent event) {
		proxy.serverStarting(event);
	}

	@EventHandler
	public void serverStopping(final FMLServerStoppingEvent event) {
		proxy.serverStopping(event);
	}
}
