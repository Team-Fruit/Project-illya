package com.bebehp.mc.projectillya.block;

import java.util.List;
import java.util.Random;

import com.bebehp.mc.projectillya.item.ModItems;
import com.bebehp.mc.projectillya.proxy.ClientProxy;
import com.bebehp.mc.projectillya.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;

public class BlockModOre extends Block {

	private final IIcon[] iicon = new IIcon[4];
	private final Random random = new Random();

	protected BlockModOre() {
		super(Material.rock);
		setCreativeTab(ClientProxy.tabIllya);
		setHardness(2.0F);
		setHarvestLevel("pickaxe", 2);
		setStepSound(soundTypeStone);
		setBlockName("ore");
		setBlockTextureName(Reference.MODID + "Ore");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(final IIconRegister register) {
		for (int i = 0; i < 4; i ++)
			this.iicon[i] = register.registerIcon(getTextureName() + i);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(final int side, final int meta) {
		return this.iicon[meta & 3];
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(final Item item, final CreativeTabs creativeTab, final List list) {
		for (int i = 0; i < 4; i ++)
			list.add(new ItemStack(item, 1, i));
	}

	@Override
	public Item getItemDropped(final int meta, final Random random, final int fortune) {
		return ModItems.gem;
	}

	@Override
	public int damageDropped(final int meta) {
		return meta;

	}

	@Override
	public int quantityDroppedWithBonus(final int fortune, final Random random) {
		if (fortune > 0 && Item.getItemFromBlock(this) != getItemDropped(0, random, fortune)) {
			int i = random.nextInt(fortune+2)-1;
			if (i < 0)
				i = 0;
			return this.quantityDropped(random)*(i+1);
		} else {
			return this.quantityDropped(random);
		}
	}

	@Override
	public int getExpDrop(final IBlockAccess iBlockAccess, final int meta, final int fortune) {
		return MathHelper.getRandomIntegerInRange(this.random, 3, 10);
	}
}
