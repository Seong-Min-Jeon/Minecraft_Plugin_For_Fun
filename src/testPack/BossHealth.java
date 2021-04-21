package testPack;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.Player;

public class BossHealth {

	private static BossBar bar1 = Bukkit.createBossBar(ChatColor.DARK_RED + "코낭그", BarColor.RED, BarStyle.SOLID);
	private static BossBar bar2 = Bukkit.createBossBar(ChatColor.DARK_RED + "1층의 지배자", BarColor.RED, BarStyle.SOLID);
	private static BossBar bar3 = Bukkit.createBossBar(ChatColor.DARK_RED + "2층의 지배자", BarColor.RED, BarStyle.SOLID);
	private static BossBar bar4 = Bukkit.createBossBar(ChatColor.DARK_RED + "3층의 지배자", BarColor.RED, BarStyle.SOLID);
	private static BossBar bar5 = Bukkit.createBossBar(ChatColor.DARK_RED + "아덴", BarColor.RED, BarStyle.SOLID);
	private static BossBar bar6 = Bukkit.createBossBar(ChatColor.DARK_RED + "특급 요리사", BarColor.RED, BarStyle.SOLID);
	private static BossBar bar7 = Bukkit.createBossBar(ChatColor.DARK_RED + "케흘렌", BarColor.RED, BarStyle.SOLID);
	private static BossBar bar8 = Bukkit.createBossBar(ChatColor.DARK_RED + "발로르", BarColor.RED, BarStyle.SOLID);
	private static BossBar bar9 = Bukkit.createBossBar(ChatColor.DARK_RED + "요정여왕 티타니아", BarColor.RED, BarStyle.SOLID);
	private static BossBar bar10 = Bukkit.createBossBar(ChatColor.DARK_RED + "요정왕 오베론", BarColor.RED, BarStyle.SOLID);
	private static BossBar bar11 = Bukkit.createBossBar(ChatColor.DARK_RED + "아라크네", BarColor.RED, BarStyle.SOLID);
	private static BossBar bar12 = Bukkit.createBossBar(ChatColor.DARK_RED + "석상 파수꾼", BarColor.RED, BarStyle.SOLID);
	private static BossBar bar13 = Bukkit.createBossBar(ChatColor.DARK_RED + "암석 거인", BarColor.RED, BarStyle.SOLID);
	private static BossBar bar14 = Bukkit.createBossBar(ChatColor.DARK_RED + "레티아리우스", BarColor.RED, BarStyle.SOLID);
	private static BossBar bar15 = Bukkit.createBossBar(ChatColor.DARK_RED + "갈리", BarColor.RED, BarStyle.SOLID);
	private static BossBar bar16 = Bukkit.createBossBar(ChatColor.DARK_RED + "디마카에루스", BarColor.RED, BarStyle.SOLID);
	private static BossBar bar17 = Bukkit.createBossBar(ChatColor.DARK_RED + "프라에그나리", BarColor.RED, BarStyle.SOLID);
	private static BossBar bar18 = Bukkit.createBossBar(ChatColor.DARK_RED + "4층의 지배자", BarColor.RED, BarStyle.SOLID);
	private static BossBar bar19 = Bukkit.createBossBar(ChatColor.DARK_RED + "5층의 지배자", BarColor.RED, BarStyle.SOLID);
	private static BossBar bar20 = Bukkit.createBossBar(ChatColor.DARK_RED + "되살아난 피르볼그의 제사장", BarColor.RED, BarStyle.SOLID);
	private static BossBar bar21 = Bukkit.createBossBar(ChatColor.DARK_RED + "미아즈마", BarColor.RED, BarStyle.SOLID);
	private static BossBar bar22 = Bukkit.createBossBar(ChatColor.DARK_RED + "와우", BarColor.RED, BarStyle.SOLID);
	private static BossBar bar23 = Bukkit.createBossBar(ChatColor.DARK_RED + "공양을 받는 돼지", BarColor.RED, BarStyle.SOLID);
	private static BossBar bar24 = Bukkit.createBossBar(ChatColor.DARK_RED + "아빠 상어", BarColor.RED, BarStyle.SOLID);
	private static BossBar bar25 = Bukkit.createBossBar(ChatColor.DARK_RED + "해왕신 포세이돈", BarColor.RED, BarStyle.SOLID);
	
	public BossBar getBar1() {
		return bar1;
	}
	
	public BossBar getBar2() {
		return bar2;
	}
	
	public BossBar getBar3() {
		return bar3;
	}
	
	public BossBar getBar4() {
		return bar4;
	}
	
	public BossBar getBar5() {
		return bar5;
	}
	
	public BossBar getBar6() {
		return bar6;
	}
	
	public BossBar getBar7() {
		return bar7;
	}
	
	public BossBar getBar8() {
		return bar8;
	}
	
	public BossBar getBar9() {
		return bar9;
	}
	
	public BossBar getBar10() {
		return bar10;
	}
	
	public BossBar getBar11() {
		return bar11;
	}
	
	public BossBar getBar12() {
		return bar12;
	}
	
	public BossBar getBar13() {
		return bar13;
	}
	
	public BossBar getBar14() {
		return bar14;
	}
	
	public BossBar getBar15() {
		return bar15;
	}
	
	public BossBar getBar16() {
		return bar16;
	}
	
	public BossBar getBar17() {
		return bar17;
	}

	public BossBar getBar18() {
		return bar18;
	}

	public BossBar getBar19() {
		return bar19;
	}
	
	public BossBar getBar20() {
		return bar20;
	}
	
	public BossBar getBar21() {
		return bar21;
	}
	
	public BossBar getBar22() {
		return bar22;
	}
	
	public BossBar getBar23() {
		return bar23;
	}
	
	public BossBar getBar24() {
		return bar24;
	}
	
	public BossBar getBar25() {
		return bar25;
	}
	
	public void removePlayer(Player player) {
		if(bar1.getPlayers().contains(player)) { 
			bar1.removePlayer(player);
		} else if(bar2.getPlayers().contains(player)) { 
			bar2.removePlayer(player);
		} else if(bar3.getPlayers().contains(player)) { 
			bar3.removePlayer(player);
		} else if(bar4.getPlayers().contains(player)) { 
			bar4.removePlayer(player);
		} else if(bar5.getPlayers().contains(player)) { 
			bar5.removePlayer(player);
		} else if(bar6.getPlayers().contains(player)) { 
			bar6.removePlayer(player);
		} else if(bar7.getPlayers().contains(player)) { 
			bar7.removePlayer(player);
		} else if(bar8.getPlayers().contains(player)) { 
			bar8.removePlayer(player);
		} else if(bar9.getPlayers().contains(player)) { 
			bar9.removePlayer(player);
		} else if(bar11.getPlayers().contains(player)) { 
			bar11.removePlayer(player);
		} else if(bar12.getPlayers().contains(player)) { 
			bar12.removePlayer(player);
		} else if(bar13.getPlayers().contains(player)) { 
			bar13.removePlayer(player);
		} else if(bar14.getPlayers().contains(player)) { 
			bar14.removePlayer(player);
		} else if(bar15.getPlayers().contains(player)) { 
			bar15.removePlayer(player);
		} else if(bar16.getPlayers().contains(player)) { 
			bar16.removePlayer(player);
		} else if(bar17.getPlayers().contains(player)) { 
			bar17.removePlayer(player);
		} else if(bar18.getPlayers().contains(player)) { 
			bar18.removePlayer(player);
		} else if(bar19.getPlayers().contains(player)) { 
			bar19.removePlayer(player);
		} else if(bar20.getPlayers().contains(player)) { 
			bar20.removePlayer(player);
		} else if(bar21.getPlayers().contains(player)) { 
			bar21.removePlayer(player);
		} else if(bar22.getPlayers().contains(player)) { 
			bar22.removePlayer(player);
		} else if(bar23.getPlayers().contains(player)) { 
			bar23.removePlayer(player);
		} else if(bar24.getPlayers().contains(player)) { 
			bar24.removePlayer(player);
		} else if(bar25.getPlayers().contains(player)) { 
			bar25.removePlayer(player);
		}
		if(bar10.getPlayers().contains(player)) { 
			bar10.removePlayer(player);
		}
	}
	
	
}
