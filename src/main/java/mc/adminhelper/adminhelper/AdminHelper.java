package mc.adminhelper.adminhelper;

import org.bukkit.plugin.java.JavaPlugin;

public final class AdminHelper extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("§c[§c§lAdminHelper§c]§r§e插件加载成功!");
        System.out.println("§c[§c§lAdminHelper§c]§r§e插件版本 ${version}");
        System.out.println("§c[§c§lAdminHelper§c]§r§e制作 ${authors}");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("§c[§c§lAdminHelper§c]§r§e服务器关闭! 插件卸载!");
        System.out.println("§c[§c§lAdminHelper§c]§r§e[跑路跑路~]");
    }
}
