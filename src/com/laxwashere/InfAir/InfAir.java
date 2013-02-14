package com.laxwashere.InfAir;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class InfAir extends JavaPlugin {
	
	public final Logger logger = Logger.getLogger("Minecraft");
	public static InfAir plugin;

	
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String CommandLabel, String[] args){
	Player player = (Player) sender;
	if(player.hasPermission("infair.air") || player.hasPermission("infair.*") || player.isOp()){
		if(CommandLabel.equalsIgnoreCase("air") || CommandLabel.equalsIgnoreCase("infair")){
			if(player instanceof Player){

					
				}
				
			}
			
			if(args.length == 0){
				player.setRemainingAir(-20);
			player.sendMessage(ChatColor.GREEN + "Oxygen is now infinite");
			return true;
			
			}else {
                player.sendMessage(ChatColor.RED + "Command argument is disabled");
                return true;
			}
			}else {
                player.sendMessage(ChatColor.RED + "You have no access to this command");
                return true;
		}
	}
}

