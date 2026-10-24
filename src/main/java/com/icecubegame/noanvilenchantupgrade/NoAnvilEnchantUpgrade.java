package com.icecubegame.noanvilenchantupgrade;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;

@Mod(NoAnvilEnchantUpgrade.MODID)
public class NoAnvilEnchantUpgrade {
    public static final String MODID = "noanvilenchantupgrade";
    public static final Logger LOGGER = LogUtils.getLogger();

    public NoAnvilEnchantUpgrade(IEventBus modEventBus, ModContainer modContainer) {

    }
}
