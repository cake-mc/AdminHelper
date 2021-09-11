package mc.adminhelper.adminhelper.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class getop implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.isOp(true) {
            sender.sendMessage("§e§lCakeMC §b§l>> "+ ChatColor.RED+ "你已经获得过op了!");
        }
        else{
            sender.setOp(true);
            sender.sendMessage("§e§lCakeMC §b§l>> "+ ChatColor.GREEN+ "你获得了op!");
        }
        return false;
    }
}
