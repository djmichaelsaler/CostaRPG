package costaRPG.listeners;


import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;

public class PlayerEventListener implements Listener{
	
	@EventHandler(priority=EventPriority.NORMAL)
	public void onPlayerDropItemEvent(PlayerDropItemEvent event){		
		event.setCancelled(true);
	}
	
	@EventHandler(priority=EventPriority.NORMAL)
	public void onPlayerPickupItemEvent(PlayerPickupItemEvent event){
		event.setCancelled(true);
	}

}
