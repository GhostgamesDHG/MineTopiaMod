package com.ghostgamesdhg.minetopia.init;

import com.ghostgamesdhg.minetopia.MinetopiaExtra;
import com.ghostgamesdhg.minetopia.util.enums.ModItemTier;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTools {

    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MinetopiaExtra.MOD_ID);

    public static final RegistryObject<SwordItem> BLUE_CRYSTAL_SWORD = ITEMS.register("blue_crystal_sword", () ->
            new SwordItem(ModItemTier.BLUE_CRYSTAL, 4, -2.4F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<SwordItem> SWORD_BLUE = ITEMS.register("sword_blue", () ->
            new SwordItem(ModItemTier.BLUE_CRYSTAL, 4, -2.4F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<SwordItem> SWORD_GOLD = ITEMS.register("sword_gold", () ->
            new SwordItem(ModItemTier.BLUE_CRYSTAL, 4, -2.4F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<SwordItem> SWORD_GREEN = ITEMS.register("sword_green", () ->
            new SwordItem(ModItemTier.BLUE_CRYSTAL, 4, -2.4F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<SwordItem> SWORD_PINK = ITEMS.register("sword_pink", () ->
            new SwordItem(ModItemTier.BLUE_CRYSTAL, 4, -2.4F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<PickaxeItem> BLUE_CRYSTAL_PICKAXE = ITEMS.register("blue_crystal_pickaxe", () ->
            new PickaxeItem(ModItemTier.BLUE_CRYSTAL, 0, 1F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<PickaxeItem> CHRISTMAS_PICKAXE = ITEMS.register("christmas_pickaxe", () ->
            new PickaxeItem(ModItemTier.BLUE_CRYSTAL, 0, 1F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<PickaxeItem> ICE_PICKAXE = ITEMS.register("ice_pickaxe", () ->
            new PickaxeItem(ModItemTier.BLUE_CRYSTAL, 0, 1F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<PickaxeItem> LAPIS_PICKAXE = ITEMS.register("lapis_pickaxe", () ->
            new PickaxeItem(ModItemTier.BLUE_CRYSTAL, 0, 1F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<PickaxeItem> REDSTONE_PICKAXE = ITEMS.register("redstone_pickaxe", () ->
            new PickaxeItem(ModItemTier.BLUE_CRYSTAL, 0, 1F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<PickaxeItem> VALENTIJN_PICKAXE = ITEMS.register("valentijn_pickaxe", () ->
            new PickaxeItem(ModItemTier.BLUE_CRYSTAL, 0, 1F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<AxeItem> BLUE_CRYSTAL_AXE = ITEMS.register("blue_crystal_axe", () ->
            new AxeItem(ModItemTier.BLUE_CRYSTAL, 6, -2.6F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<AxeItem> CHRISTMAS_AXE = ITEMS.register("christmas_axe", () ->
            new AxeItem(ModItemTier.BLUE_CRYSTAL, 6, -2.6F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<AxeItem> COPPER_AXE = ITEMS.register("copper_axe", () ->
            new AxeItem(ModItemTier.BLUE_CRYSTAL, 6, -2.6F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<AxeItem> EMERALD_AXE = ITEMS.register("emerald_axe", () ->
            new AxeItem(ModItemTier.BLUE_CRYSTAL, 6, -2.6F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<AxeItem> LAPIS_AXE = ITEMS.register("lapis_axe", () ->
            new AxeItem(ModItemTier.BLUE_CRYSTAL, 6, -2.6F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<AxeItem> MAGMA_AXE = ITEMS.register("magma_axe", () ->
            new AxeItem(ModItemTier.BLUE_CRYSTAL, 6, -2.6F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<AxeItem> OBSIDIAN_AXE = ITEMS.register("obsidian_axe", () ->
            new AxeItem(ModItemTier.BLUE_CRYSTAL, 6, -2.6F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<AxeItem> REDSTONE_AXE = ITEMS.register("redstone_axe", () ->
            new AxeItem(ModItemTier.BLUE_CRYSTAL, 6, -2.6F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<HoeItem> BLUE_CRYSTAL_HOE = ITEMS.register("blue_crystal_hoe", () ->
            new HoeItem(ModItemTier.BLUE_CRYSTAL, 0, 1F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<ShovelItem> BLUE_CRYSTAL_SHOVEL = ITEMS.register("blue_crystal_shovel", () ->
            new ShovelItem(ModItemTier.BLUE_CRYSTAL, 0, 1F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<SwordItem> VALENTIJN_SWORD = ITEMS.register("valentijn_sword", () ->
            new SwordItem(ModItemTier.BLUE_CRYSTAL, 5, -2.4F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<SwordItem> MES = ITEMS.register("mes", () ->
            new SwordItem(ModItemTier.MES, 4, -3F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<SwordItem> WAPENSTOK = ITEMS.register("wapenstok", () ->
            new SwordItem(ModItemTier.WAPENSTOK, 0, 10F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<SwordItem> WAPENSTOK_DIAMOND = ITEMS.register("wapenstok_diamond", () ->
            new SwordItem(ModItemTier.WAPENSTOK, 0, 10F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<SwordItem> WAPENSTOK_EMERALD = ITEMS.register("wapenstok_emerald", () ->
            new SwordItem(ModItemTier.WAPENSTOK, 0, 10F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<SwordItem> WAPENSTOK_GOLD = ITEMS.register("wapenstok_gold", () ->
            new SwordItem(ModItemTier.WAPENSTOK, 0, 10F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<SwordItem> WAPENSTOK_IRON = ITEMS.register("wapenstok_iron", () ->
            new SwordItem(ModItemTier.WAPENSTOK, 0, 10F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<SwordItem> WAPENSTOK_REDSTONE = ITEMS.register("wapenstok_redstone", () ->
            new SwordItem(ModItemTier.WAPENSTOK, 0, 10F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<SwordItem> TASER = ITEMS.register("taser", () ->
            new SwordItem(ModItemTier.TASER, 0, 10F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<SwordItem> KNUPPEL = ITEMS.register("knuppel", () ->
            new SwordItem(ModItemTier.KNUPPEL, 0, 10F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<SwordItem> LIGHTSABER_BLUE = ITEMS.register("lightsaber_blue", () ->
            new SwordItem(ModItemTier.LIGHTSABER, 1, 10F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<SwordItem> LIGHTSABER_GREEN = ITEMS.register("lightsaber_green", () ->
            new SwordItem(ModItemTier.LIGHTSABER, 1, 10F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<SwordItem> LIGHTSABER_PURPLE = ITEMS.register("lightsaber_purple", () ->
            new SwordItem(ModItemTier.LIGHTSABER, 1, 10F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<SwordItem> LIGHTSABER_RED = ITEMS.register("lightsaber_red", () ->
            new SwordItem(ModItemTier.LIGHTSABER, 1, 10F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<SwordItem> LIGHTSABER_YELLOW = ITEMS.register("lightsaber_yellow", () ->
            new SwordItem(ModItemTier.LIGHTSABER, 1, 10F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    //REFINED PICKAXES
    public static final RegistryObject<PickaxeItem> CACTUS_PICKAXE_REFINED = ITEMS.register("cactus_pickaxe_refined", () ->
            new PickaxeItem(ModItemTier.BLUE_CRYSTAL, 0, 1F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<PickaxeItem> COPPER_PICKAXE_REFINED = ITEMS.register("copper_pickaxe_refined", () ->
            new PickaxeItem(ModItemTier.BLUE_CRYSTAL, 0, 1F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<PickaxeItem> DARKPRISMARINE_PICKAXE_REFINED = ITEMS.register("darkprismarine_pickaxe_refined", () ->
            new PickaxeItem(ModItemTier.BLUE_CRYSTAL, 0, 1F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<PickaxeItem> LAVA_PICKAXE_REFINED = ITEMS.register("lava_pickaxe_refined", () ->
            new PickaxeItem(ModItemTier.BLUE_CRYSTAL, 0, 1F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<PickaxeItem> MONDRIAAN_PICKAXE_REFINED = ITEMS.register("mondriaan_pickaxe_refined", () ->
            new PickaxeItem(ModItemTier.BLUE_CRYSTAL, 0, 1F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<PickaxeItem> MORGANITE_PICKAXE_REFINED = ITEMS.register("morganite_pickaxe_refined", () ->
            new PickaxeItem(ModItemTier.BLUE_CRYSTAL, 0, 1F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<PickaxeItem> NETHERPORTAL_PICKAXE_REFINED = ITEMS.register("netherportal_pickaxe_refined", () ->
            new PickaxeItem(ModItemTier.BLUE_CRYSTAL, 0, 1F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE_REFINED = ITEMS.register("ruby_pickaxe_refined", () ->
            new PickaxeItem(ModItemTier.BLUE_CRYSTAL, 0, 1F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<PickaxeItem> SAPPHIRE_PICKAXE_REFINED = ITEMS.register("sapphire_pickaxe_refined", () ->
            new PickaxeItem(ModItemTier.BLUE_CRYSTAL, 0, 1F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<PickaxeItem> SILVER_PICKAXE_REFINED = ITEMS.register("silver_pickaxe_refined", () ->
            new PickaxeItem(ModItemTier.BLUE_CRYSTAL, 0, 1F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<PickaxeItem> WATER_PICKAXE_REFINED = ITEMS.register("water_pickaxe_refined", () ->
            new PickaxeItem(ModItemTier.BLUE_CRYSTAL, 0, 1F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<PickaxeItem> MAGMA_PICKAXE_REFINED = ITEMS.register("magma_pickaxe_refined", () ->
            new PickaxeItem(ModItemTier.BLUE_CRYSTAL, 0, 1F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<PickaxeItem> OBSIDIAN_PICKAXE_REFINED = ITEMS.register("obsidian_pickaxe_refined", () ->
            new PickaxeItem(ModItemTier.BLUE_CRYSTAL, 0, 1F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<PickaxeItem> EMERALD_PICKAXE_REFINED = ITEMS.register("emerald_pickaxe_refined", () ->
            new PickaxeItem(ModItemTier.BLUE_CRYSTAL, 0, 1F, new Item.Properties().group(MinetopiaExtra.TAB3)));
}