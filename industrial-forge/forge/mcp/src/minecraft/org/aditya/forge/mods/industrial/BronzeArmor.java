package org.aditya.forge.mods.industrial;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import org.aditya.forge.mods.industrial.IndustrialMod;;

/**
 * @author Aditya Gupta
 */

public class BronzeArmor extends ItemArmor {
	public BronzeArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
		this.setCreativeTab(CreativeTabs.tabIndustrial);
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer) {
		if (stack.itemID == IndustrialMod.bronzehelmet.itemID
				|| stack.itemID == IndustrialMod.bronzechestplate.itemID
				|| stack.itemID == IndustrialMod.bronzeboots.itemID) {
			return "IndustrialMod:textures/armor/BronzeArmor_1.png";
		}
		if (stack.itemID == IndustrialMod.bronzeleggings.itemID) {
			return "IndustrialMod:textures/armor/BronzeArmor_2.png";
		} else {
			return null;
		}
	}

	public void registerIcons(IconRegister reg) {
		if (itemID == IndustrialMod.bronzechestplate.itemID) {
			this.itemIcon = reg.registerIcon(IndustrialMod.modid + ":" + (this.getUnlocalizedName().substring(5)));
		}

		if (itemID == IndustrialMod.bronzeleggings.itemID) {
			this.itemIcon = reg.registerIcon(IndustrialMod.modid + ":" + (this.getUnlocalizedName().substring(5)));
		}

		if (itemID == IndustrialMod.bronzeboots.itemID) {
			this.itemIcon = reg.registerIcon(IndustrialMod.modid + ":" + (this.getUnlocalizedName().substring(5)));
		}

		if (itemID == IndustrialMod.bronzehelmet.itemID) {
			this.itemIcon = reg.registerIcon(IndustrialMod.modid + ":" + (this.getUnlocalizedName().substring(5)));
		}
	}
}
