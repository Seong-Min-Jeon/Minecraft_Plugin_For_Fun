package testPack;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Blaze;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.ElderGuardian;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Giant;
import org.bukkit.entity.Guardian;
import org.bukkit.entity.IronGolem;
import org.bukkit.entity.Item;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.entity.PolarBear;
import org.bukkit.entity.SmallFireball;
import org.bukkit.entity.Zoglin;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockBurnEvent;
import org.bukkit.event.block.BlockIgniteEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.entity.EntityRegainHealthEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.entity.EntityRegainHealthEvent.RegainReason;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;


import java.util.Random;

public class Main extends JavaPlugin implements Listener{
	
	Random rnd = new Random();
	World sao = Bukkit.getWorld("sao");
	World world = Bukkit.getWorld("world");
	
	BossBar bar = Bukkit.createBossBar(ChatColor.DARK_RED + "The Eye", BarColor.RED, BarStyle.SOLID);
	
	@Override
	public void onEnable() {
		this.getServer().getPluginManager().registerEvents(this, this);
		
		new RefreshServer();
	}
	
	@Override
	public void onDisable() {
		getLogger().info("==Disable==");
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer(); 
		
		new MobThread(player);
		
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {
//			ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
//			EnchantmentStorageMeta eb = (EnchantmentStorageMeta) item.getItemMeta();
//			eb.addStoredEnchant(Enchantment.DAMAGE_ALL, 9, true);
//			eb.addStoredEnchant(Enchantment.ARROW_DAMAGE, 9, true);
//			item.setItemMeta(eb);
//			player.getInventory().addItem(item);
//		}
	}
	
	@EventHandler
	public void respawnEvent(PlayerRespawnEvent event) {
		Player player = event.getPlayer();
		if(player.getWorld().getName().equalsIgnoreCase("sao")) {
			event.setRespawnLocation(new Location(Bukkit.getWorld("sao"), -151, 66, -25));
		}
	}
	
	@EventHandler
	public void playerDeath(PlayerDeathEvent event) {
		Player player = event.getEntity();
		Location loc = player.getLocation();
		if(player.getWorld() == sao) {
			// -98 194 -31  -62 214 21
			if(loc.getX() <= -62 && loc.getY() <= 214 && loc.getZ() <= 21 
					&& loc.getX() >= -98 && loc.getY() >= 194 && loc.getZ() >= -31) {
				event.setKeepInventory(true);
				event.setNewExp(0);
				event.setNewLevel(player.getLevel() / 2);
			}
		}
	}
	
	@EventHandler
	public void consumeItem(PlayerItemConsumeEvent event) {
		Player player = (Player)event.getPlayer();
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "힐링 포션I")) {
			event.setCancelled(true);
			return;
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "힐링 포션II")) {
			event.setCancelled(true);
			return;
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "힐링 포션III")) {
			event.setCancelled(true);
			return;
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "힐링 포션IV")) {
			event.setCancelled(true);
			return;
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "힐링 포션V")) {
			event.setCancelled(true);
			return;
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "힐링 포션VI")) {
			event.setCancelled(true);
			return;
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "힐링 포션VII")) {
			event.setCancelled(true);
			return;
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "힐링 포션VIII")) {
			event.setCancelled(true);
			return;
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "힐링 포션IX")) {
			event.setCancelled(true);
			return;
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "힐링 포션X")) {
			event.setCancelled(true);
			return;
		}
	}

	@EventHandler
	public void mouseEvent(PlayerInteractEvent event) {
		try {
			EquipmentSlot e = event.getHand();
			if (e.equals(EquipmentSlot.HAND)) {
				Player player = event.getPlayer();
				if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.YELLOW + "힐링 포션I")) {
					if (player.getHealth() + 1 >= 20) {
						player.setHealth(20);
					} else {
						player.setHealth(player.getHealth() + 1);
					}
					player.getInventory().getItemInMainHand().setAmount(0);
				}
				if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.YELLOW + "힐링 포션II")) {
					if (player.getHealth() + 2 >= 20) {
						player.setHealth(20);
					} else {
						player.setHealth(player.getHealth() + 2);
					}
					player.getInventory().getItemInMainHand().setAmount(0);
				}
				if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.YELLOW + "힐링 포션III")) {
					if (player.getHealth() + 3 >= 20) {
						player.setHealth(20);
					} else {
						player.setHealth(player.getHealth() + 3);
					}
					player.getInventory().getItemInMainHand().setAmount(0);
				}
				if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.YELLOW + "힐링 포션IV")) {
					if (player.getHealth() + 4 >= 20) {
						player.setHealth(20);
					} else {
						player.setHealth(player.getHealth() + 4);
					}
					player.getInventory().getItemInMainHand().setAmount(0);
				}
				if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.YELLOW + "힐링 포션V")) {
					if (player.getHealth() + 5 >= 20) {
						player.setHealth(20);
					} else {
						player.setHealth(player.getHealth() + 5);
					}
					player.getInventory().getItemInMainHand().setAmount(0);
				}
				if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.YELLOW + "힐링 포션VI")) {
					if (player.getHealth() + 6 >= 20) {
						player.setHealth(20);
					} else {
						player.setHealth(player.getHealth() + 6);
					}
					player.getInventory().getItemInMainHand().setAmount(0);
				}
				if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.YELLOW + "힐링 포션VII")) {
					if (player.getHealth() + 7 >= 20) {
						player.setHealth(20);
					} else {
						player.setHealth(player.getHealth() + 7);
					}
					player.getInventory().getItemInMainHand().setAmount(0);
				}
				if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.YELLOW + "힐링 포션VIII")) {
					if (player.getHealth() + 8 >= 20) {
						player.setHealth(20);
					} else {
						player.setHealth(player.getHealth() + 8);
					}
					player.getInventory().getItemInMainHand().setAmount(0);
				}
				if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.YELLOW + "힐링 포션IX")) {
					if (player.getHealth() + 9 >= 20) {
						player.setHealth(20);
					} else {
						player.setHealth(player.getHealth() + 9);
					}
					player.getInventory().getItemInMainHand().setAmount(0);
				}
				if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.YELLOW + "힐링 포션X")) {
					if (player.getHealth() + 10 >= 20) {
						player.setHealth(20);
					} else {
						player.setHealth(player.getHealth() + 10);
					}
					player.getInventory().getItemInMainHand().setAmount(0);
				}

			}
		} catch (Exception e) {

		}
	}	
	
	@EventHandler
	public void spawnEntity(CreatureSpawnEvent event) {
		LivingEntity entity = event.getEntity();
		if(entity.getWorld().getName().equalsIgnoreCase("sao")) {
			
			entity.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, Integer.MAX_VALUE, 1));
			
			Location loc = entity.getLocation();
			
			// 1층 안전구역 -75 72 10  -63 63 19
			if (loc.getX() <= -63 && loc.getY() <= 72 && loc.getZ() <= 19 
					&& loc.getX() >= -75 && loc.getY() >= 63 && loc.getZ() >= 10) { 
				event.setCancelled(true);
				return;
			}
			// 2층 안전구역 -143 85 -1  -158 75 20
			if (loc.getX() <= -143 && loc.getY() <= 85 && loc.getZ() <= 20 
					&& loc.getX() >= -158 && loc.getY() >= 75 && loc.getZ() >= -1) { 
				event.setCancelled(true);
				return;
			}
			// 3층 안전구역 -111 96 7  -92 89 20
			if (loc.getX() <= -92 && loc.getY() <= 96 && loc.getZ() <= 20 
					&& loc.getX() >= -111 && loc.getY() >= 89 && loc.getZ() >= 7) { 
				event.setCancelled(true);
				return;
			}
			// 3층 안전구역 -76 98 1  -62 88 20
			if (loc.getX() <= -62 && loc.getY() <= 98 && loc.getZ() <= 20 
					&& loc.getX() >= -76 && loc.getY() >= 88 && loc.getZ() >= 1) { 
				event.setCancelled(true);
				return;
			}
			// 4층 안전구역 -141 111 -15  -158 101 -30
			if (loc.getX() <= -141 && loc.getY() <= 111 && loc.getZ() <= -15 
					&& loc.getX() >= -158 && loc.getY() >= 101 && loc.getZ() >= -30) { 
				event.setCancelled(true);
				return;
			}
			// 5층 안전구역 -128 123 14  -104 114 -15
			if (loc.getX() <= -104 && loc.getY() <= 123 && loc.getZ() <= 14 
					&& loc.getX() >= -128 && loc.getY() >= 114 && loc.getZ() >= -15) { 
				event.setCancelled(true);
				return;
			}
			// 5층 안전구역 -114 123 -19  -145 114 -29
			if (loc.getX() <= -114 && loc.getY() <= 123 && loc.getZ() <= -19 
					&& loc.getX() >= -145 && loc.getY() >= 114 && loc.getZ() >= -29) { 
				event.setCancelled(true);
				return;
			}
			// 5층 안전구역 -78 124 4  -62 114 20
			if (loc.getX() <= -62 && loc.getY() <= 124 && loc.getZ() <= 20 
					&& loc.getX() >= -78 && loc.getY() >= 114 && loc.getZ() >= 4) { 
				event.setCancelled(true);
				return;
			}
			// 6층 안전구역 -105 137 5  -137 128 -19
			if (loc.getX() <= -105 && loc.getY() <= 137 && loc.getZ() <= 5 
					&& loc.getX() >= -137 && loc.getY() >= 128 && loc.getZ() >= -19) { 
				event.setCancelled(true);
				return;
			}
			// 8층 안전구역 -85 163 -16  -73 153 6
			if (loc.getX() <= -73 && loc.getY() <= 163 && loc.getZ() <= 6 
					&& loc.getX() >= -85 && loc.getY() >= 153 && loc.getZ() >= -16) { 
				event.setCancelled(true);
				return;
			}
			// 8층 안전구역 -107 163 7  -126 153 20
			if (loc.getX() <= -107 && loc.getY() <= 163 && loc.getZ() <= 20 
					&& loc.getX() >= -126 && loc.getY() >= 153 && loc.getZ() >= 7) { 
				event.setCancelled(true);
				return;
			}

			// 보스방 -98 194 -31  -62 214 21
			if (loc.getX() <= -62 && loc.getY() <= 214 && loc.getZ() <= 21 
					&& loc.getX() >= -98 && loc.getY() >= 194 && loc.getZ() >= -31) {
				if(event.getEntity() instanceof Giant) {
					
				} else {
					event.setCancelled(true);
					return;
				}
			}
			
			// 1층 -142 63 -31  -63 72 19
			if (loc.getX() <= -63 && loc.getY() <= 72 && loc.getZ() <= 19 
					&& loc.getX() >= -142 && loc.getY() >= 63 && loc.getZ() >= -31) {
				if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
					entity.setCustomName(ChatColor.BOLD + "평범한 좀비");
					entity.setCustomNameVisible(true);
					entity.setMaxHealth(40);
					entity.setHealth(40);
					Zombie zombie = (Zombie) entity;
					zombie.setBaby(false);
					EntityEquipment weapon = entity.getEquipment();
					ItemStack weaponItem = new ItemStack(Material.AIR);
					weapon.setItemInMainHand(weaponItem);
					EntityEquipment head = entity.getEquipment();
					ItemStack headItem = new ItemStack(Material.AIR);
					head.setHelmet(headItem);
					EntityEquipment chest = entity.getEquipment();
					ItemStack chestItem = new ItemStack(Material.AIR);
					chest.setChestplate(chestItem);
					EntityEquipment leggings = entity.getEquipment();
					ItemStack leggingsItem = new ItemStack(Material.AIR);
					leggings.setLeggings(leggingsItem);
					EntityEquipment boots = entity.getEquipment();
					ItemStack bootsItem = new ItemStack(Material.AIR);
					boots.setBoots(bootsItem);
					entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 2));
				} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
					entity.setCustomName(ChatColor.BOLD + "평범한 스켈이");
					entity.setCustomNameVisible(true);
					entity.setMaxHealth(40);
					entity.setHealth(40);
					EntityEquipment weapon = entity.getEquipment();
					ItemStack weaponItem = new ItemStack(Material.BOW);
					weapon.setItemInMainHand(weaponItem);
					EntityEquipment head = entity.getEquipment();
					ItemStack headItem = new ItemStack(Material.AIR);
					head.setHelmet(headItem);
					EntityEquipment chest = entity.getEquipment();
					ItemStack chestItem = new ItemStack(Material.AIR);
					chest.setChestplate(chestItem);
					EntityEquipment leggings = entity.getEquipment();
					ItemStack leggingsItem = new ItemStack(Material.AIR);
					leggings.setLeggings(leggingsItem);
					EntityEquipment boots = entity.getEquipment();
					ItemStack bootsItem = new ItemStack(Material.AIR);
					boots.setBoots(bootsItem);
				} else {
					event.setCancelled(true);
				}
			}
			
			// 2층 -78 75 21  -158 87 -30
			if (loc.getX() <= -78 && loc.getY() <= 87 && loc.getZ() <= 21 
					&& loc.getX() >= -158 && loc.getY() >= 75 && loc.getZ() >= -30) {
				if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
					entity.setCustomName(ChatColor.BOLD + "나무꾼 좀비");
					entity.setCustomNameVisible(true);
					entity.setMaxHealth(55);
					entity.setHealth(55);
					Zombie zombie = (Zombie) entity;
					zombie.setBaby(false);
					EntityEquipment weapon = entity.getEquipment();
					ItemStack weaponItem = new ItemStack(Material.IRON_AXE);
					weapon.setItemInMainHand(weaponItem);
					EntityEquipment head = entity.getEquipment();
					ItemStack headItem = new ItemStack(Material.LEATHER_HELMET);
					head.setHelmet(headItem);
					EntityEquipment chest = entity.getEquipment();
					ItemStack chestItem = new ItemStack(Material.LEATHER_CHESTPLATE);
					chest.setChestplate(chestItem);
					EntityEquipment leggings = entity.getEquipment();
					ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
					leggings.setLeggings(leggingsItem);
					EntityEquipment boots = entity.getEquipment();
					ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
					boots.setBoots(bootsItem);
					entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 3));
				} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
					entity.setCustomName(ChatColor.BOLD + "검술을 배운 스켈이");
					entity.setCustomNameVisible(true);
					entity.setMaxHealth(30);
					entity.setHealth(30);
					EntityEquipment weapon = entity.getEquipment();
					ItemStack weaponItem = new ItemStack(Material.IRON_SWORD);
					weapon.setItemInMainHand(weaponItem);
					EntityEquipment head = entity.getEquipment();
					ItemStack headItem = new ItemStack(Material.IRON_HELMET);
					head.setHelmet(headItem);
					EntityEquipment chest = entity.getEquipment();
					ItemStack chestItem = new ItemStack(Material.IRON_CHESTPLATE);
					chest.setChestplate(chestItem);
					EntityEquipment leggings = entity.getEquipment();
					ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
					leggings.setLeggings(leggingsItem);
					EntityEquipment boots = entity.getEquipment();
					ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
					boots.setBoots(bootsItem);
					entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 3));
				} else {
					event.setCancelled(true);
				}
				
			}
			
			// 3층 -144 88 -31  -62 99 20
			if (loc.getX() <= -62 && loc.getY() <= 99 && loc.getZ() <= 20 
					&& loc.getX() >= -144 && loc.getY() >= 88 && loc.getZ() >= -31) {
				if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
					entity.setCustomName(ChatColor.BOLD + "파이어 좀비");
					entity.setCustomNameVisible(true);
					entity.setMaxHealth(70);
					entity.setHealth(70);
					Zombie zombie = (Zombie) entity;
					zombie.setBaby(false);
					EntityEquipment weapon = entity.getEquipment();
					ItemStack weaponItem = new ItemStack(Material.AIR);
					weapon.setItemInMainHand(weaponItem);
					EntityEquipment helmet = entity.getEquipment();
					ItemStack helmetItem = new ItemStack(Material.LEATHER_HELMET);
					LeatherArmorMeta helmetmeta = (LeatherArmorMeta) helmetItem.getItemMeta();
					helmetmeta.setColor(Color.fromRGB(250, 0, 0));
					helmetItem.setItemMeta(helmetmeta);
					helmet.setHelmet(helmetItem);
					EntityEquipment chestplate = entity.getEquipment();
					ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
					LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
					chestmeta.setColor(Color.fromRGB(250, 0, 0));
					chestplateItem.setItemMeta(chestmeta);
					chestplate.setChestplate(chestplateItem);
					EntityEquipment leggings = entity.getEquipment();
					ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
					LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
					leggingsmeta.setColor(Color.fromRGB(250, 0, 0));
					leggingsItem.setItemMeta(leggingsmeta);
					leggings.setLeggings(leggingsItem);
					EntityEquipment boots = entity.getEquipment();
					ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
					LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
					bootsmeta.setColor(Color.fromRGB(250, 0, 0));
					bootsItem.setItemMeta(bootsmeta);
					boots.setBoots(bootsItem);
					entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 4));
				} else if (entity.getType() == (EntityType) EntityType.BLAZE) {
					entity.setCustomName(ChatColor.BOLD + "불의 요정");
					entity.setCustomNameVisible(true);
					entity.setMaxHealth(70);
					entity.setHealth(70);
				} else {
					event.setCancelled(true);
				}
			}
			
			// 4층 -77 100 21  -158 111 -30
			if (loc.getX() <= -77 && loc.getY() <= 111 && loc.getZ() <= 21 
					&& loc.getX() >= -158 && loc.getY() >= 100 && loc.getZ() >= -30) {
				if (entity.getType() == (EntityType) EntityType.SPIDER) {
					entity.setCustomName(ChatColor.BOLD + "늑대 거미");
					entity.setCustomNameVisible(true);
					entity.setMaxHealth(100);
					entity.setHealth(100);
					entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 7));
				} else if (entity.getType() == (EntityType) EntityType.CAVE_SPIDER) {
					entity.setCustomName(ChatColor.BOLD + "독거미");
					entity.setCustomNameVisible(true);
					entity.setMaxHealth(100);
					entity.setHealth(100);
					entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 7));
				} else {
					event.setCancelled(true);
				}
			}
			
			// 5층 -145 114 -31  -62 124 20
			if (loc.getX() <= -62 && loc.getY() <= 124 && loc.getZ() <= 20 
					&& loc.getX() >= -145 && loc.getY() >= 114 && loc.getZ() >= -31) {
				if (entity.getType() == (EntityType) EntityType.POLAR_BEAR) {
					entity.setCustomName(ChatColor.BOLD + "나비");
					entity.setCustomNameVisible(true);
					entity.setMaxHealth(150);
					entity.setHealth(150);
					if(rnd.nextInt(2) == 0) {
						PolarBear zombie = (PolarBear) entity;
						zombie.setBaby();
					}
					entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 8));
				} else {
					event.setCancelled(true);
				}
			}
			
			// 6층 -75 127 21  -143 137 -30
			if (loc.getX() <= -75 && loc.getY() <= 137 && loc.getZ() <= 21 
					&& loc.getX() >= -143 && loc.getY() >= 127 && loc.getZ() >= -30) {
				if (entity.getType() == (EntityType) EntityType.IRON_GOLEM) {
					entity.setCustomName(ChatColor.BOLD + "고대 병기");
					entity.setCustomNameVisible(true);
					entity.setMaxHealth(180);
					entity.setHealth(180);
					entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 10));
				} else {
					event.setCancelled(true);
				}
			}
			
			// 7층 -140 139 -31  -73 151 20
			if (loc.getX() <= -73 && loc.getY() <= 151 && loc.getZ() <= 20 
					&& loc.getX() >= -140 && loc.getY() >= 139 && loc.getZ() >= -31) {
				if (entity.getType() == (EntityType) EntityType.BLAZE) {
					entity.setCustomName(ChatColor.BOLD + "불의 화신");
					entity.setCustomNameVisible(true);
					entity.setMaxHealth(220);
					entity.setHealth(220);
				} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
					entity.setCustomName(ChatColor.BOLD + "검은 스켈이");
					entity.setCustomNameVisible(true);
					entity.setMaxHealth(220);
					entity.setHealth(220);
					EntityEquipment weapon = entity.getEquipment();
					ItemStack weaponItem = new ItemStack(Material.NETHERITE_SWORD);
					weapon.setItemInMainHand(weaponItem);
					EntityEquipment head = entity.getEquipment();
					ItemStack headItem = new ItemStack(Material.AIR);
					head.setHelmet(headItem);
					EntityEquipment chest = entity.getEquipment();
					ItemStack chestItem = new ItemStack(Material.AIR);
					chest.setChestplate(chestItem);
					EntityEquipment leggings = entity.getEquipment();
					ItemStack leggingsItem = new ItemStack(Material.AIR);
					leggings.setLeggings(leggingsItem);
					EntityEquipment boots = entity.getEquipment();
					ItemStack bootsItem = new ItemStack(Material.AIR);
					boots.setBoots(bootsItem);
					entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 12));
					entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				} else {
					event.setCancelled(true);
				}
			}
			
			// 8층 -73 152 20  -147 165 -30
			if (loc.getX() <= -73 && loc.getY() <= 165 && loc.getZ() <= 20 
					&& loc.getX() >= -147 && loc.getY() >= 152 && loc.getZ() >= -30) {
				if (entity.getType() == (EntityType) EntityType.ZOGLIN) {
					entity.setCustomName(ChatColor.BOLD + "유통기한 지난 돼지고기");
					entity.setCustomNameVisible(true);
					entity.setMaxHealth(250);
					entity.setHealth(250);
					entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 13));
				} else {
					event.setCancelled(true);
				}
			}
			
			// 9층 -148 166 -31  -73 177 21
			if (loc.getX() <= -73 && loc.getY() <= 177 && loc.getZ() <= 21 
					&& loc.getX() >= -148 && loc.getY() >= 166 && loc.getZ() >= -31) {
				if (entity.getType() == (EntityType) EntityType.ELDER_GUARDIAN) {
					entity.setCustomName(ChatColor.BOLD + "바다 신전 보스");
					entity.setCustomNameVisible(true);
					entity.setMaxHealth(300);
					entity.setHealth(300);
				} else if (entity.getType() == (EntityType) EntityType.GUARDIAN) {
					entity.setCustomName(ChatColor.BOLD + "바다 신전 잡몹");
					entity.setCustomNameVisible(true);
					entity.setMaxHealth(280);
					entity.setHealth(280);
				} else {
					event.setCancelled(true);
				}
			}
			
			// 10층 -74 180 21  -142 192 -30
			if (loc.getX() <= -74 && loc.getY() <= 192 && loc.getZ() <= 21 
					&& loc.getX() >= -142 && loc.getY() >= 180 && loc.getZ() >= -30) {
				if (entity.getType() == (EntityType) EntityType.VINDICATOR) {
					entity.setCustomName(ChatColor.BOLD + "포보르 추종자");
					entity.setCustomNameVisible(true);
					entity.setMaxHealth(350);
					entity.setHealth(350);
					EntityEquipment head = entity.getEquipment();
					ItemStack headItem = new ItemStack(Material.AIR);
					head.setHelmet(headItem);
					entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 15));
				} else if (entity.getType() == (EntityType) EntityType.EVOKER) {
					entity.setCustomName(ChatColor.BOLD + "포보르 추종자");
					entity.setCustomNameVisible(true);
					entity.setMaxHealth(350);
					entity.setHealth(350);
					entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 15));
				} else if (entity.getType() == (EntityType) EntityType.ILLUSIONER) {
					entity.setCustomName(ChatColor.BOLD + "포보르 추종자");
					entity.setCustomNameVisible(true);
					entity.setMaxHealth(350);
					entity.setHealth(350);
					entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 15));
				} else if (entity.getType() == (EntityType) EntityType.RAVAGER) {
					entity.setCustomName(ChatColor.BOLD + "고오옴");
					entity.setCustomNameVisible(true);
					entity.setMaxHealth(350);
					entity.setHealth(350);
					entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 15));
				} else {
					event.setCancelled(true);
				}
			}
		}
		
	}
	
	@EventHandler
	public void onHit(EntityDamageByEntityEvent event){
		try {
			if(event.getEntity().getWorld().getName().equals("sao")) {
				if(event.getDamager() instanceof Player) {
					Player player = (Player) event.getDamager();
					if(event.getEntity() instanceof Player) {
						event.setCancelled(true);
						return;
					} else {
						event.setDamage(event.getDamage() + (player.getLevel()/10));
					}
					if(event.getEntity() instanceof IronGolem) {
						((IronGolem) event.getEntity()).setTarget(player);
						List<Entity> entitylist = event.getEntity().getNearbyEntities(50, 10, 50);
						for (Entity nearEntity : entitylist) {
							if (nearEntity instanceof IronGolem) {
								((IronGolem) nearEntity).setTarget(player);
							}
						}
					}
				} else if(event.getDamager() instanceof Arrow) {
					Arrow arrow = (Arrow) event.getDamager();
					if(arrow.getShooter() instanceof Player) {
						if(event.getEntity() instanceof Player) {
							event.setCancelled(true);
							return;
						}
					} else if(!(arrow.getShooter() instanceof Player)) {
						if(!(event.getEntity() instanceof Player)) {
							event.setCancelled(true);
							return;
						}
					}
				} else if(event.getDamager() instanceof SmallFireball){
					SmallFireball ball = (SmallFireball) event.getDamager();
					if(ball.getShooter() instanceof Blaze) {
						if(!(event.getEntity() instanceof Player)) {
							event.setCancelled(true);
							return;
						}
					}
				} else if(event.getDamager() instanceof Blaze) {
					if(event.getEntity() instanceof Player) {
						event.getEntity().setFireTicks(200);
					}
				} else if(event.getDamager().getCustomName().equals(ChatColor.BOLD + "파이어 좀비")) {
					if(event.getEntity() instanceof Player) {
						event.getEntity().setFireTicks(200);
					}
				} else if(event.getDamager() instanceof ElderGuardian) {
					if(event.getEntity() instanceof Player) {
						Player player = (Player) event.getEntity();
						player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 200, 0));
						player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 200, 1));
					}
				} else if(event.getDamager() instanceof Guardian) {
					if(event.getEntity() instanceof Player) {
						Player player = (Player) event.getEntity();
						player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 200, 0));
						player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, 200, 1));
					}
				} 
			}
		} catch(Exception e) {
			
		}

		try {
			if(event.getEntity() instanceof Giant) {
				event.setCancelled(true);
				((LivingEntity) event.getEntity()).damage(event.getFinalDamage());
				
				int num = rnd.nextInt(20);
				if(num == 0) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						Location loc = allPlayer.getLocation();
						if(loc.getX() <= -62 && loc.getY() <= 214 && loc.getZ() <= 21 
								&& loc.getX() >= -98 && loc.getY() >= 194 && loc.getZ() >= -31) {
							allPlayer.damage(19);
							allPlayer.sendMessage(ChatColor.RED + "죽어라 인간.");
							// ===============================================================
							ParticleData pd = new ParticleData(allPlayer.getUniqueId());
							if (pd.hasID()) {
								pd.endTask();
								pd.removeID();
							}
							ParticleEffect pe = new ParticleEffect(allPlayer);
							pe.startE2();
							// ================================================================
						}
					}
				} else if(num < 3) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						Location loc = allPlayer.getLocation();
						if(loc.getX() <= -62 && loc.getY() <= 214 && loc.getZ() <= 21 
								&& loc.getX() >= -98 && loc.getY() >= 194 && loc.getZ() >= -31) {
							allPlayer.setFireTicks(200);
							allPlayer.sendMessage(ChatColor.RED + "구워져라.");
							// ===============================================================
							ParticleData pd = new ParticleData(allPlayer.getUniqueId());
							if (pd.hasID()) {
								pd.endTask();
								pd.removeID();
							}
							ParticleEffect pe = new ParticleEffect(allPlayer);
							pe.startE21();
							// ================================================================
						}
					}
				} else if(num == 3) {
					if(event.getDamager() instanceof Player) {
						Player player = (Player) event.getDamager();
						player.damage(10);
						player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 200, 0));
						player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 200, 0));
						player.sendMessage(ChatColor.RED + "고통받아라.");
						// ===============================================================
						ParticleData pd = new ParticleData(player.getUniqueId());
						if (pd.hasID()) {
							pd.endTask();
							pd.removeID();
						}
						ParticleEffect pe = new ParticleEffect(player);
						pe.startE17();
						// ================================================================
					} else if(event.getDamager() instanceof Arrow) {
						Arrow arrow = (Arrow) event.getDamager();
						Player player = (Player) arrow.getShooter();
						player.damage(10);
						player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 200, 0));
						player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 200, 0));
						player.sendMessage(ChatColor.RED + "고통받아라.");
						// ===============================================================
						ParticleData pd = new ParticleData(player.getUniqueId());
						if (pd.hasID()) {
							pd.endTask();
							pd.removeID();
						}
						ParticleEffect pe = new ParticleEffect(player);
						pe.startE17();
						// ================================================================
					}
				}
				
				
				
			}
		} catch(Exception e) {
			
		}
	}
	
	@EventHandler
	public void skillDamage(EntityDamageEvent event) {
		if(event.getEntity().getWorld().getName().equals("sao")) {
			if (event.getCause() == DamageCause.DROWNING) {
				if (event.getEntity() instanceof Mob) {
					event.setCancelled(true);
					Mob mob = (Mob) event.getEntity();
					mob.remove();
					return;
				}
			} else if (event.getCause() == DamageCause.SUFFOCATION) {
				if (event.getEntity() instanceof Mob) {
					event.setCancelled(true);
					Mob mob = (Mob) event.getEntity();
					mob.remove();
					return;
				}
			}
			
			if(event.getEntity() instanceof Giant) {
				bar.setProgress(((LivingEntity) event.getEntity()).getHealth() / 30000.0);
			}
			
		}
	}
	
	@EventHandler
	public void mobDeathEvent(EntityDeathEvent event) {
		if(event.getEntity() instanceof EnderDragon) {
			for (Player allPlayer : Bukkit.getOnlinePlayers()) {
				allPlayer.sendMessage(ChatColor.GRAY + "[System] 추가 컨텐츠 개방을 축하드립니다! 마을에서 판매하고 있는 차원 이동서를 통해 새로운 세계로 갈 수 있게 되었습니다. 새로운 세계에서는 "
						+ "기존과 다른 전투 시스템이 적용됩니다. 1. 레벨에 따른 추가 공격력 수치가 적용됩니다. 2. 플레이어는 서로 공격할 수 없습니다. 3. 위험구역에서는 몬스터가 주위에 계속 스폰됩니다. 4. 몬스터와 멀어지면 몬스터는 사라집니다.");
			}
		}
		
		try {
			LivingEntity ent = event.getEntity();
			Location loc = ent.getLocation();
			if(ent.getWorld().getName().equals("sao")) {
				event.getDrops().clear();
				if(ent.getCustomName().equals(ChatColor.BOLD + "평범한 좀비")) {
					event.setDroppedExp(2);
					Bukkit.getWorld("sao").dropItem(loc, new ItemStack(Material.QUARTZ, rnd.nextInt(3)));
				} else if(ent.getCustomName().equals(ChatColor.BOLD + "평범한 스켈이")) {
					event.setDroppedExp(2);
					Bukkit.getWorld("sao").dropItem(loc, new ItemStack(Material.ARROW, rnd.nextInt(3)));
				} else if(ent.getCustomName().equals(ChatColor.BOLD + "나무꾼 좀비")) {
					event.setDroppedExp(3);
					Bukkit.getWorld("sao").dropItem(loc, new ItemStack(Material.OAK_LOG, rnd.nextInt(5)+5));
				} else if(ent.getCustomName().equals(ChatColor.BOLD + "검술을 배운 스켈이")) {
					event.setDroppedExp(3);
					Bukkit.getWorld("sao").dropItem(loc, new ItemStack(Material.IRON_INGOT, rnd.nextInt(3)));
				} else if(ent.getCustomName().equals(ChatColor.BOLD + "파이어 좀비")) {
					event.setDroppedExp(5);
					Bukkit.getWorld("sao").dropItem(loc, new ItemStack(Material.REDSTONE, rnd.nextInt(5)+3));
					Bukkit.getWorld("sao").dropItem(loc, new ItemStack(Material.GUNPOWDER, rnd.nextInt(5)));
				} else if(ent.getCustomName().equals(ChatColor.BOLD + "불의 요정")) {
					event.setDroppedExp(5);
					Bukkit.getWorld("sao").dropItem(loc, new ItemStack(Material.BLAZE_ROD, rnd.nextInt(3)));
				} else if(ent.getCustomName().equals(ChatColor.BOLD + "늑대 거미")) {
					event.setDroppedExp(8);
					Bukkit.getWorld("sao").dropItem(loc, new ItemStack(Material.SPIDER_EYE, rnd.nextInt(3)));
					Bukkit.getWorld("sao").dropItem(loc, new ItemStack(Material.STRING, rnd.nextInt(2)));
				} else if(ent.getCustomName().equals(ChatColor.BOLD + "독거미")) {
					event.setDroppedExp(8);
					Bukkit.getWorld("sao").dropItem(loc, new ItemStack(Material.SPIDER_EYE, rnd.nextInt(5)));
				} else if(ent.getCustomName().equals(ChatColor.BOLD + "나비")) {
					event.setDroppedExp(10);
					Bukkit.getWorld("sao").dropItem(loc, new ItemStack(Material.GOLD_INGOT, rnd.nextInt(3)));
				} else if(ent.getCustomName().equals(ChatColor.BOLD + "고대 병기")) {
					event.setDroppedExp(12);
					Bukkit.getWorld("sao").dropItem(loc, new ItemStack(Material.IRON_INGOT, rnd.nextInt(3)));
					Bukkit.getWorld("sao").dropItem(loc, new ItemStack(Material.NETHERITE_SCRAP, rnd.nextInt(2)));
				} else if(ent.getCustomName().equals(ChatColor.BOLD + "불의 화신")) {
					event.setDroppedExp(15);
					Bukkit.getWorld("sao").dropItem(loc, new ItemStack(Material.BLAZE_ROD, rnd.nextInt(3)));
					Bukkit.getWorld("sao").dropItem(loc, new ItemStack(Material.GOLD_INGOT, rnd.nextInt(3)));
				} else if(ent.getCustomName().equals(ChatColor.BOLD + "검은 스켈이")) {
					event.setDroppedExp(15);
					Bukkit.getWorld("sao").dropItem(loc, new ItemStack(Material.WITHER_SKELETON_SKULL, rnd.nextInt(2)));
					Bukkit.getWorld("sao").dropItem(loc, new ItemStack(Material.BONE, rnd.nextInt(4)));
				} else if(ent.getCustomName().equals(ChatColor.BOLD + "유통기한 지난 돼지고기")) {
					event.setDroppedExp(20);
					Bukkit.getWorld("sao").dropItem(loc, new ItemStack(Material.PORKCHOP, rnd.nextInt(5)));
					Bukkit.getWorld("sao").dropItem(loc, new ItemStack(Material.ENDER_PEARL, rnd.nextInt(2)));
				} else if(ent.getCustomName().equals(ChatColor.BOLD + "바다 신전 보스")) {
					event.setDroppedExp(25);
					Bukkit.getWorld("sao").dropItem(loc, new ItemStack(Material.DIAMOND, rnd.nextInt(5)));
				} else if(ent.getCustomName().equals(ChatColor.BOLD + "바다 신전 잡몹")) {
					event.setDroppedExp(25);
					Bukkit.getWorld("sao").dropItem(loc, new ItemStack(Material.DIAMOND, rnd.nextInt(3)));
				} else if(ent.getCustomName().equals(ChatColor.BOLD + "포보르 추종자")) {
					event.setDroppedExp(40);
					Bukkit.getWorld("sao").dropItem(loc, new ItemStack(Material.EMERALD, rnd.nextInt(5)));
				} else if(ent.getCustomName().equals(ChatColor.BOLD + "고오옴")) {
					event.setDroppedExp(50);
					Bukkit.getWorld("sao").dropItem(loc, new ItemStack(Material.NETHER_STAR, rnd.nextInt(2)));
				}
			}
		} catch(Exception e) {
			
		}
	}
	
	@EventHandler
	public void dropItem(PlayerDropItemEvent event) {
		Player player = (Player) event.getPlayer();
		Item itemArg = event.getItemDrop();
		World world = player.getWorld();
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "차원 이동서")) {
			if(world == this.world) {
				player.teleport(new Location(sao, -151, 66, -25));
				itemArg.remove();
			} else if(world == sao) {
				player.teleport(new Location(this.world, -185, 68, -104));
				itemArg.remove();
			}
		}
		
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "인챈트 추출서")) {
			ItemStack weapon = player.getInventory().getItemInMainHand();
			ArrayList<Enchantment> ary1 = new ArrayList<>();
			ArrayList<Integer> ary2 = new ArrayList<>();
			if(weapon.getEnchantments().size() == 0) {
				player.sendMessage(ChatColor.GRAY + "아이템에 인챈트가 부여되어 있지 않습니다.");
			} else {
				Map<Enchantment, Integer> map = weapon.getEnchantments();
				ary1.addAll(map.keySet());
				ary2.addAll(map.values());
				ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
				EnchantmentStorageMeta eb = (EnchantmentStorageMeta) item.getItemMeta();
				for(int i = 0 ; i < ary1.size() ; i++) {
					eb.addStoredEnchant(ary1.get(i), ary2.get(i), true);
				}
				item.setItemMeta(eb);
				weapon.setAmount(0);
				itemArg.remove();
				player.getInventory().addItem(item);
			}
		}
		
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "게브네의 주술서")) {
			ItemStack weapon = player.getInventory().getItemInMainHand();
			ItemMeta im = weapon.getItemMeta();
			try {
				im.setDisplayName(ChatColor.DARK_PURPLE + im.getDisplayName().substring(2));
			} catch(Exception e) {

			}
			im.setUnbreakable(true);
			weapon.setItemMeta(im);
			itemArg.remove();
		}
		
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "엘드릭 이동서")) {
			itemArg.remove();
			
			player.teleport(new Location(Bukkit.getWorld("sao"), -79, 202, -26));
			List<Entity> list = player.getNearbyEntities(100, 100, 100);
			int tmp = 0;
			for(Entity ent : list) {
				if(ent instanceof Player) {
					Player nearP = (Player) ent;
					Location loc = nearP.getLocation();
					// -98 194 -31  -62 214 21
					if(loc.getX() <= -62 && loc.getY() <= 214 && loc.getZ() <= 21 
							&& loc.getX() >= -98 && loc.getY() >= 194 && loc.getZ() >= -31) {
						tmp++;
					}
				}
			}
			if(tmp == 0) {
				Giant g = (Giant) Bukkit.getWorld("sao").spawnEntity(new Location(sao, -79, 202, 7), EntityType.GIANT);
				g.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, Integer.MAX_VALUE, 0, true, false, false));
				g.setAI(false);
				g.setMaxHealth(30000);
				g.setHealth(30000);
				
				bar.setProgress(g.getHealth() / 30000.0);
				for(Player p : Bukkit.getOnlinePlayers()) {
					if(p.getWorld() == sao) {
						bar.addPlayer(p);
					}
				}
				
			}
			
		}
	}

	@EventHandler
	public void regenHealth(EntityRegainHealthEvent event) {
		if(event.getEntity().getWorld().getName().equalsIgnoreCase("sao")) {
			if(event.getRegainReason() == RegainReason.SATIATED) {
				event.setCancelled(true);
			}
		}
	
	}
	
	@EventHandler
	public void blockBreakEvent(BlockBreakEvent event) {
		if(event.getBlock().getWorld() == sao) {
			Location loc = event.getBlock().getLocation();
			if(loc.getX() <= -62 && loc.getY() <= 214 && loc.getZ() <= 21 
					&& loc.getX() >= -98 && loc.getY() >= 194 && loc.getZ() >= -31) {
				event.setCancelled(true);
				return;
			}
		}
	}
	
	@EventHandler
	public void blockBurnEvent(BlockBurnEvent event) {
		if(event.getBlock().getWorld() == sao) {
			Location loc = event.getBlock().getLocation();
			if(loc.getX() <= -62 && loc.getY() <= 214 && loc.getZ() <= 21 
					&& loc.getX() >= -98 && loc.getY() >= 194 && loc.getZ() >= -31) {
				event.setCancelled(true);
				return;
			}
		}
	}

	@EventHandler
	public void blockIgniteEvent(BlockIgniteEvent event) {
		if(event.getBlock().getWorld() == sao) {
			Location loc = event.getBlock().getLocation();
			if(loc.getX() <= -62 && loc.getY() <= 214 && loc.getZ() <= 21 
					&& loc.getX() >= -98 && loc.getY() >= 194 && loc.getZ() >= -31) {
				event.setCancelled(true);
				return;
			}
		}
	}
	
	@EventHandler
	public void blockPlaceEvent(BlockPlaceEvent event) {
		if(event.getBlock().getWorld() == sao) {
			Location loc = event.getBlock().getLocation();
			if(loc.getX() <= -62 && loc.getY() <= 214 && loc.getZ() <= 21 
					&& loc.getX() >= -98 && loc.getY() >= 194 && loc.getZ() >= -31) {
				event.setCancelled(true);
				return;
			}
		}
	}
	
	@EventHandler
	public void ExplosionCancel(EntityExplodeEvent event) {
		Entity entity = event.getEntity();
		if(entity.getWorld() == sao) {
			if(entity instanceof Creeper || entity instanceof Fireball) {
				event.setCancelled(true);
			}
			if(event.getEntityType() == EntityType.PRIMED_TNT) {
				event.setCancelled(true);
			}
		}
		
	}

	@EventHandler
	public void playerOff(PlayerQuitEvent event) {
		Player player = event.getPlayer();
		Location loc = player.getLocation();
		System.out.println(0);
		if(player.getWorld() == sao) {
			System.out.println(1);
			// -98 194 -31  -62 214 21
			if(loc.getX() <= -62 && loc.getY() <= 214 && loc.getZ() <= 21 
					&& loc.getX() >= -98 && loc.getY() >= 194 && loc.getZ() >= -31) {
				System.out.println(2);
				player.setHealth(0);
				return;
			}
		}
	}
	
}