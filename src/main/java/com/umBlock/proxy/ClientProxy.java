package com.umBlock.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

    public void preInit(FMLPreInitializationEvent preInitEvent) {
        super.preInit(preInitEvent);
    }

    public void init(FMLInitializationEvent initEvent) {
        super.init(initEvent);
    }

    public void postInit(FMLPostInitializationEvent postInitEvent) {
        super.postInit(postInitEvent);
    }
}
