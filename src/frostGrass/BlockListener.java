package frostGrass;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockSpreadEvent;

public class BlockListener implements Listener {
	@EventHandler
	public void onGrassSpread(BlockSpreadEvent event) {
		if (event.getSource().getType().equals(Material.GRASS)) {
			Location locAbove = event.getBlock().getLocation().clone().add(0,1,0);
			if (locAbove.getBlock().getType().equals(Material.AIR)) {
				locAbove.getBlock().setType(Material.SNOW);
			}
		}
	}

}