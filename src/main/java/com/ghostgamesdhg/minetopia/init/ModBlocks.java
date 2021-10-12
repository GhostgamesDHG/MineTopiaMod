package com.ghostgamesdhg.minetopia.init;

import com.ghostgamesdhg.minetopia.MinetopiaExtra;
import com.ghostgamesdhg.minetopia.blocks.*;
import net.minecraft.block.Block;
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
}