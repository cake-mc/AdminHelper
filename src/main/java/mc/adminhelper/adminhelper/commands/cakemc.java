package mc.adminhelper.adminhelper.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class cakemc implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage("§e§lCakeMC §b§l>> "+ ChatColor.YELLOW+sender.getName()+ChatColor.GREEN+" 欢迎来到"+" §e§lCakeMC");
        sender.sendMessage("§e§lCakeMC §b§l>> "+ ChatColor.GREEN+"我们的主页");
        sender.sendMessage("§e§lCakeMC §b§l>> "+ ChatColor.GREEN+"https://www.cakemc.top/");
        sender.sendMessage("§e§lCakeMC §b§l>> "+ ChatColor.GREEN+"我们的博客");
        sender.sendMessage("§e§lCakeMC §b§l>> "+ ChatColor.GREEN+"https://blog.cakemc.top/");
        sender.sendMessage("§e§lCakeMC §b§l>> "+ ChatColor.YELLOW+"Want Get Op?");
        sender.sendMessage("§e§lCakeMC §b§l>> "+ ChatColor.YELLOW+"/getop");
        sender.sendMessage("§e§lCakeMC §b§l>> "+ ChatColor.YELLOW+"plz");

        return false;
    }
}
