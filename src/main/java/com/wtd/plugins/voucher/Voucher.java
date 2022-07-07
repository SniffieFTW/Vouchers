package com.wtd.plugins.voucher;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Voucher extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("----------------------");
        System.out.println("Voucher Plugin Started");
        System.out.println("----------------------");

        //makes config
        getConfig().options().copyDefaults();
        saveDefaultConfig();

        //events
        Bukkit.getPluginManager().registerEvents(new Events(), this);

        //commands
        getCommand("voucher").setExecutor(new VoucherGive(this));


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
