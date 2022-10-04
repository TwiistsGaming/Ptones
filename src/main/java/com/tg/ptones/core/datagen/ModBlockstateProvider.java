package com.tg.ptones.core.datagen;


import com.tg.ptones.Ptones;
import com.tg.ptones.core.init.BlockInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
@SuppressWarnings("SpellCheckingInspection")
public class ModBlockstateProvider extends BlockStateProvider {
    public ModBlockstateProvider(DataGenerator gen,  ExistingFileHelper exFileHelper) {
        super(gen, Ptones.MOD_ID, exFileHelper);

    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(BlockInit.PTONE_TILE.get());
        simpleAgonBlock(BlockInit.AGON_ZERO.get());
        simpleAgonBlock(BlockInit.AGON_ONE.get());
        simpleAgonBlock(BlockInit.AGON_TWO.get());
        simpleAgonBlock(BlockInit.AGON_THREE.get());
        simpleAgonBlock(BlockInit.AGON_FOUR.get());
        simpleAgonBlock(BlockInit.AGON_FIVE.get());
        simpleAgonBlock(BlockInit.AGON_SIX.get());
        simpleAgonBlock(BlockInit.AGON_SEVEN.get());
        simpleAgonBlock(BlockInit.AGON_EIGHT.get());
        simpleAgonBlock(BlockInit.AGON_NINE.get());
        simpleAgonBlock(BlockInit.AGON_TEN.get());
        simpleAgonBlock(BlockInit.AGON_ELEVEN.get());
        simpleAgonBlock(BlockInit.AGON_TWELVE.get());
        simpleAgonBlock(BlockInit.AGON_THIRTEEN.get());
        simpleAgonBlock(BlockInit.AGON_FOURTEEN.get());
        simpleAgonBlock(BlockInit.AGON_FIFTEEN.get());

        simpleAzurBlock(BlockInit.AZUR_ZERO.get());
        simpleAzurBlock(BlockInit.AZUR_ONE.get());
        simpleAzurBlock(BlockInit.AZUR_TWO.get());
        simpleAzurBlock(BlockInit.AZUR_THREE.get());
        simpleAzurBlock(BlockInit.AZUR_FOUR.get());
        simpleAzurBlock(BlockInit.AZUR_FIVE.get());
        simpleAzurBlock(BlockInit.AZUR_SIX.get());
        simpleAzurBlock(BlockInit.AZUR_SEVEN.get());
        simpleAzurBlock(BlockInit.AZUR_EIGHT.get());
        simpleAzurBlock(BlockInit.AZUR_NINE.get());
        simpleAzurBlock(BlockInit.AZUR_TEN.get());
        simpleAzurBlock(BlockInit.AZUR_ELEVEN.get());
        simpleAzurBlock(BlockInit.AZUR_TWELVE.get());
        simpleAzurBlock(BlockInit.AZUR_THIRTEEN.get());
        simpleAzurBlock(BlockInit.AZUR_FOURTEEN.get());
        simpleAzurBlock(BlockInit.AZUR_FIFTEEN.get());

        simpleBittBlock(BlockInit.BITT_ZERO.get());
        simpleBittBlock(BlockInit.BITT_ONE.get());
        simpleBittBlock(BlockInit.BITT_TWO.get());
        simpleBittBlock(BlockInit.BITT_THREE.get());
        simpleBittBlock(BlockInit.BITT_FOUR.get());
        simpleBittBlock(BlockInit.BITT_FIVE.get());
        simpleBittBlock(BlockInit.BITT_SIX.get());
        simpleBittBlock(BlockInit.BITT_SEVEN.get());
        simpleBittBlock(BlockInit.BITT_EIGHT.get());
        simpleBittBlock(BlockInit.BITT_NINE.get());
        simpleBittBlock(BlockInit.BITT_TEN.get());
        simpleBittBlock(BlockInit.BITT_ELEVEN.get());
        simpleBittBlock(BlockInit.BITT_TWELVE.get());
        simpleBittBlock(BlockInit.BITT_THIRTEEN.get());
        simpleBittBlock(BlockInit.BITT_FOURTEEN.get());
        simpleBittBlock(BlockInit.BITT_FIFTEEN.get());

        simpleCrayBlock(BlockInit.CRAY_ZERO.get());
        simpleCrayBlock(BlockInit.CRAY_ONE.get());
        simpleCrayBlock(BlockInit.CRAY_TWO.get());
        simpleCrayBlock(BlockInit.CRAY_THREE.get());
        simpleCrayBlock(BlockInit.CRAY_FOUR.get());
        simpleCrayBlock(BlockInit.CRAY_FIVE.get());
        simpleCrayBlock(BlockInit.CRAY_SIX.get());
        simpleCrayBlock(BlockInit.CRAY_SEVEN.get());
        simpleCrayBlock(BlockInit.CRAY_EIGHT.get());
        simpleCrayBlock(BlockInit.CRAY_NINE.get());
        simpleCrayBlock(BlockInit.CRAY_TEN.get());
        simpleCrayBlock(BlockInit.CRAY_ELEVEN.get());
        simpleCrayBlock(BlockInit.CRAY_TWELVE.get());
        simpleCrayBlock(BlockInit.CRAY_THIRTEEN.get());
        simpleCrayBlock(BlockInit.CRAY_FOURTEEN.get());
        simpleCrayBlock(BlockInit.CRAY_FIFTEEN.get());

        simpleFortBlock(BlockInit.FORT_ZERO.get());
        simpleFortBlock(BlockInit.FORT_ONE.get());
        simpleFortBlock(BlockInit.FORT_TWO.get());
        simpleFortBlock(BlockInit.FORT_THREE.get());
        simpleFortBlock(BlockInit.FORT_FOUR.get());
        simpleFortBlock(BlockInit.FORT_FIVE.get());
        simpleFortBlock(BlockInit.FORT_SIX.get());
        simpleFortBlock(BlockInit.FORT_SEVEN.get());
        simpleFortBlock(BlockInit.FORT_EIGHT.get());
        simpleFortBlock(BlockInit.FORT_NINE.get());
        simpleFortBlock(BlockInit.FORT_TEN.get());
        simpleFortBlock(BlockInit.FORT_ELEVEN.get());
        simpleFortBlock(BlockInit.FORT_TWELVE.get());
        simpleFortBlock(BlockInit.FORT_THIRTEEN.get());
        simpleFortBlock(BlockInit.FORT_FOURTEEN.get());
        simpleFortBlock(BlockInit.FORT_FIFTEEN.get());

        simpleglaxxBlock(BlockInit.GLAXX_ZERO.get());
        simpleglaxxBlock(BlockInit.GLAXX_ONE.get());
        simpleglaxxBlock(BlockInit.GLAXX_TWO.get());
        simpleglaxxBlock(BlockInit.GLAXX_THREE.get());
        simpleglaxxBlock(BlockInit.GLAXX_FOUR.get());
        simpleglaxxBlock(BlockInit.GLAXX_FIVE.get());
        simpleglaxxBlock(BlockInit.GLAXX_SIX.get());
        simpleglaxxBlock(BlockInit.GLAXX_SEVEN.get());
        simpleglaxxBlock(BlockInit.GLAXX_EIGHT.get());
        simpleglaxxBlock(BlockInit.GLAXX_NINE.get());
        simpleglaxxBlock(BlockInit.GLAXX_TEN.get());
        simpleglaxxBlock(BlockInit.GLAXX_ELEVEN.get());
        simpleglaxxBlock(BlockInit.GLAXX_TWELVE.get());
        simpleglaxxBlock(BlockInit.GLAXX_THIRTEEN.get());
        simpleglaxxBlock(BlockInit.GLAXX_FOURTEEN.get());
        simpleglaxxBlock(BlockInit.GLAXX_FIFTEEN.get());

        simpleIszmBlock(BlockInit.ISZM_ZERO.get());
        simpleIszmBlock(BlockInit.ISZM_ONE.get());
        simpleIszmBlock(BlockInit.ISZM_TWO.get());
        simpleIszmBlock(BlockInit.ISZM_THREE.get());
        simpleIszmBlock(BlockInit.ISZM_FOUR.get());
        simpleIszmBlock(BlockInit.ISZM_FIVE.get());
        simpleIszmBlock(BlockInit.ISZM_SIX.get());
        simpleIszmBlock(BlockInit.ISZM_SEVEN.get());
        simpleIszmBlock(BlockInit.ISZM_EIGHT.get());
        simpleIszmBlock(BlockInit.ISZM_NINE.get());
        simpleIszmBlock(BlockInit.ISZM_TEN.get());
        simpleIszmBlock(BlockInit.ISZM_ELEVEN.get());
        simpleIszmBlock(BlockInit.ISZM_TWELVE.get());
        simpleIszmBlock(BlockInit.ISZM_THIRTEEN.get());
        simpleIszmBlock(BlockInit.ISZM_FOURTEEN.get());
        simpleIszmBlock(BlockInit.ISZM_FIFTEEN.get());

        simpleJeltBlock(BlockInit.JELT_ZERO.get());
        simpleJeltBlock(BlockInit.JELT_ONE.get());
        simpleJeltBlock(BlockInit.JELT_TWO.get());
        simpleJeltBlock(BlockInit.JELT_THREE.get());
        simpleJeltBlock(BlockInit.JELT_FOUR.get());
        simpleJeltBlock(BlockInit.JELT_FIVE.get());
        simpleJeltBlock(BlockInit.JELT_SIX.get());
        simpleJeltBlock(BlockInit.JELT_SEVEN.get());
        simpleJeltBlock(BlockInit.JELT_EIGHT.get());
        simpleJeltBlock(BlockInit.JELT_NINE.get());
        simpleJeltBlock(BlockInit.JELT_TEN.get());
        simpleJeltBlock(BlockInit.JELT_ELEVEN.get());
        simpleJeltBlock(BlockInit.JELT_TWELVE.get());
        simpleJeltBlock(BlockInit.JELT_THIRTEEN.get());
        simpleJeltBlock(BlockInit.JELT_FOURTEEN.get());
        simpleJeltBlock(BlockInit.JELT_FIFTEEN.get());

        simpleKorpBlock(BlockInit.KORP_ZERO.get());
        simpleKorpBlock(BlockInit.KORP_ONE.get());
        simpleKorpBlock(BlockInit.KORP_TWO.get());
        simpleKorpBlock(BlockInit.KORP_THREE.get());
        simpleKorpBlock(BlockInit.KORP_FOUR.get());
        simpleKorpBlock(BlockInit.KORP_FIVE.get());
        simpleKorpBlock(BlockInit.KORP_SIX.get());
        simpleKorpBlock(BlockInit.KORP_SEVEN.get());
        simpleKorpBlock(BlockInit.KORP_EIGHT.get());
        simpleKorpBlock(BlockInit.KORP_NINE.get());
        simpleKorpBlock(BlockInit.KORP_TEN.get());
        simpleKorpBlock(BlockInit.KORP_ELEVEN.get());
        simpleKorpBlock(BlockInit.KORP_TWELVE.get());
        simpleKorpBlock(BlockInit.KORP_THIRTEEN.get());
        simpleKorpBlock(BlockInit.KORP_FOURTEEN.get());
        simpleKorpBlock(BlockInit.KORP_FIFTEEN.get());

        simpleKrypBlock(BlockInit.KRYP_ZERO.get());
        simpleKrypBlock(BlockInit.KRYP_ONE.get());
        simpleKrypBlock(BlockInit.KRYP_TWO.get());
        simpleKrypBlock(BlockInit.KRYP_THREE.get());
        simpleKrypBlock(BlockInit.KRYP_FOUR.get());
        simpleKrypBlock(BlockInit.KRYP_FIVE.get());
        simpleKrypBlock(BlockInit.KRYP_SIX.get());
        simpleKrypBlock(BlockInit.KRYP_SEVEN.get());
        simpleKrypBlock(BlockInit.KRYP_EIGHT.get());
        simpleKrypBlock(BlockInit.KRYP_NINE.get());
        simpleKrypBlock(BlockInit.KRYP_TEN.get());
        simpleKrypBlock(BlockInit.KRYP_ELEVEN.get());
        simpleKrypBlock(BlockInit.KRYP_TWELVE.get());
        simpleKrypBlock(BlockInit.KRYP_THIRTEEN.get());
        simpleKrypBlock(BlockInit.KRYP_FOURTEEN.get());
        simpleKrypBlock(BlockInit.KRYP_FIFTEEN.get());

        simpleLairBlock(BlockInit.LAIR_ZERO.get());
        simpleLairBlock(BlockInit.LAIR_ONE.get());
        simpleLairBlock(BlockInit.LAIR_TWO.get());
        simpleLairBlock(BlockInit.LAIR_THREE.get());
        simpleLairBlock(BlockInit.LAIR_FOUR.get());
        simpleLairBlock(BlockInit.LAIR_FIVE.get());
        simpleLairBlock(BlockInit.LAIR_SIX.get());
        simpleLairBlock(BlockInit.LAIR_SEVEN.get());
        simpleLairBlock(BlockInit.LAIR_EIGHT.get());
        simpleLairBlock(BlockInit.LAIR_NINE.get());
        simpleLairBlock(BlockInit.LAIR_TEN.get());
        simpleLairBlock(BlockInit.LAIR_ELEVEN.get());
        simpleLairBlock(BlockInit.LAIR_TWELVE.get());
        simpleLairBlock(BlockInit.LAIR_THIRTEEN.get());
        simpleLairBlock(BlockInit.LAIR_FOURTEEN.get());
        simpleLairBlock(BlockInit.LAIR_FIFTEEN.get());

        simpleLaveBlock(BlockInit.LAVE_ZERO.get());
        simpleLaveBlock(BlockInit.LAVE_ONE.get());
        simpleLaveBlock(BlockInit.LAVE_TWO.get());
        simpleLaveBlock(BlockInit.LAVE_THREE.get());
        simpleLaveBlock(BlockInit.LAVE_FOUR.get());
        simpleLaveBlock(BlockInit.LAVE_FIVE.get());
        simpleLaveBlock(BlockInit.LAVE_SIX.get());
        simpleLaveBlock(BlockInit.LAVE_SEVEN.get());
        simpleLaveBlock(BlockInit.LAVE_EIGHT.get());
        simpleLaveBlock(BlockInit.LAVE_NINE.get());
        simpleLaveBlock(BlockInit.LAVE_TEN.get());
        simpleLaveBlock(BlockInit.LAVE_ELEVEN.get());
        simpleLaveBlock(BlockInit.LAVE_TWELVE.get());
        simpleLaveBlock(BlockInit.LAVE_THIRTEEN.get());
        simpleLaveBlock(BlockInit.LAVE_FOURTEEN.get());
        simpleLaveBlock(BlockInit.LAVE_FIFTEEN.get());

        simpleMintBlock(BlockInit.MINT_ZERO.get());
        simpleMintBlock(BlockInit.MINT_ONE.get());
        simpleMintBlock(BlockInit.MINT_TWO.get());
        simpleMintBlock(BlockInit.MINT_THREE.get());
        simpleMintBlock(BlockInit.MINT_FOUR.get());
        simpleMintBlock(BlockInit.MINT_FIVE.get());
        simpleMintBlock(BlockInit.MINT_SIX.get());
        simpleMintBlock(BlockInit.MINT_SEVEN.get());
        simpleMintBlock(BlockInit.MINT_EIGHT.get());
        simpleMintBlock(BlockInit.MINT_NINE.get());
        simpleMintBlock(BlockInit.MINT_TEN.get());
        simpleMintBlock(BlockInit.MINT_ELEVEN.get());
        simpleMintBlock(BlockInit.MINT_TWELVE.get());
        simpleMintBlock(BlockInit.MINT_THIRTEEN.get());
        simpleMintBlock(BlockInit.MINT_FOURTEEN.get());
        simpleMintBlock(BlockInit.MINT_FIFTEEN.get());

        simpleMystBlock(BlockInit.MYST_ZERO.get());
        simpleMystBlock(BlockInit.MYST_ONE.get());
        simpleMystBlock(BlockInit.MYST_TWO.get());
        simpleMystBlock(BlockInit.MYST_THREE.get());
        simpleMystBlock(BlockInit.MYST_FOUR.get());
        simpleMystBlock(BlockInit.MYST_FIVE.get());
        simpleMystBlock(BlockInit.MYST_SIX.get());
        simpleMystBlock(BlockInit.MYST_SEVEN.get());
        simpleMystBlock(BlockInit.MYST_EIGHT.get());
        simpleMystBlock(BlockInit.MYST_NINE.get());
        simpleMystBlock(BlockInit.MYST_TEN.get());
        simpleMystBlock(BlockInit.MYST_ELEVEN.get());
        simpleMystBlock(BlockInit.MYST_TWELVE.get());
        simpleMystBlock(BlockInit.MYST_THIRTEEN.get());
        simpleMystBlock(BlockInit.MYST_FOURTEEN.get());
        simpleMystBlock(BlockInit.MYST_FIFTEEN.get());

        simpleRedsBlock(BlockInit.REDS_ZERO.get());
        simpleRedsBlock(BlockInit.REDS_ONE.get());
        simpleRedsBlock(BlockInit.REDS_TWO.get());
        simpleRedsBlock(BlockInit.REDS_THREE.get());
        simpleRedsBlock(BlockInit.REDS_FOUR.get());
        simpleRedsBlock(BlockInit.REDS_FIVE.get());
        simpleRedsBlock(BlockInit.REDS_SIX.get());
        simpleRedsBlock(BlockInit.REDS_SEVEN.get());
        simpleRedsBlock(BlockInit.REDS_EIGHT.get());
        simpleRedsBlock(BlockInit.REDS_NINE.get());
        simpleRedsBlock(BlockInit.REDS_TEN.get());
        simpleRedsBlock(BlockInit.REDS_ELEVEN.get());
        simpleRedsBlock(BlockInit.REDS_TWELVE.get());
        simpleRedsBlock(BlockInit.REDS_THIRTEEN.get());
        simpleRedsBlock(BlockInit.REDS_FOURTEEN.get());
        simpleRedsBlock(BlockInit.REDS_FIFTEEN.get());

        simpleReedBlock(BlockInit.REED_ZERO.get());
        simpleReedBlock(BlockInit.REED_ONE.get());
        simpleReedBlock(BlockInit.REED_TWO.get());
        simpleReedBlock(BlockInit.REED_THREE.get());
        simpleReedBlock(BlockInit.REED_FOUR.get());
        simpleReedBlock(BlockInit.REED_FIVE.get());
        simpleReedBlock(BlockInit.REED_SIX.get());
        simpleReedBlock(BlockInit.REED_SEVEN.get());
        simpleReedBlock(BlockInit.REED_EIGHT.get());
        simpleReedBlock(BlockInit.REED_NINE.get());
        simpleReedBlock(BlockInit.REED_TEN.get());
        simpleReedBlock(BlockInit.REED_ELEVEN.get());
        simpleReedBlock(BlockInit.REED_TWELVE.get());
        simpleReedBlock(BlockInit.REED_THIRTEEN.get());
        simpleReedBlock(BlockInit.REED_FOURTEEN.get());
        simpleReedBlock(BlockInit.REED_FIFTEEN.get());

        simpleRoenBlock(BlockInit.ROEN_ZERO.get());
        simpleRoenBlock(BlockInit.ROEN_ONE.get());
        simpleRoenBlock(BlockInit.ROEN_TWO.get());
        simpleRoenBlock(BlockInit.ROEN_THREE.get());
        simpleRoenBlock(BlockInit.ROEN_FOUR.get());
        simpleRoenBlock(BlockInit.ROEN_FIVE.get());
        simpleRoenBlock(BlockInit.ROEN_SIX.get());
        simpleRoenBlock(BlockInit.ROEN_SEVEN.get());
        simpleRoenBlock(BlockInit.ROEN_EIGHT.get());
        simpleRoenBlock(BlockInit.ROEN_NINE.get());
        simpleRoenBlock(BlockInit.ROEN_TEN.get());
        simpleRoenBlock(BlockInit.ROEN_ELEVEN.get());
        simpleRoenBlock(BlockInit.ROEN_TWELVE.get());
        simpleRoenBlock(BlockInit.ROEN_THIRTEEN.get());
        simpleRoenBlock(BlockInit.ROEN_FOURTEEN.get());
        simpleRoenBlock(BlockInit.ROEN_FIFTEEN.get());

        simpleSolsBlock(BlockInit.SOLS_ZERO.get());
        simpleSolsBlock(BlockInit.SOLS_ONE.get());
        simpleSolsBlock(BlockInit.SOLS_TWO.get());
        simpleSolsBlock(BlockInit.SOLS_THREE.get());
        simpleSolsBlock(BlockInit.SOLS_FOUR.get());
        simpleSolsBlock(BlockInit.SOLS_FIVE.get());
        simpleSolsBlock(BlockInit.SOLS_SIX.get());
        simpleSolsBlock(BlockInit.SOLS_SEVEN.get());
        simpleSolsBlock(BlockInit.SOLS_EIGHT.get());
        simpleSolsBlock(BlockInit.SOLS_NINE.get());
        simpleSolsBlock(BlockInit.SOLS_TEN.get());
        simpleSolsBlock(BlockInit.SOLS_ELEVEN.get());
        simpleSolsBlock(BlockInit.SOLS_TWELVE.get());
        simpleSolsBlock(BlockInit.SOLS_THIRTEEN.get());
        simpleSolsBlock(BlockInit.SOLS_FOURTEEN.get());
        simpleSolsBlock(BlockInit.SOLS_FIFTEEN.get());

        simpleSyncBlock(BlockInit.SYNC_ZERO.get());
        simpleSyncBlock(BlockInit.SYNC_ONE.get());
        simpleSyncBlock(BlockInit.SYNC_TWO.get());
        simpleSyncBlock(BlockInit.SYNC_THREE.get());
        simpleSyncBlock(BlockInit.SYNC_FOUR.get());
        simpleSyncBlock(BlockInit.SYNC_FIVE.get());
        simpleSyncBlock(BlockInit.SYNC_SIX.get());
        simpleSyncBlock(BlockInit.SYNC_SEVEN.get());
        simpleSyncBlock(BlockInit.SYNC_EIGHT.get());
        simpleSyncBlock(BlockInit.SYNC_NINE.get());
        simpleSyncBlock(BlockInit.SYNC_TEN.get());
        simpleSyncBlock(BlockInit.SYNC_ELEVEN.get());
        simpleSyncBlock(BlockInit.SYNC_TWELVE.get());
        simpleSyncBlock(BlockInit.SYNC_THIRTEEN.get());
        simpleSyncBlock(BlockInit.SYNC_FOURTEEN.get());
        simpleSyncBlock(BlockInit.SYNC_FIFTEEN.get());

        simpleTankBlock(BlockInit.TANK_ZERO.get());
        simpleTankBlock(BlockInit.TANK_ONE.get());
        simpleTankBlock(BlockInit.TANK_TWO.get());
        simpleTankBlock(BlockInit.TANK_THREE.get());
        simpleTankBlock(BlockInit.TANK_FOUR.get());
        simpleTankBlock(BlockInit.TANK_FIVE.get());
        simpleTankBlock(BlockInit.TANK_SIX.get());
        simpleTankBlock(BlockInit.TANK_SEVEN.get());
        simpleTankBlock(BlockInit.TANK_EIGHT.get());
        simpleTankBlock(BlockInit.TANK_NINE.get());
        simpleTankBlock(BlockInit.TANK_TEN.get());
        simpleTankBlock(BlockInit.TANK_ELEVEN.get());
        simpleTankBlock(BlockInit.TANK_TWELVE.get());
        simpleTankBlock(BlockInit.TANK_THIRTEEN.get());
        simpleTankBlock(BlockInit.TANK_FOURTEEN.get());
        simpleTankBlock(BlockInit.TANK_FIFTEEN.get());

        simpleVectBlock(BlockInit.VECT_ZERO.get());
        simpleVectBlock(BlockInit.VECT_ONE.get());
        simpleVectBlock(BlockInit.VECT_TWO.get());
        simpleVectBlock(BlockInit.VECT_THREE.get());
        simpleVectBlock(BlockInit.VECT_FOUR.get());
        simpleVectBlock(BlockInit.VECT_FIVE.get());
        simpleVectBlock(BlockInit.VECT_SIX.get());
        simpleVectBlock(BlockInit.VECT_SEVEN.get());
        simpleVectBlock(BlockInit.VECT_EIGHT.get());
        simpleVectBlock(BlockInit.VECT_NINE.get());
        simpleVectBlock(BlockInit.VECT_TEN.get());
        simpleVectBlock(BlockInit.VECT_ELEVEN.get());
        simpleVectBlock(BlockInit.VECT_TWELVE.get());
        simpleVectBlock(BlockInit.VECT_THIRTEEN.get());
        simpleVectBlock(BlockInit.VECT_FOURTEEN.get());
        simpleVectBlock(BlockInit.VECT_FIFTEEN.get());

        simpleVenaBlock(BlockInit.VENA_ZERO.get());
        simpleVenaBlock(BlockInit.VENA_ONE.get());
        simpleVenaBlock(BlockInit.VENA_TWO.get());
        simpleVenaBlock(BlockInit.VENA_THREE.get());
        simpleVenaBlock(BlockInit.VENA_FOUR.get());
        simpleVenaBlock(BlockInit.VENA_FIVE.get());
        simpleVenaBlock(BlockInit.VENA_SIX.get());
        simpleVenaBlock(BlockInit.VENA_SEVEN.get());
        simpleVenaBlock(BlockInit.VENA_EIGHT.get());
        simpleVenaBlock(BlockInit.VENA_NINE.get());
        simpleVenaBlock(BlockInit.VENA_TEN.get());
        simpleVenaBlock(BlockInit.VENA_ELEVEN.get());
        simpleVenaBlock(BlockInit.VENA_TWELVE.get());
        simpleVenaBlock(BlockInit.VENA_THIRTEEN.get());
        simpleVenaBlock(BlockInit.VENA_FOURTEEN.get());
        simpleVenaBlock(BlockInit.VENA_FIFTEEN.get());

        simpleZaneBlock(BlockInit.ZANE_ZERO.get());
        simpleZaneBlock(BlockInit.ZANE_ONE.get());
        simpleZaneBlock(BlockInit.ZANE_TWO.get());
        simpleZaneBlock(BlockInit.ZANE_THREE.get());
        simpleZaneBlock(BlockInit.ZANE_FOUR.get());
        simpleZaneBlock(BlockInit.ZANE_FIVE.get());
        simpleZaneBlock(BlockInit.ZANE_SIX.get());
        simpleZaneBlock(BlockInit.ZANE_SEVEN.get());
        simpleZaneBlock(BlockInit.ZANE_EIGHT.get());
        simpleZaneBlock(BlockInit.ZANE_NINE.get());
        simpleZaneBlock(BlockInit.ZANE_TEN.get());
        simpleZaneBlock(BlockInit.ZANE_ELEVEN.get());
        simpleZaneBlock(BlockInit.ZANE_TWELVE.get());
        simpleZaneBlock(BlockInit.ZANE_THIRTEEN.get());
        simpleZaneBlock(BlockInit.ZANE_FOURTEEN.get());
        simpleZaneBlock(BlockInit.ZANE_FIFTEEN.get());

        simpleZechBlock(BlockInit.ZECH_ZERO.get());
        simpleZechBlock(BlockInit.ZECH_ONE.get());
        simpleZechBlock(BlockInit.ZECH_TWO.get());
        simpleZechBlock(BlockInit.ZECH_THREE.get());
        simpleZechBlock(BlockInit.ZECH_FOUR.get());
        simpleZechBlock(BlockInit.ZECH_FIVE.get());
        simpleZechBlock(BlockInit.ZECH_SIX.get());
        simpleZechBlock(BlockInit.ZECH_SEVEN.get());
        simpleZechBlock(BlockInit.ZECH_EIGHT.get());
        simpleZechBlock(BlockInit.ZECH_NINE.get());
        simpleZechBlock(BlockInit.ZECH_TEN.get());
        simpleZechBlock(BlockInit.ZECH_ELEVEN.get());
        simpleZechBlock(BlockInit.ZECH_TWELVE.get());
        simpleZechBlock(BlockInit.ZECH_THIRTEEN.get());
        simpleZechBlock(BlockInit.ZECH_FOURTEEN.get());
        simpleZechBlock(BlockInit.ZECH_FIFTEEN.get());

        simpleZestBlock(BlockInit.ZEST_ZERO.get());
        simpleZestBlock(BlockInit.ZEST_ONE.get());
        simpleZestBlock(BlockInit.ZEST_TWO.get());
        simpleZestBlock(BlockInit.ZEST_THREE.get());
        simpleZestBlock(BlockInit.ZEST_FOUR.get());
        simpleZestBlock(BlockInit.ZEST_FIVE.get());
        simpleZestBlock(BlockInit.ZEST_SIX.get());
        simpleZestBlock(BlockInit.ZEST_SEVEN.get());
        simpleZestBlock(BlockInit.ZEST_EIGHT.get());
        simpleZestBlock(BlockInit.ZEST_NINE.get());
        simpleZestBlock(BlockInit.ZEST_TEN.get());
        simpleZestBlock(BlockInit.ZEST_ELEVEN.get());
        simpleZestBlock(BlockInit.ZEST_TWELVE.get());
        simpleZestBlock(BlockInit.ZEST_THIRTEEN.get());
        simpleZestBlock(BlockInit.ZEST_FOURTEEN.get());
        simpleZestBlock(BlockInit.ZEST_FIFTEEN.get());

        simpleZetaBlock(BlockInit.ZETA_ZERO.get());
        simpleZetaBlock(BlockInit.ZETA_ONE.get());
        simpleZetaBlock(BlockInit.ZETA_TWO.get());
        simpleZetaBlock(BlockInit.ZETA_THREE.get());
        simpleZetaBlock(BlockInit.ZETA_FOUR.get());
        simpleZetaBlock(BlockInit.ZETA_FIVE.get());
        simpleZetaBlock(BlockInit.ZETA_SIX.get());
        simpleZetaBlock(BlockInit.ZETA_SEVEN.get());
        simpleZetaBlock(BlockInit.ZETA_EIGHT.get());
        simpleZetaBlock(BlockInit.ZETA_NINE.get());
        simpleZetaBlock(BlockInit.ZETA_TEN.get());
        simpleZetaBlock(BlockInit.ZETA_ELEVEN.get());
        simpleZetaBlock(BlockInit.ZETA_TWELVE.get());
        simpleZetaBlock(BlockInit.ZETA_THIRTEEN.get());
        simpleZetaBlock(BlockInit.ZETA_FOURTEEN.get());
        simpleZetaBlock(BlockInit.ZETA_FIFTEEN.get());

        simpleZionBlock(BlockInit.ZION_ZERO.get());
        simpleZionBlock(BlockInit.ZION_ONE.get());
        simpleZionBlock(BlockInit.ZION_TWO.get());
        simpleZionBlock(BlockInit.ZION_THREE.get());
        simpleZionBlock(BlockInit.ZION_FOUR.get());
        simpleZionBlock(BlockInit.ZION_FIVE.get());
        simpleZionBlock(BlockInit.ZION_SIX.get());
        simpleZionBlock(BlockInit.ZION_SEVEN.get());
        simpleZionBlock(BlockInit.ZION_EIGHT.get());
        simpleZionBlock(BlockInit.ZION_NINE.get());
        simpleZionBlock(BlockInit.ZION_TEN.get());
        simpleZionBlock(BlockInit.ZION_ELEVEN.get());
        simpleZionBlock(BlockInit.ZION_TWELVE.get());
        simpleZionBlock(BlockInit.ZION_THIRTEEN.get());
        simpleZionBlock(BlockInit.ZION_FOURTEEN.get());
        simpleZionBlock(BlockInit.ZION_FIFTEEN.get());

        simpleZkulBlock(BlockInit.ZKUL_ZERO.get());
        simpleZkulBlock(BlockInit.ZKUL_ONE.get());
        simpleZkulBlock(BlockInit.ZKUL_TWO.get());
        simpleZkulBlock(BlockInit.ZKUL_THREE.get());
        simpleZkulBlock(BlockInit.ZKUL_FOUR.get());
        simpleZkulBlock(BlockInit.ZKUL_FIVE.get());
        simpleZkulBlock(BlockInit.ZKUL_SIX.get());
        simpleZkulBlock(BlockInit.ZKUL_SEVEN.get());
        simpleZkulBlock(BlockInit.ZKUL_EIGHT.get());
        simpleZkulBlock(BlockInit.ZKUL_NINE.get());
        simpleZkulBlock(BlockInit.ZKUL_TEN.get());
        simpleZkulBlock(BlockInit.ZKUL_ELEVEN.get());
        simpleZkulBlock(BlockInit.ZKUL_TWELVE.get());
        simpleZkulBlock(BlockInit.ZKUL_THIRTEEN.get());
        simpleZkulBlock(BlockInit.ZKUL_FOURTEEN.get());
        simpleZkulBlock(BlockInit.ZKUL_FIFTEEN.get());

        simpleZoeaBlock(BlockInit.ZOEA_ZERO.get());
        simpleZoeaBlock(BlockInit.ZOEA_ONE.get());
        simpleZoeaBlock(BlockInit.ZOEA_TWO.get());
        simpleZoeaBlock(BlockInit.ZOEA_THREE.get());
        simpleZoeaBlock(BlockInit.ZOEA_FOUR.get());
        simpleZoeaBlock(BlockInit.ZOEA_FIVE.get());
        simpleZoeaBlock(BlockInit.ZOEA_SIX.get());
        simpleZoeaBlock(BlockInit.ZOEA_SEVEN.get());
        simpleZoeaBlock(BlockInit.ZOEA_EIGHT.get());
        simpleZoeaBlock(BlockInit.ZOEA_NINE.get());
        simpleZoeaBlock(BlockInit.ZOEA_TEN.get());
        simpleZoeaBlock(BlockInit.ZOEA_ELEVEN.get());
        simpleZoeaBlock(BlockInit.ZOEA_TWELVE.get());
        simpleZoeaBlock(BlockInit.ZOEA_THIRTEEN.get());
        simpleZoeaBlock(BlockInit.ZOEA_FOURTEEN.get());
        simpleZoeaBlock(BlockInit.ZOEA_FIFTEEN.get());

        simpleZomeBlock(BlockInit.ZOME_ZERO.get());
        simpleZomeBlock(BlockInit.ZOME_ONE.get());
        simpleZomeBlock(BlockInit.ZOME_TWO.get());
        simpleZomeBlock(BlockInit.ZOME_THREE.get());
        simpleZomeBlock(BlockInit.ZOME_FOUR.get());
        simpleZomeBlock(BlockInit.ZOME_FIVE.get());
        simpleZomeBlock(BlockInit.ZOME_SIX.get());
        simpleZomeBlock(BlockInit.ZOME_SEVEN.get());
        simpleZomeBlock(BlockInit.ZOME_EIGHT.get());
        simpleZomeBlock(BlockInit.ZOME_NINE.get());
        simpleZomeBlock(BlockInit.ZOME_TEN.get());
        simpleZomeBlock(BlockInit.ZOME_ELEVEN.get());
        simpleZomeBlock(BlockInit.ZOME_TWELVE.get());
        simpleZomeBlock(BlockInit.ZOME_THIRTEEN.get());
        simpleZomeBlock(BlockInit.ZOME_FOURTEEN.get());
        simpleZomeBlock(BlockInit.ZOME_FIFTEEN.get());

        simpleZoneBlock(BlockInit.ZONE_ZERO.get());
        simpleZoneBlock(BlockInit.ZONE_ONE.get());
        simpleZoneBlock(BlockInit.ZONE_TWO.get());
        simpleZoneBlock(BlockInit.ZONE_THREE.get());
        simpleZoneBlock(BlockInit.ZONE_FOUR.get());
        simpleZoneBlock(BlockInit.ZONE_FIVE.get());
        simpleZoneBlock(BlockInit.ZONE_SIX.get());
        simpleZoneBlock(BlockInit.ZONE_SEVEN.get());
        simpleZoneBlock(BlockInit.ZONE_EIGHT.get());
        simpleZoneBlock(BlockInit.ZONE_NINE.get());
        simpleZoneBlock(BlockInit.ZONE_TEN.get());
        simpleZoneBlock(BlockInit.ZONE_ELEVEN.get());
        simpleZoneBlock(BlockInit.ZONE_TWELVE.get());
        simpleZoneBlock(BlockInit.ZONE_THIRTEEN.get());
        simpleZoneBlock(BlockInit.ZONE_FOURTEEN.get());
        simpleZoneBlock(BlockInit.ZONE_FIFTEEN.get());

        simpleZorgBlock(BlockInit.ZORG_ZERO.get());
        simpleZorgBlock(BlockInit.ZORG_ONE.get());
        simpleZorgBlock(BlockInit.ZORG_TWO.get());
        simpleZorgBlock(BlockInit.ZORG_THREE.get());
        simpleZorgBlock(BlockInit.ZORG_FOUR.get());
        simpleZorgBlock(BlockInit.ZORG_FIVE.get());
        simpleZorgBlock(BlockInit.ZORG_SIX.get());
        simpleZorgBlock(BlockInit.ZORG_SEVEN.get());
        simpleZorgBlock(BlockInit.ZORG_EIGHT.get());
        simpleZorgBlock(BlockInit.ZORG_NINE.get());
        simpleZorgBlock(BlockInit.ZORG_TEN.get());
        simpleZorgBlock(BlockInit.ZORG_ELEVEN.get());
        simpleZorgBlock(BlockInit.ZORG_TWELVE.get());
        simpleZorgBlock(BlockInit.ZORG_THIRTEEN.get());
        simpleZorgBlock(BlockInit.ZORG_FOURTEEN.get());
        simpleZorgBlock(BlockInit.ZORG_FIFTEEN.get());

        simpleZtylBlock(BlockInit.ZTYL_ZERO.get());
        simpleZtylBlock(BlockInit.ZTYL_ONE.get());
        simpleZtylBlock(BlockInit.ZTYL_TWO.get());
        simpleZtylBlock(BlockInit.ZTYL_THREE.get());
        simpleZtylBlock(BlockInit.ZTYL_FOUR.get());
        simpleZtylBlock(BlockInit.ZTYL_FIVE.get());
        simpleZtylBlock(BlockInit.ZTYL_SIX.get());
        simpleZtylBlock(BlockInit.ZTYL_SEVEN.get());
        simpleZtylBlock(BlockInit.ZTYL_EIGHT.get());
        simpleZtylBlock(BlockInit.ZTYL_NINE.get());
        simpleZtylBlock(BlockInit.ZTYL_TEN.get());
        simpleZtylBlock(BlockInit.ZTYL_ELEVEN.get());
        simpleZtylBlock(BlockInit.ZTYL_TWELVE.get());
        simpleZtylBlock(BlockInit.ZTYL_THIRTEEN.get());
        simpleZtylBlock(BlockInit.ZTYL_FOURTEEN.get());
        simpleZtylBlock(BlockInit.ZTYL_FIFTEEN.get());

        simpleZythBlock(BlockInit.ZYTH_ZERO.get());
        simpleZythBlock(BlockInit.ZYTH_ONE.get());
        simpleZythBlock(BlockInit.ZYTH_TWO.get());
        simpleZythBlock(BlockInit.ZYTH_THREE.get());
        simpleZythBlock(BlockInit.ZYTH_FOUR.get());
        simpleZythBlock(BlockInit.ZYTH_FIVE.get());
        simpleZythBlock(BlockInit.ZYTH_SIX.get());
        simpleZythBlock(BlockInit.ZYTH_SEVEN.get());
        simpleZythBlock(BlockInit.ZYTH_EIGHT.get());
        simpleZythBlock(BlockInit.ZYTH_NINE.get());
        simpleZythBlock(BlockInit.ZYTH_TEN.get());
        simpleZythBlock(BlockInit.ZYTH_ELEVEN.get());
        simpleZythBlock(BlockInit.ZYTH_TWELVE.get());
        simpleZythBlock(BlockInit.ZYTH_THIRTEEN.get());
        simpleZythBlock(BlockInit.ZYTH_FOURTEEN.get());
        simpleZythBlock(BlockInit.ZYTH_FIFTEEN.get());

    }

    public ModelFile cubeAgonAll(Block block) {
        return models().cubeAll(block.getRegistryName().getPath(), blockAgonTexture(block));
    }

    public ResourceLocation blockAgonTexture(Block block) {
        ResourceLocation name = block.getRegistryName();
        return new ResourceLocation(name.getNamespace(),  "block/agon/" + name.getPath());
    }

    public void simpleAgonBlock(Block block) {
        simpleBlock(block, cubeAgonAll(block));
    }

    //Azur
    public ModelFile cubeAzurAll(Block block) {
        return models().cubeAll(block.getRegistryName().getPath(), blockAzurTexture(block));
    }

    public ResourceLocation blockAzurTexture(Block block) {
        ResourceLocation name = block.getRegistryName();
        return new ResourceLocation(name.getNamespace(),  "block/azur/" + name.getPath());
    }

    public void simpleAzurBlock(Block block) {
        simpleBlock(block, cubeAzurAll(block));
    }

    //Bitt
    public ModelFile cubeBittAll(Block block) {
        return models().cubeAll(block.getRegistryName().getPath(), blockBittTexture(block));
    }

    public ResourceLocation blockBittTexture(Block block) {
        ResourceLocation name = block.getRegistryName();
        return new ResourceLocation(name.getNamespace(),  "block/bitt/" + name.getPath());
    }

    public void simpleBittBlock(Block block) {
        simpleBlock(block, cubeBittAll(block));
    }

    //Cray
    public ModelFile cubeCrayAll(Block block) {
        return models().cubeAll(block.getRegistryName().getPath(), blockCrayTexture(block));
    }

    public ResourceLocation blockCrayTexture(Block block) {
        ResourceLocation name = block.getRegistryName();
        return new ResourceLocation(name.getNamespace(),  "block/cray/" + name.getPath());
    }

    public void simpleCrayBlock(Block block) {
        simpleBlock(block, cubeCrayAll(block));
    }
    //Fort
    public ModelFile cubeFortAll(Block block) {
        return models().cubeAll(block.getRegistryName().getPath(), blockFortTexture(block));
    }

    public ResourceLocation blockFortTexture(Block block) {
        ResourceLocation name = block.getRegistryName();
        return new ResourceLocation(name.getNamespace(),  "block/fort/" + name.getPath());
    }

    public void simpleFortBlock(Block block) {
        simpleBlock(block, cubeFortAll(block));
    }

    //glaxx
    public ModelFile cubeglaxxAll(Block block) {
        return models().cubeAll(block.getRegistryName().getPath(), blockglaxxTexture(block));
    }

    public ResourceLocation blockglaxxTexture(Block block) {
        ResourceLocation name = block.getRegistryName();
        return new ResourceLocation(name.getNamespace(),  "block/glaxx/" + name.getPath());
    }

    public void simpleglaxxBlock(Block block) {
        simpleBlock(block, cubeglaxxAll(block));
    }

    //Iszm
    public ModelFile cubeIszmAll(Block block) {
        return models().cubeAll(block.getRegistryName().getPath(), blockIszmTexture(block));
    }

    public ResourceLocation blockIszmTexture(Block block) {
        ResourceLocation name = block.getRegistryName();
        return new ResourceLocation(name.getNamespace(),  "block/iszm/" + name.getPath());
    }

    public void simpleIszmBlock(Block block) {
        simpleBlock(block, cubeIszmAll(block));
    }

    //Jelt
    public ModelFile cubeJeltAll(Block block) {
        return models().cubeAll(block.getRegistryName().getPath(), blockJeltTexture(block));
    }

    public ResourceLocation blockJeltTexture(Block block) {
        ResourceLocation name = block.getRegistryName();
        return new ResourceLocation(name.getNamespace(),  "block/jelt/" + name.getPath());
    }

    public void simpleJeltBlock(Block block) {
        simpleBlock(block, cubeJeltAll(block));
    }

    //Korp
    public ModelFile cubeKorpAll(Block block) {
        return models().cubeAll(block.getRegistryName().getPath(), blockKorpTexture(block));
    }

    public ResourceLocation blockKorpTexture(Block block) {
        ResourceLocation name = block.getRegistryName();
        return new ResourceLocation(name.getNamespace(),  "block/korp/" + name.getPath());
    }

    public void simpleKorpBlock(Block block) {
        simpleBlock(block, cubeKorpAll(block));
    }

    //Kryp
    public ModelFile cubeKrypAll(Block block) {
        return models().cubeAll(block.getRegistryName().getPath(), blockKrypTexture(block));
    }

    public ResourceLocation blockKrypTexture(Block block) {
        ResourceLocation name = block.getRegistryName();
        return new ResourceLocation(name.getNamespace(),  "block/kryp/" + name.getPath());
    }

    public void simpleKrypBlock(Block block) {
        simpleBlock(block, cubeKrypAll(block));
    }

    //Lair
    public ModelFile cubeLairAll(Block block) {
        return models().cubeAll(block.getRegistryName().getPath(), blockLairTexture(block));
    }

    public ResourceLocation blockLairTexture(Block block) {
        ResourceLocation name = block.getRegistryName();
        return new ResourceLocation(name.getNamespace(),  "block/lair/" + name.getPath());
    }

    public void simpleLairBlock(Block block) {
        simpleBlock(block, cubeLairAll(block));
    }

    //Lave
    public ModelFile cubeLaveAll(Block block) {
        return models().cubeAll(block.getRegistryName().getPath(), blockLaveTexture(block));
    }

    public ResourceLocation blockLaveTexture(Block block) {
        ResourceLocation name = block.getRegistryName();
        return new ResourceLocation(name.getNamespace(),  "block/lave/" + name.getPath());
    }

    public void simpleLaveBlock(Block block) {
        simpleBlock(block, cubeLaveAll(block));
    }

    //Mint
    public ModelFile cubeMintAll(Block block) {
        return models().cubeAll(block.getRegistryName().getPath(), blockMintTexture(block));
    }

    public ResourceLocation blockMintTexture(Block block) {
        ResourceLocation name = block.getRegistryName();
        return new ResourceLocation(name.getNamespace(),  "block/mint/" + name.getPath());
    }

    public void simpleMintBlock(Block block) {
        simpleBlock(block, cubeMintAll(block));
    }

    //Myst
    public ModelFile cubeMystAll(Block block) {
        return models().cubeAll(block.getRegistryName().getPath(), blockMystTexture(block));
    }

    public ResourceLocation blockMystTexture(Block block) {
        ResourceLocation name = block.getRegistryName();
        return new ResourceLocation(name.getNamespace(),  "block/myst/" + name.getPath());
    }

    public void simpleMystBlock(Block block) {
        simpleBlock(block, cubeMystAll(block));
    }

    //Reds
    public ModelFile cubeRedsAll(Block block) {
        return models().cubeAll(block.getRegistryName().getPath(), blockRedsTexture(block));
    }

    public ResourceLocation blockRedsTexture(Block block) {
        ResourceLocation name = block.getRegistryName();
        return new ResourceLocation(name.getNamespace(),  "block/reds/" + name.getPath());
    }

    public void simpleRedsBlock(Block block) {
        simpleBlock(block, cubeRedsAll(block));
    }

    //Reed
    public ModelFile cubeReedAll(Block block) {
        return models().cubeAll(block.getRegistryName().getPath(), blockReedTexture(block));
    }

    public ResourceLocation blockReedTexture(Block block) {
        ResourceLocation name = block.getRegistryName();
        return new ResourceLocation(name.getNamespace(),  "block/reed/" + name.getPath());
    }

    public void simpleReedBlock(Block block) {
        simpleBlock(block, cubeReedAll(block));
    }

    //Roen
    public ModelFile cubeRoenAll(Block block) {
        return models().cubeAll(block.getRegistryName().getPath(), blockRoenTexture(block));
    }

    public ResourceLocation blockRoenTexture(Block block) {
        ResourceLocation name = block.getRegistryName();
        return new ResourceLocation(name.getNamespace(),  "block/roen/" + name.getPath());
    }

    public void simpleRoenBlock(Block block) {
        simpleBlock(block, cubeRoenAll(block));
    }

    //Sols
    public ModelFile cubeSolsAll(Block block) {
        return models().cubeAll(block.getRegistryName().getPath(), blockSolsTexture(block));
    }

    public ResourceLocation blockSolsTexture(Block block) {
        ResourceLocation name = block.getRegistryName();
        return new ResourceLocation(name.getNamespace(),  "block/sols/" + name.getPath());
    }

    public void simpleSolsBlock(Block block) {
        simpleBlock(block, cubeSolsAll(block));
    }

    //Sync
    public ModelFile cubeSyncAll(Block block) {
        return models().cubeAll(block.getRegistryName().getPath(), blockSyncTexture(block));
    }

    public ResourceLocation blockSyncTexture(Block block) {
        ResourceLocation name = block.getRegistryName();
        return new ResourceLocation(name.getNamespace(),  "block/sync/" + name.getPath());
    }

    public void simpleSyncBlock(Block block) {
        simpleBlock(block, cubeSyncAll(block));
    }

    //Tank
    public ModelFile cubeTankAll(Block block) {
        return models().cubeAll(block.getRegistryName().getPath(), blockTankTexture(block));
    }

    public ResourceLocation blockTankTexture(Block block) {
        ResourceLocation name = block.getRegistryName();
        return new ResourceLocation(name.getNamespace(),  "block/tank/" + name.getPath());
    }

    public void simpleTankBlock(Block block) {
        simpleBlock(block, cubeTankAll(block));
    }

    //Vect
    public ModelFile cubeVectAll(Block block) {
        return models().cubeAll(block.getRegistryName().getPath(), blockVectTexture(block));
    }

    public ResourceLocation blockVectTexture(Block block) {
        ResourceLocation name = block.getRegistryName();
        return new ResourceLocation(name.getNamespace(),  "block/vect/" + name.getPath());
    }

    public void simpleVectBlock(Block block) {
        simpleBlock(block, cubeVectAll(block));
    }

    //Vena
    public ModelFile cubeVenaAll(Block block) {
        return models().cubeAll(block.getRegistryName().getPath(), blockVenaTexture(block));
    }

    public ResourceLocation blockVenaTexture(Block block) {
        ResourceLocation name = block.getRegistryName();
        return new ResourceLocation(name.getNamespace(),  "block/vena/" + name.getPath());
    }

    public void simpleVenaBlock(Block block) {
        simpleBlock(block, cubeVenaAll(block));
    }

    //Zane
    public ModelFile cubeZaneAll(Block block) {
        return models().cubeAll(block.getRegistryName().getPath(), blockZaneTexture(block));
    }

    public ResourceLocation blockZaneTexture(Block block) {
        ResourceLocation name = block.getRegistryName();
        return new ResourceLocation(name.getNamespace(),  "block/zane/" + name.getPath());
    }

    public void simpleZaneBlock(Block block) {
        simpleBlock(block, cubeZaneAll(block));
    }

    //Zech
    public ModelFile cubeZechAll(Block block) {
        return models().cubeAll(block.getRegistryName().getPath(), blockZechTexture(block));
    }

    public ResourceLocation blockZechTexture(Block block) {
        ResourceLocation name = block.getRegistryName();
        return new ResourceLocation(name.getNamespace(),  "block/zech/" + name.getPath());
    }

    public void simpleZechBlock(Block block) {
        simpleBlock(block, cubeZechAll(block));
    }

    //Zest
    public ModelFile cubeZestAll(Block block) {
        return models().cubeAll(block.getRegistryName().getPath(), blockZestTexture(block));
    }

    public ResourceLocation blockZestTexture(Block block) {
        ResourceLocation name = block.getRegistryName();
        return new ResourceLocation(name.getNamespace(),  "block/zest/" + name.getPath());
    }

    public void simpleZestBlock(Block block) {
        simpleBlock(block, cubeZestAll(block));
    }

    //Zeta
    public ModelFile cubeZetaAll(Block block) {
        return models().cubeAll(block.getRegistryName().getPath(), blockZetaTexture(block));
    }

    public ResourceLocation blockZetaTexture(Block block) {
        ResourceLocation name = block.getRegistryName();
        return new ResourceLocation(name.getNamespace(),  "block/zeta/" + name.getPath());
    }

    public void simpleZetaBlock(Block block) {
        simpleBlock(block, cubeZetaAll(block));
    }

    //Zion
    public ModelFile cubeZionAll(Block block) {
        return models().cubeAll(block.getRegistryName().getPath(), blockZionTexture(block));
    }

    public ResourceLocation blockZionTexture(Block block) {
        ResourceLocation name = block.getRegistryName();
        return new ResourceLocation(name.getNamespace(),  "block/zion/" + name.getPath());
    }

    public void simpleZionBlock(Block block) {
        simpleBlock(block, cubeZionAll(block));
    }

    //Zkul
    public ModelFile cubeZkulAll(Block block) {
        return models().cubeAll(block.getRegistryName().getPath(), blockZkulTexture(block));
    }

    public ResourceLocation blockZkulTexture(Block block) {
        ResourceLocation name = block.getRegistryName();
        return new ResourceLocation(name.getNamespace(),  "block/zkul/" + name.getPath());
    }

    public void simpleZkulBlock(Block block) {
        simpleBlock(block, cubeZkulAll(block));
    }

    //Zoea
    public ModelFile cubeZoeaAll(Block block) {
        return models().cubeAll(block.getRegistryName().getPath(), blockZoeaTexture(block));
    }

    public ResourceLocation blockZoeaTexture(Block block) {
        ResourceLocation name = block.getRegistryName();
        return new ResourceLocation(name.getNamespace(),  "block/zoea/" + name.getPath());
    }

    public void simpleZoeaBlock(Block block) {
        simpleBlock(block, cubeZoeaAll(block));
    }

    //Zome
    public ModelFile cubeZomeAll(Block block) {
        return models().cubeAll(block.getRegistryName().getPath(), blockZomeTexture(block));
    }

    public ResourceLocation blockZomeTexture(Block block) {
        ResourceLocation name = block.getRegistryName();
        return new ResourceLocation(name.getNamespace(),  "block/zome/" + name.getPath());
    }

    public void simpleZomeBlock(Block block) {
        simpleBlock(block, cubeZomeAll(block));
    }

    //Zone
    public ModelFile cubeZoneAll(Block block) {
        return models().cubeAll(block.getRegistryName().getPath(), blockZoneTexture(block));
    }

    public ResourceLocation blockZoneTexture(Block block) {
        ResourceLocation name = block.getRegistryName();
        return new ResourceLocation(name.getNamespace(),  "block/zone/" + name.getPath());
    }

    public void simpleZoneBlock(Block block) {
        simpleBlock(block, cubeZoneAll(block));
    }

    //Zorg
    public ModelFile cubeZorgAll(Block block) {
        return models().cubeAll(block.getRegistryName().getPath(), blockZorgTexture(block));
    }

    public ResourceLocation blockZorgTexture(Block block) {
        ResourceLocation name = block.getRegistryName();
        return new ResourceLocation(name.getNamespace(),  "block/zorg/" + name.getPath());
    }

    public void simpleZorgBlock(Block block) {
        simpleBlock(block, cubeZorgAll(block));
    }

    //Ztyl
    public ModelFile cubeZtylAll(Block block) {
        return models().cubeAll(block.getRegistryName().getPath(), blockZtylTexture(block));
    }

    public ResourceLocation blockZtylTexture(Block block) {
        ResourceLocation name = block.getRegistryName();
        return new ResourceLocation(name.getNamespace(),  "block/ztyl/" + name.getPath());
    }

    public void simpleZtylBlock(Block block) {
        simpleBlock(block, cubeZtylAll(block));
    }

    //Zyth
    public ModelFile cubeZythAll(Block block) {
        return models().cubeAll(block.getRegistryName().getPath(), blockZythTexture(block));
    }
    ResourceLocation zyth;

    public ResourceLocation blockZythTexture(Block block) {
        ResourceLocation name = block.getRegistryName();
        return new ResourceLocation(name.getNamespace(),  "block/zyth/" + name.getPath());

    }

    public void simpleZythBlock(Block block) {
        simpleBlock(block, cubeZythAll(block));
    }
}
