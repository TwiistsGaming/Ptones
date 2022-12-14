package com.tg.ptones.core.datagen;

import com.tg.ptones.Ptones;
import com.tg.ptones.core.init.BlockInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
@SuppressWarnings("SpellCheckingInspection")
public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Ptones.MOD_ID, existingFileHelper);
    }

    protected void simpleBlockItem(Item item) {
        getBuilder(item.getRegistryName().toString())
                .parent(getExistingFile(modLoc("block/" + item.getRegistryName().getPath())));
    }

    protected void oneLayerItem(Item item, ResourceLocation texture) {
        ResourceLocation itemTexture = new ResourceLocation(texture.getNamespace(), "item/" + texture.getPath());
        if (existingFileHelper.exists(itemTexture, PackType.CLIENT_RESOURCES, ".png", "textures")) {
            getBuilder(item.getRegistryName().getPath()).parent(getExistingFile(mcLoc("item/generated")))
                    .texture("layer0", itemTexture);
        } else {
            System.out.println(
                    "Texture for " + item.getRegistryName().toString() + " not present at " + itemTexture.toString());
        }
    }

    protected void oneLayerItem(Item item) {
        oneLayerItem(item, item.getRegistryName());
    }

    @Override
    protected void registerModels() {
        simpleBlockItem(BlockInit.PTONE_TILE.get().asItem());
        simpleBlockItem(BlockInit.AGON_ZERO.get().asItem());
        simpleBlockItem(BlockInit.AGON_ONE.get().asItem());
        simpleBlockItem(BlockInit.AGON_TWO.get().asItem());
        simpleBlockItem(BlockInit.AGON_THREE.get().asItem());
        simpleBlockItem(BlockInit.AGON_FOUR.get().asItem());
        simpleBlockItem(BlockInit.AGON_FIVE.get().asItem());
        simpleBlockItem(BlockInit.AGON_SIX.get().asItem());
        simpleBlockItem(BlockInit.AGON_SEVEN.get().asItem());
        simpleBlockItem(BlockInit.AGON_EIGHT.get().asItem());
        simpleBlockItem(BlockInit.AGON_NINE.get().asItem());
        simpleBlockItem(BlockInit.AGON_TEN.get().asItem());
        simpleBlockItem(BlockInit.AGON_ELEVEN.get().asItem());
        simpleBlockItem(BlockInit.AGON_TWELVE.get().asItem());
        simpleBlockItem(BlockInit.AGON_THIRTEEN.get().asItem());
        simpleBlockItem(BlockInit.AGON_FOURTEEN.get().asItem());
        simpleBlockItem(BlockInit.AGON_FIFTEEN.get().asItem());

        simpleBlockItem(BlockInit.AZUR_ZERO.get().asItem());
        simpleBlockItem(BlockInit.AZUR_ONE.get().asItem());
        simpleBlockItem(BlockInit.AZUR_TWO.get().asItem());
        simpleBlockItem(BlockInit.AZUR_THREE.get().asItem());
        simpleBlockItem(BlockInit.AZUR_FOUR.get().asItem());
        simpleBlockItem(BlockInit.AZUR_FIVE.get().asItem());
        simpleBlockItem(BlockInit.AZUR_SIX.get().asItem());
        simpleBlockItem(BlockInit.AZUR_SEVEN.get().asItem());
        simpleBlockItem(BlockInit.AZUR_EIGHT.get().asItem());
        simpleBlockItem(BlockInit.AZUR_NINE.get().asItem());
        simpleBlockItem(BlockInit.AZUR_TEN.get().asItem());
        simpleBlockItem(BlockInit.AZUR_ELEVEN.get().asItem());
        simpleBlockItem(BlockInit.AZUR_TWELVE.get().asItem());
        simpleBlockItem(BlockInit.AZUR_THIRTEEN.get().asItem());
        simpleBlockItem(BlockInit.AZUR_FOURTEEN.get().asItem());
        simpleBlockItem(BlockInit.AZUR_FIFTEEN.get().asItem());

        simpleBlockItem(BlockInit.BITT_ZERO.get().asItem());
        simpleBlockItem(BlockInit.BITT_ONE.get().asItem());
        simpleBlockItem(BlockInit.BITT_TWO.get().asItem());
        simpleBlockItem(BlockInit.BITT_THREE.get().asItem());
        simpleBlockItem(BlockInit.BITT_FOUR.get().asItem());
        simpleBlockItem(BlockInit.BITT_FIVE.get().asItem());
        simpleBlockItem(BlockInit.BITT_SIX.get().asItem());
        simpleBlockItem(BlockInit.BITT_SEVEN.get().asItem());
        simpleBlockItem(BlockInit.BITT_EIGHT.get().asItem());
        simpleBlockItem(BlockInit.BITT_NINE.get().asItem());
        simpleBlockItem(BlockInit.BITT_TEN.get().asItem());
        simpleBlockItem(BlockInit.BITT_ELEVEN.get().asItem());
        simpleBlockItem(BlockInit.BITT_TWELVE.get().asItem());
        simpleBlockItem(BlockInit.BITT_THIRTEEN.get().asItem());
        simpleBlockItem(BlockInit.BITT_FOURTEEN.get().asItem());
        simpleBlockItem(BlockInit.BITT_FIFTEEN.get().asItem());

        simpleBlockItem(BlockInit.CRAY_ZERO.get().asItem());
        simpleBlockItem(BlockInit.CRAY_ONE.get().asItem());
        simpleBlockItem(BlockInit.CRAY_TWO.get().asItem());
        simpleBlockItem(BlockInit.CRAY_THREE.get().asItem());
        simpleBlockItem(BlockInit.CRAY_FOUR.get().asItem());
        simpleBlockItem(BlockInit.CRAY_FIVE.get().asItem());
        simpleBlockItem(BlockInit.CRAY_SIX.get().asItem());
        simpleBlockItem(BlockInit.CRAY_SEVEN.get().asItem());
        simpleBlockItem(BlockInit.CRAY_EIGHT.get().asItem());
        simpleBlockItem(BlockInit.CRAY_NINE.get().asItem());
        simpleBlockItem(BlockInit.CRAY_TEN.get().asItem());
        simpleBlockItem(BlockInit.CRAY_ELEVEN.get().asItem());
        simpleBlockItem(BlockInit.CRAY_TWELVE.get().asItem());
        simpleBlockItem(BlockInit.CRAY_THIRTEEN.get().asItem());
        simpleBlockItem(BlockInit.CRAY_FOURTEEN.get().asItem());
        simpleBlockItem(BlockInit.CRAY_FIFTEEN.get().asItem());

        simpleBlockItem(BlockInit.FORT_ZERO.get().asItem());
        simpleBlockItem(BlockInit.FORT_ONE.get().asItem());
        simpleBlockItem(BlockInit.FORT_TWO.get().asItem());
        simpleBlockItem(BlockInit.FORT_THREE.get().asItem());
        simpleBlockItem(BlockInit.FORT_FOUR.get().asItem());
        simpleBlockItem(BlockInit.FORT_FIVE.get().asItem());
        simpleBlockItem(BlockInit.FORT_SIX.get().asItem());
        simpleBlockItem(BlockInit.FORT_SEVEN.get().asItem());
        simpleBlockItem(BlockInit.FORT_EIGHT.get().asItem());
        simpleBlockItem(BlockInit.FORT_NINE.get().asItem());
        simpleBlockItem(BlockInit.FORT_TEN.get().asItem());
        simpleBlockItem(BlockInit.FORT_ELEVEN.get().asItem());
        simpleBlockItem(BlockInit.FORT_TWELVE.get().asItem());
        simpleBlockItem(BlockInit.FORT_THIRTEEN.get().asItem());
        simpleBlockItem(BlockInit.FORT_FOURTEEN.get().asItem());
        simpleBlockItem(BlockInit.FORT_FIFTEEN.get().asItem());

        simpleBlockItem(BlockInit.GLAXX_ZERO.get().asItem());
        simpleBlockItem(BlockInit.GLAXX_ONE.get().asItem());
        simpleBlockItem(BlockInit.GLAXX_TWO.get().asItem());
        simpleBlockItem(BlockInit.GLAXX_THREE.get().asItem());
        simpleBlockItem(BlockInit.GLAXX_FOUR.get().asItem());
        simpleBlockItem(BlockInit.GLAXX_FIVE.get().asItem());
        simpleBlockItem(BlockInit.GLAXX_SIX.get().asItem());
        simpleBlockItem(BlockInit.GLAXX_SEVEN.get().asItem());
        simpleBlockItem(BlockInit.GLAXX_EIGHT.get().asItem());
        simpleBlockItem(BlockInit.GLAXX_NINE.get().asItem());
        simpleBlockItem(BlockInit.GLAXX_TEN.get().asItem());
        simpleBlockItem(BlockInit.GLAXX_ELEVEN.get().asItem());
        simpleBlockItem(BlockInit.GLAXX_TWELVE.get().asItem());
        simpleBlockItem(BlockInit.GLAXX_THIRTEEN.get().asItem());
        simpleBlockItem(BlockInit.GLAXX_FOURTEEN.get().asItem());
        simpleBlockItem(BlockInit.GLAXX_FIFTEEN.get().asItem());

        simpleBlockItem(BlockInit.ISZM_ZERO.get().asItem());
        simpleBlockItem(BlockInit.ISZM_ONE.get().asItem());
        simpleBlockItem(BlockInit.ISZM_TWO.get().asItem());
        simpleBlockItem(BlockInit.ISZM_THREE.get().asItem());
        simpleBlockItem(BlockInit.ISZM_FOUR.get().asItem());
        simpleBlockItem(BlockInit.ISZM_FIVE.get().asItem());
        simpleBlockItem(BlockInit.ISZM_SIX.get().asItem());
        simpleBlockItem(BlockInit.ISZM_SEVEN.get().asItem());
        simpleBlockItem(BlockInit.ISZM_EIGHT.get().asItem());
        simpleBlockItem(BlockInit.ISZM_NINE.get().asItem());
        simpleBlockItem(BlockInit.ISZM_TEN.get().asItem());
        simpleBlockItem(BlockInit.ISZM_ELEVEN.get().asItem());
        simpleBlockItem(BlockInit.ISZM_TWELVE.get().asItem());
        simpleBlockItem(BlockInit.ISZM_THIRTEEN.get().asItem());
        simpleBlockItem(BlockInit.ISZM_FOURTEEN.get().asItem());
        simpleBlockItem(BlockInit.ISZM_FIFTEEN.get().asItem());

        simpleBlockItem(BlockInit.JELT_ZERO.get().asItem());
        simpleBlockItem(BlockInit.JELT_ONE.get().asItem());
        simpleBlockItem(BlockInit.JELT_TWO.get().asItem());
        simpleBlockItem(BlockInit.JELT_THREE.get().asItem());
        simpleBlockItem(BlockInit.JELT_FOUR.get().asItem());
        simpleBlockItem(BlockInit.JELT_FIVE.get().asItem());
        simpleBlockItem(BlockInit.JELT_SIX.get().asItem());
        simpleBlockItem(BlockInit.JELT_SEVEN.get().asItem());
        simpleBlockItem(BlockInit.JELT_EIGHT.get().asItem());
        simpleBlockItem(BlockInit.JELT_NINE.get().asItem());
        simpleBlockItem(BlockInit.JELT_TEN.get().asItem());
        simpleBlockItem(BlockInit.JELT_ELEVEN.get().asItem());
        simpleBlockItem(BlockInit.JELT_TWELVE.get().asItem());
        simpleBlockItem(BlockInit.JELT_THIRTEEN.get().asItem());
        simpleBlockItem(BlockInit.JELT_FOURTEEN.get().asItem());
        simpleBlockItem(BlockInit.JELT_FIFTEEN.get().asItem());

        simpleBlockItem(BlockInit.KORP_ZERO.get().asItem());
        simpleBlockItem(BlockInit.KORP_ONE.get().asItem());
        simpleBlockItem(BlockInit.KORP_TWO.get().asItem());
        simpleBlockItem(BlockInit.KORP_THREE.get().asItem());
        simpleBlockItem(BlockInit.KORP_FOUR.get().asItem());
        simpleBlockItem(BlockInit.KORP_FIVE.get().asItem());
        simpleBlockItem(BlockInit.KORP_SIX.get().asItem());
        simpleBlockItem(BlockInit.KORP_SEVEN.get().asItem());
        simpleBlockItem(BlockInit.KORP_EIGHT.get().asItem());
        simpleBlockItem(BlockInit.KORP_NINE.get().asItem());
        simpleBlockItem(BlockInit.KORP_TEN.get().asItem());
        simpleBlockItem(BlockInit.KORP_ELEVEN.get().asItem());
        simpleBlockItem(BlockInit.KORP_TWELVE.get().asItem());
        simpleBlockItem(BlockInit.KORP_THIRTEEN.get().asItem());
        simpleBlockItem(BlockInit.KORP_FOURTEEN.get().asItem());
        simpleBlockItem(BlockInit.KORP_FIFTEEN.get().asItem());

        simpleBlockItem(BlockInit.KRYP_ZERO.get().asItem());
        simpleBlockItem(BlockInit.KRYP_ONE.get().asItem());
        simpleBlockItem(BlockInit.KRYP_TWO.get().asItem());
        simpleBlockItem(BlockInit.KRYP_THREE.get().asItem());
        simpleBlockItem(BlockInit.KRYP_FOUR.get().asItem());
        simpleBlockItem(BlockInit.KRYP_FIVE.get().asItem());
        simpleBlockItem(BlockInit.KRYP_SIX.get().asItem());
        simpleBlockItem(BlockInit.KRYP_SEVEN.get().asItem());
        simpleBlockItem(BlockInit.KRYP_EIGHT.get().asItem());
        simpleBlockItem(BlockInit.KRYP_NINE.get().asItem());
        simpleBlockItem(BlockInit.KRYP_TEN.get().asItem());
        simpleBlockItem(BlockInit.KRYP_ELEVEN.get().asItem());
        simpleBlockItem(BlockInit.KRYP_TWELVE.get().asItem());
        simpleBlockItem(BlockInit.KRYP_THIRTEEN.get().asItem());
        simpleBlockItem(BlockInit.KRYP_FOURTEEN.get().asItem());
        simpleBlockItem(BlockInit.KRYP_FIFTEEN.get().asItem());

        simpleBlockItem(BlockInit.LAIR_ZERO.get().asItem());
        simpleBlockItem(BlockInit.LAIR_ONE.get().asItem());
        simpleBlockItem(BlockInit.LAIR_TWO.get().asItem());
        simpleBlockItem(BlockInit.LAIR_THREE.get().asItem());
        simpleBlockItem(BlockInit.LAIR_FOUR.get().asItem());
        simpleBlockItem(BlockInit.LAIR_FIVE.get().asItem());
        simpleBlockItem(BlockInit.LAIR_SIX.get().asItem());
        simpleBlockItem(BlockInit.LAIR_SEVEN.get().asItem());
        simpleBlockItem(BlockInit.LAIR_EIGHT.get().asItem());
        simpleBlockItem(BlockInit.LAIR_NINE.get().asItem());
        simpleBlockItem(BlockInit.LAIR_TEN.get().asItem());
        simpleBlockItem(BlockInit.LAIR_ELEVEN.get().asItem());
        simpleBlockItem(BlockInit.LAIR_TWELVE.get().asItem());
        simpleBlockItem(BlockInit.LAIR_THIRTEEN.get().asItem());
        simpleBlockItem(BlockInit.LAIR_FOURTEEN.get().asItem());
        simpleBlockItem(BlockInit.LAIR_FIFTEEN.get().asItem());

        simpleBlockItem(BlockInit.LAVE_ZERO.get().asItem());
        simpleBlockItem(BlockInit.LAVE_ONE.get().asItem());
        simpleBlockItem(BlockInit.LAVE_TWO.get().asItem());
        simpleBlockItem(BlockInit.LAVE_THREE.get().asItem());
        simpleBlockItem(BlockInit.LAVE_FOUR.get().asItem());
        simpleBlockItem(BlockInit.LAVE_FIVE.get().asItem());
        simpleBlockItem(BlockInit.LAVE_SIX.get().asItem());
        simpleBlockItem(BlockInit.LAVE_SEVEN.get().asItem());
        simpleBlockItem(BlockInit.LAVE_EIGHT.get().asItem());
        simpleBlockItem(BlockInit.LAVE_NINE.get().asItem());
        simpleBlockItem(BlockInit.LAVE_TEN.get().asItem());
        simpleBlockItem(BlockInit.LAVE_ELEVEN.get().asItem());
        simpleBlockItem(BlockInit.LAVE_TWELVE.get().asItem());
        simpleBlockItem(BlockInit.LAVE_THIRTEEN.get().asItem());
        simpleBlockItem(BlockInit.LAVE_FOURTEEN.get().asItem());
        simpleBlockItem(BlockInit.LAVE_FIFTEEN.get().asItem());

        simpleBlockItem(BlockInit.MINT_ZERO.get().asItem());
        simpleBlockItem(BlockInit.MINT_ONE.get().asItem());
        simpleBlockItem(BlockInit.MINT_TWO.get().asItem());
        simpleBlockItem(BlockInit.MINT_THREE.get().asItem());
        simpleBlockItem(BlockInit.MINT_FOUR.get().asItem());
        simpleBlockItem(BlockInit.MINT_FIVE.get().asItem());
        simpleBlockItem(BlockInit.MINT_SIX.get().asItem());
        simpleBlockItem(BlockInit.MINT_SEVEN.get().asItem());
        simpleBlockItem(BlockInit.MINT_EIGHT.get().asItem());
        simpleBlockItem(BlockInit.MINT_NINE.get().asItem());
        simpleBlockItem(BlockInit.MINT_TEN.get().asItem());
        simpleBlockItem(BlockInit.MINT_ELEVEN.get().asItem());
        simpleBlockItem(BlockInit.MINT_TWELVE.get().asItem());
        simpleBlockItem(BlockInit.MINT_THIRTEEN.get().asItem());
        simpleBlockItem(BlockInit.MINT_FOURTEEN.get().asItem());
        simpleBlockItem(BlockInit.MINT_FIFTEEN.get().asItem());

        simpleBlockItem(BlockInit.MYST_ZERO.get().asItem());
        simpleBlockItem(BlockInit.MYST_ONE.get().asItem());
        simpleBlockItem(BlockInit.MYST_TWO.get().asItem());
        simpleBlockItem(BlockInit.MYST_THREE.get().asItem());
        simpleBlockItem(BlockInit.MYST_FOUR.get().asItem());
        simpleBlockItem(BlockInit.MYST_FIVE.get().asItem());
        simpleBlockItem(BlockInit.MYST_SIX.get().asItem());
        simpleBlockItem(BlockInit.MYST_SEVEN.get().asItem());
        simpleBlockItem(BlockInit.MYST_EIGHT.get().asItem());
        simpleBlockItem(BlockInit.MYST_NINE.get().asItem());
        simpleBlockItem(BlockInit.MYST_TEN.get().asItem());
        simpleBlockItem(BlockInit.MYST_ELEVEN.get().asItem());
        simpleBlockItem(BlockInit.MYST_TWELVE.get().asItem());
        simpleBlockItem(BlockInit.MYST_THIRTEEN.get().asItem());
        simpleBlockItem(BlockInit.MYST_FOURTEEN.get().asItem());
        simpleBlockItem(BlockInit.MYST_FIFTEEN.get().asItem());

        simpleBlockItem(BlockInit.REDS_ZERO.get().asItem());
        simpleBlockItem(BlockInit.REDS_ONE.get().asItem());
        simpleBlockItem(BlockInit.REDS_TWO.get().asItem());
        simpleBlockItem(BlockInit.REDS_THREE.get().asItem());
        simpleBlockItem(BlockInit.REDS_FOUR.get().asItem());
        simpleBlockItem(BlockInit.REDS_FIVE.get().asItem());
        simpleBlockItem(BlockInit.REDS_SIX.get().asItem());
        simpleBlockItem(BlockInit.REDS_SEVEN.get().asItem());
        simpleBlockItem(BlockInit.REDS_EIGHT.get().asItem());
        simpleBlockItem(BlockInit.REDS_NINE.get().asItem());
        simpleBlockItem(BlockInit.REDS_TEN.get().asItem());
        simpleBlockItem(BlockInit.REDS_ELEVEN.get().asItem());
        simpleBlockItem(BlockInit.REDS_TWELVE.get().asItem());
        simpleBlockItem(BlockInit.REDS_THIRTEEN.get().asItem());
        simpleBlockItem(BlockInit.REDS_FOURTEEN.get().asItem());
        simpleBlockItem(BlockInit.REDS_FIFTEEN.get().asItem());

        simpleBlockItem(BlockInit.REED_ZERO.get().asItem());
        simpleBlockItem(BlockInit.REED_ONE.get().asItem());
        simpleBlockItem(BlockInit.REED_TWO.get().asItem());
        simpleBlockItem(BlockInit.REED_THREE.get().asItem());
        simpleBlockItem(BlockInit.REED_FOUR.get().asItem());
        simpleBlockItem(BlockInit.REED_FIVE.get().asItem());
        simpleBlockItem(BlockInit.REED_SIX.get().asItem());
        simpleBlockItem(BlockInit.REED_SEVEN.get().asItem());
        simpleBlockItem(BlockInit.REED_EIGHT.get().asItem());
        simpleBlockItem(BlockInit.REED_NINE.get().asItem());
        simpleBlockItem(BlockInit.REED_TEN.get().asItem());
        simpleBlockItem(BlockInit.REED_ELEVEN.get().asItem());
        simpleBlockItem(BlockInit.REED_TWELVE.get().asItem());
        simpleBlockItem(BlockInit.REED_THIRTEEN.get().asItem());
        simpleBlockItem(BlockInit.REED_FOURTEEN.get().asItem());
        simpleBlockItem(BlockInit.REED_FIFTEEN.get().asItem());

        simpleBlockItem(BlockInit.ROEN_ZERO.get().asItem());
        simpleBlockItem(BlockInit.ROEN_ONE.get().asItem());
        simpleBlockItem(BlockInit.ROEN_TWO.get().asItem());
        simpleBlockItem(BlockInit.ROEN_THREE.get().asItem());
        simpleBlockItem(BlockInit.ROEN_FOUR.get().asItem());
        simpleBlockItem(BlockInit.ROEN_FIVE.get().asItem());
        simpleBlockItem(BlockInit.ROEN_SIX.get().asItem());
        simpleBlockItem(BlockInit.ROEN_SEVEN.get().asItem());
        simpleBlockItem(BlockInit.ROEN_EIGHT.get().asItem());
        simpleBlockItem(BlockInit.ROEN_NINE.get().asItem());
        simpleBlockItem(BlockInit.ROEN_TEN.get().asItem());
        simpleBlockItem(BlockInit.ROEN_ELEVEN.get().asItem());
        simpleBlockItem(BlockInit.ROEN_TWELVE.get().asItem());
        simpleBlockItem(BlockInit.ROEN_THIRTEEN.get().asItem());
        simpleBlockItem(BlockInit.ROEN_FOURTEEN.get().asItem());
        simpleBlockItem(BlockInit.ROEN_FIFTEEN.get().asItem());

        simpleBlockItem(BlockInit.SOLS_ZERO.get().asItem());
        simpleBlockItem(BlockInit.SOLS_ONE.get().asItem());
        simpleBlockItem(BlockInit.SOLS_TWO.get().asItem());
        simpleBlockItem(BlockInit.SOLS_THREE.get().asItem());
        simpleBlockItem(BlockInit.SOLS_FOUR.get().asItem());
        simpleBlockItem(BlockInit.SOLS_FIVE.get().asItem());
        simpleBlockItem(BlockInit.SOLS_SIX.get().asItem());
        simpleBlockItem(BlockInit.SOLS_SEVEN.get().asItem());
        simpleBlockItem(BlockInit.SOLS_EIGHT.get().asItem());
        simpleBlockItem(BlockInit.SOLS_NINE.get().asItem());
        simpleBlockItem(BlockInit.SOLS_TEN.get().asItem());
        simpleBlockItem(BlockInit.SOLS_ELEVEN.get().asItem());
        simpleBlockItem(BlockInit.SOLS_TWELVE.get().asItem());
        simpleBlockItem(BlockInit.SOLS_THIRTEEN.get().asItem());
        simpleBlockItem(BlockInit.SOLS_FOURTEEN.get().asItem());
        simpleBlockItem(BlockInit.SOLS_FIFTEEN.get().asItem());

        simpleBlockItem(BlockInit.SYNC_ZERO.get().asItem());
        simpleBlockItem(BlockInit.SYNC_ONE.get().asItem());
        simpleBlockItem(BlockInit.SYNC_TWO.get().asItem());
        simpleBlockItem(BlockInit.SYNC_THREE.get().asItem());
        simpleBlockItem(BlockInit.SYNC_FOUR.get().asItem());
        simpleBlockItem(BlockInit.SYNC_FIVE.get().asItem());
        simpleBlockItem(BlockInit.SYNC_SIX.get().asItem());
        simpleBlockItem(BlockInit.SYNC_SEVEN.get().asItem());
        simpleBlockItem(BlockInit.SYNC_EIGHT.get().asItem());
        simpleBlockItem(BlockInit.SYNC_NINE.get().asItem());
        simpleBlockItem(BlockInit.SYNC_TEN.get().asItem());
        simpleBlockItem(BlockInit.SYNC_ELEVEN.get().asItem());
        simpleBlockItem(BlockInit.SYNC_TWELVE.get().asItem());
        simpleBlockItem(BlockInit.SYNC_THIRTEEN.get().asItem());
        simpleBlockItem(BlockInit.SYNC_FOURTEEN.get().asItem());
        simpleBlockItem(BlockInit.SYNC_FIFTEEN.get().asItem());

        simpleBlockItem(BlockInit.TANK_ZERO.get().asItem());
        simpleBlockItem(BlockInit.TANK_ONE.get().asItem());
        simpleBlockItem(BlockInit.TANK_TWO.get().asItem());
        simpleBlockItem(BlockInit.TANK_THREE.get().asItem());
        simpleBlockItem(BlockInit.TANK_FOUR.get().asItem());
        simpleBlockItem(BlockInit.TANK_FIVE.get().asItem());
        simpleBlockItem(BlockInit.TANK_SIX.get().asItem());
        simpleBlockItem(BlockInit.TANK_SEVEN.get().asItem());
        simpleBlockItem(BlockInit.TANK_EIGHT.get().asItem());
        simpleBlockItem(BlockInit.TANK_NINE.get().asItem());
        simpleBlockItem(BlockInit.TANK_TEN.get().asItem());
        simpleBlockItem(BlockInit.TANK_ELEVEN.get().asItem());
        simpleBlockItem(BlockInit.TANK_TWELVE.get().asItem());
        simpleBlockItem(BlockInit.TANK_THIRTEEN.get().asItem());
        simpleBlockItem(BlockInit.TANK_FOURTEEN.get().asItem());
        simpleBlockItem(BlockInit.TANK_FIFTEEN.get().asItem());

        simpleBlockItem(BlockInit.VECT_ZERO.get().asItem());
        simpleBlockItem(BlockInit.VECT_ONE.get().asItem());
        simpleBlockItem(BlockInit.VECT_TWO.get().asItem());
        simpleBlockItem(BlockInit.VECT_THREE.get().asItem());
        simpleBlockItem(BlockInit.VECT_FOUR.get().asItem());
        simpleBlockItem(BlockInit.VECT_FIVE.get().asItem());
        simpleBlockItem(BlockInit.VECT_SIX.get().asItem());
        simpleBlockItem(BlockInit.VECT_SEVEN.get().asItem());
        simpleBlockItem(BlockInit.VECT_EIGHT.get().asItem());
        simpleBlockItem(BlockInit.VECT_NINE.get().asItem());
        simpleBlockItem(BlockInit.VECT_TEN.get().asItem());
        simpleBlockItem(BlockInit.VECT_ELEVEN.get().asItem());
        simpleBlockItem(BlockInit.VECT_TWELVE.get().asItem());
        simpleBlockItem(BlockInit.VECT_THIRTEEN.get().asItem());
        simpleBlockItem(BlockInit.VECT_FOURTEEN.get().asItem());
        simpleBlockItem(BlockInit.VECT_FIFTEEN.get().asItem());

        simpleBlockItem(BlockInit.VENA_ZERO.get().asItem());
        simpleBlockItem(BlockInit.VENA_ONE.get().asItem());
        simpleBlockItem(BlockInit.VENA_TWO.get().asItem());
        simpleBlockItem(BlockInit.VENA_THREE.get().asItem());
        simpleBlockItem(BlockInit.VENA_FOUR.get().asItem());
        simpleBlockItem(BlockInit.VENA_FIVE.get().asItem());
        simpleBlockItem(BlockInit.VENA_SIX.get().asItem());
        simpleBlockItem(BlockInit.VENA_SEVEN.get().asItem());
        simpleBlockItem(BlockInit.VENA_EIGHT.get().asItem());
        simpleBlockItem(BlockInit.VENA_NINE.get().asItem());
        simpleBlockItem(BlockInit.VENA_TEN.get().asItem());
        simpleBlockItem(BlockInit.VENA_ELEVEN.get().asItem());
        simpleBlockItem(BlockInit.VENA_TWELVE.get().asItem());
        simpleBlockItem(BlockInit.VENA_THIRTEEN.get().asItem());
        simpleBlockItem(BlockInit.VENA_FOURTEEN.get().asItem());
        simpleBlockItem(BlockInit.VENA_FIFTEEN.get().asItem());

        simpleBlockItem(BlockInit.ZANE_ZERO.get().asItem());
        simpleBlockItem(BlockInit.ZANE_ONE.get().asItem());
        simpleBlockItem(BlockInit.ZANE_TWO.get().asItem());
        simpleBlockItem(BlockInit.ZANE_THREE.get().asItem());
        simpleBlockItem(BlockInit.ZANE_FOUR.get().asItem());
        simpleBlockItem(BlockInit.ZANE_FIVE.get().asItem());
        simpleBlockItem(BlockInit.ZANE_SIX.get().asItem());
        simpleBlockItem(BlockInit.ZANE_SEVEN.get().asItem());
        simpleBlockItem(BlockInit.ZANE_EIGHT.get().asItem());
        simpleBlockItem(BlockInit.ZANE_NINE.get().asItem());
        simpleBlockItem(BlockInit.ZANE_TEN.get().asItem());
        simpleBlockItem(BlockInit.ZANE_ELEVEN.get().asItem());
        simpleBlockItem(BlockInit.ZANE_TWELVE.get().asItem());
        simpleBlockItem(BlockInit.ZANE_THIRTEEN.get().asItem());
        simpleBlockItem(BlockInit.ZANE_FOURTEEN.get().asItem());
        simpleBlockItem(BlockInit.ZANE_FIFTEEN.get().asItem());

        simpleBlockItem(BlockInit.ZECH_ZERO.get().asItem());
        simpleBlockItem(BlockInit.ZECH_ONE.get().asItem());
        simpleBlockItem(BlockInit.ZECH_TWO.get().asItem());
        simpleBlockItem(BlockInit.ZECH_THREE.get().asItem());
        simpleBlockItem(BlockInit.ZECH_FOUR.get().asItem());
        simpleBlockItem(BlockInit.ZECH_FIVE.get().asItem());
        simpleBlockItem(BlockInit.ZECH_SIX.get().asItem());
        simpleBlockItem(BlockInit.ZECH_SEVEN.get().asItem());
        simpleBlockItem(BlockInit.ZECH_EIGHT.get().asItem());
        simpleBlockItem(BlockInit.ZECH_NINE.get().asItem());
        simpleBlockItem(BlockInit.ZECH_TEN.get().asItem());
        simpleBlockItem(BlockInit.ZECH_ELEVEN.get().asItem());
        simpleBlockItem(BlockInit.ZECH_TWELVE.get().asItem());
        simpleBlockItem(BlockInit.ZECH_THIRTEEN.get().asItem());
        simpleBlockItem(BlockInit.ZECH_FOURTEEN.get().asItem());
        simpleBlockItem(BlockInit.ZECH_FIFTEEN.get().asItem());

        simpleBlockItem(BlockInit.ZEST_ZERO.get().asItem());
        simpleBlockItem(BlockInit.ZEST_ONE.get().asItem());
        simpleBlockItem(BlockInit.ZEST_TWO.get().asItem());
        simpleBlockItem(BlockInit.ZEST_THREE.get().asItem());
        simpleBlockItem(BlockInit.ZEST_FOUR.get().asItem());
        simpleBlockItem(BlockInit.ZEST_FIVE.get().asItem());
        simpleBlockItem(BlockInit.ZEST_SIX.get().asItem());
        simpleBlockItem(BlockInit.ZEST_SEVEN.get().asItem());
        simpleBlockItem(BlockInit.ZEST_EIGHT.get().asItem());
        simpleBlockItem(BlockInit.ZEST_NINE.get().asItem());
        simpleBlockItem(BlockInit.ZEST_TEN.get().asItem());
        simpleBlockItem(BlockInit.ZEST_ELEVEN.get().asItem());
        simpleBlockItem(BlockInit.ZEST_TWELVE.get().asItem());
        simpleBlockItem(BlockInit.ZEST_THIRTEEN.get().asItem());
        simpleBlockItem(BlockInit.ZEST_FOURTEEN.get().asItem());
        simpleBlockItem(BlockInit.ZEST_FIFTEEN.get().asItem());

        simpleBlockItem(BlockInit.ZETA_ZERO.get().asItem());
        simpleBlockItem(BlockInit.ZETA_ONE.get().asItem());
        simpleBlockItem(BlockInit.ZETA_TWO.get().asItem());
        simpleBlockItem(BlockInit.ZETA_THREE.get().asItem());
        simpleBlockItem(BlockInit.ZETA_FOUR.get().asItem());
        simpleBlockItem(BlockInit.ZETA_FIVE.get().asItem());
        simpleBlockItem(BlockInit.ZETA_SIX.get().asItem());
        simpleBlockItem(BlockInit.ZETA_SEVEN.get().asItem());
        simpleBlockItem(BlockInit.ZETA_EIGHT.get().asItem());
        simpleBlockItem(BlockInit.ZETA_NINE.get().asItem());
        simpleBlockItem(BlockInit.ZETA_TEN.get().asItem());
        simpleBlockItem(BlockInit.ZETA_ELEVEN.get().asItem());
        simpleBlockItem(BlockInit.ZETA_TWELVE.get().asItem());
        simpleBlockItem(BlockInit.ZETA_THIRTEEN.get().asItem());
        simpleBlockItem(BlockInit.ZETA_FOURTEEN.get().asItem());
        simpleBlockItem(BlockInit.ZETA_FIFTEEN.get().asItem());

        simpleBlockItem(BlockInit.ZION_ZERO.get().asItem());
        simpleBlockItem(BlockInit.ZION_ONE.get().asItem());
        simpleBlockItem(BlockInit.ZION_TWO.get().asItem());
        simpleBlockItem(BlockInit.ZION_THREE.get().asItem());
        simpleBlockItem(BlockInit.ZION_FOUR.get().asItem());
        simpleBlockItem(BlockInit.ZION_FIVE.get().asItem());
        simpleBlockItem(BlockInit.ZION_SIX.get().asItem());
        simpleBlockItem(BlockInit.ZION_SEVEN.get().asItem());
        simpleBlockItem(BlockInit.ZION_EIGHT.get().asItem());
        simpleBlockItem(BlockInit.ZION_NINE.get().asItem());
        simpleBlockItem(BlockInit.ZION_TEN.get().asItem());
        simpleBlockItem(BlockInit.ZION_ELEVEN.get().asItem());
        simpleBlockItem(BlockInit.ZION_TWELVE.get().asItem());
        simpleBlockItem(BlockInit.ZION_THIRTEEN.get().asItem());
        simpleBlockItem(BlockInit.ZION_FOURTEEN.get().asItem());
        simpleBlockItem(BlockInit.ZION_FIFTEEN.get().asItem());

        simpleBlockItem(BlockInit.ZKUL_ZERO.get().asItem());
        simpleBlockItem(BlockInit.ZKUL_ONE.get().asItem());
        simpleBlockItem(BlockInit.ZKUL_TWO.get().asItem());
        simpleBlockItem(BlockInit.ZKUL_THREE.get().asItem());
        simpleBlockItem(BlockInit.ZKUL_FOUR.get().asItem());
        simpleBlockItem(BlockInit.ZKUL_FIVE.get().asItem());
        simpleBlockItem(BlockInit.ZKUL_SIX.get().asItem());
        simpleBlockItem(BlockInit.ZKUL_SEVEN.get().asItem());
        simpleBlockItem(BlockInit.ZKUL_EIGHT.get().asItem());
        simpleBlockItem(BlockInit.ZKUL_NINE.get().asItem());
        simpleBlockItem(BlockInit.ZKUL_TEN.get().asItem());
        simpleBlockItem(BlockInit.ZKUL_ELEVEN.get().asItem());
        simpleBlockItem(BlockInit.ZKUL_TWELVE.get().asItem());
        simpleBlockItem(BlockInit.ZKUL_THIRTEEN.get().asItem());
        simpleBlockItem(BlockInit.ZKUL_FOURTEEN.get().asItem());
        simpleBlockItem(BlockInit.ZKUL_FIFTEEN.get().asItem());

        simpleBlockItem(BlockInit.ZOEA_ZERO.get().asItem());
        simpleBlockItem(BlockInit.ZOEA_ONE.get().asItem());
        simpleBlockItem(BlockInit.ZOEA_TWO.get().asItem());
        simpleBlockItem(BlockInit.ZOEA_THREE.get().asItem());
        simpleBlockItem(BlockInit.ZOEA_FOUR.get().asItem());
        simpleBlockItem(BlockInit.ZOEA_FIVE.get().asItem());
        simpleBlockItem(BlockInit.ZOEA_SIX.get().asItem());
        simpleBlockItem(BlockInit.ZOEA_SEVEN.get().asItem());
        simpleBlockItem(BlockInit.ZOEA_EIGHT.get().asItem());
        simpleBlockItem(BlockInit.ZOEA_NINE.get().asItem());
        simpleBlockItem(BlockInit.ZOEA_TEN.get().asItem());
        simpleBlockItem(BlockInit.ZOEA_ELEVEN.get().asItem());
        simpleBlockItem(BlockInit.ZOEA_TWELVE.get().asItem());
        simpleBlockItem(BlockInit.ZOEA_THIRTEEN.get().asItem());
        simpleBlockItem(BlockInit.ZOEA_FOURTEEN.get().asItem());
        simpleBlockItem(BlockInit.ZOEA_FIFTEEN.get().asItem());

        simpleBlockItem(BlockInit.ZOME_ZERO.get().asItem());
        simpleBlockItem(BlockInit.ZOME_ONE.get().asItem());
        simpleBlockItem(BlockInit.ZOME_TWO.get().asItem());
        simpleBlockItem(BlockInit.ZOME_THREE.get().asItem());
        simpleBlockItem(BlockInit.ZOME_FOUR.get().asItem());
        simpleBlockItem(BlockInit.ZOME_FIVE.get().asItem());
        simpleBlockItem(BlockInit.ZOME_SIX.get().asItem());
        simpleBlockItem(BlockInit.ZOME_SEVEN.get().asItem());
        simpleBlockItem(BlockInit.ZOME_EIGHT.get().asItem());
        simpleBlockItem(BlockInit.ZOME_NINE.get().asItem());
        simpleBlockItem(BlockInit.ZOME_TEN.get().asItem());
        simpleBlockItem(BlockInit.ZOME_ELEVEN.get().asItem());
        simpleBlockItem(BlockInit.ZOME_TWELVE.get().asItem());
        simpleBlockItem(BlockInit.ZOME_THIRTEEN.get().asItem());
        simpleBlockItem(BlockInit.ZOME_FOURTEEN.get().asItem());
        simpleBlockItem(BlockInit.ZOME_FIFTEEN.get().asItem());

        simpleBlockItem(BlockInit.ZONE_ZERO.get().asItem());
        simpleBlockItem(BlockInit.ZONE_ONE.get().asItem());
        simpleBlockItem(BlockInit.ZONE_TWO.get().asItem());
        simpleBlockItem(BlockInit.ZONE_THREE.get().asItem());
        simpleBlockItem(BlockInit.ZONE_FOUR.get().asItem());
        simpleBlockItem(BlockInit.ZONE_FIVE.get().asItem());
        simpleBlockItem(BlockInit.ZONE_SIX.get().asItem());
        simpleBlockItem(BlockInit.ZONE_SEVEN.get().asItem());
        simpleBlockItem(BlockInit.ZONE_EIGHT.get().asItem());
        simpleBlockItem(BlockInit.ZONE_NINE.get().asItem());
        simpleBlockItem(BlockInit.ZONE_TEN.get().asItem());
        simpleBlockItem(BlockInit.ZONE_ELEVEN.get().asItem());
        simpleBlockItem(BlockInit.ZONE_TWELVE.get().asItem());
        simpleBlockItem(BlockInit.ZONE_THIRTEEN.get().asItem());
        simpleBlockItem(BlockInit.ZONE_FOURTEEN.get().asItem());
        simpleBlockItem(BlockInit.ZONE_FIFTEEN.get().asItem());

        simpleBlockItem(BlockInit.ZORG_ZERO.get().asItem());
        simpleBlockItem(BlockInit.ZORG_ONE.get().asItem());
        simpleBlockItem(BlockInit.ZORG_TWO.get().asItem());
        simpleBlockItem(BlockInit.ZORG_THREE.get().asItem());
        simpleBlockItem(BlockInit.ZORG_FOUR.get().asItem());
        simpleBlockItem(BlockInit.ZORG_FIVE.get().asItem());
        simpleBlockItem(BlockInit.ZORG_SIX.get().asItem());
        simpleBlockItem(BlockInit.ZORG_SEVEN.get().asItem());
        simpleBlockItem(BlockInit.ZORG_EIGHT.get().asItem());
        simpleBlockItem(BlockInit.ZORG_NINE.get().asItem());
        simpleBlockItem(BlockInit.ZORG_TEN.get().asItem());
        simpleBlockItem(BlockInit.ZORG_ELEVEN.get().asItem());
        simpleBlockItem(BlockInit.ZORG_TWELVE.get().asItem());
        simpleBlockItem(BlockInit.ZORG_THIRTEEN.get().asItem());
        simpleBlockItem(BlockInit.ZORG_FOURTEEN.get().asItem());
        simpleBlockItem(BlockInit.ZORG_FIFTEEN.get().asItem());

        simpleBlockItem(BlockInit.ZTYL_ZERO.get().asItem());
        simpleBlockItem(BlockInit.ZTYL_ONE.get().asItem());
        simpleBlockItem(BlockInit.ZTYL_TWO.get().asItem());
        simpleBlockItem(BlockInit.ZTYL_THREE.get().asItem());
        simpleBlockItem(BlockInit.ZTYL_FOUR.get().asItem());
        simpleBlockItem(BlockInit.ZTYL_FIVE.get().asItem());
        simpleBlockItem(BlockInit.ZTYL_SIX.get().asItem());
        simpleBlockItem(BlockInit.ZTYL_SEVEN.get().asItem());
        simpleBlockItem(BlockInit.ZTYL_EIGHT.get().asItem());
        simpleBlockItem(BlockInit.ZTYL_NINE.get().asItem());
        simpleBlockItem(BlockInit.ZTYL_TEN.get().asItem());
        simpleBlockItem(BlockInit.ZTYL_ELEVEN.get().asItem());
        simpleBlockItem(BlockInit.ZTYL_TWELVE.get().asItem());
        simpleBlockItem(BlockInit.ZTYL_THIRTEEN.get().asItem());
        simpleBlockItem(BlockInit.ZTYL_FOURTEEN.get().asItem());
        simpleBlockItem(BlockInit.ZTYL_FIFTEEN.get().asItem());

        simpleBlockItem(BlockInit.ZYTH_ZERO.get().asItem());
        simpleBlockItem(BlockInit.ZYTH_ONE.get().asItem());
        simpleBlockItem(BlockInit.ZYTH_TWO.get().asItem());
        simpleBlockItem(BlockInit.ZYTH_THREE.get().asItem());
        simpleBlockItem(BlockInit.ZYTH_FOUR.get().asItem());
        simpleBlockItem(BlockInit.ZYTH_FIVE.get().asItem());
        simpleBlockItem(BlockInit.ZYTH_SIX.get().asItem());
        simpleBlockItem(BlockInit.ZYTH_SEVEN.get().asItem());
        simpleBlockItem(BlockInit.ZYTH_EIGHT.get().asItem());
        simpleBlockItem(BlockInit.ZYTH_NINE.get().asItem());
        simpleBlockItem(BlockInit.ZYTH_TEN.get().asItem());
        simpleBlockItem(BlockInit.ZYTH_ELEVEN.get().asItem());
        simpleBlockItem(BlockInit.ZYTH_TWELVE.get().asItem());
        simpleBlockItem(BlockInit.ZYTH_THIRTEEN.get().asItem());
        simpleBlockItem(BlockInit.ZYTH_FOURTEEN.get().asItem());
        simpleBlockItem(BlockInit.ZYTH_FIFTEEN.get().asItem());
    }


}
