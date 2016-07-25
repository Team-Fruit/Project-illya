package com.bebehp.mc.projectillya.reference;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Reference {
	public static final String MODID = "Projectillya";
	public static final String NAME = "Projectillya";
	public static final String VERSION = "${version}";
	public static final String FORGE = "${forgeversion}";
	public static final String MINECRAFT = "${mcversion}";
	public static final String PROXY_CLIENT = "com.bebehp.mc.projectillya.proxy.ClientProxy";

	public static Logger logger = LogManager.getLogger(Reference.MODID);
}
