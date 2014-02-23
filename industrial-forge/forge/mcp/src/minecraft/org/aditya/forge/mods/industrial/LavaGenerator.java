package org.aditya.forge.mods.industrial;

import java.util.Random;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class LavaGenerator extends Block{
	public LavaGenerator(int par1, String texture) {
		super(par1, Material.iron);
		setCreativeTab(CreativeTabs.tabIndustrial);
	}

	public int idDropped(int par1, Random par2Random, int par3) {
		return IndustrialMod.lavagenerator.blockID;
	}

	public int quantityDropped(Random random) {
		return 1;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister reg) {
		this.blockIcon = reg.registerIcon(IndustrialMod.modid + ":" + (this.getUnlocalizedName().substring(5)));
	}

	/**
     * Called upon block activation (right click on the block.)
     */
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {
        if (par5EntityPlayer.getCurrentEquippedItem() != null && par5EntityPlayer.getCurrentEquippedItem().itemID == Item.flintAndSteel.itemID)
        {
            par1World.setBlock(par2, par3 + 1, par4, Block.lavaStill.blockID);
            par5EntityPlayer.getCurrentEquippedItem().damageItem(1, par5EntityPlayer);
            return true;
        }
        else
        {
            return super.onBlockActivated(par1World, par2, par3, par4, par5EntityPlayer, par6, par7, par8, par9);
        }
    }
}
