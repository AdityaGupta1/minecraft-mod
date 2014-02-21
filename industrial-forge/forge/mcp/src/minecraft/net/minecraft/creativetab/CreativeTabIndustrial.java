package net.minecraft.creativetab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

final class CreativeTabIndustrial extends CreativeTabs {
	CreativeTabIndustrial(int par1, String par2Str) 
	{	
		super(par1, par2Str);
	}

	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex() {
		return 3361;
	}

	public String getTranslatedTabLabel() {
		return "Industrial Mod";
	}
}
