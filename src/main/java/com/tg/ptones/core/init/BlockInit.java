package com.tg.ptones.core.init;

import com.tg.ptones.Ptones;
import com.tg.ptones.common.blocks.PtonesBlock;
import com.tg.ptones.common.blocks.PtonesFlatLamp;
import com.tg.ptones.common.blocks.PtonesGlassBlock;
import com.tg.ptones.core.itemgroup.PtonesCreativeTab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;
@SuppressWarnings("SpellCheckingInspection")
public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Ptones.MOD_ID);

    public static final RegistryObject<Block> PTONE_TILE = registerBlock("ptone_tile",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> LAMP_FLAT = registerBlock("lamp_flat",
            () -> new PtonesFlatLamp());
    public static final RegistryObject<Block> AGON_ZERO = registerBlock("agon_0",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> AGON_ONE = registerBlock("agon_1",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> AGON_TWO = registerBlock("agon_2",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> AGON_THREE = registerBlock("agon_3",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> AGON_FOUR = registerBlock("agon_4",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> AGON_FIVE = registerBlock("agon_5",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> AGON_SIX = registerBlock("agon_6",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> AGON_SEVEN = registerBlock("agon_7",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> AGON_EIGHT = registerBlock("agon_8",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> AGON_NINE = registerBlock("agon_9",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> AGON_TEN = registerBlock("agon_10",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> AGON_ELEVEN = registerBlock("agon_11",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> AGON_TWELVE = registerBlock("agon_12",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> AGON_THIRTEEN = registerBlock("agon_13",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> AGON_FOURTEEN = registerBlock("agon_14",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> AGON_FIFTEEN = registerBlock("agon_15",
            () -> new PtonesBlock());

    public static final RegistryObject<Block> AZUR_ZERO = registerBlock("azur_0",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> AZUR_ONE = registerBlock("azur_1",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> AZUR_TWO = registerBlock("azur_2",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> AZUR_THREE = registerBlock("azur_3",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> AZUR_FOUR = registerBlock("azur_4",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> AZUR_FIVE = registerBlock("azur_5",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> AZUR_SIX = registerBlock("azur_6",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> AZUR_SEVEN = registerBlock("azur_7",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> AZUR_EIGHT = registerBlock("azur_8",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> AZUR_NINE = registerBlock("azur_9",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> AZUR_TEN = registerBlock("azur_10",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> AZUR_ELEVEN = registerBlock("azur_11",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> AZUR_TWELVE = registerBlock("azur_12",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> AZUR_THIRTEEN = registerBlock("azur_13",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> AZUR_FOURTEEN = registerBlock("azur_14",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> AZUR_FIFTEEN = registerBlock("azur_15",
            () -> new PtonesBlock());

    public static final RegistryObject<Block> BITT_ZERO = registerBlock("bitt_0",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> BITT_ONE = registerBlock("bitt_1",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> BITT_TWO = registerBlock("bitt_2",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> BITT_THREE = registerBlock("bitt_3",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> BITT_FOUR = registerBlock("bitt_4",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> BITT_FIVE = registerBlock("bitt_5",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> BITT_SIX = registerBlock("bitt_6",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> BITT_SEVEN = registerBlock("bitt_7",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> BITT_EIGHT = registerBlock("bitt_8",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> BITT_NINE = registerBlock("bitt_9",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> BITT_TEN = registerBlock("bitt_10",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> BITT_ELEVEN = registerBlock("bitt_11",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> BITT_TWELVE = registerBlock("bitt_12",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> BITT_THIRTEEN = registerBlock("bitt_13",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> BITT_FOURTEEN = registerBlock("bitt_14",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> BITT_FIFTEEN = registerBlock("bitt_15",
            () -> new PtonesBlock());

    public static final RegistryObject<Block> CRAY_ZERO = registerBlock("cray_0",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> CRAY_ONE = registerBlock("cray_1",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> CRAY_TWO = registerBlock("cray_2",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> CRAY_THREE = registerBlock("cray_3",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> CRAY_FOUR = registerBlock("cray_4",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> CRAY_FIVE = registerBlock("cray_5",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> CRAY_SIX = registerBlock("cray_6",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> CRAY_SEVEN = registerBlock("cray_7",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> CRAY_EIGHT = registerBlock("cray_8",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> CRAY_NINE = registerBlock("cray_9",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> CRAY_TEN = registerBlock("cray_10",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> CRAY_ELEVEN = registerBlock("cray_11",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> CRAY_TWELVE = registerBlock("cray_12",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> CRAY_THIRTEEN = registerBlock("cray_13",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> CRAY_FOURTEEN = registerBlock("cray_14",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> CRAY_FIFTEEN = registerBlock("cray_15",
            () -> new PtonesBlock());

    public static final RegistryObject<Block> FORT_ZERO = registerBlock("fort_0",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> FORT_ONE = registerBlock("fort_1",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> FORT_TWO = registerBlock("fort_2",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> FORT_THREE = registerBlock("fort_3",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> FORT_FOUR = registerBlock("fort_4",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> FORT_FIVE = registerBlock("fort_5",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> FORT_SIX = registerBlock("fort_6",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> FORT_SEVEN = registerBlock("fort_7",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> FORT_EIGHT = registerBlock("fort_8",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> FORT_NINE = registerBlock("fort_9",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> FORT_TEN = registerBlock("fort_10",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> FORT_ELEVEN = registerBlock("fort_11",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> FORT_TWELVE = registerBlock("fort_12",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> FORT_THIRTEEN = registerBlock("fort_13",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> FORT_FOURTEEN = registerBlock("fort_14",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> FORT_FIFTEEN = registerBlock("fort_15",
            () -> new PtonesBlock());

    public static final RegistryObject<Block> GLAXX_ZERO = registerBlock("glaxx_0",
            () -> new PtonesGlassBlock());
    public static final RegistryObject<Block> GLAXX_ONE = registerBlock("glaxx_1",
            () -> new PtonesGlassBlock());
    public static final RegistryObject<Block> GLAXX_TWO = registerBlock("glaxx_2",
            () -> new PtonesGlassBlock());
    public static final RegistryObject<Block> GLAXX_THREE = registerBlock("glaxx_3",
            () -> new PtonesGlassBlock());
    public static final RegistryObject<Block> GLAXX_FOUR = registerBlock("glaxx_4",
            () -> new PtonesGlassBlock());
    public static final RegistryObject<Block> GLAXX_FIVE = registerBlock("glaxx_5",
            () -> new PtonesGlassBlock());
    public static final RegistryObject<Block> GLAXX_SIX = registerBlock("glaxx_6",
            () -> new PtonesGlassBlock());
    public static final RegistryObject<Block> GLAXX_SEVEN = registerBlock("glaxx_7",
            () -> new PtonesGlassBlock());
    public static final RegistryObject<Block> GLAXX_EIGHT = registerBlock("glaxx_8",
            () -> new PtonesGlassBlock());
    public static final RegistryObject<Block> GLAXX_NINE = registerBlock("glaxx_9",
            () -> new PtonesGlassBlock());
    public static final RegistryObject<Block> GLAXX_TEN = registerBlock("glaxx_10",
            () -> new PtonesGlassBlock());
    public static final RegistryObject<Block> GLAXX_ELEVEN = registerBlock("glaxx_11",
            () -> new PtonesGlassBlock());
    public static final RegistryObject<Block> GLAXX_TWELVE = registerBlock("glaxx_12",
            () -> new PtonesGlassBlock());
    public static final RegistryObject<Block> GLAXX_THIRTEEN = registerBlock("glaxx_13",
            () -> new PtonesGlassBlock());
    public static final RegistryObject<Block> GLAXX_FOURTEEN = registerBlock("glaxx_14",
            () -> new PtonesGlassBlock());
    public static final RegistryObject<Block> GLAXX_FIFTEEN = registerBlock("glaxx_15",
            () -> new PtonesGlassBlock());

    public static final RegistryObject<Block> ISZM_ZERO = registerBlock("iszm_0",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ISZM_ONE = registerBlock("iszm_1",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ISZM_TWO = registerBlock("iszm_2",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ISZM_THREE = registerBlock("iszm_3",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ISZM_FOUR = registerBlock("iszm_4",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ISZM_FIVE = registerBlock("iszm_5",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ISZM_SIX = registerBlock("iszm_6",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ISZM_SEVEN = registerBlock("iszm_7",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ISZM_EIGHT = registerBlock("iszm_8",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ISZM_NINE = registerBlock("iszm_9",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ISZM_TEN = registerBlock("iszm_10",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ISZM_ELEVEN = registerBlock("iszm_11",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ISZM_TWELVE = registerBlock("iszm_12",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ISZM_THIRTEEN = registerBlock("iszm_13",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ISZM_FOURTEEN = registerBlock("iszm_14",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ISZM_FIFTEEN = registerBlock("iszm_15",
            () -> new PtonesBlock());

    public static final RegistryObject<Block> JELT_ZERO = registerBlock("jelt_0",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> JELT_ONE = registerBlock("jelt_1",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> JELT_TWO = registerBlock("jelt_2",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> JELT_THREE = registerBlock("jelt_3",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> JELT_FOUR = registerBlock("jelt_4",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> JELT_FIVE = registerBlock("jelt_5",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> JELT_SIX = registerBlock("jelt_6",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> JELT_SEVEN = registerBlock("jelt_7",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> JELT_EIGHT = registerBlock("jelt_8",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> JELT_NINE = registerBlock("jelt_9",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> JELT_TEN = registerBlock("jelt_10",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> JELT_ELEVEN = registerBlock("jelt_11",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> JELT_TWELVE = registerBlock("jelt_12",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> JELT_THIRTEEN = registerBlock("jelt_13",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> JELT_FOURTEEN = registerBlock("jelt_14",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> JELT_FIFTEEN = registerBlock("jelt_15",
            () -> new PtonesBlock());

    public static final RegistryObject<Block> KORP_ZERO = registerBlock("korp_0",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> KORP_ONE = registerBlock("korp_1",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> KORP_TWO = registerBlock("korp_2",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> KORP_THREE = registerBlock("korp_3",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> KORP_FOUR = registerBlock("korp_4",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> KORP_FIVE = registerBlock("korp_5",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> KORP_SIX = registerBlock("korp_6",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> KORP_SEVEN = registerBlock("korp_7",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> KORP_EIGHT = registerBlock("korp_8",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> KORP_NINE = registerBlock("korp_9",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> KORP_TEN = registerBlock("korp_10",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> KORP_ELEVEN = registerBlock("korp_11",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> KORP_TWELVE = registerBlock("korp_12",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> KORP_THIRTEEN = registerBlock("korp_13",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> KORP_FOURTEEN = registerBlock("korp_14",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> KORP_FIFTEEN = registerBlock("korp_15",
            () -> new PtonesBlock());

    public static final RegistryObject<Block> KRYP_ZERO = registerBlock("kryp_0",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> KRYP_ONE = registerBlock("kryp_1",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> KRYP_TWO = registerBlock("kryp_2",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> KRYP_THREE = registerBlock("kryp_3",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> KRYP_FOUR = registerBlock("kryp_4",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> KRYP_FIVE = registerBlock("kryp_5",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> KRYP_SIX = registerBlock("kryp_6",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> KRYP_SEVEN = registerBlock("kryp_7",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> KRYP_EIGHT = registerBlock("kryp_8",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> KRYP_NINE = registerBlock("kryp_9",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> KRYP_TEN = registerBlock("kryp_10",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> KRYP_ELEVEN = registerBlock("kryp_11",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> KRYP_TWELVE = registerBlock("kryp_12",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> KRYP_THIRTEEN = registerBlock("kryp_13",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> KRYP_FOURTEEN = registerBlock("kryp_14",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> KRYP_FIFTEEN = registerBlock("kryp_15",
            () -> new PtonesBlock());

    public static final RegistryObject<Block> LAIR_ZERO = registerBlock("lair_0",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> LAIR_ONE = registerBlock("lair_1",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> LAIR_TWO = registerBlock("lair_2",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> LAIR_THREE = registerBlock("lair_3",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> LAIR_FOUR = registerBlock("lair_4",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> LAIR_FIVE = registerBlock("lair_5",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> LAIR_SIX = registerBlock("lair_6",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> LAIR_SEVEN = registerBlock("lair_7",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> LAIR_EIGHT = registerBlock("lair_8",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> LAIR_NINE = registerBlock("lair_9",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> LAIR_TEN = registerBlock("lair_10",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> LAIR_ELEVEN = registerBlock("lair_11",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> LAIR_TWELVE = registerBlock("lair_12",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> LAIR_THIRTEEN = registerBlock("lair_13",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> LAIR_FOURTEEN = registerBlock("lair_14",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> LAIR_FIFTEEN = registerBlock("lair_15",
            () -> new PtonesBlock());

    public static final RegistryObject<Block> LAVE_ZERO = registerBlock("lave_0",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> LAVE_ONE = registerBlock("lave_1",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> LAVE_TWO = registerBlock("lave_2",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> LAVE_THREE = registerBlock("lave_3",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> LAVE_FOUR = registerBlock("lave_4",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> LAVE_FIVE = registerBlock("lave_5",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> LAVE_SIX = registerBlock("lave_6",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> LAVE_SEVEN = registerBlock("lave_7",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> LAVE_EIGHT = registerBlock("lave_8",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> LAVE_NINE = registerBlock("lave_9",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> LAVE_TEN = registerBlock("lave_10",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> LAVE_ELEVEN = registerBlock("lave_11",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> LAVE_TWELVE = registerBlock("lave_12",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> LAVE_THIRTEEN = registerBlock("lave_13",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> LAVE_FOURTEEN = registerBlock("lave_14",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> LAVE_FIFTEEN = registerBlock("lave_15",
            () -> new PtonesBlock());

    public static final RegistryObject<Block> MINT_ZERO = registerBlock("mint_0",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> MINT_ONE = registerBlock("mint_1",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> MINT_TWO = registerBlock("mint_2",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> MINT_THREE = registerBlock("mint_3",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> MINT_FOUR = registerBlock("mint_4",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> MINT_FIVE = registerBlock("mint_5",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> MINT_SIX = registerBlock("mint_6",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> MINT_SEVEN = registerBlock("mint_7",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> MINT_EIGHT = registerBlock("mint_8",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> MINT_NINE = registerBlock("mint_9",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> MINT_TEN = registerBlock("mint_10",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> MINT_ELEVEN = registerBlock("mint_11",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> MINT_TWELVE = registerBlock("mint_12",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> MINT_THIRTEEN = registerBlock("mint_13",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> MINT_FOURTEEN = registerBlock("mint_14",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> MINT_FIFTEEN = registerBlock("mint_15",
            () -> new PtonesBlock());

    public static final RegistryObject<Block> MYST_ZERO = registerBlock("myst_0",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> MYST_ONE = registerBlock("myst_1",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> MYST_TWO = registerBlock("myst_2",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> MYST_THREE = registerBlock("myst_3",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> MYST_FOUR = registerBlock("myst_4",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> MYST_FIVE = registerBlock("myst_5",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> MYST_SIX = registerBlock("myst_6",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> MYST_SEVEN = registerBlock("myst_7",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> MYST_EIGHT = registerBlock("myst_8",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> MYST_NINE = registerBlock("myst_9",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> MYST_TEN = registerBlock("myst_10",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> MYST_ELEVEN = registerBlock("myst_11",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> MYST_TWELVE = registerBlock("myst_12",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> MYST_THIRTEEN = registerBlock("myst_13",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> MYST_FOURTEEN = registerBlock("myst_14",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> MYST_FIFTEEN = registerBlock("myst_15",
            () -> new PtonesBlock());

    public static final RegistryObject<Block> REDS_ZERO = registerBlock("reds_0",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> REDS_ONE = registerBlock("reds_1",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> REDS_TWO = registerBlock("reds_2",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> REDS_THREE = registerBlock("reds_3",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> REDS_FOUR = registerBlock("reds_4",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> REDS_FIVE = registerBlock("reds_5",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> REDS_SIX = registerBlock("reds_6",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> REDS_SEVEN = registerBlock("reds_7",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> REDS_EIGHT = registerBlock("reds_8",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> REDS_NINE = registerBlock("reds_9",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> REDS_TEN = registerBlock("reds_10",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> REDS_ELEVEN = registerBlock("reds_11",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> REDS_TWELVE = registerBlock("reds_12",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> REDS_THIRTEEN = registerBlock("reds_13",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> REDS_FOURTEEN = registerBlock("reds_14",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> REDS_FIFTEEN = registerBlock("reds_15",
            () -> new PtonesBlock());

    public static final RegistryObject<Block> REED_ZERO = registerBlock("reed_0",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> REED_ONE = registerBlock("reed_1",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> REED_TWO = registerBlock("reed_2",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> REED_THREE = registerBlock("reed_3",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> REED_FOUR = registerBlock("reed_4",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> REED_FIVE = registerBlock("reed_5",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> REED_SIX = registerBlock("reed_6",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> REED_SEVEN = registerBlock("reed_7",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> REED_EIGHT = registerBlock("reed_8",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> REED_NINE = registerBlock("reed_9",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> REED_TEN = registerBlock("reed_10",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> REED_ELEVEN = registerBlock("reed_11",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> REED_TWELVE = registerBlock("reed_12",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> REED_THIRTEEN = registerBlock("reed_13",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> REED_FOURTEEN = registerBlock("reed_14",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> REED_FIFTEEN = registerBlock("reed_15",
            () -> new PtonesBlock());

    public static final RegistryObject<Block> ROEN_ZERO = registerBlock("roen_0",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ROEN_ONE = registerBlock("roen_1",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ROEN_TWO = registerBlock("roen_2",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ROEN_THREE = registerBlock("roen_3",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ROEN_FOUR = registerBlock("roen_4",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ROEN_FIVE = registerBlock("roen_5",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ROEN_SIX = registerBlock("roen_6",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ROEN_SEVEN = registerBlock("roen_7",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ROEN_EIGHT = registerBlock("roen_8",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ROEN_NINE = registerBlock("roen_9",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ROEN_TEN = registerBlock("roen_10",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ROEN_ELEVEN = registerBlock("roen_11",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ROEN_TWELVE = registerBlock("roen_12",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ROEN_THIRTEEN = registerBlock("roen_13",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ROEN_FOURTEEN = registerBlock("roen_14",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ROEN_FIFTEEN = registerBlock("roen_15",
            () -> new PtonesBlock());

    public static final RegistryObject<Block> SOLS_ZERO = registerBlock("sols_0",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> SOLS_ONE = registerBlock("sols_1",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> SOLS_TWO = registerBlock("sols_2",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> SOLS_THREE = registerBlock("sols_3",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> SOLS_FOUR = registerBlock("sols_4",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> SOLS_FIVE = registerBlock("sols_5",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> SOLS_SIX = registerBlock("sols_6",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> SOLS_SEVEN = registerBlock("sols_7",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> SOLS_EIGHT = registerBlock("sols_8",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> SOLS_NINE = registerBlock("sols_9",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> SOLS_TEN = registerBlock("sols_10",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> SOLS_ELEVEN = registerBlock("sols_11",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> SOLS_TWELVE = registerBlock("sols_12",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> SOLS_THIRTEEN = registerBlock("sols_13",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> SOLS_FOURTEEN = registerBlock("sols_14",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> SOLS_FIFTEEN = registerBlock("sols_15",
            () -> new PtonesBlock());

    public static final RegistryObject<Block> SYNC_ZERO = registerBlock("sync_0",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> SYNC_ONE = registerBlock("sync_1",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> SYNC_TWO = registerBlock("sync_2",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> SYNC_THREE = registerBlock("sync_3",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> SYNC_FOUR = registerBlock("sync_4",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> SYNC_FIVE = registerBlock("sync_5",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> SYNC_SIX = registerBlock("sync_6",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> SYNC_SEVEN = registerBlock("sync_7",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> SYNC_EIGHT = registerBlock("sync_8",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> SYNC_NINE = registerBlock("sync_9",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> SYNC_TEN = registerBlock("sync_10",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> SYNC_ELEVEN = registerBlock("sync_11",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> SYNC_TWELVE = registerBlock("sync_12",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> SYNC_THIRTEEN = registerBlock("sync_13",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> SYNC_FOURTEEN = registerBlock("sync_14",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> SYNC_FIFTEEN = registerBlock("sync_15",
            () -> new PtonesBlock());

    public static final RegistryObject<Block> TANK_ZERO = registerBlock("tank_0",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> TANK_ONE = registerBlock("tank_1",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> TANK_TWO = registerBlock("tank_2",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> TANK_THREE = registerBlock("tank_3",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> TANK_FOUR = registerBlock("tank_4",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> TANK_FIVE = registerBlock("tank_5",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> TANK_SIX = registerBlock("tank_6",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> TANK_SEVEN = registerBlock("tank_7",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> TANK_EIGHT = registerBlock("tank_8",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> TANK_NINE = registerBlock("tank_9",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> TANK_TEN = registerBlock("tank_10",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> TANK_ELEVEN = registerBlock("tank_11",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> TANK_TWELVE = registerBlock("tank_12",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> TANK_THIRTEEN = registerBlock("tank_13",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> TANK_FOURTEEN = registerBlock("tank_14",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> TANK_FIFTEEN = registerBlock("tank_15",
            () -> new PtonesBlock());

    public static final RegistryObject<Block> VECT_ZERO = registerBlock("vect_0",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> VECT_ONE = registerBlock("vect_1",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> VECT_TWO = registerBlock("vect_2",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> VECT_THREE = registerBlock("vect_3",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> VECT_FOUR = registerBlock("vect_4",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> VECT_FIVE = registerBlock("vect_5",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> VECT_SIX = registerBlock("vect_6",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> VECT_SEVEN = registerBlock("vect_7",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> VECT_EIGHT = registerBlock("vect_8",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> VECT_NINE = registerBlock("vect_9",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> VECT_TEN = registerBlock("vect_10",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> VECT_ELEVEN = registerBlock("vect_11",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> VECT_TWELVE = registerBlock("vect_12",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> VECT_THIRTEEN = registerBlock("vect_13",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> VECT_FOURTEEN = registerBlock("vect_14",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> VECT_FIFTEEN = registerBlock("vect_15",
            () -> new PtonesBlock());

    public static final RegistryObject<Block> VENA_ZERO = registerBlock("vena_0",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> VENA_ONE = registerBlock("vena_1",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> VENA_TWO = registerBlock("vena_2",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> VENA_THREE = registerBlock("vena_3",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> VENA_FOUR = registerBlock("vena_4",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> VENA_FIVE = registerBlock("vena_5",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> VENA_SIX = registerBlock("vena_6",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> VENA_SEVEN = registerBlock("vena_7",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> VENA_EIGHT = registerBlock("vena_8",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> VENA_NINE = registerBlock("vena_9",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> VENA_TEN = registerBlock("vena_10",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> VENA_ELEVEN = registerBlock("vena_11",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> VENA_TWELVE = registerBlock("vena_12",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> VENA_THIRTEEN = registerBlock("vena_13",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> VENA_FOURTEEN = registerBlock("vena_14",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> VENA_FIFTEEN = registerBlock("vena_15",
            () -> new PtonesBlock());

    public static final RegistryObject<Block> ZANE_ZERO = registerBlock("zane_0",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZANE_ONE = registerBlock("zane_1",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZANE_TWO = registerBlock("zane_2",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZANE_THREE = registerBlock("zane_3",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZANE_FOUR = registerBlock("zane_4",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZANE_FIVE = registerBlock("zane_5",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZANE_SIX = registerBlock("zane_6",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZANE_SEVEN = registerBlock("zane_7",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZANE_EIGHT = registerBlock("zane_8",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZANE_NINE = registerBlock("zane_9",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZANE_TEN = registerBlock("zane_10",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZANE_ELEVEN = registerBlock("zane_11",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZANE_TWELVE = registerBlock("zane_12",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZANE_THIRTEEN = registerBlock("zane_13",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZANE_FOURTEEN = registerBlock("zane_14",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZANE_FIFTEEN = registerBlock("zane_15",
            () -> new PtonesBlock());

    public static final RegistryObject<Block> ZECH_ZERO = registerBlock("zech_0",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZECH_ONE = registerBlock("zech_1",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZECH_TWO = registerBlock("zech_2",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZECH_THREE = registerBlock("zech_3",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZECH_FOUR = registerBlock("zech_4",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZECH_FIVE = registerBlock("zech_5",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZECH_SIX = registerBlock("zech_6",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZECH_SEVEN = registerBlock("zech_7",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZECH_EIGHT = registerBlock("zech_8",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZECH_NINE = registerBlock("zech_9",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZECH_TEN = registerBlock("zech_10",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZECH_ELEVEN = registerBlock("zech_11",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZECH_TWELVE = registerBlock("zech_12",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZECH_THIRTEEN = registerBlock("zech_13",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZECH_FOURTEEN = registerBlock("zech_14",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZECH_FIFTEEN = registerBlock("zech_15",
            () -> new PtonesBlock());

    public static final RegistryObject<Block> ZEST_ZERO = registerBlock("zest_0",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZEST_ONE = registerBlock("zest_1",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZEST_TWO = registerBlock("zest_2",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZEST_THREE = registerBlock("zest_3",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZEST_FOUR = registerBlock("zest_4",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZEST_FIVE = registerBlock("zest_5",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZEST_SIX = registerBlock("zest_6",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZEST_SEVEN = registerBlock("zest_7",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZEST_EIGHT = registerBlock("zest_8",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZEST_NINE = registerBlock("zest_9",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZEST_TEN = registerBlock("zest_10",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZEST_ELEVEN = registerBlock("zest_11",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZEST_TWELVE = registerBlock("zest_12",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZEST_THIRTEEN = registerBlock("zest_13",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZEST_FOURTEEN = registerBlock("zest_14",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZEST_FIFTEEN = registerBlock("zest_15",
            () -> new PtonesBlock());

    public static final RegistryObject<Block> ZETA_ZERO = registerBlock("zeta_0",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZETA_ONE = registerBlock("zeta_1",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZETA_TWO = registerBlock("zeta_2",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZETA_THREE = registerBlock("zeta_3",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZETA_FOUR = registerBlock("zeta_4",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZETA_FIVE = registerBlock("zeta_5",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZETA_SIX = registerBlock("zeta_6",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZETA_SEVEN = registerBlock("zeta_7",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZETA_EIGHT = registerBlock("zeta_8",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZETA_NINE = registerBlock("zeta_9",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZETA_TEN = registerBlock("zeta_10",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZETA_ELEVEN = registerBlock("zeta_11",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZETA_TWELVE = registerBlock("zeta_12",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZETA_THIRTEEN = registerBlock("zeta_13",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZETA_FOURTEEN = registerBlock("zeta_14",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZETA_FIFTEEN = registerBlock("zeta_15",
            () -> new PtonesBlock());

    public static final RegistryObject<Block> ZION_ZERO = registerBlock("zion_0",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZION_ONE = registerBlock("zion_1",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZION_TWO = registerBlock("zion_2",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZION_THREE = registerBlock("zion_3",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZION_FOUR = registerBlock("zion_4",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZION_FIVE = registerBlock("zion_5",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZION_SIX = registerBlock("zion_6",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZION_SEVEN = registerBlock("zion_7",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZION_EIGHT = registerBlock("zion_8",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZION_NINE = registerBlock("zion_9",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZION_TEN = registerBlock("zion_10",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZION_ELEVEN = registerBlock("zion_11",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZION_TWELVE = registerBlock("zion_12",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZION_THIRTEEN = registerBlock("zion_13",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZION_FOURTEEN = registerBlock("zion_14",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZION_FIFTEEN = registerBlock("zion_15",
            () -> new PtonesBlock());

    public static final RegistryObject<Block> ZKUL_ZERO = registerBlock("zkul_0",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZKUL_ONE = registerBlock("zkul_1",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZKUL_TWO = registerBlock("zkul_2",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZKUL_THREE = registerBlock("zkul_3",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZKUL_FOUR = registerBlock("zkul_4",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZKUL_FIVE = registerBlock("zkul_5",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZKUL_SIX = registerBlock("zkul_6",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZKUL_SEVEN = registerBlock("zkul_7",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZKUL_EIGHT = registerBlock("zkul_8",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZKUL_NINE = registerBlock("zkul_9",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZKUL_TEN = registerBlock("zkul_10",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZKUL_ELEVEN = registerBlock("zkul_11",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZKUL_TWELVE = registerBlock("zkul_12",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZKUL_THIRTEEN = registerBlock("zkul_13",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZKUL_FOURTEEN = registerBlock("zkul_14",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZKUL_FIFTEEN = registerBlock("zkul_15",
            () -> new PtonesBlock());

    public static final RegistryObject<Block> ZOEA_ZERO = registerBlock("zoea_0",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZOEA_ONE = registerBlock("zoea_1",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZOEA_TWO = registerBlock("zoea_2",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZOEA_THREE = registerBlock("zoea_3",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZOEA_FOUR = registerBlock("zoea_4",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZOEA_FIVE = registerBlock("zoea_5",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZOEA_SIX = registerBlock("zoea_6",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZOEA_SEVEN = registerBlock("zoea_7",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZOEA_EIGHT = registerBlock("zoea_8",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZOEA_NINE = registerBlock("zoea_9",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZOEA_TEN = registerBlock("zoea_10",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZOEA_ELEVEN = registerBlock("zoea_11",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZOEA_TWELVE = registerBlock("zoea_12",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZOEA_THIRTEEN = registerBlock("zoea_13",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZOEA_FOURTEEN = registerBlock("zoea_14",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZOEA_FIFTEEN = registerBlock("zoea_15",
            () -> new PtonesBlock());

    public static final RegistryObject<Block> ZOME_ZERO = registerBlock("zome_0",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZOME_ONE = registerBlock("zome_1",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZOME_TWO = registerBlock("zome_2",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZOME_THREE = registerBlock("zome_3",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZOME_FOUR = registerBlock("zome_4",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZOME_FIVE = registerBlock("zome_5",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZOME_SIX = registerBlock("zome_6",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZOME_SEVEN = registerBlock("zome_7",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZOME_EIGHT = registerBlock("zome_8",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZOME_NINE = registerBlock("zome_9",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZOME_TEN = registerBlock("zome_10",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZOME_ELEVEN = registerBlock("zome_11",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZOME_TWELVE = registerBlock("zome_12",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZOME_THIRTEEN = registerBlock("zome_13",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZOME_FOURTEEN = registerBlock("zome_14",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZOME_FIFTEEN = registerBlock("zome_15",
            () -> new PtonesBlock());

    public static final RegistryObject<Block> ZONE_ZERO = registerBlock("zone_0",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZONE_ONE = registerBlock("zone_1",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZONE_TWO = registerBlock("zone_2",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZONE_THREE = registerBlock("zone_3",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZONE_FOUR = registerBlock("zone_4",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZONE_FIVE = registerBlock("zone_5",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZONE_SIX = registerBlock("zone_6",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZONE_SEVEN = registerBlock("zone_7",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZONE_EIGHT = registerBlock("zone_8",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZONE_NINE = registerBlock("zone_9",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZONE_TEN = registerBlock("zone_10",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZONE_ELEVEN = registerBlock("zone_11",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZONE_TWELVE = registerBlock("zone_12",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZONE_THIRTEEN = registerBlock("zone_13",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZONE_FOURTEEN = registerBlock("zone_14",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZONE_FIFTEEN = registerBlock("zone_15",
            () -> new PtonesBlock());

    public static final RegistryObject<Block> ZORG_ZERO = registerBlock("zorg_0",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZORG_ONE = registerBlock("zorg_1",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZORG_TWO = registerBlock("zorg_2",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZORG_THREE = registerBlock("zorg_3",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZORG_FOUR = registerBlock("zorg_4",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZORG_FIVE = registerBlock("zorg_5",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZORG_SIX = registerBlock("zorg_6",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZORG_SEVEN = registerBlock("zorg_7",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZORG_EIGHT = registerBlock("zorg_8",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZORG_NINE = registerBlock("zorg_9",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZORG_TEN = registerBlock("zorg_10",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZORG_ELEVEN = registerBlock("zorg_11",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZORG_TWELVE = registerBlock("zorg_12",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZORG_THIRTEEN = registerBlock("zorg_13",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZORG_FOURTEEN = registerBlock("zorg_14",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZORG_FIFTEEN = registerBlock("zorg_15",
            () -> new PtonesBlock());

    public static final RegistryObject<Block> ZTYL_ZERO = registerBlock("ztyl_0",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZTYL_ONE = registerBlock("ztyl_1",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZTYL_TWO = registerBlock("ztyl_2",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZTYL_THREE = registerBlock("ztyl_3",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZTYL_FOUR = registerBlock("ztyl_4",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZTYL_FIVE = registerBlock("ztyl_5",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZTYL_SIX = registerBlock("ztyl_6",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZTYL_SEVEN = registerBlock("ztyl_7",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZTYL_EIGHT = registerBlock("ztyl_8",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZTYL_NINE = registerBlock("ztyl_9",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZTYL_TEN = registerBlock("ztyl_10",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZTYL_ELEVEN = registerBlock("ztyl_11",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZTYL_TWELVE = registerBlock("ztyl_12",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZTYL_THIRTEEN = registerBlock("ztyl_13",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZTYL_FOURTEEN = registerBlock("ztyl_14",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZTYL_FIFTEEN = registerBlock("ztyl_15",
            () -> new PtonesBlock());

    public static final RegistryObject<Block> ZYTH_ZERO = registerBlock("zyth_0",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZYTH_ONE = registerBlock("zyth_1",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZYTH_TWO = registerBlock("zyth_2",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZYTH_THREE = registerBlock("zyth_3",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZYTH_FOUR = registerBlock("zyth_4",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZYTH_FIVE = registerBlock("zyth_5",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZYTH_SIX = registerBlock("zyth_6",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZYTH_SEVEN = registerBlock("zyth_7",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZYTH_EIGHT = registerBlock("zyth_8",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZYTH_NINE = registerBlock("zyth_9",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZYTH_TEN = registerBlock("zyth_10",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZYTH_ELEVEN = registerBlock("zyth_11",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZYTH_TWELVE = registerBlock("zyth_12",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZYTH_THIRTEEN = registerBlock("zyth_13",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZYTH_FOURTEEN = registerBlock("zyth_14",
            () -> new PtonesBlock());
    public static final RegistryObject<Block> ZYTH_FIFTEEN = registerBlock("zyth_15",
            () -> new PtonesBlock());

    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    public static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(PtonesCreativeTab.PTONES)));
    }
 }
