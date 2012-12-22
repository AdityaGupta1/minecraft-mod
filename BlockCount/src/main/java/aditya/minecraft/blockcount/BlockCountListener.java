/**
 * Copyright: Aditya Gupta
 */
package aditya.minecraft.blockcount;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

/**
 * @author Aditya Gupta
 */
public class BlockCountListener implements Listener {

    static int blockBreak = 0;
    static int blockPlace = 0;

    @EventHandler
    public void blockBreak(BlockBreakEvent event) {
        Player player = event.getPlayer();
        player.sendMessage(ChatColor.AQUA + "Blocks broken: " + ++blockBreak);
    }

    @EventHandler
    public void blockPlace(BlockPlaceEvent event) {
        Player player = event.getPlayer();
        player.sendMessage(ChatColor.AQUA + "Blocks placed: " + ++blockPlace);
    }
}
