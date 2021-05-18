package com.ghostgamesdhg.minetopia.init;

import com.ghostgamesdhg.minetopia.MinetopiaExtra;
import com.ghostgamesdhg.minetopia.blocks.BlockInvis;
import com.ghostgamesdhg.minetopia.blocks.BlockItemBase;
import com.ghostgamesdhg.minetopia.blocks.BlockItemItemBase;
import com.ghostgamesdhg.minetopia.blocks.BlockTrophies;
import com.ghostgamesdhg.minetopia.items.DiamondCore;
import com.ghostgamesdhg.minetopia.items.EmeraldCoin;
import com.ghostgamesdhg.minetopia.items.ItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlockItems {
    
    //This class registers the items in the mod.
    
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MinetopiaExtra.MOD_ID);

    // Blocks Items
    public static final RegistryObject<Item> BLUE_CRYSTAL_BLOCK_ITEM = ITEMS.register("blue_crystal_block",
            () -> new BlockItemBase(ModBlocks.BLUE_CRYSTAL_BLOCK.get()));

    public static final RegistryObject<Item> BLUE_CRYSTAL_ORE_ITEM = ITEMS.register("blue_crystal_ore",
            () -> new BlockItemBase(ModBlocks.BLUE_CRYSTAL_ORE.get()));

    public static final RegistryObject<Item> DIAMONDCORE_ORE_ITEM = ITEMS.register("diamondcore_ore",
            () -> new BlockItemBase(ModBlocks.DIAMONDCORE_ORE.get()));

    public static final RegistryObject<Item> PIN_AUTOMAAT_ITEM = ITEMS.register("pin_automaat",
            () -> new BlockItemBase(ModBlocks.PIN_AUTOMAAT.get()));

    public static final RegistryObject<Item> BLAUWE_KEUKENTEGELS_ITEM = ITEMS.register("blauwe_keukentegels",
            () -> new BlockItemBase(ModBlocks.BLAUWE_KEUKENTEGELS.get()));

    public static final RegistryObject<Item> ZWARTE_KEUKENTEGELS_ITEM = ITEMS.register("zwarte_keukentegels",
            () -> new BlockItemBase(ModBlocks.ZWARTE_KEUKENTEGELS.get()));

    public static final RegistryObject<Item> DONKERBLAUWE_KEUKENTEGELS_ITEM = ITEMS.register("donkerblauwe_keukentegels",
            () -> new BlockItemBase(ModBlocks.DONKERBLAUWE_KEUKENTEGELS.get()));

    public static final RegistryObject<Item> BRUINE_KEUKENTEGELS_ITEM = ITEMS.register("bruine_keukentegels",
            () -> new BlockItemBase(ModBlocks.BRUINE_KEUKENTEGELS.get()));

    public static final RegistryObject<Item> CYAN_KEUKENTEGELS_ITEM = ITEMS.register("cyan_keukentegels",
            () -> new BlockItemBase(ModBlocks.CYAN_KEUKENTEGELS.get()));

    public static final RegistryObject<Item> GROENE_KEUKENTEGELS_ITEM = ITEMS.register("groene_keukentegels",
            () -> new BlockItemBase(ModBlocks.GROENE_KEUKENTEGELS.get()));

    public static final RegistryObject<Item> GRIJZE_KEUKENTEGELS_ITEM = ITEMS.register("grijze_keukentegels",
            () -> new BlockItemBase(ModBlocks.GRIJZE_KEUKENTEGELS.get()));

    public static final RegistryObject<Item> LICHTGRIJZE_KEUKENTEGELS_ITEM = ITEMS.register("lichtgrijze_keukentegels",
            () -> new BlockItemBase(ModBlocks.LICHTGRIJZE_KEUKENTEGELS.get()));

    public static final RegistryObject<Item> LICHTGROENE_KEUKENTEGELS_ITEM = ITEMS.register("lichtgroene_keukentegels",
            () -> new BlockItemBase(ModBlocks.LICHTGROENE_KEUKENTEGELS.get()));

    public static final RegistryObject<Item> MAGENTA_KEUKENTEGELS_ITEM = ITEMS.register("magenta_keukentegels",
            () -> new BlockItemBase(ModBlocks.MAGENTA_KEUKENTEGELS.get()));

    public static final RegistryObject<Item> ORANJE_KEUKENTEGELS_ITEM = ITEMS.register("oranje_keukentegels",
            () -> new BlockItemBase(ModBlocks.ORANJE_KEUKENTEGELS.get()));

    public static final RegistryObject<Item> PAARZE_KEUKENTEGELS_ITEM = ITEMS.register("paarze_keukentegels",
            () -> new BlockItemBase(ModBlocks.PAARZE_KEUKENTEGELS.get()));

    public static final RegistryObject<Item> RODE_KEUKENTEGELS_ITEM = ITEMS.register("rode_keukentegels",
            () -> new BlockItemBase(ModBlocks.RODE_KEUKENTEGELS.get()));

    public static final RegistryObject<Item> ROZE_KEUKENTEGELS_ITEM = ITEMS.register("roze_keukentegels",
            () -> new BlockItemBase(ModBlocks.ROZE_KEUKENTEGELS.get()));

    public static final RegistryObject<Item> BROWN_CABINE_ITEM = ITEMS.register("brown_cabine",
            () -> new BlockItemBase(ModBlocks.BROWN_CABINE.get()));

    public static final RegistryObject<Item> COMPUTER_ITEM = ITEMS.register("computer",
            () -> new BlockItemBase(ModBlocks.COMPUTER.get()));

    public static final RegistryObject<Item> HONDEN_BEDJE_ITEM = ITEMS.register("honden_bedje",
            () -> new BlockItemBase(ModBlocks.HONDEN_BEDJE.get()));

    public static final RegistryObject<Item> OVEN_ITEM = ITEMS.register("oven",
            () -> new BlockItemBase(ModBlocks.OVEN.get()));

    public static final RegistryObject<Item> PUMPKIN_ITEM = ITEMS.register("pumpkin",
            () -> new BlockItemBase(ModBlocks.PUMPKIN.get()));

    public static final RegistryObject<Item> OIL_CAN_ITEM = ITEMS.register("oil_can",
            () -> new BlockItemBase(ModBlocks.OIL_CAN.get()));

    public static final RegistryObject<Item> PARKING_SIGN_ITEM = ITEMS.register("parking_sign",
            () -> new BlockItemBase(ModBlocks.PARKING_SIGN.get()));

    public static final RegistryObject<Item> ROADBLOCK_ITEM = ITEMS.register("roadblock",
            () -> new BlockItemBase(ModBlocks.ROADBLOCK.get()));

    public static final RegistryObject<Item> SCHOENTJE_ITEM = ITEMS.register("schoentje",
            () -> new BlockItemBase(ModBlocks.SCHOENTJE.get()));

    public static final RegistryObject<Item> TRAFFIC_CONE_ITEM = ITEMS.register("traffic_cone",
            () -> new BlockItemBase(ModBlocks.TRAFFIC_CONE.get()));

    public static final RegistryObject<Item> LANTAARN_ITEM = ITEMS.register("lantaarn",
            () -> new BlockItemBase(ModBlocks.LANTAARN.get()));

    public static final RegistryObject<Item> BOOMBOX_ITEM = ITEMS.register("boombox",
            () -> new BlockItemBase(ModBlocks.BOOMBOX.get()));

    public static final RegistryObject<Item> MICROFOON_ITEM = ITEMS.register("microfoon",
            () -> new BlockItemBase(ModBlocks.MICROFOON.get()));

    public static final RegistryObject<Item> GOPRO_ITEM = ITEMS.register("gopro",
            () -> new BlockItemBase(ModBlocks.GOPRO.get()));

    public static final RegistryObject<Item> FILMCAMERA_ITEM = ITEMS.register("filmcamera",
            () -> new BlockItemBase(ModBlocks.FILMCAMERA.get()));

    public static final RegistryObject<Item> LUCKYBAG_ITEM = ITEMS.register("luckybag",
            () -> new BlockItemBase(ModBlocks.LUCKYBAG.get()));

    public static final RegistryObject<Item> WALKIETALKIE_ITEM = ITEMS.register("walkietalkie",
            () -> new BlockItemBase(ModBlocks.WALKIETALKIE.get()));

    public static final RegistryObject<Item> KOFFER_ITEM = ITEMS.register("koffer",
            () -> new BlockItemBase(ModBlocks.KOFFER.get()));

    public static final RegistryObject<Item> KRANS_ITEM = ITEMS.register("krans",
            () -> new BlockItemBase(ModBlocks.KRANS.get()));

    public static final RegistryObject<Item> KERST_SLINGERS_ITEM = ITEMS.register("kerst_slingers",
            () -> new BlockItemBase(ModBlocks.KERST_SLINGERS.get()));

    public static final RegistryObject<Item> ARCADE_ITEM = ITEMS.register("arcade",
            () -> new BlockItemBase(ModBlocks.ARCADE.get()));

    public static final RegistryObject<Item> NOTEBOOK_ITEM = ITEMS.register("notebook",
            () -> new BlockItemBase(ModBlocks.NOTEBOOK.get()));

    public static final RegistryObject<Item> MONITOR_ITEM = ITEMS.register("monitor",
            () -> new BlockItemBase(ModBlocks.MONITOR.get()));

    public static final RegistryObject<Item> CADEAU_ITEM = ITEMS.register("cadeau",
            () -> new BlockItemBase(ModBlocks.CADEAU.get()));

    public static final RegistryObject<Item> ANTENNE_ITEM = ITEMS.register("antenne",
            () -> new BlockItemBase(ModBlocks.ANTENNE.get()));

    public static final RegistryObject<Item> MOD_MAKER_TROPHIE_ITEM = ITEMS.register("mod_maker_trophie",
            () -> new BlockInvis(ModBlocks.MOD_MAKER_TROPHIE.get()));

    public static final RegistryObject<Item> DIAMOND_TROPHIE_1J_ITEM = ITEMS.register("diamond_trophie_1j",
            () -> new BlockTrophies(ModBlocks.DIAMOND_TROPHIE_1J.get()));

    public static final RegistryObject<Item> BRONZE_TROPHIE_1J_ITEM = ITEMS.register("bronze_trophie_1j",
            () -> new BlockTrophies(ModBlocks.BRONZE_TROPHIE_1J.get()));

    public static final RegistryObject<Item> GOLDEN_TROPHIE_1J_ITEM = ITEMS.register("golden_trophie_1j",
            () -> new BlockTrophies(ModBlocks.GOLDEN_TROPHIE_1J.get()));

    public static final RegistryObject<Item> SILVER_TROPHIE_1J_ITEM = ITEMS.register("silver_trophie_1j",
            () -> new BlockTrophies(ModBlocks.SILVER_TROPHIE_1J.get()));

    public static final RegistryObject<Item> FLASHLIGHT_ITEM = ITEMS.register("flashlight",
            () -> new BlockItemItemBase(ModBlocks.FLASHLIGHT.get()));
}
