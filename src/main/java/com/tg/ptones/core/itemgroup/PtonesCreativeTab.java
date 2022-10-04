package com.tg.ptones.core.itemgroup;

import com.tg.ptones.core.init.BlockInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class PtonesCreativeTab {

    public static final CreativeModeTab PTONES = new CreativeModeTab("ptones") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(BlockInit.PTONE_TILE.get());
        }
    };
}
