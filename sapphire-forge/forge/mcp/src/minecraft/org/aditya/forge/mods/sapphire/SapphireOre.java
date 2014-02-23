package org.aditya.forge.mods.sapphire;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * @author Aditya Gupta
 */

public class SapphireOre extends Block{
	public SapphireOre(int par1, String texture) {
		super(par1, Material.rock);
		setCreativeTab(CreativeTabs.tabBlock);
	}

	public int idDropped(int par1, Random par2Random, int par3) {
		return SapphireMod.sapphire.itemID;
	}

	public int quantityDropped(Random random) {
		return 1;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister reg) {
		this.blockIcon = reg.registerIcon(SapphireMod.modid + ":" + (this.getUnlocalizedName().substring(5)));
	}

}
