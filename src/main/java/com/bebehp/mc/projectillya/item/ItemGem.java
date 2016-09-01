package com.bebehp.mc.projectillya.item;

import java.util.List;

import com.bebehp.mc.projectillya.proxy.ClientProxy;
import com.bebehp.mc.projectillya.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class ItemGem extends Item{

	private final IIcon[] iicon = new IIcon[4];

	public ItemGem() {
		super();
		setCreativeTab(ClientProxy.tabIllya);
		setHasSubtypes(true);
		setMaxDamage(0);
		setUnlocalizedName("gem");
		setTextureName(Reference.MODID + "Gem");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(final IIconRegister iicon) {
		for (int i = 0; i < 4; i ++)
			this.iicon[i] = iicon.registerIcon(getIconString() + "." + i);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIconFromDamage(final int meta) {
		return this.iicon[meta];
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(final Item item, final CreativeTabs creativeTab, final List list) {
		for (int i = 0; i < 4; i ++)
			list.add(new ItemStack(this, 1, i));
	}

	@Override
	public int getMetadata(final int meta) {
		return meta;
	}

	@Override
	public String getUnlocalizedName(final ItemStack itemStack) {
		return this.getUnlocalizedName() + "." + itemStack.getItemDamage();
	}
}
