package com.tg.ptones.core.datagen;

import com.tg.ptones.core.init.BlockInit;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(DataGenerator p_125973_) {
        super(p_125973_);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> p_176532_) {

        ShapedRecipeBuilder.shaped(BlockInit.PTONE_TILE.get(), 8)
                .define('E', Blocks.SMOOTH_STONE_SLAB)
                .define('S', Blocks.STONE)
                .pattern("EE ")
                .pattern("ESE")
                .pattern(" EE")
                .unlockedBy("has_stone", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.STONE).build()))
                .save(p_176532_);

        ShapedRecipeBuilder.shaped(BlockInit.LAMP_FLAT.get(), 2)
                .define('I', Tags.Items.INGOTS_IRON)
                .define('D', Tags.Items.DUSTS_GLOWSTONE)
                .define('S', Blocks.SMOOTH_STONE_SLAB)
                .pattern("IDI")
                .pattern("SSS")
                .unlockedBy("has_glowstone", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Tags.Items.DUSTS_GLOWSTONE).build()))
                .save(p_176532_);

        ShapedRecipeBuilder.shaped(BlockInit.AGON_ZERO.get(), 8)
                .define('E', BlockInit.PTONE_TILE.get())
                .define('S', Blocks.SMOOTH_STONE_SLAB)
                .pattern("EEE")
                .pattern("ESE")
                .pattern("EEE")
                .unlockedBy("has_ptone_tile", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.PTONE_TILE.get()).build()))
                .save(p_176532_);

        ShapedRecipeBuilder.shaped(BlockInit.AZUR_ZERO.get(), 8)
                .define('E', BlockInit.PTONE_TILE.get())
                .define('S', Tags.Items.DYES_BLUE)
                .pattern("EEE")
                .pattern("ESE")
                .pattern("EEE")
                .unlockedBy("has_ptone_tile", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.PTONE_TILE.get()).build()))
                .save(p_176532_);

        ShapedRecipeBuilder.shaped(BlockInit.BITT_ZERO.get(), 8)
                .define('E', BlockInit.PTONE_TILE.get())
                .define('S', Items.COAL)
                .pattern("EEE")
                .pattern("ESE")
                .pattern("EEE")
                .unlockedBy("has_ptone_tile", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.PTONE_TILE.get()).build()))
                .save(p_176532_);

        ShapedRecipeBuilder.shaped(BlockInit.CRAY_ZERO.get(), 8)
                .define('E', BlockInit.PTONE_TILE.get())
                .define('S', Blocks.TERRACOTTA)
                .pattern("EEE")
                .pattern("ESE")
                .pattern("EEE")
                .unlockedBy("has_ptone_tile", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.PTONE_TILE.get()).build()))
                .save(p_176532_);

        ShapedRecipeBuilder.shaped(BlockInit.FORT_ZERO.get(), 8)
                .define('E', BlockInit.PTONE_TILE.get())
                .define('S', Items.BRICK)
                .pattern("EEE")
                .pattern("ESE")
                .pattern("EEE")
                .unlockedBy("has_ptone_tile", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.PTONE_TILE.get()).build()))
                .save(p_176532_);

        ShapedRecipeBuilder.shaped(BlockInit.GLAXX_ZERO.get(), 8)
                .define('E', BlockInit.PTONE_TILE.get())
                .define('S', Tags.Items.GLASS)
                .pattern("EEE")
                .pattern("ESE")
                .pattern("EEE")
                .unlockedBy("has_ptone_tile", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.PTONE_TILE.get()).build()))
                .save(p_176532_);

        ShapedRecipeBuilder.shaped(BlockInit.ISZM_ZERO.get(), 8)
                .define('E', BlockInit.PTONE_TILE.get())
                .define('S', Blocks.STONE)
                .pattern("EEE")
                .pattern("ESE")
                .pattern("EEE")
                .unlockedBy("has_ptone_tile", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.PTONE_TILE.get()).build()))
                .save(p_176532_);

        ShapedRecipeBuilder.shaped(BlockInit.JELT_ZERO.get(), 8)
                .define('E', BlockInit.PTONE_TILE.get())
                .define('S', Tags.Items.DYES_ORANGE)
                .pattern("EEE")
                .pattern("ESE")
                .pattern("EEE")
                .unlockedBy("has_ptone_tile", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.PTONE_TILE.get()).build()))
                .save(p_176532_);

        ShapedRecipeBuilder.shaped(BlockInit.KORP_ZERO.get(), 8)
                .define('E', BlockInit.PTONE_TILE.get())
                .define('S', Blocks.GRAVEL)
                .pattern("EEE")
                .pattern("ESE")
                .pattern("EEE")
                .unlockedBy("has_ptone_tile", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.PTONE_TILE.get()).build()))
                .save(p_176532_);

        ShapedRecipeBuilder.shaped(BlockInit.KRYP_ZERO.get(), 8)
                .define('E', BlockInit.PTONE_TILE.get())
                .define('S', Blocks.DIRT)
                .pattern("EEE")
                .pattern("ESE")
                .pattern("EEE")
                .unlockedBy("has_ptone_tile", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.PTONE_TILE.get()).build()))
                .save(p_176532_);

        ShapedRecipeBuilder.shaped(BlockInit.LAIR_ZERO.get(), 8)
                .define('E', BlockInit.PTONE_TILE.get())
                .define('S', Blocks.GRANITE)
                .pattern("EEE")
                .pattern("ESE")
                .pattern("EEE")
                .unlockedBy("has_ptone_tile", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.PTONE_TILE.get()).build()))
                .save(p_176532_);

        ShapedRecipeBuilder.shaped(BlockInit.LAVE_ZERO.get(), 8)
                .define('E', BlockInit.PTONE_TILE.get())
                .define('S', Tags.Items.DYES_LIGHT_BLUE)
                .pattern("EEE")
                .pattern("ESE")
                .pattern("EEE")
                .unlockedBy("has_ptone_tile", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.PTONE_TILE.get()).build()))
                .save(p_176532_);

        ShapedRecipeBuilder.shaped(BlockInit.MINT_ZERO.get(), 8)
                .define('E', BlockInit.PTONE_TILE.get())
                .define('S', Tags.Items.DYES_LIME)
                .pattern("EEE")
                .pattern("ESE")
                .pattern("EEE")
                .unlockedBy("has_ptone_tile", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.PTONE_TILE.get()).build()))
                .save(p_176532_);

        ShapedRecipeBuilder.shaped(BlockInit.MYST_ZERO.get(), 8)
                .define('E', BlockInit.PTONE_TILE.get())
                .define('S', Blocks.SNOW_BLOCK)
                .pattern("EEE")
                .pattern("ESE")
                .pattern("EEE")
                .unlockedBy("has_ptone_tile", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.PTONE_TILE.get()).build()))
                .save(p_176532_);

        ShapedRecipeBuilder.shaped(BlockInit.REDS_ZERO.get(), 8)
                .define('E', BlockInit.PTONE_TILE.get())
                .define('S', Tags.Items.DYES_RED)
                .pattern("EEE")
                .pattern("ESE")
                .pattern("EEE")
                .unlockedBy("has_ptone_tile", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.PTONE_TILE.get()).build()))
                .save(p_176532_);

        ShapedRecipeBuilder.shaped(BlockInit.REED_ZERO.get(), 8)
                .define('E', BlockInit.PTONE_TILE.get())
                .define('S', Items.SUGAR_CANE)
                .pattern("EEE")
                .pattern("ESE")
                .pattern("EEE")
                .unlockedBy("has_ptone_tile", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.PTONE_TILE.get()).build()))
                .save(p_176532_);

        ShapedRecipeBuilder.shaped(BlockInit.ROEN_ZERO.get(), 8)
                .define('E', BlockInit.PTONE_TILE.get())
                .define('S', Blocks.SAND)
                .pattern("EEE")
                .pattern("ESE")
                .pattern("EEE")
                .unlockedBy("has_ptone_tile", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.PTONE_TILE.get()).build()))
                .save(p_176532_);

        ShapedRecipeBuilder.shaped(BlockInit.SOLS_ZERO.get(), 8)
                .define('E', BlockInit.PTONE_TILE.get())
                .define('S', Tags.Items.DYES_YELLOW)
                .pattern("EEE")
                .pattern("ESE")
                .pattern("EEE")
                .unlockedBy("has_ptone_tile", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.PTONE_TILE.get()).build()))
                .save(p_176532_);

        ShapedRecipeBuilder.shaped(BlockInit.SYNC_ZERO.get(), 8)
                .define('E', BlockInit.PTONE_TILE.get())
                .define('S', Tags.Items.DYES_GREEN)
                .pattern("EEE")
                .pattern("ESE")
                .pattern("EEE")
                .unlockedBy("has_ptone_tile", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.PTONE_TILE.get()).build()))
                .save(p_176532_);

        ShapedRecipeBuilder.shaped(BlockInit.TANK_ZERO.get(), 8)
                .define('E', BlockInit.PTONE_TILE.get())
                .define('S', Tags.Items.DYES_GRAY)
                .pattern("EEE")
                .pattern("ESE")
                .pattern("EEE")
                .unlockedBy("has_ptone_tile", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.PTONE_TILE.get()).build()))
                .save(p_176532_);

        ShapedRecipeBuilder.shaped(BlockInit.VECT_ZERO.get(), 8)
                .define('E', BlockInit.PTONE_TILE.get())
                .define('S', Tags.Items.DYES_BLACK)
                .pattern("EEE")
                .pattern("ESE")
                .pattern("EEE")
                .unlockedBy("has_ptone_tile", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.PTONE_TILE.get()).build()))
                .save(p_176532_);

        ShapedRecipeBuilder.shaped(BlockInit.VENA_ZERO.get(), 8)
                .define('E', BlockInit.PTONE_TILE.get())
                .define('S', Blocks.ANDESITE)
                .pattern("EEE")
                .pattern("ESE")
                .pattern("EEE")
                .unlockedBy("has_ptone_tile", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.PTONE_TILE.get()).build()))
                .save(p_176532_);

        ShapedRecipeBuilder.shaped(BlockInit.ZANE_ZERO.get(), 8)
                .define('E', BlockInit.PTONE_TILE.get())
                .define('S', Items.CLAY_BALL)
                .pattern("EEE")
                .pattern("ESE")
                .pattern("EEE")
                .unlockedBy("has_ptone_tile", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.PTONE_TILE.get()).build()))
                .save(p_176532_);

        ShapedRecipeBuilder.shaped(BlockInit.ZECH_ZERO.get(), 8)
                .define('E', BlockInit.PTONE_TILE.get())
                .define('S', Items.CHARCOAL)
                .pattern("EEE")
                .pattern("ESE")
                .pattern("EEE")
                .unlockedBy("has_ptone_tile", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.PTONE_TILE.get()).build()))
                .save(p_176532_);

        ShapedRecipeBuilder.shaped(BlockInit.ZEST_ZERO.get(), 8)
                .define('E', BlockInit.PTONE_TILE.get())
                .define('S', Items.SNOWBALL)
                .pattern("EEE")
                .pattern("ESE")
                .pattern("EEE")
                .unlockedBy("has_ptone_tile", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.PTONE_TILE.get()).build()))
                .save(p_176532_);

        ShapedRecipeBuilder.shaped(BlockInit.ZETA_ZERO.get(), 8)
                .define('E', BlockInit.PTONE_TILE.get())
                .define('S', Items.STRING)
                .pattern("EEE")
                .pattern("ESE")
                .pattern("EEE")
                .unlockedBy("has_ptone_tile", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.PTONE_TILE.get()).build()))
                .save(p_176532_);

        ShapedRecipeBuilder.shaped(BlockInit.ZION_ZERO.get(), 8)
                .define('E', BlockInit.PTONE_TILE.get())
                .define('S', Items.TORCH)
                .pattern("EEE")
                .pattern("ESE")
                .pattern("EEE")
                .unlockedBy("has_ptone_tile", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.PTONE_TILE.get()).build()))
                .save(p_176532_);

        ShapedRecipeBuilder.shaped(BlockInit.ZKUL_ZERO.get(), 8)
                .define('E', BlockInit.PTONE_TILE.get())
                .define('S', Items.BONE)
                .pattern("EEE")
                .pattern("ESE")
                .pattern("EEE")
                .unlockedBy("has_ptone_tile", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.PTONE_TILE.get()).build()))
                .save(p_176532_);

        ShapedRecipeBuilder.shaped(BlockInit.ZOEA_ZERO.get(), 8)
                .define('E', BlockInit.PTONE_TILE.get())
                .define('S', Blocks.DIORITE)
                .pattern("EEE")
                .pattern("ESE")
                .pattern("EEE")
                .unlockedBy("has_ptone_tile", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.PTONE_TILE.get()).build()))
                .save(p_176532_);

        ShapedRecipeBuilder.shaped(BlockInit.ZOME_ZERO.get(), 8)
                .define('E', BlockInit.PTONE_TILE.get())
                .define('S', Tags.Items.COBBLESTONE)
                .pattern("EEE")
                .pattern("ESE")
                .pattern("EEE")
                .unlockedBy("has_ptone_tile", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.PTONE_TILE.get()).build()))
                .save(p_176532_);

        ShapedRecipeBuilder.shaped(BlockInit.ZONE_ZERO.get(), 8)
                .define('E', BlockInit.PTONE_TILE.get())
                .define('S', Blocks.COBBLESTONE_SLAB)
                .pattern("EEE")
                .pattern("ESE")
                .pattern("EEE")
                .unlockedBy("has_ptone_tile", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.PTONE_TILE.get()).build()))
                .save(p_176532_);

        ShapedRecipeBuilder.shaped(BlockInit.ZORG_ZERO.get(), 8)
                .define('E', BlockInit.PTONE_TILE.get())
                .define('S', Blocks.CLAY)
                .pattern("EEE")
                .pattern("ESE")
                .pattern("EEE")
                .unlockedBy("has_ptone_tile", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.PTONE_TILE.get()).build()))
                .save(p_176532_);

        ShapedRecipeBuilder.shaped(BlockInit.ZTYL_ZERO.get(), 8)
                .define('E', BlockInit.PTONE_TILE.get())
                .define('S', Tags.Items.DYES_LIGHT_GRAY)
                .pattern("EEE")
                .pattern("ESE")
                .pattern("EEE")
                .unlockedBy("has_ptone_tile", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.PTONE_TILE.get()).build()))
                .save(p_176532_);

        ShapedRecipeBuilder.shaped(BlockInit.ZYTH_ZERO.get(), 8)
                .define('E', BlockInit.PTONE_TILE.get())
                .define('S', Items.STICK)
                .pattern("EEE")
                .pattern("ESE")
                .pattern("EEE")
                .unlockedBy("has_ptone_tile", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockInit.PTONE_TILE.get()).build()))
                .save(p_176532_);
    }
}
