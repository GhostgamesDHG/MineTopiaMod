package com.ghostgamesdhg.minetopia.init;

import com.ghostgamesdhg.minetopia.MinetopiaExtra;
import com.ghostgamesdhg.minetopia.blocks.blocks.Antenne;
import com.ghostgamesdhg.minetopia.blocks.blocks.Blue_Crystal_Block;
import com.ghostgamesdhg.minetopia.blocks.blocks.Blue_Crystal_Ore;
import com.ghostgamesdhg.minetopia.blocks.blocks.Cadeau;
import com.ghostgamesdhg.minetopia.blocks.blocks.Computer;
import com.ghostgamesdhg.minetopia.blocks.blocks.Flashlight;
import com.ghostgamesdhg.minetopia.blocks.blocks.Honden_Bedje;
import com.ghostgamesdhg.minetopia.blocks.blocks.Monitor;
import com.ghostgamesdhg.minetopia.blocks.blocks.Notebook;
import com.ghostgamesdhg.minetopia.blocks.blocks.Oil_Can;
import com.ghostgamesdhg.minetopia.blocks.blocks.Oven;
import com.ghostgamesdhg.minetopia.blocks.blocks.PAtm;
import com.ghostgamesdhg.minetopia.blocks.blocks.Parking_Sign;
import com.ghostgamesdhg.minetopia.blocks.blocks.PinAutomaat;
import com.ghostgamesdhg.minetopia.blocks.blocks.Pumpkin;
import com.ghostgamesdhg.minetopia.blocks.blocks.Roadblock;
import com.ghostgamesdhg.minetopia.blocks.blocks.Schoentje;
import com.ghostgamesdhg.minetopia.blocks.blocks.Traffic_Cone;
import com.ghostgamesdhg.minetopia.blocks.blocks.boombox;
import com.ghostgamesdhg.minetopia.blocks.blocks.copper_ore;
import com.ghostgamesdhg.minetopia.blocks.blocks.diamondcore_ore;
import com.ghostgamesdhg.minetopia.blocks.blocks.filmcamera;
import com.ghostgamesdhg.minetopia.blocks.blocks.gopro;
import com.ghostgamesdhg.minetopia.blocks.blocks.kerst_slingers;
import com.ghostgamesdhg.minetopia.blocks.blocks.keukentegels;
import com.ghostgamesdhg.minetopia.blocks.blocks.krans;
import com.ghostgamesdhg.minetopia.blocks.blocks.lantaarn;
import com.ghostgamesdhg.minetopia.blocks.blocks.microfoon;
import com.ghostgamesdhg.minetopia.blocks.blocks.trophies_1j;
import com.ghostgamesdhg.minetopia.blocks.blocks.walkietalkie;
import com.ghostgamesdhg.minetopia.blocks.blocks.wall_light;
import com.ghostgamesdhg.minetopia.blocks.crops.CornBlock;
import com.ghostgamesdhg.minetopia.blocks.crops.PaprikaBlock;
import com.ghostgamesdhg.minetopia.blocks.crops.PineAppleBlock;
import com.ghostgamesdhg.minetopia.blocks.crops.StrawberryBlock;
import com.ghostgamesdhg.minetopia.blocks.crops.TomatoBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {

    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MinetopiaExtra.MOD_ID);

    public static final RegistryObject<Block> BLUE_CRYSTAL_BLOCK = BLOCKS.register("blue_crystal_block", Blue_Crystal_Block::new);
    public static final RegistryObject<Block> BLUE_CRYSTAL_ORE = BLOCKS.register("blue_crystal_ore", Blue_Crystal_Ore::new);
    public static final RegistryObject<Block> DIAMONDCORE_ORE = BLOCKS.register("diamondcore_ore", diamondcore_ore::new);
    public static final RegistryObject<Block> COPPER_ORE = BLOCKS.register("copper_ore", copper_ore::new);
    public static final RegistryObject<Block> COPPER_BLOCK = BLOCKS.register("copper_block", Blue_Crystal_Block::new);
    public static final RegistryObject<Block> PIN_AUTOMAAT = BLOCKS.register("pin_automaat", PinAutomaat::new);
    public static final RegistryObject<Block> PORTABLE_ATM = BLOCKS.register("portable_atm", PAtm::new);
    public static final RegistryObject<Block> BLAUWE_KEUKENTEGELS = BLOCKS.register("blauwe_keukentegels", keukentegels::new);
    public static final RegistryObject<Block> ZWARTE_KEUKENTEGELS = BLOCKS.register("zwarte_keukentegels", keukentegels::new);
    public static final RegistryObject<Block> DONKERBLAUWE_KEUKENTEGELS = BLOCKS.register("donkerblauwe_keukentegels", keukentegels::new);
    public static final RegistryObject<Block> BRUINE_KEUKENTEGELS = BLOCKS.register("bruine_keukentegels", keukentegels::new);
    public static final RegistryObject<Block> CYAN_KEUKENTEGELS = BLOCKS.register("cyan_keukentegels", keukentegels::new);
    public static final RegistryObject<Block> GROENE_KEUKENTEGELS = BLOCKS.register("groene_keukentegels", keukentegels::new);
    public static final RegistryObject<Block> GRIJZE_KEUKENTEGELS = BLOCKS.register("grijze_keukentegels", keukentegels::new);
    public static final RegistryObject<Block> LICHTGRIJZE_KEUKENTEGELS = BLOCKS.register("lichtgrijze_keukentegels", keukentegels::new);
    public static final RegistryObject<Block> LICHTGROENE_KEUKENTEGELS = BLOCKS.register("lichtgroene_keukentegels", keukentegels::new);
    public static final RegistryObject<Block> MAGENTA_KEUKENTEGELS = BLOCKS.register("magenta_keukentegels", keukentegels::new);
    public static final RegistryObject<Block> ORANJE_KEUKENTEGELS = BLOCKS.register("oranje_keukentegels", keukentegels::new);
    public static final RegistryObject<Block> ROZE_KEUKENTEGELS = BLOCKS.register("roze_keukentegels", keukentegels::new);
    public static final RegistryObject<Block> PAARZE_KEUKENTEGELS = BLOCKS.register("paarze_keukentegels", keukentegels::new);
    public static final RegistryObject<Block> RODE_KEUKENTEGELS = BLOCKS.register("rode_keukentegels", keukentegels::new);
    public static final RegistryObject<Block> GELE_KEUKENTEGELS = BLOCKS.register("gele_keukentegels", keukentegels::new);
    public static final RegistryObject<Block> COMPUTER = BLOCKS.register("computer", Computer::new);
    public static final RegistryObject<Block> HONDEN_BEDJE = BLOCKS.register("honden_bedje", Honden_Bedje::new);
    public static final RegistryObject<Block> OVEN = BLOCKS.register("oven", () -> new Oven());
    public static final RegistryObject<Block> OIL_CAN = BLOCKS.register("oil_can", Oil_Can::new);
    public static final RegistryObject<Block> PARKING_SIGN = BLOCKS.register("parking_sign", Parking_Sign::new);
    public static final RegistryObject<Block> PUMPKIN = BLOCKS.register("pumpkin", Pumpkin::new);
    public static final RegistryObject<Block> ROADBLOCK = BLOCKS.register("roadblock", Roadblock::new);
    public static final RegistryObject<Block> SCHOENTJE = BLOCKS.register("schoentje", Schoentje::new);
    public static final RegistryObject<Block> TRAFFIC_CONE = BLOCKS.register("traffic_cone", Traffic_Cone::new);
    public static final RegistryObject<Block> LANTAARN = BLOCKS.register("lantaarn", lantaarn::new);
    public static final RegistryObject<Block> BOOMBOX = BLOCKS.register("boombox", boombox::new);
    public static final RegistryObject<Block> MICROFOON = BLOCKS.register("microfoon", microfoon::new);
    public static final RegistryObject<Block> GOPRO = BLOCKS.register("gopro", gopro::new);
    public static final RegistryObject<Block> FILMCAMERA = BLOCKS.register("filmcamera", filmcamera::new);
    public static final RegistryObject<Block> WALKIETALKIE = BLOCKS.register("walkietalkie", walkietalkie::new);
    public static final RegistryObject<Block> KRANS = BLOCKS.register("krans", krans::new);
    public static final RegistryObject<Block> KERST_SLINGERS = BLOCKS.register("kerst_slingers", kerst_slingers::new);
    public static final RegistryObject<Block> NOTEBOOK = BLOCKS.register("notebook", Notebook::new);
    public static final RegistryObject<Block> MONITOR = BLOCKS.register("monitor", Monitor::new);
    public static final RegistryObject<Block> CADEAU = BLOCKS.register("cadeau", Cadeau::new);
    public static final RegistryObject<Block> FLASHLIGHT = BLOCKS.register("flashlight", Flashlight::new);
    public static final RegistryObject<Block> ANTENNE = BLOCKS.register("antenne", Antenne::new);
    public static final RegistryObject<Block> DIAMOND_TROPHIE_1J = BLOCKS.register("diamond_trophie_1j", trophies_1j::new);
    public static final RegistryObject<Block> GOLDEN_TROPHIE_1J = BLOCKS.register("golden_trophie_1j", trophies_1j::new);
    public static final RegistryObject<Block> BRONZE_TROPHIE_1J = BLOCKS.register("bronze_trophie_1j", trophies_1j::new);
    public static final RegistryObject<Block> SILVER_TROPHIE_1J = BLOCKS.register("silver_trophie_1j", trophies_1j::new);
    public static final RegistryObject<Block> WALL_LIGHT = BLOCKS.register("wall_light", wall_light::new);
    public static final RegistryObject<Block> WHITE_BRICKS = BLOCKS.register("white_bricks", keukentegels::new);
    public static final RegistryObject<Block> BLACK_BRICKS = BLOCKS.register("black_bricks", keukentegels::new);

    //crops
    public static final RegistryObject<Block> CORN = BLOCKS.register("corn_crop",
            () -> new CornBlock(AbstractBlock.Properties.from(Blocks.WHEAT)));

    public static final RegistryObject<Block> PAPRIKA = BLOCKS.register("paprika_crop",
            () -> new PaprikaBlock(AbstractBlock.Properties.from(Blocks.WHEAT)));

    public static final RegistryObject<Block> TOMATO = BLOCKS.register("tomato_crop",
            () -> new TomatoBlock(AbstractBlock.Properties.from(Blocks.WHEAT)));

    public static final RegistryObject<Block> PINEAPPLE = BLOCKS.register("pineapple_crop",
            () -> new PineAppleBlock(AbstractBlock.Properties.from(Blocks.WHEAT)));

    public static final RegistryObject<Block> STRAWBERRY = BLOCKS.register("strawberry_crop",
            () -> new StrawberryBlock(AbstractBlock.Properties.from(Blocks.WHEAT)));
}