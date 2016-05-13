package frostGrass;




import org.bukkit.plugin.java.JavaPlugin;

import org.bukkit.ChatColor;


public class FrostGrass extends JavaPlugin {

	
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new BlockListener(),this);
		this.getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "[FrostGrass] Plugin enabled.");
		return;
			
	}

	public void onDisable() {
		this.getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "[FrostGrass] Plugin disabled.");
	}
	

}
