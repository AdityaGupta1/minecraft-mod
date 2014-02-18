/**
 * Copyright: Aditya Gupta
 */
package aditya.minecraft.blockcount;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * @author Aditya Gupta
 */
public class BlockCountCommandExecutor implements CommandExecutor {

    private BlockCountPlugin plugin;

    public BlockCountCommandExecutor(BlockCountPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        System.out.println("Running the \"resetblock\" command");
        if (!(sender instanceof Player)) {
            sender.sendMessage("This command can only be run by a player.");
            return false;
        }
        Player player = (Player) sender;
        String arg;

        arg = args.length == 0 ? "both" : args[0];

        String message;
        switch (arg) {
            case "place":
                message = "Blocks placed: "
                        + BlockCountListener.blockPlace
                        + ", count resetted";
                BlockCountListener.blockPlace = 0;
                break;
            case "break":
                message = "Blocks destroyed: "
                        + BlockCountListener.blockBreak
                        + ", count resetted";
                BlockCountListener.blockBreak = 0;
                break;
            case "both":
            default:
                message = "Blocks placed: "
                        + BlockCountListener.blockPlace
                        + " Blocks destroyed: "
                        + BlockCountListener.blockBreak
                        + ", count resetted";
                BlockCountListener.blockBreak = 0;
                BlockCountListener.blockPlace = 0;
                break;
        }
        player.sendMessage(ChatColor.AQUA + message);
//        player.sendMessage(ChatColor.AQUA + "Block count resetted");

        return true;
    }
}
