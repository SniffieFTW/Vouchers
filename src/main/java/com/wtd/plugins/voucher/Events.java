package com.wtd.plugins.voucher;


import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.Objects;

import static org.bukkit.Material.*;

public class Events implements Listener {


    @EventHandler
    public void onRightClick(PlayerInteractEvent e) {

        if (Objects.equals(e.getItem(), PAPER)) {
            e.getPlayer().sendMessage("You have Redeemed This Voucher");
        }



    }
}
