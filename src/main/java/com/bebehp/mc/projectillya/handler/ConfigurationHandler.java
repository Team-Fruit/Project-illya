package com.bebehp.mc.projectillya.handler;
import java.io.File;

import com.bebehp.mc.projectillya.reference.Reference;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

public class ConfigurationHandler {
	public static final ConfigurationHandler INSTANCE = new ConfigurationHandler();
	public static final String VERSION = "1";
	public static Configuration configuration;

	public static final boolean RUBY_ENABLE_DEFAULT = true;
	public static boolean rubyEnable = RUBY_ENABLE_DEFAULT;
	public static Property propRubyEnable = null;

	public static final boolean SAPPHIRE_ENABLE_DEFAULT = true;
	public static boolean sapphireEnable = SAPPHIRE_ENABLE_DEFAULT;
	public static Property propSapphireEnable = null;

	public static final boolean PERIDOT_ENABLE_DEFAULT = true;
	public static boolean peridotEnable = PERIDOT_ENABLE_DEFAULT;
	public static Property propPeridotEnable = null;

	public static final boolean TOPAZ_ENABLE_DEFAULT = true;
	public static boolean topazEnable = TOPAZ_ENABLE_DEFAULT;
	public static Property propTopazEnable = null;

	public static void init(final File configFile) {
		if (configuration == null) {
			configuration = new Configuration(configFile, VERSION);
			loadConfiguration();
		}
	}

	public static void loadConfiguration() {
		propRubyEnable = configuration.get("ore generation", "Generate Ruby Ore",RUBY_ENABLE_DEFAULT);
		rubyEnable = propRubyEnable.getBoolean();

		propSapphireEnable = configuration.get("ore generation", "Generate Sapphire Ore",RUBY_ENABLE_DEFAULT);
		sapphireEnable = propSapphireEnable.getBoolean();

		propPeridotEnable = configuration.get("ore generation", "Generate Peridot Ore",RUBY_ENABLE_DEFAULT);
		peridotEnable = propPeridotEnable.getBoolean();

		propTopazEnable = configuration.get("ore generation", "Generate Topaz Ore",RUBY_ENABLE_DEFAULT);
		topazEnable = propTopazEnable.getBoolean();

		if (configuration.hasChanged()) {
			configuration.save();
		}
	}

	private ConfigurationHandler() {
	}

	@SubscribeEvent
	public void onConfigurationChangedEvent(final ConfigChangedEvent.OnConfigChangedEvent event) {
		if (event.modID.equalsIgnoreCase(Reference.MODID)) {
			loadConfiguration();
		}
	}
}