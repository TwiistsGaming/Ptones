package com.tg.ptones.common.blocks;

import com.tg.ptones.core.init.BlockInit;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.phys.BlockHitResult;


public class PtonesBlock extends Block {

    public PtonesBlock() {
        super(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE).strength(3.0F, 3.0F));
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        if(state.getBlock() == BlockInit.AGON_ZERO.get()){

            if(player.isCrouching()) {
                level.setBlockAndUpdate(pos, BlockInit.AGON_ONE.get().defaultBlockState());
            }
        }

        return super.use(state, level, pos, player, hand, hitResult);
    }
}
