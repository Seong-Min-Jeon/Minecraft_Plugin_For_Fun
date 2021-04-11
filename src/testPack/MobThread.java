package testPack;

import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.craftbukkit.v1_16_R3.CraftWorld;
import org.bukkit.entity.Blaze;
import org.bukkit.entity.CaveSpider;
import org.bukkit.entity.Drowned;
import org.bukkit.entity.Enderman;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Evoker;
import org.bukkit.entity.Husk;
import org.bukkit.entity.IronGolem;
import org.bukkit.entity.Player;
import org.bukkit.entity.PolarBear;
import org.bukkit.entity.Ravager;
import org.bukkit.entity.Silverfish;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Slime;
import org.bukkit.entity.Spider;
import org.bukkit.entity.Stray;
import org.bukkit.entity.Vex;
import org.bukkit.entity.Vindicator;
import org.bukkit.entity.Witch;
import org.bukkit.entity.WitherSkeleton;
import org.bukkit.entity.Zoglin;
import org.bukkit.entity.Zombie;
import org.bukkit.entity.PigZombie;
import org.bukkit.entity.Piglin;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;

import net.minecraft.server.v1_16_R3.WorldServer;

public class MobThread {

	int sleep;
	Random rnd = new Random();

	public MobThread(Player player) {

		sleep = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;

			@Override
			public void run() {

				Location loc = player.getLocation();
				
				if(player.getWorld().getName().equalsIgnoreCase("sao")) {
					if (time % 80 == 10) {
						if (loc.getX() <= -63 && loc.getY() <= 72 && loc.getZ() <= 19 
								&& loc.getX() >= -142 && loc.getY() >= 63 && loc.getZ() >= -31) {
							f1(player, loc);
						} else if(loc.getX() <= -78 && loc.getY() <= 87 && loc.getZ() <= 21 
								&& loc.getX() >= -158 && loc.getY() >= 75 && loc.getZ() >= -30) {
							f2(player, loc);
						} else if(loc.getX() <= -62 && loc.getY() <= 99 && loc.getZ() <= 20 
								&& loc.getX() >= -144 && loc.getY() >= 88 && loc.getZ() >= -31) {
							f3(player, loc);
						} else if(loc.getX() <= -77 && loc.getY() <= 111 && loc.getZ() <= 21 
								&& loc.getX() >= -158 && loc.getY() >= 100 && loc.getZ() >= -30) {
							f4(player, loc);
						} else if(loc.getX() <= -62 && loc.getY() <= 124 && loc.getZ() <= 20 
								&& loc.getX() >= -145 && loc.getY() >= 114 && loc.getZ() >= -31) {
							f5(player, loc);
						} else if(loc.getX() <= -75 && loc.getY() <= 137 && loc.getZ() <= 21 
								&& loc.getX() >= -143 && loc.getY() >= 127 && loc.getZ() >= -30) {
							f6(player, loc);
						} else if(loc.getX() <= -73 && loc.getY() <= 151 && loc.getZ() <= 20 
								&& loc.getX() >= -140 && loc.getY() >= 139 && loc.getZ() >= -31) {
							f7(player, loc);
						} else if(loc.getX() <= -73 && loc.getY() <= 165 && loc.getZ() <= 20 
								&& loc.getX() >= -147 && loc.getY() >= 152 && loc.getZ() >= -30) {
							f8(player, loc);
						} else if(loc.getX() <= -73 && loc.getY() <= 177 && loc.getZ() <= 21 
								&& loc.getX() >= -148 && loc.getY() >= 166 && loc.getZ() >= -31) {
							f9(player, loc);
						} else if(loc.getX() <= -74 && loc.getY() <= 192 && loc.getZ() <= 21 
								&& loc.getX() >= -142 && loc.getY() >= 180 && loc.getZ() >= -30) {
							f10(player, loc);
						}
					}
				}
				
				if(time >= 400) {
					time = 0;
				}
				
				time++;

			}

		}, 0, 1);
	}

	public void f1(Player player, Location loc) {
		loc = location(loc);
		if (!(loc.getX() <= -63 && loc.getY() <= 72 && loc.getZ() <= 19 
				&& loc.getX() >= -142 && loc.getY() >= 63 && loc.getZ() >= -31)) {
			return;
		}
		if(rnd.nextInt(2) == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		} else {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		}
	}
	
	public void f2(Player player, Location loc) {
		loc = location(loc);
		if (!(loc.getX() <= -78 && loc.getY() <= 87 && loc.getZ() <= 21 
				&& loc.getX() >= -158 && loc.getY() >= 75 && loc.getZ() >= -30)) {
			return;
		}
		if(rnd.nextInt(2) == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		} else {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		}
	}
	
	public void f3(Player player, Location loc) {
		loc = location(loc);
		if (!(loc.getX() <= -62 && loc.getY() <= 99 && loc.getZ() <= 20 
				&& loc.getX() >= -144 && loc.getY() >= 88 && loc.getZ() >= -31)) {
			return;
		}
		if(rnd.nextInt(2) == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		} else {
			loc.getWorld().spawnEntity(loc, EntityType.BLAZE);
		}
	}
	
	public void f4(Player player, Location loc) {
		loc = location(loc);
		if (!(loc.getX() <= -77 && loc.getY() <= 111 && loc.getZ() <= 21 
				&& loc.getX() >= -158 && loc.getY() >= 100 && loc.getZ() >= -30)) {
			return;
		}
		if(rnd.nextInt(2) == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SPIDER);
		} else {
			loc.getWorld().spawnEntity(loc, EntityType.CAVE_SPIDER);
		}
	}
	
	public void f5(Player player, Location loc) {
		loc = location(loc);
		if (!(loc.getX() <= -62 && loc.getY() <= 124 && loc.getZ() <= 20 
				&& loc.getX() >= -145 && loc.getY() >= 114 && loc.getZ() >= -31)) {
			return;
		}
		loc.getWorld().spawnEntity(loc, EntityType.POLAR_BEAR);
	}
	
	public void f6(Player player, Location loc) {
		loc = location(loc);
		if (!(loc.getX() <= -75 && loc.getY() <= 137 && loc.getZ() <= 21 
				&& loc.getX() >= -143 && loc.getY() >= 127 && loc.getZ() >= -30)) {
			return;
		}
		loc.getWorld().spawnEntity(loc, EntityType.IRON_GOLEM);
	}
	
	public void f7(Player player, Location loc) {
		loc = location(loc);
		if (!(loc.getX() <= -73 && loc.getY() <= 151 && loc.getZ() <= 20 
				&& loc.getX() >= -140 && loc.getY() >= 139 && loc.getZ() >= -31)) {
			return;
		}
		if(rnd.nextInt(2) == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.BLAZE);
		} else {
			loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
		}
	}
	
	public void f8(Player player, Location loc) {
		loc = location(loc);
		if (!(loc.getX() <= -73 && loc.getY() <= 165 && loc.getZ() <= 20 
				&& loc.getX() >= -147 && loc.getY() >= 152 && loc.getZ() >= -30)) {
			return;
		}
		loc.getWorld().spawnEntity(loc, EntityType.ZOGLIN);
	}
	
	public void f9(Player player, Location loc) {
		loc = location(loc);
		if (!(loc.getX() <= -73 && loc.getY() <= 177 && loc.getZ() <= 21 
				&& loc.getX() >= -148 && loc.getY() >= 166 && loc.getZ() >= -31)) {
			return;
		}
		if(rnd.nextInt(2) == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.ELDER_GUARDIAN);
		} else {
			loc.getWorld().spawnEntity(loc, EntityType.GUARDIAN);
		}
	}
	
	public void f10(Player player, Location loc) {
		loc = location(loc);
		if (!(loc.getX() <= -74 && loc.getY() <= 192 && loc.getZ() <= 21 
				&& loc.getX() >= -142 && loc.getY() >= 180 && loc.getZ() >= -30)) {
			return;
		}
		int num = rnd.nextInt(4);
		if(num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.VINDICATOR);
		} else if(num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.EVOKER);
		} else if(num == 2) {
			loc.getWorld().spawnEntity(loc, EntityType.ILLUSIONER);
		} else {
			loc.getWorld().spawnEntity(loc, EntityType.RAVAGER);
		}
	}
	

	
	public Location location(Location loc) {
		int x = rnd.nextInt(10) - 5;
		int z = rnd.nextInt(10) - 5;
		loc.add(x, 0, z);
		loc.add(0, 1, 0);
		return loc;
	}

}
