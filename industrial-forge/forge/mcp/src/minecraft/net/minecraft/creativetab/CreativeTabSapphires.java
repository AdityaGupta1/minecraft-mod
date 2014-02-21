package net.minecraft.creativetab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

final class CreativeTabSapphires extends CreativeTabs
{
    CreativeTabSapphires(int par1, String par2Str)
    {
        super(par1, par2Str);
    }

    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex()
    {
        return 3002;
    }
    
    public String getTranslatedTabLabel()
    {
    return "Sapphire Mod";
    }
}
