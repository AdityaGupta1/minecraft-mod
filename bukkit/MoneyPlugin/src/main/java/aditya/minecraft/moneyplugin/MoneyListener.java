/**
 * Copyright: Aditya Gupta
 */
package aditya.minecraft.moneyplugin;

import org.bukkit.ChatColor;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.inventory.FurnaceExtractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

/**
 * @author Aditya Gupta
 */
public class MoneyListener implements Listener {

    /**
     *
     */
    public double money = 0.00;
    private boolean buy = false;
    private int quantity = 0;
    private int blockid = 0;
    private double cost = 0.00;

    /**
     *
     * @param event
     */
    @EventHandler
    public void blockBreak(BlockBreakEvent event) {
        money = money + 0.01;
        Player player;
        player = event.getPlayer();
        player.sendMessage(ChatColor.AQUA + "You have $" + String.format("%1$.2f", money));
    }

    @EventHandler
    public void blockPlace(BlockPlaceEvent event) {
        money = money + 0.01;
        Player player;
        player = event.getPlayer();
        player.sendMessage(ChatColor.AQUA + "You have $" + String.format("%1$.2f", money));
    }

    @EventHandler
    public void furnaceExtract(FurnaceExtractEvent event) {
        money = money + 0.03;
        Player player;
        player = event.getPlayer();
        player.sendMessage(ChatColor.AQUA + "You have $" + String.format("%1$.2f", money));
    }

    @EventHandler
    public void shopItem(BlockDamageEvent event) {
        if (event.getBlock().getTypeId() == 68) {
            Sign sign = (Sign) event.getBlock().getState();
            if ("BUY".equals(sign.getLine(0))) {
                buy = true;
            }
            if ("SELL".equals(sign.getLine(0))) {
                buy = false;
            }
            quantity = Integer.valueOf(sign.getLine(1));
            blockid = Integer.valueOf(sign.getLine(2));
            cost = Double.valueOf(sign.getLine(3));

            if (buy) {
                if (money >= cost) {
                    money -= cost;
                    
                    Player player;
                    player = event.getPlayer();
                    player.getInventory().addItem(new ItemStack(blockid, quantity));
                    player.sendMessage(ChatColor.AQUA + "You have $" + String.format("%1$.2f", money));
                }

            }
            if (money < cost) {
                Player player;
                player = event.getPlayer();
                player.sendMessage(ChatColor.RED + "You do not have enough money! You have $" + String.format("%1$.2f", money));
            }




        }
        if (!buy) {
            money += cost;
            Player player;
            player = event.getPlayer();
            player.getInventory().removeItem(new ItemStack(blockid, quantity));
            player.sendMessage(ChatColor.AQUA + "You have $" + String.format("%1$.2f", money));
        }
    }
}