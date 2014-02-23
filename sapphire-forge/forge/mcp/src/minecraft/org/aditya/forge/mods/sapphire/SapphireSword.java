package org.aditya.forge.mods.sapphire;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;

/**
 * @author Aditya Gupta
 */

public class SapphireSword extends ItemSword {
	public SapphireSword(int ItemID, EnumToolMaterial material) {
		super(ItemID, material);
		this.setCreativeTab(CreativeTabs.tabTools);
	}

	public void registerIcons(IconRegister reg) { 
		if (itemID == SapphireMod.sapphiresword.itemID) {
			this.itemIcon = reg.registerIcon(SapphireMod.modid + ":" + (this.getUnlocalizedName().substring(5)));
		}
	}
}
