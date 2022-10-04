package com.tg.ptones.core.datagen;

import com.tg.ptones.Ptones;
import com.tg.ptones.core.datagen.custom.ModEnUsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = Ptones.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){

       DataGenerator generator = event.getGenerator();
       ExistingFileHelper helper = event.getExistingFileHelper();

        if (event.includeClient()) {
            generator.addProvider(new ModBlockstateProvider(generator, helper));
            generator.addProvider(new ModItemModelProvider(generator, helper));
            generator.addProvider(new ModEnUsProvider(generator));
        }
       if(event.includeServer()) {
           generator.addProvider(new ModRecipeProvider(generator));
           generator.addProvider(new ModLootTableProvider(generator));

       }
    }
}
