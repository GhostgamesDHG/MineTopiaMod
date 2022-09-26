package com.ghostgamesdhg.minetopia.init;

import com.ghostgamesdhg.minetopia.MinetopiaExtra;
import com.ghostgamesdhg.minetopia.blocks.blocks.BlockHalloweenBase;
import com.ghostgamesdhg.minetopia.blocks.blocks.BlockInvis;
import com.ghostgamesdhg.minetopia.blocks.blocks.BlockItemBase;
import com.ghostgamesdhg.minetopia.blocks.blocks.BlockItemItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockItems {

    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MinetopiaExtra.MOD_ID);

    public static final RegistryObject<Item> BLUE_CRYSTAL_BLOCK_ITEM = ITEMS.register("blue_crystal_block",
            () -> new BlockItemBase(ModBlocks.BLUE_CRYSTAL_BLOCK.get()));

    public static final RegistryObject<Item> BLUE_CRYSTAL_ORE_ITEM = ITEMS.register("blue_crystal_ore",
            () -> new BlockItemBase(ModBlocks.BLUE_CRYSTAL_ORE.get()));

    public static final RegistryObject<Item> PCB_DUST_ORE_ITEM = ITEMS.register("pcb_dust_ore",
            () -> new BlockItemBase(ModBlocks.PCB_DUST_ORE.get()));

    public static final RegistryObject<Item> COPPER_ORE_ITEM = ITEMS.register("copper_ore",
            () -> new BlockItemBase(ModBlocks.COPPER_ORE.get()));

    public static final RegistryObject<Item> COPPER_BLOCK_ITEM = ITEMS.register("copper_block",
            () -> new BlockItemBase(ModBlocks.COPPER_BLOCK.get()));

    public static final RegistryObject<Item> PIN_AUTOMAAT_ITEM = ITEMS.register("pin_automaat",
            () -> new BlockItemBase(ModBlocks.PIN_AUTOMAAT.get()));

    public static final RegistryObject<Item> PORTABLE_ATM_ITEM = ITEMS.register("portable_atm",
            () -> new BlockItemBase(ModBlocks.PORTABLE_ATM.get()));

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

    public static final RegistryObject<Item> GELE_KEUKENTEGELS_ITEM = ITEMS.register("gele_keukentegels",
            () -> new BlockItemBase(ModBlocks.GELE_KEUKENTEGELS.get()));

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

    public static final RegistryObject<Item> COMPUTER_ITEM = ITEMS.register("computer",
            () -> new BlockItemBase(ModBlocks.COMPUTER.get()));

    public static final RegistryObject<Item> HONDEN_BEDJE_ITEM = ITEMS.register("honden_bedje",
            () -> new BlockItemBase(ModBlocks.HONDEN_BEDJE.get()));

    public static final RegistryObject<Item> OVEN_ITEM = ITEMS.register("oven",
            () -> new BlockItemBase(ModBlocks.OVEN.get()));

    public static final RegistryObject<Item> PUMPKIN_ITEM = ITEMS.register("pumpkin",
            () -> new BlockHalloweenBase(ModBlocks.PUMPKIN.get()));

    public static final RegistryObject<Item> SITTING_SKELETON_ITEM = ITEMS.register("sitting_skeleton",
            () -> new BlockHalloweenBase(ModBlocks.SITTING_SKELETON.get()));

    public static final RegistryObject<Item> MONSTERBOOK_ITEM = ITEMS.register("monsterbook",
            () -> new BlockHalloweenBase(ModBlocks.MONSTERBOOK.get()));

    public static final RegistryObject<Item> CLEAVER_ITEM = ITEMS.register("cleaver",
            () -> new BlockHalloweenBase(ModBlocks.CLEAVER.get()));

    public static final RegistryObject<Item> OWL_ITEM = ITEMS.register("owl",
            () -> new BlockHalloweenBase(ModBlocks.OWL.get()));

    public static final RegistryObject<Item> RAT_ITEM = ITEMS.register("rat",
            () -> new BlockHalloweenBase(ModBlocks.RAT.get()));

    public static final RegistryObject<Item> ZOMBIE_ARM_ITEM = ITEMS.register("zombie_arm",
            () -> new BlockHalloweenBase(ModBlocks.ZOMBIE_ARM.get()));

    public static final RegistryObject<Item> MINI_SPIDER_ITEM = ITEMS.register("mini_spider",
            () -> new BlockHalloweenBase(ModBlocks.MINI_SPIDER.get()));

    public static final RegistryObject<Item> GLOBE_ITEM = ITEMS.register("globe",
            () -> new BlockItemBase(ModBlocks.GLOBE.get()));

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

    public static final RegistryObject<Item> WALKIETALKIE_ITEM = ITEMS.register("walkietalkie",
            () -> new BlockItemBase(ModBlocks.WALKIETALKIE.get()));

    public static final RegistryObject<Item> KRANS_ITEM = ITEMS.register("krans",
            () -> new BlockItemBase(ModBlocks.KRANS.get()));

    public static final RegistryObject<Item> KERST_SLINGERS_ITEM = ITEMS.register("kerst_slingers",
            () -> new BlockItemBase(ModBlocks.KERST_SLINGERS.get()));

    public static final RegistryObject<Item> NOTEBOOK_ITEM = ITEMS.register("notebook",
            () -> new BlockItemBase(ModBlocks.NOTEBOOK.get()));

    public static final RegistryObject<Item> MONITOR_ITEM = ITEMS.register("monitor",
            () -> new BlockItemBase(ModBlocks.MONITOR.get()));

    public static final RegistryObject<Item> CADEAU_ITEM = ITEMS.register("cadeau",
            () -> new BlockItemBase(ModBlocks.CADEAU.get()));

    public static final RegistryObject<Item> ANTENNE_ITEM = ITEMS.register("antenne",
            () -> new BlockItemBase(ModBlocks.ANTENNE.get()));

    public static final RegistryObject<Item> DIAMOND_TROPHIE_1J_ITEM = ITEMS.register("diamond_trophie_1j",
            () -> new BlockInvis(ModBlocks.DIAMOND_TROPHIE_1J.get()));

    public static final RegistryObject<Item> BRONZE_TROPHIE_1J_ITEM = ITEMS.register("bronze_trophie_1j",
            () -> new BlockInvis(ModBlocks.BRONZE_TROPHIE_1J.get()));

    public static final RegistryObject<Item> GOLDEN_TROPHIE_1J_ITEM = ITEMS.register("golden_trophie_1j",
            () -> new BlockInvis(ModBlocks.GOLDEN_TROPHIE_1J.get()));

    public static final RegistryObject<Item> SILVER_TROPHIE_1J_ITEM = ITEMS.register("silver_trophie_1j",
            () -> new BlockInvis(ModBlocks.SILVER_TROPHIE_1J.get()));

    public static final RegistryObject<Item> FLASHLIGHT_ITEM = ITEMS.register("flashlight",
            () -> new BlockItemItemBase(ModBlocks.FLASHLIGHT.get()));

    public static final RegistryObject<Item> WALL_LIGHT_ITEM = ITEMS.register("wall_light",
            () -> new BlockItemBase(ModBlocks.WALL_LIGHT.get()));

    public static final RegistryObject<Item> WHITE_BRICKS_ITEM = ITEMS.register("white_bricks",
            () -> new BlockItemBase(ModBlocks.WHITE_BRICKS.get()));

    public static final RegistryObject<Item> RICH_QUARTZ_BLOCK_ITEM = ITEMS.register("rich_quartz_block",
            () -> new BlockItemBase(ModBlocks.RICH_QUARTZ_BLOCK.get()));

    public static final RegistryObject<Item> BLACK_BRICKS_ITEM = ITEMS.register("black_bricks",
            () -> new BlockItemBase(ModBlocks.BLACK_BRICKS.get()));

    public static final RegistryObject<Item> BUNKER_DOOR_ITEM = ITEMS.register("bunker_door",
            () -> new BlockItemBase(ModBlocks.BUNKER_DOOR.get()));

    public static final RegistryObject<Item> LAMP_ITEM = ITEMS.register("lamp",
            () -> new BlockItemBase(ModBlocks.LAMP.get()));

    public static final RegistryObject<Item> WOODEN_DOOR_ITEM = ITEMS.register("wooden_door",
            () -> new BlockItemBase(ModBlocks.WOODEN_DOOR.get()));

    public static final RegistryObject<Item> RICH_QUARTZ_DOOR_ITEM = ITEMS.register("rich_quartz_door",
            () -> new BlockItemBase(ModBlocks.RICH_QUARTZ_DOOR.get()));

    public static final RegistryObject<Item> STEEL_DOOR_ITEM = ITEMS.register("steel_door",
            () -> new BlockItemBase(ModBlocks.STEEL_DOOR.get()));

    public static final RegistryObject<Item> QUARTZ_DOOR_ITEM = ITEMS.register("quartz_door",
            () -> new BlockItemBase(ModBlocks.QUARTZ_DOOR.get()));

    //Half blocks, stairs
    public static final RegistryObject<Item> WHITE_BRICK_STAIRS_ITEM = ITEMS.register("white_brick_stairs",
            () -> new BlockItemBase(ModBlocks.WHITE_BRICK_STAIRS.get()));

    public static final RegistryObject<Item> BLACK_BRICK_STAIRS_ITEM = ITEMS.register("black_brick_stairs",
            () -> new BlockItemBase(ModBlocks.BLACK_BRICK_STAIRS.get()));

    public static final RegistryObject<Item> BLACK_BRICK_SLAB_ITEM = ITEMS.register("black_brick_slab",
            () -> new BlockItemBase(ModBlocks.BLACK_BRICK_SLAB.get()));

    public static final RegistryObject<Item> WHITE_BRICK_SLAB_ITEM = ITEMS.register("white_brick_slab",
            () -> new BlockItemBase(ModBlocks.WHITE_BRICK_SLAB.get()));
}
