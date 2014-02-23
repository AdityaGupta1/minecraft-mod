package org.aditya.forge.mods.industrial;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.*;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;

/**
 * @author Aditya Gupta
 */

public class RocketLauncher extends Item {

	public RocketLauncher(int par1) {
		super(par1);
		setCreativeTab(CreativeTabs.tabTools);
		setMaxStackSize(1);
	}

	public void registerIcons(IconRegister reg) {
		if (itemID == IndustrialMod.rocketlauncher.itemID) {
			this.itemIcon = reg.registerIcon(IndustrialMod.modid + ":" + (this.getUnlocalizedName().substring(5)));
		}
	}
	
	/**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        if (!par2World.isRemote)
        {
            par2World.spawnEntityInWorld(new EntityRocket(par2World, par3EntityPlayer));
            EntityRocket.type = 1;
        }

        return par1ItemStack;
    }
}
