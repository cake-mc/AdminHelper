package mc.adminhelper.adminhelper;

import mc.adminhelper.adminhelper.commands.cakemc;
import mc.adminhelper.adminhelper.commands.getop;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class AdminHelper extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("§e§lCakeMC §b§l>> §e插件加载成功!");
        getCommand("cakemc").setExecutor(new cakemc());
        getCommand("getop").setExecutor(new getop());
    }
    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("§e§lCakeMC §b§l>> §e服务器关闭! 插件卸载!");
        System.out.println("§e§lCakeMC §b§l>> §e[跑路跑路~]");
    }
}
