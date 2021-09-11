package mc.adminhelper.adminhelper.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class cakemc implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage("§e§lCakeMC §b§l>> "+ ChatColor.YELLOW+sender.getName()+ChatColor.GREEN+" 欢迎来到"+" §e§lCakeMC");
        return false;
    }
}
