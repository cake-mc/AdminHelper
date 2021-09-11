package mc.adminhelper.adminhelper.events;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;

public class fish implements Listener {
    @EventHandler
    public void PlayerFishEvent(PlayerFishEvent fish){
        fish.getPlayer().chat(ChatColor.GREEN+"我正在钓鱼 "+ChatColor.YELLOW+"但是不允许钓鱼");
        fish.setCancelled();
    }
}
