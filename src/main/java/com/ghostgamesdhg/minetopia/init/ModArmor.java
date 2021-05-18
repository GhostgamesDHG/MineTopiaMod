package com.ghostgamesdhg.minetopia.init;

import com.ghostgamesdhg.minetopia.MinetopiaExtra;
import com.ghostgamesdhg.minetopia.blocks.BlockInvis;
import com.ghostgamesdhg.minetopia.blocks.BlockItemBase;
import com.ghostgamesdhg.minetopia.blocks.BlockItemItemBase;
import com.ghostgamesdhg.minetopia.blocks.BlockTrophies;
import com.ghostgamesdhg.minetopia.items.DiamondCore;
import com.ghostgamesdhg.minetopia.items.EmeraldCoin;
import com.ghostgamesdhg.minetopia.items.ItemBase;
import com.ghostgamesdhg.minetopia.util.enums.ModArmorMaterial;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModArmor {

    //This class registers the items in the mod.

    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MinetopiaExtra.MOD_ID);

    // Armors place

    //NORMAL CLOTHES
    public static final RegistryObject<ArmorItem> NORMAL_HELMET = ITEMS.register("normal_helmet", () ->
            new ArmorItem(ModArmorMaterial.NORMAL, EquipmentSlotType.HEAD, new Item.Properties().group(MinetopiaExtra.TAB5)));

    public static final RegistryObject<ArmorItem> NORMAL_HOODIE = ITEMS.register("normal_hoodie", () ->
            new ArmorItem(ModArmorMaterial.NORMAL, EquipmentSlotType.CHEST, new Item.Properties().group(MinetopiaExtra.TAB5)));

    public static final RegistryObject<ArmorItem> NORMAL_LEGGINGS = ITEMS.register("normal_leggings", () ->
            new ArmorItem(ModArmorMaterial.NORMAL, EquipmentSlotType.LEGS, new Item.Properties().group(MinetopiaExtra.TAB5)));

    public static final RegistryObject<ArmorItem> NORMAL_BOOTS = ITEMS.register("normal_boots", () ->
            new ArmorItem(ModArmorMaterial.NORMAL, EquipmentSlotType.FEET, new Item.Properties().group(MinetopiaExtra.TAB5)));

    //POLITIE NEDERLAND
    public static final RegistryObject<ArmorItem> POLITIE_NEDERLAND_HELMET = ITEMS.register("politie_nederland_helmet", () ->
            new ArmorItem(ModArmorMaterial.POLITIE_NEDERLAND, EquipmentSlotType.HEAD, new Item.Properties().group(MinetopiaExtra.TAB5)));

    public static final RegistryObject<ArmorItem> POLITIE_NEDERLAND_CHESTPLATE = ITEMS.register("politie_nederland_chestplate", () ->
            new ArmorItem(ModArmorMaterial.POLITIE_NEDERLAND, EquipmentSlotType.CHEST, new Item.Properties().group(MinetopiaExtra.TAB5)));

    public static final RegistryObject<ArmorItem> POLITIE_NEDERLAND_LEGGINGS = ITEMS.register("politie_nederland_leggings", () ->
            new ArmorItem(ModArmorMaterial.POLITIE_NEDERLAND, EquipmentSlotType.LEGS, new Item.Properties().group(MinetopiaExtra.TAB5)));

    public static final RegistryObject<ArmorItem> POLITIE_NEDERLAND_BOOTS = ITEMS.register("politie_nederland_boots", () ->
            new ArmorItem(ModArmorMaterial.POLITIE_NEDERLAND, EquipmentSlotType.FEET, new Item.Properties().group(MinetopiaExtra.TAB5)));

    //POLITIE BELGIE
    public static final RegistryObject<ArmorItem> POLITIEBELGIE_HELMET = ITEMS.register("politiebelgie_helmet", () ->
            new ArmorItem(ModArmorMaterial.POLITIEBELGIE, EquipmentSlotType.HEAD, new Item.Properties().group(MinetopiaExtra.TAB5)));

    public static final RegistryObject<ArmorItem> POLITIEBELGIE_CHESTPLATE = ITEMS.register("politiebelgie_chestplate", () ->
            new ArmorItem(ModArmorMaterial.POLITIEBELGIE, EquipmentSlotType.CHEST, new Item.Properties().group(MinetopiaExtra.TAB5)));

    public static final RegistryObject<ArmorItem> POLITIEBELGIE_LEGGINGS = ITEMS.register("politiebelgie_leggings", () ->
            new ArmorItem(ModArmorMaterial.POLITIEBELGIE, EquipmentSlotType.LEGS, new Item.Properties().group(MinetopiaExtra.TAB5)));

    public static final RegistryObject<ArmorItem> POLITIEBELGIE_BOOTS = ITEMS.register("politiebelgie_boots", () ->
            new ArmorItem(ModArmorMaterial.POLITIEBELGIE, EquipmentSlotType.FEET, new Item.Properties().group(MinetopiaExtra.TAB5)));

    //POLITIE DUBAI
    public static final RegistryObject<ArmorItem> POLITIEDUBAI_HELMET = ITEMS.register("politiedubai_helmet", () ->
            new ArmorItem(ModArmorMaterial.POLITIEDUBAI, EquipmentSlotType.HEAD, new Item.Properties().group(MinetopiaExtra.TAB5)));

    public static final RegistryObject<ArmorItem> POLITIEDUBAI_CHESTPLATE = ITEMS.register("politiedubai_chestplate", () ->
            new ArmorItem(ModArmorMaterial.POLITIEDUBAI, EquipmentSlotType.CHEST, new Item.Properties().group(MinetopiaExtra.TAB5)));

    public static final RegistryObject<ArmorItem> POLITIEDUBAI_LEGGINGS = ITEMS.register("politiedubai_leggings", () ->
            new ArmorItem(ModArmorMaterial.POLITIEDUBAI, EquipmentSlotType.LEGS, new Item.Properties().group(MinetopiaExtra.TAB5)));

    public static final RegistryObject<ArmorItem> POLITIEDUBAI_BOOTS = ITEMS.register("politiedubai_boots", () ->
            new ArmorItem(ModArmorMaterial.POLITIEDUBAI, EquipmentSlotType.FEET, new Item.Properties().group(MinetopiaExtra.TAB5)));

    // BIVAK
    public static final RegistryObject<ArmorItem> BIVAK = ITEMS.register("bivak", () ->
            new ArmorItem(ModArmorMaterial.BIVAK, EquipmentSlotType.HEAD, new Item.Properties().group(MinetopiaExtra.TAB7)));
}