package com.umBlock;


import com.umBlock.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, version = Reference.VERSION)
public class Main {

    @Mod.Instance(Reference.MOD_ID)
    public static Main instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent preInitEvent) {
        proxy.preInit(preInitEvent);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent initEvent) {
        proxy.init(initEvent);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent postInitEvent) {
        proxy.postInit(postInitEvent);
    }
}
