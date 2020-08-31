package testPack;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Biome;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class RefreshServer {

	int sleep;
	Random rnd = new Random();
	World world;

	public RefreshServer() {
		
		sleep = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {
		
			int time = 0;
			
			@Override
			public void run() {
				
				if(time % 600 == 0) {
					world = Bukkit.getWorld("sao");
					List<Entity> list1 = world.getEntities();
					for(Entity ent : list1) {
						int cnt = 0;
						List<Entity> list2 = ent.getNearbyEntities(30, 8, 30);
						for(Entity ent2 : list2) {
							if(ent2 instanceof Player) {
								cnt++;
							}
						}
						if(cnt == 0) {
							try {
								if(ent.getType() == EntityType.ZOMBIE) {
									ent.remove();
								}
								if(ent.getType() == EntityType.SKELETON) {
									ent.remove();
								}
								if(ent.getType() == EntityType.DROWNED) {
									ent.remove();
								}
								if(ent.getType() == EntityType.ENDERMAN) {
									ent.remove();
								}
								if(ent.getType() == EntityType.SILVERFISH) {
									ent.remove();
								}
								if(ent.getType() == EntityType.STRAY) {
									ent.remove();
								}
								if(ent.getType() == EntityType.RAVAGER) {
									ent.remove();
								}
								if(ent.getType() == EntityType.WITHER_SKELETON) {
									ent.remove();
								}
								if(ent.getType() == EntityType.WITCH) {
									ent.remove();
								}
								if(ent.getType() == EntityType.CAVE_SPIDER) {
									ent.remove();
								}
								if(ent.getType() == EntityType.SPIDER) {
									ent.remove();
								}
								if(ent.getType() == EntityType.MAGMA_CUBE) {
									ent.remove();
								}
								if(ent.getType() == EntityType.SLIME) {
									ent.remove();
								}
								if(ent.getType() == EntityType.HUSK) {
									ent.remove();
								}
								if(ent.getType() == EntityType.EVOKER) {
									ent.remove();
								}
								if(ent.getType() == EntityType.ENDERMITE) {
									ent.remove();
								}
								if(ent.getType() == EntityType.GUARDIAN) {
									ent.remove();
								}
								if(ent.getType() == EntityType.ELDER_GUARDIAN) {
									ent.remove();
								}
								if(ent.getType() == EntityType.GHAST) {
									ent.remove();
								}
								if(ent.getType() == EntityType.PHANTOM) {
									ent.remove();
								}
								if(ent.getType() == EntityType.VINDICATOR) {
									ent.remove();
								}
								if(ent.getType() == EntityType.IRON_GOLEM) {
									ent.remove();
								}
								if(ent.getType() == EntityType.BLAZE) {
									ent.remove();
								}
								if(ent.getType() == EntityType.WITHER) {
									ent.remove();
								}
								if(ent.getType() == EntityType.POLAR_BEAR) {
									ent.remove();
								}
								if(ent.getType() == EntityType.PIGLIN) {
									ent.remove();
								}
								if(ent.getType() == EntityType.ZOGLIN) {
									ent.remove();
								}
								if(ent.getType() == EntityType.ZOMBIFIED_PIGLIN) {
									ent.remove();
								}
							} catch(Exception e) {
								
							}
						}
					}
				
				if(time >= 6000) {
					time = 0;
				}
			
				time++;
				
				}
			}						
			
		}, 0, 1);
	}
	
}
