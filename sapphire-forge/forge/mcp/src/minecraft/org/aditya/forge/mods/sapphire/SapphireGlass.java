package org.aditya.forge.mods.sapphire;

import java.util.Random;

import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

/**
 * @author Aditya Gupta
 */

public class SapphireGlass extends Block {

	public SapphireGlass(int par1, String texture) {
		super(par1, Material.glass);
		setCreativeTab(CreativeTabs.tabBlock);
	}

	public boolean isOpaqueCube() {
		return false;
	}

	public boolean renderAsNormalBlock() {
		return false;
	}

	public int getRenderType() {
		return 0;
	}

	public int getRenderBlockPass() {
		return 0;
	}

	protected boolean canSilkHarvest() {
		return true;
	}

	public int idDropped(int par1, Random par2Random, int par3) {
		return SapphireMod.sapphireglass.blockID;
	}

	public int quantityDropped(Random random) {
		return 0;
	}

	public void registerIcons(IconRegister reg) {
		this.blockIcon = reg.registerIcon(SapphireMod.modid + ":" + (this.getUnlocalizedName().substring(5)));
	}
}
