package mc.adminhelper.adminhelper.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.scheduler.BukkitRunnable;

public class 秒表 implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length==0){
            sender.sendMessage("§e§lCakeMC §b§l>> "+ChatColor.GREEN+"请接秒数");
            return false;
        }
        else if (args.length==1) {
            String sendercommand = args[0];
            int i = Integer.parseInt(sendercommand);
            if (i <= 0) {
                sender.sendMessage("§e§lCakeMC §b§l>> " + ChatColor.RED + "请接秒数");
                return false;
            } else if (i > 0) {
                Bukkit.getServer().broadcastMessage("§e§lCakeMC §b§l>> " + ChatColor.GOLD + sender.getName() + ChatColor.GREEN + " 创造了一个 " + ChatColor.YELLOW + i + ChatColor.GREEN + " 秒的计时器.");
                new BukkitRunnable() {
                    int j=i;
                    public void run() {
                        if (j == 0) {
                            Bukkit.getServer().broadcastMessage("§e§lCakeMC §b§l>> " + ChatColor.RED + "倒计时结束");
                            this.cancel();
                        } else {
                            Bukkit.getServer().broadcastMessage("§e§lCakeMC §b§l>> " + ChatColor.GREEN + "秒表还剩 " + ChatColor.YELLOW + i + ChatColor.GREEN + " 秒");
                            j--;
                        }
                    }
                };
                return false;
            }
            else{
                sender.sendMessage("§e§lCakeMC §b§l>> " + ChatColor.RED + "请接秒数");
                return false;
            }
        }
        else{
            sender.sendMessage("§e§lCakeMC §b§l>> " + ChatColor.RED + "请接秒数");
            return false;
        }
        }
}
