/**
 * Copyright: Aditya Gupta
 */
package aditya.minecraft.moneyplugin;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

/**
 * @author Aditya Gupta
 */
public class MoneyListener implements Listener {

    /**
     *
     */
    public double money = 0.00;

    /**
     *
     * @param event
     */
    @EventHandler
    public void blockBreak(BlockBreakEvent event) {
        money = money + 0.1;
        Player player;
        player = event.getPlayer();
        player.sendMessage(ChatColor.AQUA + "You have $" + money);
    }
    
    @EventHandler
    public void blockPlace(BlockPlaceEvent event) {
        money = money + 0.1;
        Player player;
        player = event.getPlayer();
        player.sendMessage(ChatColor.AQUA + "You have $" + money);
    }
}
