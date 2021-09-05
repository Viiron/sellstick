package fr.romdu57.sellstick;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class MyEventStick implements Listener {

    @EventHandler
    public void PlayerInteract(PlayerInteractEvent e) {
        Player p = (Player) e.getPlayer();
        Action action = e.getAction();
            if(e.getItem() == null){
                return;
            }
            if(e.getItem().getType() == null) {
                return;
            }
            if(e.getItem().getType() == Material.STICK) {
                if(action.equals(Action.LEFT_CLICK_BLOCK)) {
                    if (e.getItem().hasItemMeta() && e.getItem().getItemMeta().getDisplayName().equals("§cBaton de Vente")) {
                        e.setCancelled(true);
                        Bukkit.dispatchCommand(p, "sellall");
                    }
                }
            }

    }
}
