package com.tg.ptones.core.events;

import com.tg.ptones.Ptones;
import com.tg.ptones.core.init.BlockInit;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.registries.RegistryObject;
@Mod.EventBusSubscriber(modid = Ptones.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(BlockInit.LAMP_FLAT.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.GLAXX_ZERO.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.GLAXX_ONE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.GLAXX_TWO.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.GLAXX_THREE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.GLAXX_FOUR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.GLAXX_FIVE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.GLAXX_SIX.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.GLAXX_SEVEN.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.GLAXX_EIGHT.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.GLAXX_NINE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.GLAXX_TEN.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.GLAXX_ELEVEN.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.GLAXX_TWELVE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.GLAXX_THIRTEEN.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.GLAXX_FOURTEEN.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.GLAXX_FIFTEEN.get(), RenderType.translucent());
    }

}
