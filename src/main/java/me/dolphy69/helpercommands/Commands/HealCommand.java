package me.dolphy69.helpercommands.Commands;

import me.dolphy69.helpercommands.HelperCommands;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.checkerframework.checker.units.qual.C;

public class HealCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(args.length == 0)
        {
            if(sender instanceof Player p)
            {
                p.setHealth(20);
                sender.sendMessage(ChatColor.GREEN + "Your hp is set to 10 hearts.");
            }
            else
            {
                sender.sendMessage(ChatColor.RED + "This command can only be run on players!");
            }
        }
        else
        {
            String playerName = args[0];
            Player p2 = Bukkit.getPlayer(playerName);
            if(p2 != null)
            {
                p2.setHealth(20);
                sender.sendMessage(ChatColor.GREEN + playerName + "'s hp is set to 10 hearts.");
            }

            else
                sender.sendMessage(ChatColor.RED + "Player named " + playerName + " could not found!");
        }
        return true;
    }
}
