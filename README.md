Bukkit
-------

For Bukkit mods, go to https://github.com/arun-gupta/bukkit-workshop.

Forge
-----

### Sapphire Mod

The Sapphire Mod adds:

* Sapphires
* Sapphire Blocks
* Sapphire Ore that generates in the Overworld
* Sapphire Glass which is clear except for a border around the edges
* Sapphire Tools
    * Sapphire Sword (does 7 damage)
    * Sapphire Axe
    * Sapphire Pickaxe
    * Sapphire Hoe
    * Sapphire Shovel
* Sapphire Armor
* Crafting and smelting recipes for these items

### Industrial Mod

The Industrial Mod adds:

* Copper, Tin, and Bronze ingots and blocks
* Copper and Tin Ores
* Energetic Shards (the main ingredient in the crafting of circuits)
* Energetic Ore to drop Energetic Shards
* 3 types of circuits: Electric, Advanced, and Epic
* Lava Generators
* Rocket Launchers
* Strange Liquid
* Bronze Armor
* Copper and Gold Wires
* Sticky Material, which is just like vines but doesn't grow and can be crafted (the texture is slightly lighter)
* Crafting and smelting recipes for these items

### To install these mods:

#### If you don't have a premium Minecraft account:

1. Obtain the modkit from [here](http://www.devoxx4kids.org/usa/workshops/minecraft-modding/). Overlay the "forge" directory from one of the folders with a mod name in it (sapphire-forge, industrial-forge, etc.) to the modkit. The modkit already has a forge directory. When you copy the forge folder into your modkit, it will merge the two forge folders together.

2. If your computer asks you if you want to replace CreativeTabs.java with a different CreativeTabs.java, say yes, because this will add the new creative tab for the sapphires.

3. When you launch Minecraft from the Eclipse in the modkit, it should have the items and blocks that are stated above in a new tab.

#### If you do have a premium Minecraft account:

If you already have forge installed on your Minecraft, skip steps 1 to 4.

1. Go to files.minecraftforge.net. At the top of the page, it will say 1.6.4-Latest. Go to the side of this and click on the "Installer" button. This will redirect you to an adfly page, from which you can download the 
forge installer.

2. Run Minecraft 1.6.4 at least once, as this is required to install forge.

3. After forge is done downloading, run the installer. It will make a window, and at the top of the window there are two choices. Select the one that says "Install Client", then click on "Next" at the bottom. This will make a forge profile in your Minecraft.

4. Go to your Minecraft Launcher and select the profile called "Forge". Run this once, as this will  make a folder that we need to edit.

5. Go to your Minecraft folder. On Windows it is `AppData\Roaming\.minecraft`, and on a Mac, it is `Libraries\Application Support\minecraft`. Open that, and there should be a "mods" forlder.
Overlay the mods folder from this repository onto the mods folder in your Minecraft folder.

6. Open your Minecraft launcher and run the forge profile. It should have the Sapphire Mod and Industrial Mod installed.
