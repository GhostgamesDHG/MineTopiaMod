package com.ghostgamesdhg.minetopia.init;

import com.ghostgamesdhg.minetopia.MinetopiaExtra;
import com.ghostgamesdhg.minetopia.blocks.BlockInvis;
import com.ghostgamesdhg.minetopia.blocks.BlockItemBase;
import com.ghostgamesdhg.minetopia.blocks.BlockItemItemBase;
import com.ghostgamesdhg.minetopia.blocks.BlockTrophies;
import com.ghostgamesdhg.minetopia.items.*;
import com.ghostgamesdhg.minetopia.util.enums.ModArmorMaterial;
import com.ghostgamesdhg.minetopia.util.enums.ModItemTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModFood {

    //This class registers the items in the mod.

    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MinetopiaExtra.MOD_ID);

    // Food place
    public static final RegistryObject<Hamburger> HAMBURGER = ITEMS.register("hamburger", Hamburger::new);
    public static final RegistryObject<Sandwich> SANDWICH = ITEMS.register("sandwich", Sandwich::new);
    public static final RegistryObject<Ananas> ANANAS = ITEMS.register("ananas", Ananas::new);
    public static final RegistryObject<Bacon> BACON = ITEMS.register("bacon", Bacon::new);
    public static final RegistryObject<Cooked_Bacon> COOKED_BACON = ITEMS.register("cooked_bacon", Cooked_Bacon::new);
    public static final RegistryObject<Chicken> CHICKEN = ITEMS.register("chicken", Chicken::new);
    public static final RegistryObject<Cooked_chicken> COOKED_CHICKEN = ITEMS.register("cooked_chicken", Cooked_chicken::new);
    public static final RegistryObject<Hotdog> HOTDOG = ITEMS.register("hotdog", Hotdog::new);
    public static final RegistryObject<Ijsje> IJSJE = ITEMS.register("ijsje", Ijsje::new);
    public static final RegistryObject<Kabeljauw> KABELJAUW = ITEMS.register("kabeljauw", Kabeljauw::new);
    public static final RegistryObject<Patat> PATAT = ITEMS.register("patat", Patat::new);
    public static final RegistryObject<Pizza> PIZZA = ITEMS.register("pizza", Pizza::new);
    public static final RegistryObject<VleesHapje> VLEESHAPJE = ITEMS.register("vleeshapje", VleesHapje::new);
    public static final RegistryObject<Sushi> Sushi = ITEMS.register("sushi", Sushi::new);
    public static final RegistryObject<Vitamine_B> VITAMINE_B = ITEMS.register("vitamine_b", Vitamine_B::new);
    public static final RegistryObject<Weed> WEED = ITEMS.register("weed", Weed::new);
    public static final RegistryObject<Purple_Weed> PURPLE_WEED = ITEMS.register("purple_weed", Purple_Weed::new);
    public static final RegistryObject<Cocaine> COCAINE = ITEMS.register("cocaine", Cocaine::new);
    public static final RegistryObject<drakenvlees> DRAKENVLEES = ITEMS.register("drakenvlees", drakenvlees::new);
    public static final RegistryObject<eenhoornvlees> EENHOORNVLEES = ITEMS.register("eenhoornvlees", eenhoornvlees::new);
    public static final RegistryObject<druiven> TROSDRUIVEN = ITEMS.register("trosdruiven", druiven::new);
    public static final RegistryObject<druiven> RODE_DRUIVEN = ITEMS.register("rode_druiven", druiven::new);
    public static final RegistryObject<hop> HOP = ITEMS.register("hop", hop::new);
    public static final RegistryObject<aardbei> AARDBEI = ITEMS.register("aardbei", aardbei::new);
    public static final RegistryObject<aardbeien_ijs> AARDBEIEN_IJS = ITEMS.register("aardbeien_ijs", aardbeien_ijs::new);
    public static final RegistryObject<alcoholfles> ALCOHOLFLES = ITEMS.register("alcoholfles", alcoholfles::new);
    public static final RegistryObject<apfelstrudel> APFELSTRUDEL = ITEMS.register("apfelstrudel", apfelstrudel::new);
    public static final RegistryObject<banaan> BANAAN = ITEMS.register("banaan", banaan::new);
    public static final RegistryObject<bitterballen> BITTERBALLEN = ITEMS.register("bitterballen", bitterballen::new);
    public static final RegistryObject<blik_linzen_soep> BLIK_LINZEN_SOEP = ITEMS.register("blik_linzen_soep", blik_linzen_soep::new);
    public static final RegistryObject<pepernoot> PEPERNOOT = ITEMS.register("pepernoot", pepernoot::new);
    public static final RegistryObject<bonbons> BONBONS = ITEMS.register("bonbons", bonbons::new);
    public static final RegistryObject<Patat> PATATJE_MAYO = ITEMS.register("patatje_mayo", Patat::new);
    public static final RegistryObject<aardbeien_ijs> CHOCOLADE_IJS = ITEMS.register("chocolade_ijs", aardbeien_ijs::new);
    public static final RegistryObject<aardbeien_ijs> CHOCOLADE_KINDERIJSJE = ITEMS.register("chocolade_kinderijsje", aardbeien_ijs::new);
    public static final RegistryObject<aardbeien_ijs> KINDERIJSJE = ITEMS.register("kinderijsje", aardbeien_ijs::new);
    public static final RegistryObject<aardbeien_ijs> SMURFEN_IJS = ITEMS.register("smurfen_ijs", aardbeien_ijs::new);
    public static final RegistryObject<aardbeien_ijs> VANILLE_IJS = ITEMS.register("vanille_ijs", aardbeien_ijs::new);
    public static final RegistryObject<Patat> VLAAMSE_FRITES = ITEMS.register("vlaamse_frites", Patat::new);
    public static final RegistryObject<banaan> AVOCADO = ITEMS.register("avocado", banaan::new);
    public static final RegistryObject<banaan> BROWNIE = ITEMS.register("brownie", banaan::new);

    //Potions (Need a rewrite!)
    public static final RegistryObject<water_bottle> WATER_BOTTLE = ITEMS.register("water_bottle", water_bottle::new);
    public static final RegistryObject<koffie> KOFFIE = ITEMS.register("koffie", koffie::new);
    public static final RegistryObject<wine> WINE = ITEMS.register("wine", wine::new);
    public static final RegistryObject<cocktail> COCKTAIL = ITEMS.register("cocktail", cocktail::new);
    public static final RegistryObject<Champagne> CHAMPAGNE_BOTTLE = ITEMS.register("champagne_bottle", Champagne::new);
    public static final RegistryObject<MilkShake> MILKSHAKE = ITEMS.register("milkshake", MilkShake::new);
}