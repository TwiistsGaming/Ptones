package com.tg.ptones;

import com.tg.ptones.core.init.BlockInit;
import com.tg.ptones.core.init.ItemInit;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Ptones.MOD_ID)
public class Ptones {

    public static final String MOD_ID = "ptones";
    public static final String NAME = "Ptones";

    public Ptones() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        BlockInit.BLOCKS.register(bus);
        ItemInit.ITEMS.register(bus);
        MinecraftForge.EVENT_BUS.register(this);
    }
}
