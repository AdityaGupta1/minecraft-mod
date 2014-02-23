package org.aditya.forge.mods.industrial;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.*;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

/**
 * @author Aditya Gupta
 */

public class EnergeticShard extends Item {

	public EnergeticShard(int par1) {
		super(par1);
		setCreativeTab(CreativeTabs.tabMaterials);
	}

	public void registerIcons(IconRegister reg) {
		if (itemID == IndustrialMod.energeticshard.itemID) {
			this.itemIcon = reg.registerIcon(IndustrialMod.modid + ":" + (this.getUnlocalizedName().substring(5)));
		}
	}
}
