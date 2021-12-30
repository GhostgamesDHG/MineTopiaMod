package com.ghostgamesdhg.minetopia.init;

import com.ghostgamesdhg.minetopia.MinetopiaExtra;
import com.ghostgamesdhg.minetopia.util.ModArmorMaterial;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModArmor {

    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MinetopiaExtra.MOD_ID);

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

    //TRAINER CLOTHES
    public static final RegistryObject<ArmorItem> TRAINER_CHESTPLATE = ITEMS.register("trainer_chestplate", () ->
            new ArmorItem(ModArmorMaterial.TRAINER, EquipmentSlotType.CHEST, new Item.Properties().group(MinetopiaExtra.TAB5)));

    public static final RegistryObject<ArmorItem> TRAINER_LEGGINGS = ITEMS.register("trainer_leggings", () ->
            new ArmorItem(ModArmorMaterial.TRAINER, EquipmentSlotType.LEGS, new Item.Properties().group(MinetopiaExtra.TAB5)));

    public static final RegistryObject<ArmorItem> TRAINER_BOOTS = ITEMS.register("trainer_boots", () ->
            new ArmorItem(ModArmorMaterial.TRAINER, EquipmentSlotType.FEET, new Item.Properties().group(MinetopiaExtra.TAB5)));

    //CHEETAH
    public static final RegistryObject<ArmorItem> CHEETAH_HELMET = ITEMS.register("cheetah_helmet", () ->
            new ArmorItem(ModArmorMaterial.CHEETAH, EquipmentSlotType.HEAD, new Item.Properties().group(MinetopiaExtra.TAB5)));

    public static final RegistryObject<ArmorItem> CHEETAH_CHESTPLATE = ITEMS.register("cheetah_chestplate", () ->
            new ArmorItem(ModArmorMaterial.CHEETAH, EquipmentSlotType.CHEST, new Item.Properties().group(MinetopiaExtra.TAB5)));

    public static final RegistryObject<ArmorItem> CHEETAH_LEGGINGS = ITEMS.register("cheetah_leggings", () ->
            new ArmorItem(ModArmorMaterial.CHEETAH, EquipmentSlotType.LEGS, new Item.Properties().group(MinetopiaExtra.TAB5)));

    public static final RegistryObject<ArmorItem> CHEETAH_BOOTS = ITEMS.register("cheetah_boots", () ->
            new ArmorItem(ModArmorMaterial.CHEETAH, EquipmentSlotType.FEET, new Item.Properties().group(MinetopiaExtra.TAB5)));

    //COW
    public static final RegistryObject<ArmorItem> COW_HELMET = ITEMS.register("cow_helmet", () ->
            new ArmorItem(ModArmorMaterial.COW, EquipmentSlotType.HEAD, new Item.Properties().group(MinetopiaExtra.TAB5)));

    public static final RegistryObject<ArmorItem> COW_CHESTPLATE = ITEMS.register("cow_chestplate", () ->
            new ArmorItem(ModArmorMaterial.COW, EquipmentSlotType.CHEST, new Item.Properties().group(MinetopiaExtra.TAB5)));

    public static final RegistryObject<ArmorItem> COW_LEGGINGS = ITEMS.register("cow_leggings", () ->
            new ArmorItem(ModArmorMaterial.COW, EquipmentSlotType.LEGS, new Item.Properties().group(MinetopiaExtra.TAB5)));

    public static final RegistryObject<ArmorItem> COW_BOOTS = ITEMS.register("cow_boots", () ->
            new ArmorItem(ModArmorMaterial.COW, EquipmentSlotType.FEET, new Item.Properties().group(MinetopiaExtra.TAB5)));

    //DALMATIER
    public static final RegistryObject<ArmorItem> DALMATIER_HELMET = ITEMS.register("dalmatier_helmet", () ->
            new ArmorItem(ModArmorMaterial.DALMATIER, EquipmentSlotType.HEAD, new Item.Properties().group(MinetopiaExtra.TAB5)));

    public static final RegistryObject<ArmorItem> DALMATIER_CHESTPLATE = ITEMS.register("dalmatier_chestplate", () ->
            new ArmorItem(ModArmorMaterial.DALMATIER, EquipmentSlotType.CHEST, new Item.Properties().group(MinetopiaExtra.TAB5)));

    public static final RegistryObject<ArmorItem> DALMATIER_LEGGINGS = ITEMS.register("dalmatier_leggings", () ->
            new ArmorItem(ModArmorMaterial.DALMATIER, EquipmentSlotType.LEGS, new Item.Properties().group(MinetopiaExtra.TAB5)));

    public static final RegistryObject<ArmorItem> DALMATIER_BOOTS = ITEMS.register("dalmatier_boots", () ->
            new ArmorItem(ModArmorMaterial.DALMATIER, EquipmentSlotType.FEET, new Item.Properties().group(MinetopiaExtra.TAB5)));

    //GIRAFFE
    public static final RegistryObject<ArmorItem> GIRAFFE_HELMET = ITEMS.register("giraffe_helmet", () ->
            new ArmorItem(ModArmorMaterial.GIRAFFE, EquipmentSlotType.HEAD, new Item.Properties().group(MinetopiaExtra.TAB5)));

    public static final RegistryObject<ArmorItem> GIRAFFE_CHESTPLATE = ITEMS.register("giraffe_chestplate", () ->
            new ArmorItem(ModArmorMaterial.GIRAFFE, EquipmentSlotType.CHEST, new Item.Properties().group(MinetopiaExtra.TAB5)));

    public static final RegistryObject<ArmorItem> GIRAFFE_LEGGINGS = ITEMS.register("giraffe_leggings", () ->
            new ArmorItem(ModArmorMaterial.GIRAFFE, EquipmentSlotType.LEGS, new Item.Properties().group(MinetopiaExtra.TAB5)));

    public static final RegistryObject<ArmorItem> GIRAFFE_BOOTS = ITEMS.register("giraffe_boots", () ->
            new ArmorItem(ModArmorMaterial.GIRAFFE, EquipmentSlotType.FEET, new Item.Properties().group(MinetopiaExtra.TAB5)));

    //JAGUAR
    public static final RegistryObject<ArmorItem> JAGUAR_HELMET = ITEMS.register("jaguar_helmet", () ->
            new ArmorItem(ModArmorMaterial.JAGUAR, EquipmentSlotType.HEAD, new Item.Properties().group(MinetopiaExtra.TAB5)));

    public static final RegistryObject<ArmorItem> JAGUAR_CHESTPLATE = ITEMS.register("jaguar_chestplate", () ->
            new ArmorItem(ModArmorMaterial.JAGUAR, EquipmentSlotType.CHEST, new Item.Properties().group(MinetopiaExtra.TAB5)));

    public static final RegistryObject<ArmorItem> JAGUAR_LEGGINGS = ITEMS.register("jaguar_leggings", () ->
            new ArmorItem(ModArmorMaterial.JAGUAR, EquipmentSlotType.LEGS, new Item.Properties().group(MinetopiaExtra.TAB5)));

    public static final RegistryObject<ArmorItem> JAGUAR_BOOTS = ITEMS.register("jaguar_boots", () ->
            new ArmorItem(ModArmorMaterial.JAGUAR, EquipmentSlotType.FEET, new Item.Properties().group(MinetopiaExtra.TAB5)));

    //TIGER
    public static final RegistryObject<ArmorItem> TIGER_HELMET = ITEMS.register("tiger_helmet", () ->
            new ArmorItem(ModArmorMaterial.TIGER, EquipmentSlotType.HEAD, new Item.Properties().group(MinetopiaExtra.TAB5)));

    public static final RegistryObject<ArmorItem> TIGER_CHESTPLATE = ITEMS.register("tiger_chestplate", () ->
            new ArmorItem(ModArmorMaterial.TIGER, EquipmentSlotType.CHEST, new Item.Properties().group(MinetopiaExtra.TAB5)));

    public static final RegistryObject<ArmorItem> TIGER_LEGGINGS = ITEMS.register("tiger_leggings", () ->
            new ArmorItem(ModArmorMaterial.TIGER, EquipmentSlotType.LEGS, new Item.Properties().group(MinetopiaExtra.TAB5)));

    public static final RegistryObject<ArmorItem> TIGER_BOOTS = ITEMS.register("tiger_boots", () ->
            new ArmorItem(ModArmorMaterial.TIGER, EquipmentSlotType.FEET, new Item.Properties().group(MinetopiaExtra.TAB5)));

    //WHITE TIGER
    public static final RegistryObject<ArmorItem> WHITE_TIGER_HELMET = ITEMS.register("white_tiger_helmet", () ->
            new ArmorItem(ModArmorMaterial.WHITE_TIGER, EquipmentSlotType.HEAD, new Item.Properties().group(MinetopiaExtra.TAB5)));

    public static final RegistryObject<ArmorItem> WHITE_TIGER_CHESTPLATE = ITEMS.register("white_tiger_chestplate", () ->
            new ArmorItem(ModArmorMaterial.WHITE_TIGER, EquipmentSlotType.CHEST, new Item.Properties().group(MinetopiaExtra.TAB5)));

    public static final RegistryObject<ArmorItem> WHITE_TIGER_LEGGINGS = ITEMS.register("white_tiger_leggings", () ->
            new ArmorItem(ModArmorMaterial.WHITE_TIGER, EquipmentSlotType.LEGS, new Item.Properties().group(MinetopiaExtra.TAB5)));

    public static final RegistryObject<ArmorItem> WHITE_TIGER_BOOTS = ITEMS.register("white_tiger_boots", () ->
            new ArmorItem(ModArmorMaterial.WHITE_TIGER, EquipmentSlotType.FEET, new Item.Properties().group(MinetopiaExtra.TAB5)));

    // BIVAK
    public static final RegistryObject<ArmorItem> BIVOUAC = ITEMS.register("bivouac", () ->
            new ArmorItem(ModArmorMaterial.BIVOUAC, EquipmentSlotType.HEAD, new Item.Properties().group(MinetopiaExtra.TAB7)));

    public static final RegistryObject<ArmorItem> BIVOUAC_ORANGE = ITEMS.register("bivouac_orange", () ->
            new ArmorItem(ModArmorMaterial.BIVOUAC_ORANGE, EquipmentSlotType.HEAD, new Item.Properties().group(MinetopiaExtra.TAB7)));

    public static final RegistryObject<ArmorItem> BIVOUAC_PINK = ITEMS.register("bivouac_pink", () ->
            new ArmorItem(ModArmorMaterial.BIVOUAC_PINK, EquipmentSlotType.HEAD, new Item.Properties().group(MinetopiaExtra.TAB7)));

    public static final RegistryObject<ArmorItem> BIVOUAC_SAND = ITEMS.register("bivouac_sand", () ->
            new ArmorItem(ModArmorMaterial.BIVOUAC_SAND, EquipmentSlotType.HEAD, new Item.Properties().group(MinetopiaExtra.TAB7)));

    public static final RegistryObject<ArmorItem> BIVOUAC_LIGHT_GRAY = ITEMS.register("bivouac_light_gray", () ->
            new ArmorItem(ModArmorMaterial.BIVOUAC_LIGHT_GRAY, EquipmentSlotType.HEAD, new Item.Properties().group(MinetopiaExtra.TAB7)));
}