/**
 * Copyright: Aditya Gupta
 */
package aditya.minecraft.blockcount;

import java.util.logging.Level;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author Aditya Gupta
 */
public class BlockCountPlugin extends JavaPlugin {
    
     @Override
    public void onEnable() {
        getLogger().log(Level.INFO, "{0} plugin enabled", getClass().getName());
//        getServer().getPluginManager().registerEvents(new MyPlayerListener(), this);
        getServer().getPluginManager().registerEvents(new BlockCountListener(), this);
        
        // This will throw a NullPointException if you don't have the command defined in your plugin.yml file!
//	getCommand("basic").setExecutor(new MyPluginCommandExecutor(this));
	getCommand("resetblock").setExecutor(new BlockCountCommandExecutor(this));
    }

    @Override
    public void onDisable() {
        getLogger().log(Level.INFO, "{0} plugin disabled", getClass().getName());
    }
    
}
