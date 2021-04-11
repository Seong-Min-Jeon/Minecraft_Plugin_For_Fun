package testPack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.tags.CustomItemTagContainer;
import org.bukkit.persistence.PersistentDataContainer;

import com.google.common.collect.Multimap;

public class ReinforcementMakeEvent {
	
	public void rein(Player player, Inventory inv) {
		try {
			if(inv.getItem(0).getType()==Material.WOODEN_SWORD || inv.getItem(0).getType()==Material.STONE_SWORD || inv.getItem(0).getType()==Material.IRON_SWORD || inv.getItem(0).getType()==Material.GOLDEN_SWORD ||
        			inv.getItem(0).getType()==Material.DIAMOND_SWORD ||
        			inv.getItem(0).getType()==Material.NETHERITE_SWORD || inv.getItem(0).getType()==Material.WOODEN_AXE ||
        			inv.getItem(0).getType()==Material.STONE_AXE || inv.getItem(0).getType()==Material.IRON_AXE || inv.getItem(0).getType()==Material.GOLDEN_AXE || 
        			inv.getItem(0).getType()==Material.DIAMOND_AXE || inv.getItem(0).getType()==Material.NETHERITE_AXE || inv.getItem(0).getType()==Material.BOW || 
        			inv.getItem(0).getType()==Material.CROSSBOW || inv.getItem(0).getType()==Material.TRIDENT) {
				if(inv.getItem(1).getType()==Material.COAL || inv.getItem(1).getType()==Material.IRON_INGOT || inv.getItem(1).getType()==Material.GOLD_INGOT ||
            			inv.getItem(1).getType()==Material.DIAMOND || inv.getItem(1).getType()==Material.NETHERITE_INGOT) {
            		if(inv.getItem(1).getAmount() < 5) {
            			player.sendMessage(ChatColor.WHITE + "광물은 5개 이상 넣어주세요.");
            		} else {
            			ItemStack itemStack = inv.getItem(0);
            			Map<Enchantment, Integer> map = itemStack.getEnchantments();
            			ItemStack var1 = null;
            			try {
            				if(itemStack.getItemMeta() == null) {
            					var1 = new ItemStack(itemStack.getType());
                    			ItemMeta var1Im = var1.getItemMeta();
                    			var1Im.setLocalizedName("0");
                    			if(var1.getType()==Material.WOODEN_SWORD || var1.getType()==Material.STONE_SWORD || var1.getType()==Material.IRON_SWORD || var1.getType()==Material.GOLDEN_SWORD ||
                            			var1.getType()==Material.DIAMOND_SWORD || var1.getType()==Material.NETHERITE_SWORD || var1.getType()==Material.WOODEN_AXE ||
                            			var1.getType()==Material.STONE_AXE || var1.getType()==Material.IRON_AXE || var1.getType()==Material.GOLDEN_AXE || 
                            			var1.getType()==Material.DIAMOND_AXE || var1.getType()==Material.NETHERITE_AXE || var1.getType()==Material.BOW || 
                            			var1.getType()==Material.CROSSBOW || var1.getType()==Material.TRIDENT) {
                    				var1Im.setDisplayName(ChatColor.AQUA + "강화된 무기");
                    			} else if(var1.getType()==Material.LEATHER_HELMET || var1.getType()==Material.CHAINMAIL_HELMET ||
                            			var1.getType()==Material.IRON_HELMET || var1.getType()==Material.GOLDEN_HELMET || var1.getType()==Material.DIAMOND_HELMET ||
                            			var1.getType()==Material.NETHERITE_HELMET) {
                    				var1Im.setDisplayName(ChatColor.AQUA + "강화된 헬멧");
                    			} else if(var1.getType()==Material.LEATHER_CHESTPLATE ||
                            			var1.getType()==Material.CHAINMAIL_CHESTPLATE || var1.getType()==Material.IRON_CHESTPLATE || var1.getType()==Material.GOLDEN_CHESTPLATE ||
                            			var1.getType()==Material.DIAMOND_CHESTPLATE || var1.getType()==Material.NETHERITE_CHESTPLATE) {
                    				var1Im.setDisplayName(ChatColor.AQUA + "강화된 갑옷");
                    			} else if(
                            			var1.getType()==Material.LEATHER_LEGGINGS || var1.getType()==Material.CHAINMAIL_LEGGINGS || var1.getType()==Material.IRON_LEGGINGS ||
                            			var1.getType()==Material.GOLDEN_LEGGINGS || var1.getType()==Material.DIAMOND_LEGGINGS ||
                            			var1.getType()==Material.NETHERITE_LEGGINGS) {
                    				var1Im.setDisplayName(ChatColor.AQUA + "강화된 각반");
                    			} else if(var1.getType()==Material.LEATHER_BOOTS || var1.getType()==Material.CHAINMAIL_BOOTS ||
                            			var1.getType()==Material.IRON_BOOTS || var1.getType()==Material.GOLDEN_BOOTS || var1.getType()==Material.DIAMOND_BOOTS || 
                            			var1.getType()==Material.NETHERITE_BOOTS) {
                    				var1Im.setDisplayName(ChatColor.AQUA + "강화된 신발");
                    			} else {
                    				var1Im.setDisplayName(ChatColor.AQUA + "강화된 장비");
                    			}
                    			ArrayList<String> var1Lore = new ArrayList();
                    			var1Lore.add(ChatColor.GRAY + "현세에 존재하는 힘을 초월한 무기");
                    			var1Lore.add(ChatColor.GRAY + " ");
                    			var1Im.setLore(var1Lore);
                    			var1.setItemMeta(var1Im);
                    			itemStack = var1;
            				} else {
                    			ItemMeta var1Im = itemStack.getItemMeta();
                    			var1Im.setDisplayName(itemStack.getItemMeta().getDisplayName());
                    			ArrayList<String> var1Lore = new ArrayList();
                    			var1Lore.add(ChatColor.GRAY + "현세에 존재하는 힘을 초월한 무기");
                    			var1Lore.add(ChatColor.GRAY + " ");
                    			var1Im.setLore(var1Lore);
                    			itemStack.setItemMeta(var1Im);
            				}
            			} catch(Exception e) {
            				
            			}
            			ItemMeta item = itemStack.getItemMeta();
            			Material itemResource = inv.getItem(1).getType();
            			ItemMeta newMeta = null;
            			Reinforcement rein = new Reinforcement();
            			newMeta = rein.effectW(player, item, itemResource);
            			if(newMeta != null) {
            				ArrayList<String> lore = new ArrayList();
                			lore.add(ChatColor.GRAY + "현세에 존재하는 힘을 초월한 무기");
                			lore.add(ChatColor.GRAY + " ");
                			lore.add("===인챈트===");
                			lore.add(ChatColor.BLUE + "공격력: " + newMeta.getLocalizedName());
                			newMeta.setLore(lore);
        					itemStack.setItemMeta(newMeta);
        					itemStack.addEnchantments(map);
        					inv.setItem(0, itemStack);
                			inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 5);
        				} else {
        					player.sendMessage("잘못된 강화방법입니다.");
        					return;
        				}
            		}
            	} else {
            		player.sendMessage(ChatColor.WHITE + "두번째 칸에는 재료를 넣어주세요.");
            	}
        	} else if(inv.getItem(0).getType()==Material.LEATHER_HELMET || inv.getItem(0).getType()==Material.LEATHER_CHESTPLATE ||
        			inv.getItem(0).getType()==Material.LEATHER_LEGGINGS || inv.getItem(0).getType()==Material.LEATHER_BOOTS || inv.getItem(0).getType()==Material.CHAINMAIL_HELMET ||
        			inv.getItem(0).getType()==Material.CHAINMAIL_CHESTPLATE || inv.getItem(0).getType()==Material.CHAINMAIL_LEGGINGS || inv.getItem(0).getType()==Material.CHAINMAIL_BOOTS ||
        			inv.getItem(0).getType()==Material.IRON_HELMET || inv.getItem(0).getType()==Material.IRON_CHESTPLATE || inv.getItem(0).getType()==Material.IRON_LEGGINGS ||
        			inv.getItem(0).getType()==Material.IRON_BOOTS || inv.getItem(0).getType()==Material.GOLDEN_HELMET || inv.getItem(0).getType()==Material.GOLDEN_CHESTPLATE ||
        			inv.getItem(0).getType()==Material.GOLDEN_LEGGINGS || inv.getItem(0).getType()==Material.GOLDEN_BOOTS || inv.getItem(0).getType()==Material.DIAMOND_HELMET ||
        			inv.getItem(0).getType()==Material.DIAMOND_CHESTPLATE || inv.getItem(0).getType()==Material.DIAMOND_LEGGINGS || inv.getItem(0).getType()==Material.DIAMOND_BOOTS || 
        			inv.getItem(0).getType()==Material.NETHERITE_HELMET || inv.getItem(0).getType()==Material.NETHERITE_CHESTPLATE || 
        			inv.getItem(0).getType()==Material.NETHERITE_LEGGINGS || inv.getItem(0).getType()==Material.NETHERITE_BOOTS) {
				if(inv.getItem(1).getType()==Material.COAL || inv.getItem(1).getType()==Material.IRON_INGOT || inv.getItem(1).getType()==Material.GOLD_INGOT ||
            			inv.getItem(1).getType()==Material.DIAMOND || inv.getItem(1).getType()==Material.NETHERITE_INGOT) {
            		if(inv.getItem(1).getAmount() < 5) {
            			player.sendMessage(ChatColor.WHITE + "광물은 5개 이상 넣어주세요.");
            		} else {
            			ItemStack itemStack = inv.getItem(0);
            			Map<Enchantment, Integer> map = itemStack.getEnchantments();
            			ItemStack var1 = null;
            			try {
            				if(itemStack.getItemMeta() == null) {
            					var1 = new ItemStack(itemStack.getType());
                    			ItemMeta var1Im = var1.getItemMeta();
                    			var1Im.setLocalizedName("0");
                    			if(var1.getType()==Material.WOODEN_SWORD || var1.getType()==Material.STONE_SWORD || var1.getType()==Material.IRON_SWORD || var1.getType()==Material.GOLDEN_SWORD ||
                            			var1.getType()==Material.DIAMOND_SWORD || var1.getType()==Material.NETHERITE_SWORD || var1.getType()==Material.WOODEN_AXE ||
                            			var1.getType()==Material.STONE_AXE || var1.getType()==Material.IRON_AXE || var1.getType()==Material.GOLDEN_AXE || 
                            			var1.getType()==Material.DIAMOND_AXE || var1.getType()==Material.NETHERITE_AXE || var1.getType()==Material.BOW || 
                            			var1.getType()==Material.CROSSBOW || var1.getType()==Material.TRIDENT) {
                    				var1Im.setDisplayName(ChatColor.AQUA + "강화된 무기");
                    			} else if(var1.getType()==Material.LEATHER_HELMET || var1.getType()==Material.CHAINMAIL_HELMET ||
                            			var1.getType()==Material.IRON_HELMET || var1.getType()==Material.GOLDEN_HELMET || var1.getType()==Material.DIAMOND_HELMET ||
                            			var1.getType()==Material.NETHERITE_HELMET) {
                    				var1Im.setDisplayName(ChatColor.AQUA + "강화된 헬멧");
                    			} else if(var1.getType()==Material.LEATHER_CHESTPLATE ||
                            			var1.getType()==Material.CHAINMAIL_CHESTPLATE || var1.getType()==Material.IRON_CHESTPLATE || var1.getType()==Material.GOLDEN_CHESTPLATE ||
                            			var1.getType()==Material.DIAMOND_CHESTPLATE || var1.getType()==Material.NETHERITE_CHESTPLATE) {
                    				var1Im.setDisplayName(ChatColor.AQUA + "강화된 갑옷");
                    			} else if(
                            			var1.getType()==Material.LEATHER_LEGGINGS || var1.getType()==Material.CHAINMAIL_LEGGINGS || var1.getType()==Material.IRON_LEGGINGS ||
                            			var1.getType()==Material.GOLDEN_LEGGINGS || var1.getType()==Material.DIAMOND_LEGGINGS ||
                            			var1.getType()==Material.NETHERITE_LEGGINGS) {
                    				var1Im.setDisplayName(ChatColor.AQUA + "강화된 각반");
                    			} else if(var1.getType()==Material.LEATHER_BOOTS || var1.getType()==Material.CHAINMAIL_BOOTS ||
                            			var1.getType()==Material.IRON_BOOTS || var1.getType()==Material.GOLDEN_BOOTS || var1.getType()==Material.DIAMOND_BOOTS || 
                            			var1.getType()==Material.NETHERITE_BOOTS) {
                    				var1Im.setDisplayName(ChatColor.AQUA + "강화된 신발");
                    			} else {
                    				var1Im.setDisplayName(ChatColor.AQUA + "강화된 장비");
                    			}
                    			ArrayList<String> var1Lore = new ArrayList();
                    			var1Lore.add(ChatColor.GRAY + "현세에 존재하는 힘을 초월한 방어구");
                    			var1Lore.add(ChatColor.GRAY + " ");
                    			var1Im.setLore(var1Lore);
                    			var1.setItemMeta(var1Im);
                    			itemStack = var1;
            				} else {
                    			ItemMeta var1Im = itemStack.getItemMeta();
                    			var1Im.setDisplayName(itemStack.getItemMeta().getDisplayName());
                    			ArrayList<String> var1Lore = new ArrayList();
                    			var1Lore.add(ChatColor.GRAY + "현세에 존재하는 힘을 초월한 방어구");
                    			var1Lore.add(ChatColor.GRAY + " ");
                    			var1Im.setLore(var1Lore);
                    			itemStack.setItemMeta(var1Im);
            				}
            			} catch(Exception e) {
            				
            			}
            			ItemMeta item = itemStack.getItemMeta();
            			Material itemResource = inv.getItem(1).getType();
            			ItemMeta newMeta = null;
            			Reinforcement rein = new Reinforcement();
            			newMeta = rein.effectE(player, item, itemResource);
            			if(newMeta != null) {
            				ArrayList<String> lore = new ArrayList();
                			lore.add(ChatColor.GRAY + "현세에 존재하는 힘을 초월한 방어구");
                			lore.add(ChatColor.GRAY + " ");
                			lore.add("===인챈트===");
                			lore.add(ChatColor.BLUE + "방어력: " + newMeta.getLocalizedName());
                			newMeta.setLore(lore);
        					itemStack.setItemMeta(newMeta);
        					itemStack.addEnchantments(map);
        					inv.setItem(0, itemStack);
                			inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 5);
        				} else {
        					player.sendMessage("잘못된 강화방법입니다.");
        					return;
        				}
            		}
            	} else {
            		player.sendMessage(ChatColor.WHITE + "두번째 칸에는 재료를 넣어주세요.");
            	}
        	} else {
        		player.sendMessage(ChatColor.WHITE + "첫번째 칸에는 강화할 장비를 넣어주세요.(생활 도구는 강화 불가)");
        	}
		} catch(Exception e) {
			player.sendMessage(ChatColor.WHITE + "첫번째 칸에는 강화할 장비, 두번째 칸에는 재료를 넣어주세요.");
		}
		return;
	}
	
}
