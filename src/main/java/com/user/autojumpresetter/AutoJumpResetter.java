package com.user.autojumpresetter;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = AutoJumpResetter.MODID, version = AutoJumpResetter.VERSION)
public class AutoJumpResetter {
    public static final String MODID = "autojumpresetter";
    public static final String VERSION = "1.0";

    @EventHandler
    public void init(FMLInitializationEvent event) {
        // Register the event handler
        MinecraftForge.EVENT_BUS.register(new AttackEventHandler());
    }
}