package org.aditya.forge.mods.industrial;

import net.minecraft.block.Block;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

/**
 * @author Aditya Gupta
 */

@Mod(modid = "IndustrialMod", name = "Industrial Mod", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class IndustrialMod {
	
	public static String modid = "IndustrialMod";
	public static Item energeticshard;
	public static Item goldwire;
	public static Block copperore;
	public static Item copperingot;
	public static Item copperwire;
	public static Item electriccircuit;
	public static Block energeticore;
	public static Block lavagenerator;
	public static Item advancedcircuit;
	public static Block tinore;
	public static Item tiningot;
	public static Item bronzeingot;
	public static Block energeticblock;
	public static Block copperblock;
	public static Block tinblock;
	public static Block bronzeblock;
	public static Item bronzeplate;
	public static Item epiccircuit;
	public static Item bronzehelmet;
	public static Item bronzechestplate;
	public static Item bronzeleggings;
	public static Item bronzeboots;
	public static Item chemicalvial;
	public static Block stickymaterial;
	public static Item rocketlauncher;
	public static Item chemicalrocketlauncher;
	
	@Init
	public void load(FMLInitializationEvent event) {
		
		energeticshard = new EnergeticShard(3101).setUnlocalizedName("energeticClump");
		LanguageRegistry.addName(energeticshard, "Energetic Shard");
		goldwire = new GoldWire(3102).setUnlocalizedName("wireGold");
		LanguageRegistry.addName(goldwire, "Gold Wire");
		copperingot = new CopperIngot(3103).setUnlocalizedName("ingotCopper");
		LanguageRegistry.addName(copperingot, "Copper Ingot");
		copperwire = new CopperWire(3104).setUnlocalizedName("wireCopper");
		LanguageRegistry.addName(copperwire, "Copper Wire");
		electriccircuit = new ElectricCircuit(3105).setUnlocalizedName("circuitElectric");
		LanguageRegistry.addName(electriccircuit, "Electric Circuit");
		advancedcircuit = new AdvancedCircuit(3106).setUnlocalizedName("circuitAdvanced");
		LanguageRegistry.addName(advancedcircuit, "Advanced Circuit");
		tiningot = new TinIngot(3111).setUnlocalizedName("ingotTin");
		LanguageRegistry.addName(tiningot, "Tin Ingot");
		bronzeingot = new BronzeIngot(3112).setUnlocalizedName("ingotBronze");
		LanguageRegistry.addName(bronzeingot, "Bronze Ingot");
		
		copperore = new CopperOre(3107, "copperore")
		.setUnlocalizedName("oreCopper").setHardness(5.0F)
		.setStepSound(Block.soundStoneFootstep).setResistance(10.0F);
		GameRegistry.registerBlock(copperore, "copperore");
		LanguageRegistry.addName(copperore, "Copper Ore");
		energeticore = new EnergeticOre(3108, "energeticore")
		.setUnlocalizedName("oreEnergetic").setHardness(5.0F)
		.setStepSound(Block.soundStoneFootstep).setResistance(10.0F);
		GameRegistry.registerBlock(energeticore, "energeticore");
		LanguageRegistry.addName(energeticore, "Energetic Ore");
		tinore = new TinOre(3110, "tinore")
		.setUnlocalizedName("oreTin").setHardness(5.0F)
		.setStepSound(Block.soundStoneFootstep).setResistance(10.0F);
		GameRegistry.registerBlock(tinore, "tinore");
		LanguageRegistry.addName(tinore, "Tin Ore");
		
		copperblock = new CopperBlock(3113, "copperblock")
		.setUnlocalizedName("blockCopper").setHardness(10.0F)
		.setStepSound(Block.soundStoneFootstep).setResistance(20.0F);
		GameRegistry.registerBlock(copperblock, "copperblock");
		LanguageRegistry.addName(copperblock, "Block of Copper");
		energeticblock = new EnergeticBlock(3114, "energeticblock")
		.setUnlocalizedName("blockEnergetic").setHardness(10.0F)
		.setStepSound(Block.soundStoneFootstep).setResistance(20.0F);
		GameRegistry.registerBlock(energeticblock, "energeticblock");
		LanguageRegistry.addName(energeticblock, "Energetic Block");
		tinblock = new TinBlock(3115, "tinblock")
		.setUnlocalizedName("blockTin").setHardness(10.0F)
		.setStepSound(Block.soundStoneFootstep).setResistance(20.0F);
		GameRegistry.registerBlock(tinblock, "tinblock");
		LanguageRegistry.addName(tinblock, "Block of Tin");
		bronzeblock = new BronzeBlock(3116, "bronzeblock")
		.setUnlocalizedName("blockBronze").setHardness(10.0F)
		.setStepSound(Block.soundStoneFootstep).setResistance(20.0F);
		GameRegistry.registerBlock(bronzeblock, "bronzeblock");
		LanguageRegistry.addName(bronzeblock, "Block of Bronze");
		
		lavagenerator = new LavaGenerator(3109, "lavagenerator")
		.setUnlocalizedName("lavaGenerator").setHardness(5.0F)
		.setStepSound(Block.soundMetalFootstep).setResistance(10.0F);
		GameRegistry.registerBlock(lavagenerator, "lavagenerator");
		LanguageRegistry.addName(lavagenerator, "Lava Generator");
		
		bronzeplate = new BronzePlate(3117).setUnlocalizedName("plateBronze");
		LanguageRegistry.addName(bronzeplate, "Bronze Plate");
		
		epiccircuit = new EpicCircuit(3118).setUnlocalizedName("circuitEpic");
		LanguageRegistry.addName(epiccircuit, "Epic Circuit");
		
		chemicalvial = new ChemicalVial(3125).setUnlocalizedName("chemicalVial");
		LanguageRegistry.addName(chemicalvial, "Strange Liquid");
		
		stickymaterial = new StickyMaterial(3126, "stickymaterial")
		.setUnlocalizedName("stickyMaterial").setHardness(0.2F)
		.setStepSound(Block.soundGrassFootstep).setResistance(0.2F);
		GameRegistry.registerBlock(stickymaterial, "stickymaterial");
		LanguageRegistry.addName(stickymaterial, "Sticky Material");
		
		rocketlauncher = new RocketLauncher(3127).setUnlocalizedName("rocketLauncher");
		LanguageRegistry.addName(rocketlauncher, "Rocket Launcher");
		
		chemicalrocketlauncher = new ChemicalRocketLauncher(3128).setUnlocalizedName("chemicalRocketLauncher");
		LanguageRegistry.addName(chemicalrocketlauncher, "Corrosive Rocket Launcher");
		
		GameRegistry.registerWorldGenerator(new WorldGeneratorCopper());
		GameRegistry.registerWorldGenerator(new WorldGeneratorEnergetic());
		GameRegistry.registerWorldGenerator(new WorldGeneratorTin());
		
		GameRegistry.addRecipe(new ItemStack(energeticshard, 16), new Object[] {"RIR", "GDG", "RIR", 'R', Item.redstone, 'I', Item.ingotIron, 'G', Item.ingotGold, 'D', Item.diamond});
		GameRegistry.addRecipe(new ItemStack(energeticshard, 8), new Object[] {"RIR", "GEG", "RIR", 'R', Item.redstone, 'I', Item.ingotIron, 'G', Item.ingotGold, 'E', Item.emerald});
		GameRegistry.addRecipe(new ItemStack(goldwire, 8), new Object[] {"GGG", 'G', Item.ingotGold});
		GameRegistry.addRecipe(new ItemStack(copperwire, 8), new Object[] {"CCC", 'C', IndustrialMod.copperingot});
		GameRegistry.addRecipe(new ItemStack(electriccircuit, 2), new Object[] {"CEC", "CIC", "CEC", 'C', IndustrialMod.copperwire, 'E', Item.diamond, 'I', Item.ingotIron});
		GameRegistry.addRecipe(new ItemStack(advancedcircuit, 1), new Object[] {"GEG", "GCG", "GEG", 'G', IndustrialMod.goldwire, 'E', IndustrialMod.energeticshard, 'C', IndustrialMod.electriccircuit});
		GameRegistry.addRecipe(new ItemStack(epiccircuit, 1), new Object[] {"PEP", "PCP", "PEP", 'P', IndustrialMod.bronzeplate, 'E', IndustrialMod.energeticblock, 'C', IndustrialMod.advancedcircuit});
		GameRegistry.addRecipe(new ItemStack(lavagenerator, 1), new Object[] {"OOO", "LCL", "OOO", 'O', Block.obsidian, 'L', Item.bucketLava, 'C', IndustrialMod.advancedcircuit});
		GameRegistry.addShapelessRecipe(new ItemStack(bronzeingot, 2), new Object[] {IndustrialMod.tiningot, IndustrialMod.copperingot, IndustrialMod.copperingot, IndustrialMod.copperingot});
		GameRegistry.addRecipe(new ItemStack(energeticblock, 1), new Object[] {"EEE", "EEE", "EEE", 'E', IndustrialMod.energeticshard});
		GameRegistry.addRecipe(new ItemStack(copperblock, 1), new Object[] {"CCC", "CCC", "CCC", 'C', IndustrialMod.copperingot});
		GameRegistry.addRecipe(new ItemStack(tinblock, 1), new Object[] {"TTT", "TTT", "TTT", 'T', IndustrialMod.tiningot});
		GameRegistry.addRecipe(new ItemStack(bronzeblock, 1), new Object[] {"BBB", "BBB", "BBB", 'B', IndustrialMod.bronzeingot});
		GameRegistry.addShapelessRecipe(new ItemStack(bronzeingot, 9), new Object[] {IndustrialMod.bronzeblock});
		GameRegistry.addShapelessRecipe(new ItemStack(tiningot, 9), new Object[] {IndustrialMod.tinblock});
		GameRegistry.addShapelessRecipe(new ItemStack(copperingot, 9), new Object[] {IndustrialMod.copperblock});
		GameRegistry.addShapelessRecipe(new ItemStack(energeticshard, 9), new Object[] {IndustrialMod.energeticblock});
		GameRegistry.addSmelting(IndustrialMod.copperore.blockID,new ItemStack(copperingot, 1), 0.25F);
		GameRegistry.addSmelting(IndustrialMod.energeticore.blockID,new ItemStack(energeticshard, 1), 0.25F);
		GameRegistry.addSmelting(IndustrialMod.tinore.blockID,new ItemStack(tiningot, 1), 0.25F);
		GameRegistry.addRecipe(new ItemStack(bronzeplate, 8), new Object[] {"BBB", "BBB", 'B', IndustrialMod.bronzeingot});
		GameRegistry.addRecipe(new ItemStack(advancedcircuit, 1), new Object[] {"PDP", "PCP", "PDP", 'P', IndustrialMod.bronzeplate, 'D', IndustrialMod.energeticblock, 'C', IndustrialMod.advancedcircuit});
		GameRegistry.addRecipe(new ItemStack(bronzehelmet, 1), new Object[] {"TTT", "T T", 'T', bronzeplate});
		GameRegistry.addRecipe(new ItemStack(bronzechestplate, 1),new Object[] { "T T", "TTT", "TTT", 'T', bronzeplate});
		GameRegistry.addRecipe(new ItemStack(bronzeleggings, 1),new Object[] { "TTT", "T T", "T T", 'T', bronzeplate});
		GameRegistry.addRecipe(new ItemStack(bronzeboots, 1), new Object[] {"T T", "T T", 'T', bronzeplate});
		GameRegistry.addShapelessRecipe(new ItemStack(chemicalvial, 1), new Object[] {IndustrialMod.energeticshard, Item.potion});
		GameRegistry.addShapelessRecipe(new ItemStack(stickymaterial, 32), new Object[] {IndustrialMod.chemicalvial, Block.vine, IndustrialMod.epiccircuit});
		GameRegistry.addShapelessRecipe(new ItemStack(stickymaterial, 16), new Object[] {IndustrialMod.chemicalvial, Block.vine, IndustrialMod.advancedcircuit});
		GameRegistry.addShapelessRecipe(new ItemStack(stickymaterial, 4), new Object[] {IndustrialMod.chemicalvial, Block.vine, IndustrialMod.electriccircuit});
		GameRegistry.addRecipe(new ItemStack(rocketlauncher, 1),new Object[] { "OOO", "TAC", "OOO", 'T', Block.tnt, 'O', Block.obsidian, 'A', advancedcircuit, 'C', electriccircuit});
		GameRegistry.addShapelessRecipe(new ItemStack(chemicalrocketlauncher), new Object[] {IndustrialMod.chemicalvial, IndustrialMod.rocketlauncher, IndustrialMod.epiccircuit});
	}
	
	public static EnumArmorMaterial BronzeArmor = EnumHelper
			.addArmorMaterial("BronzeArmor", 8, new int[] { 3, 8, 6, 3 }, 30);

	{
		RenderingRegistry.addNewArmourRendererPrefix("BronzeArmor");

		bronzehelmet = new BronzeArmor(3119, BronzeArmor, 5, 0)
				.setUnlocalizedName("helmetBronze");
		bronzechestplate = new BronzeArmor(3120, BronzeArmor, 5, 1)
				.setUnlocalizedName("chestplateBronze");
		bronzeleggings = new BronzeArmor(3121, BronzeArmor, 5, 2)
				.setUnlocalizedName("leggingsBronze");
		bronzeboots = new BronzeArmor(3122, BronzeArmor, 5, 3)
				.setUnlocalizedName("bootsBronze");

		LanguageRegistry.addName(bronzehelmet, "Bronze Helmet");
		LanguageRegistry.addName(bronzechestplate, "Bronze Chestplate");
		LanguageRegistry.addName(bronzeboots, "Bronze Boots");
		LanguageRegistry.addName(bronzeleggings, "Bronze Leggings");
	}

}
