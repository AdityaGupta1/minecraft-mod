package org.aditya.forge.mods.sapphire;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.*;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

/**
 * @author Aditya Gupta
 */

public class Sapphire extends Item {

	public Sapphire(int par1) {
		super(par1);
		setCreativeTab(CreativeTabs.tabMaterials);
	}

	public void registerIcons(IconRegister reg) {
		if (itemID == SapphireMod.sapphire.itemID) {
			this.itemIcon = reg.registerIcon(SapphireMod.modid + ":" + (this.getUnlocalizedName().substring(5)));
		}
	}
}
