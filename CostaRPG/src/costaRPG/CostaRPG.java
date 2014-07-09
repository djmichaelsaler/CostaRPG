package costaRPG;

import org.bukkit.plugin.java.JavaPlugin;

import costaRPG.listeners.EntityEventListener;
import costaRPG.listeners.PlayerEventListener;

public class CostaRPG extends JavaPlugin{
	@Override
	public void onEnable() {
		getLogger().info("onEnable has been invoked!");
		getServer().getPluginManager().registerEvents(new EntityEventListener(), this);
		getServer().getPluginManager().registerEvents(new PlayerEventListener(), this);
	}
 
	@Override
	public void onDisable() {
		getLogger().info("onDisable has been invoked!");
	}
}
