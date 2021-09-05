package fr.romdu57.sellstick.commands;

import fr.romdu57.sellstick.Main;

import fr.romdu57.sellstick.utils.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;

public class sellstick implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            ItemBuilder stick = new ItemBuilder(Material.STICK).setDisplayName("§cBaton de Vente").addEnchant(Enchantment.DURABILITY, 0).setFlag(ItemFlag.HIDE_ENCHANTS);
            player.getInventory().addItem(stick.toItemStack());
            player.updateInventory();
            return true;
        }
        return false;
    }
}
