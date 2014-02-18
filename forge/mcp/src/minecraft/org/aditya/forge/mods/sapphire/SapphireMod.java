package org.aditya.forge.mods.sapphire;

import net.minecraft.block.Block;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "SapphireMod", name = "SapphireMod", version = "v1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class SapphireMod {

	public static String modid = "SapphireMod";
	public static Item sapphire;
	public static Block sapphireblock;
	public static Block sapphireore;
	public static Block sapphireglass;
	public static Item sapphireaxe;
	public static Item sapphireshovel;
	public static Item sapphirepickaxe;
	public static Item sapphirehoe;
	public static Item sapphiresword;

	@Init
	public void load(FMLInitializationEvent event) {
		sapphire = new Sapphire(2000).setUnlocalizedName("sapphire");
		LanguageRegistry.addName(sapphire, "Sapphire");

		sapphireblock = new SapphireBlock(2001, "sapphireblock")
				.setUnlocalizedName("blockSapphire").setHardness(5.0F)
				.setStepSound(Block.soundMetalFootstep).setResistance(10.0F);
		GameRegistry.registerBlock(sapphireblock, "sapphireblock");
		LanguageRegistry.addName(sapphireblock, "Sapphire Block");

		sapphireore = new SapphireOre(2002, "sapphireore")
				.setUnlocalizedName("oreSapphire").setHardness(5.0F)
				.setStepSound(Block.soundMetalFootstep).setResistance(10.0F);
		GameRegistry.registerBlock(sapphireore, "sapphireore");
		LanguageRegistry.addName(sapphireore, "Sapphire Ore");

		sapphireglass = new SapphireGlass(2003, "sapphireglass")
				.setUnlocalizedName("glassSapphire").setHardness(0.3F)
				.setStepSound(Block.soundGlassFootstep).setResistance(1.0F);
		GameRegistry.registerBlock(sapphireglass, "SapphireGlass");
		LanguageRegistry.addName(sapphireglass, "Sapphire Glass");

		GameRegistry.registerWorldGenerator(new WorldGeneratorSapphire());

		GameRegistry.addRecipe(new ItemStack(sapphireblock, 1), new Object[] {"TTT", "TTT", "TTT", 'T', sapphire, });
		GameRegistry.addShapelessRecipe(new ItemStack(sapphire, 9),new Object[] { sapphireblock });
		GameRegistry.addSmelting(SapphireMod.sapphireore.blockID,new ItemStack(sapphire, 1), 5F);
		GameRegistry.addSmelting(SapphireMod.sapphireblock.blockID,new ItemStack(sapphireglass, 1), 5F);
		GameRegistry.addRecipe(new ItemStack(sapphirepickaxe, 1), new Object[] {"TTT", " Y ", " Y ", 'T', sapphire, 'Y', Item.stick });
		GameRegistry.addRecipe(new ItemStack(sapphiresword, 1), new Object[] {" T ", " T ", " Y ", 'T', sapphire, 'Y', Item.stick });
		GameRegistry.addRecipe(new ItemStack(sapphireaxe, 1), new Object[] {"TT ", "TY ", " Y ", 'T', sapphire, 'Y', Item.stick });
		GameRegistry.addRecipe(new ItemStack(sapphirehoe, 1), new Object[] {"TT ", " Y ", " Y ", 'T', sapphire, 'Y', Item.stick });
		GameRegistry.addRecipe(new ItemStack(sapphireshovel, 1), new Object[] {" T ", " Y ", " Y ", 'T', sapphire, 'Y', Item.stick });
	}

	public static EnumToolMaterial SapphireTool = EnumHelper.addToolMaterial(
			"SapphireTool", 3, 1600, 9.0F, 3.0F, 10);
	{

		sapphireaxe = new SapphireAxe(2004, SapphireTool)
				.setUnlocalizedName("axeSapphire");
		sapphireshovel = new SapphireShovel(2005, SapphireTool)
				.setUnlocalizedName("spadeSapphire");
		sapphirepickaxe = new SapphirePickaxe(2006, SapphireTool)
				.setUnlocalizedName("pickaxeSapphire");
		sapphirehoe = new SapphireHoe(2007, SapphireTool)
				.setUnlocalizedName("hoeSapphire");
		sapphiresword = new SapphireSword(2008, SapphireTool)
				.setUnlocalizedName("swordSapphire");

		LanguageRegistry.addName(sapphireaxe, "Sapphire Axe");
		LanguageRegistry.addName(sapphireshovel, "Sapphire Shovel");
		LanguageRegistry.addName(sapphirepickaxe, "Sapphire Pickaxe");
		LanguageRegistry.addName(sapphiresword, "Sapphire Sword");
		LanguageRegistry.addName(sapphirehoe, "Sapphire Hoe");
	}
}
