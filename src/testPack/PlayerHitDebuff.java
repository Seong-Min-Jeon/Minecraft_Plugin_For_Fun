package testPack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.SoundCategory;
import org.bukkit.Particle.DustOptions;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.craftbukkit.v1_16_R3.CraftWorld;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.CaveSpider;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.FallingBlock;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Slime;
import org.bukkit.entity.SpectralArrow;
import org.bukkit.entity.WitherSkeleton;
import org.bukkit.entity.Zoglin;
import org.bukkit.entity.Zombie;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.EulerAngle;
import org.bukkit.util.Vector;

import net.minecraft.server.v1_16_R3.WorldServer;

public class PlayerHitDebuff {
	
	Random rnd = new Random();
	private int taskID;

	public void playerHitDebuff(Player player, Entity mob) {
		mob1(player, mob);
		mob2(player, mob);
		mob3(player, mob);
		mob4(player, mob);
		mob5(player, mob);
	}

	// 유통기한 지난 돼지고기
	public void mob1(Player player, Entity mob) {
		if (mob.getCustomName().equalsIgnoreCase(ChatColor.BOLD + "유통기한 지난 돼지고기")) {
			int num = rnd.nextInt(5);
			if (num == 0) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100, 1, true, false, false));
				player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 100, 9, true, false, false));
				player.damage(10);
			}
		}
	}
	
	// 바다 신전 보스
	public void mob2(Player player, Entity mob) {
		if (mob.getCustomName().equalsIgnoreCase(ChatColor.BOLD + "바다 신전 보스")) {
			int num = rnd.nextInt(3);
			if (num == 0) {
				if(player.getHealth() <= 4) {
					player.setHealth(0);
				} else {
					player.setHealth(player.getHealth() - 4);
				}
			}
		}
	}

	// 바다 신전 잡몹
	public void mob3(Player player, Entity mob) {
		if (mob.getCustomName().equalsIgnoreCase(ChatColor.BOLD + "바다 신전 잡몹")) {
			int num = rnd.nextInt(3);
			if (num == 0) {
				if(player.getHealth() <= 2) {
					player.setHealth(0);
				} else {
					player.setHealth(player.getHealth() - 2);
				}
			}
		}
	}

	// 포보르 추종자
	public void mob4(Player player, Entity mob) {
		if (mob.getCustomName().equalsIgnoreCase(ChatColor.BOLD + "포보르 추종자")) {
			int num = rnd.nextInt(5);
			if (num == 0) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100, 1, true, false, false));
				player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 100, 9, true, false, false));
				player.damage(40);
			}
		}
	}

	// 고오옴
	public void mob5(Player player, Entity mob) {
		if (mob.getCustomName().equalsIgnoreCase(ChatColor.BOLD + "고오옴")) {
			int num = rnd.nextInt(8);
			if (num == 0) {
				for(PotionEffect effect : player.getActivePotionEffects ()){
			        player.removePotionEffect(effect.getType());
			    }
				player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100, 1, true, false, false));
				player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 100, 9, true, false, false));
				player.damage(50);
			} else if(num == 1) {
				if(!player.isSneaking()) {
					player.setVelocity(new Vector(0, 3, 0));
				}
				player.damage(100);
			}
		}
	}

	public void sendMessage(Player player, String msg) {
		List<Entity> entitylist = player.getNearbyEntities(20, 10, 20);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				nearPlayer.sendMessage(msg);
			}
		}
	}
	
}