package com.bebehp.mc.projectillya.block;

import java.util.Random;

import com.bebehp.mc.projectillya.handler.ConfigurationHandler;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class ModOreGenerator implements IWorldGenerator{

	@Override
	public void generate(final Random random, final int chunkX, final int chunkZ, final World world, final IChunkProvider chunkGenerator,final IChunkProvider chunkProvider) {
		if (world.provider.dimensionId == 0) {
			if (ConfigurationHandler.rubyEnable)
				generateOreRuby(world, random, chunkX*16, chunkZ*16);
			if (ConfigurationHandler.sapphireEnable)
				generateOreSapphire(world, random, chunkX*16, chunkZ*16);
			if (ConfigurationHandler.peridotEnable)
				generateOrePeridot(world, random, chunkX*16, chunkZ*16);
			if (ConfigurationHandler.topazEnable)
				generateOreTopaz(world, random, chunkX*16, chunkZ*16);
		}
	}

	private void generateOreRuby(final World world, final Random random, final int x, final int z) {
		for (int i = 0; i < 5; i++) {
			final int rubyX = x + random.nextInt(16);
			final int rubyY = random.nextInt(20);
			final int rubyZ = z + random.nextInt(16);
			new WorldGenMinable(ModBlocks.ore, 0, 3, Blocks.stone).generate(world, random, rubyX, rubyY, rubyZ);
		}
	}

	private void generateOreSapphire(final World world, final Random random, final int x, final int z) {
		for (int i = 0; i < 5; i++) {
			final int sapphireX = x + random.nextInt(16);
			final int sapphireY = random.nextInt(20);
			final int sapphireZ = z + random.nextInt(16);
			new WorldGenMinable(ModBlocks.ore, 1, 3, Blocks.stone).generate(world, random, sapphireX, sapphireY, sapphireZ);
		}
	}

	private void generateOrePeridot(final World world, final Random random, final int x, final int z) {
		for (int i = 0; i < 10; i++) {
			final int peridotX = x + random.nextInt(16);
			final int peridotY = random.nextInt(32);
			final int peridotZ = z + random.nextInt(16);
			new WorldGenMinable(ModBlocks.ore, 2, 3, Blocks.stone).generate(world, random, peridotX, peridotY, peridotZ);
		}
	}

	private void generateOreTopaz(final World world, final Random random, final int x, final int z) {
		for (int i = 0; i < 10; i++) {
			final int topazX = x + random.nextInt(16);
			final int topazY = random.nextInt(32);
			final int topazZ = z + random.nextInt(16);
			new WorldGenMinable(ModBlocks.ore, 3, 3, Blocks.stone).generate(world, random, topazX, topazY, topazZ);
		}
	}

}
