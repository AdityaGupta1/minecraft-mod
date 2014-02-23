package org.aditya.forge.mods.sapphire;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

/**
 * @author Aditya Gupta
 */

public class SapphireArmor extends ItemArmor {
	public SapphireArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
		this.setCreativeTab(CreativeTabs.tabCombat);
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer) {
		if (stack.itemID == SapphireMod.sapphirehelmet.itemID
				|| stack.itemID == SapphireMod.sapphirechestplate.itemID
				|| stack.itemID == SapphireMod.sapphireboots.itemID) {
			return "SapphireMod:textures/armor/SapphireArmor_1.png";
		}
		if (stack.itemID == SapphireMod.sapphireleggings.itemID) {
			return "SapphireMod:textures/armor/SapphireArmor_2.png";
		} else {
			return null;
		}
	}

	public void registerIcons(IconRegister reg) { // Make sure to import
													// IconRegister!
		if (itemID == SapphireMod.sapphirechestplate.itemID) {
			this.itemIcon = reg.registerIcon(SapphireMod.modid + ":" + (this.getUnlocalizedName().substring(5)));
		}

		if (itemID == SapphireMod.sapphireleggings.itemID) {
			this.itemIcon = reg.registerIcon(SapphireMod.modid + ":" + (this.getUnlocalizedName().substring(5)));
		}

		if (itemID == SapphireMod.sapphireboots.itemID) {
			this.itemIcon = reg.registerIcon(SapphireMod.modid + ":" + (this.getUnlocalizedName().substring(5)));
		}

		if (itemID == SapphireMod.sapphirehelmet.itemID) {
			this.itemIcon = reg.registerIcon(SapphireMod.modid + ":" + (this.getUnlocalizedName().substring(5)));
		}
	}
}
