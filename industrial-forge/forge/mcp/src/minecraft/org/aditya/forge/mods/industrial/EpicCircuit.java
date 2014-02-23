package org.aditya.forge.mods.industrial;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.*;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

/**
 * @author Aditya Gupta
 */

public class EpicCircuit extends Item {

	public EpicCircuit(int par1) {
		super(par1);
		setCreativeTab(CreativeTabs.tabRedstone);
	}

	public void registerIcons(IconRegister reg) {
		if (itemID == IndustrialMod.epiccircuit.itemID) {
			this.itemIcon = reg.registerIcon(IndustrialMod.modid + ":" + (this.getUnlocalizedName().substring(5)));
		}
	}
}
