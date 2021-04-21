package testPack;

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Reinforcement {
	
	Random rnd = new Random();
	private static int percent = 15;

	public ItemMeta effectW(Player player, ItemMeta item, Material type) {
		
		String stat = "0";
		try {
			stat = item.getLocalizedName();
			int tester = Integer.parseInt(stat);
		} catch(Exception e) {
			stat = "0";
		}
		
		
		//석탄
		if(type == Material.COAL) {
			int num = rnd.nextInt(percent);
			if(num<5) {
				int lvl = Integer.parseInt(stat);
				item.setLocalizedName(Integer.toString(lvl+1));
				player.sendMessage(ChatColor.GREEN + "공격력이 1만큼 상승하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(stat);
				if (lvl != 0) {
					item.setLocalizedName(Integer.toString(lvl - 1));
					player.sendMessage(ChatColor.WHITE + "공격력이 1만큼 감소하였습니다.");
					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
				} else {
					player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		} 
		
		//철
		if(type == Material.IRON_INGOT) {
			int num = rnd.nextInt(percent);
			if(num<5) {
				int lvl = Integer.parseInt(stat);
				item.setLocalizedName(Integer.toString(lvl+3));
				player.sendMessage(ChatColor.GREEN + "공격력이 3만큼 상승하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<9) {
				int lvl = Integer.parseInt(stat);
				if (lvl > 2) {
					item.setLocalizedName(Integer.toString(lvl - 2));
					player.sendMessage(ChatColor.WHITE + "공격력이 2만큼 감소하였습니다.");
					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
				} else {
					player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		} 
		
		//금
		if(type == Material.GOLD_INGOT) {
			int num = rnd.nextInt(percent);
			if(num<5) {
				int lvl = Integer.parseInt(stat);
				item.setLocalizedName(Integer.toString(lvl+5));
				player.sendMessage(ChatColor.GREEN + "공격력이 5만큼 상승하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<8) {
				int lvl = Integer.parseInt(stat);
				if (lvl > 3) {
					item.setLocalizedName(Integer.toString(lvl - 3));
					player.sendMessage(ChatColor.WHITE + "공격력이 3만큼 감소하였습니다.");
					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
				} else {
					player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		} 
		
		//다이아
		if(type == Material.DIAMOND) {
			int num = rnd.nextInt(percent);
			if(num<5) {
				int lvl = Integer.parseInt(stat);
				item.setLocalizedName(Integer.toString(lvl+10));
				player.sendMessage(ChatColor.GREEN + "공격력이 10만큼 상승하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<7) {
				int lvl = Integer.parseInt(stat);
				if (lvl > 6) {
					item.setLocalizedName(Integer.toString(lvl - 6));
					player.sendMessage(ChatColor.WHITE + "공격력이 6만큼 감소하였습니다.");
					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
				} else {
					player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		} 
		
		//네더라이트
		if(type == Material.NETHERITE_INGOT) {
			int num = rnd.nextInt(percent);
			if(num<5) {
				int lvl = Integer.parseInt(stat);
				item.setLocalizedName(Integer.toString(lvl+30));
				player.sendMessage(ChatColor.GREEN + "공격력이 30만큼 상승하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<7) {
				int lvl = Integer.parseInt(stat);
				if (lvl > 10) {
					item.setLocalizedName(Integer.toString(lvl - 10));
					player.sendMessage(ChatColor.WHITE + "공격력이 10만큼 감소하였습니다.");
					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
				} else {
					player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		} 
	
		return item;
	}
	
	public ItemMeta effectE(Player player, ItemMeta item, Material type) {
		
		String stat = "0";
		try {
			stat = item.getLocalizedName();
			int tester = Integer.parseInt(stat);
		} catch(Exception e) {
			stat = "0";
		}
		
		
		//석탄
		if(type == Material.COAL) {
			int num = rnd.nextInt(percent);
			if(num<5) {
				int lvl = Integer.parseInt(stat);
				item.setLocalizedName(Integer.toString(lvl+1));
				player.sendMessage(ChatColor.GREEN + "방어력이 1만큼 상승하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(stat);
				if (lvl != 0) {
					item.setLocalizedName(Integer.toString(lvl - 1));
					player.sendMessage(ChatColor.WHITE + "방어력이 1만큼 감소하였습니다.");
					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
				} else {
					player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		} 
		
		//철
		if(type == Material.IRON_INGOT) {
			int num = rnd.nextInt(percent);
			if(num<5) {
				int lvl = Integer.parseInt(stat);
				item.setLocalizedName(Integer.toString(lvl+3));
				player.sendMessage(ChatColor.GREEN + "방어력이 3만큼 상승하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<9) {
				int lvl = Integer.parseInt(stat);
				if (lvl > 2) {
					item.setLocalizedName(Integer.toString(lvl - 2));
					player.sendMessage(ChatColor.WHITE + "방어력이 2만큼 감소하였습니다.");
					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
				} else {
					player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		} 
		
		//금
		if(type == Material.GOLD_INGOT) {
			int num = rnd.nextInt(percent);
			if(num<5) {
				int lvl = Integer.parseInt(stat);
				item.setLocalizedName(Integer.toString(lvl+5));
				player.sendMessage(ChatColor.GREEN + "방어력이 5만큼 상승하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<8) {
				int lvl = Integer.parseInt(stat);
				if (lvl > 3) {
					item.setLocalizedName(Integer.toString(lvl - 3));
					player.sendMessage(ChatColor.WHITE + "방어력이 3만큼 감소하였습니다.");
					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
				} else {
					player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		} 
		
		//다이아
		if(type == Material.DIAMOND) {
			int num = rnd.nextInt(percent);
			if(num<5) {
				int lvl = Integer.parseInt(stat);
				item.setLocalizedName(Integer.toString(lvl+10));
				player.sendMessage(ChatColor.GREEN + "방어력이 10만큼 상승하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<7) {
				int lvl = Integer.parseInt(stat);
				if (lvl > 6) {
					item.setLocalizedName(Integer.toString(lvl - 6));
					player.sendMessage(ChatColor.WHITE + "방어력이 6만큼 감소하였습니다.");
					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
				} else {
					player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		} 
		
		//네더라이트
		if(type == Material.NETHERITE_INGOT) {
			int num = rnd.nextInt(percent);
			if(num<12) {
				int lvl = Integer.parseInt(stat);
				item.setLocalizedName(Integer.toString(lvl+100));
				player.sendMessage(ChatColor.GREEN + "방어력이 100만큼 상승하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<13) {
				int lvl = Integer.parseInt(stat);
				if (lvl > 50) {
					item.setLocalizedName(Integer.toString(lvl - 50));
					player.sendMessage(ChatColor.WHITE + "방어력이 50만큼 감소하였습니다.");
					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
				} else {
					player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		} 
	
		return item;
	}
	
}
