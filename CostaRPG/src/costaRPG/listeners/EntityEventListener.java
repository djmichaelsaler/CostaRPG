package costaRPG.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

public class EntityEventListener implements Listener{
	
	@EventHandler(priority=EventPriority.NORMAL)
	public void onFoodLevelChangeEvent(FoodLevelChangeEvent event){
		event.setCancelled(true);
	}

	@EventHandler(priority=EventPriority.NORMAL)
	public void onEntityDamageEvent(EntityDamageEvent event){
		if (event.getCause()==DamageCause.FALL )
			event.setCancelled(true);
	}
}
