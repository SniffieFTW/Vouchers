package com.wtd.plugins.voucher;


import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class VoucherGive implements CommandExecutor {

    private Voucher voucher;

    public VoucherGive(Voucher voucher) {
        this.voucher = voucher;

        voucher.getConfig();
    }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.sendMessage("You have been given a voucher");

            ItemStack v = new ItemStack(Material.PAPER);
            ItemMeta vm = v.getItemMeta();
            vm.setDisplayName(String.valueOf(voucher.getConfig().getString("Voucher.name")));
            v.setItemMeta(vm);

            player.getInventory().addItem(v);

        } else {
            System.out.println("You don't have perms for this");
        }

        return false;
    }
}
