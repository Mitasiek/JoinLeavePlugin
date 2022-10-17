package me.mitasiek.joinleaveplugin;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinLeaveListener implements Listener {

    @EventHandler
        public void onJoin(PlayerJoinEvent e){

            Player player = e.getPlayer();

            if (player.hasPlayedBefore()){
                e.setJoinMessage(ChatColor.YELLOW + "Witamy ponownie " + ChatColor.GREEN + "" + ChatColor.BOLD + "" + player.getDisplayName() + ChatColor.RESET + "!");
            }else{

                e.setJoinMessage(ChatColor.BLUE + "Witamy gracza " + ChatColor.GREEN +""+ ChatColor.BOLD + player.getDisplayName() + ChatColor.BOLD +""+ ChatColor.BLUE + "!");

            }

    }

    @EventHandler
    public void onLeave(PlayerQuitEvent e){
        Player player = e.getPlayer();

        e.setQuitMessage(ChatColor.RED + "" + ChatColor.BOLD + player.getDisplayName() + ChatColor.RESET + " uciekł z serwera, zdrajca!");

    }

}
