package com.ghostgamesdhg.minetopia.init;

import com.ghostgamesdhg.minetopia.MinetopiaExtra;
import com.ghostgamesdhg.minetopia.items.*;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModFood {

    //This class registers the items in the mod.
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MinetopiaExtra.MOD_ID);

    // Food place
    public static final RegistryObject<Hamburger> HAMBURGER = ITEMS.register("hamburger", Hamburger::new);
    public static final RegistryObject<fourHunger> SANDWICH = ITEMS.register("sandwich", fourHunger::new);
    public static final RegistryObject<twoHunger> ANANAS = ITEMS.register("ananas", twoHunger::new);
    public static final RegistryObject<fourHunger> BACON = ITEMS.register("bacon", fourHunger::new);
    public static final RegistryObject<fourHunger> COOKED_BACON = ITEMS.register("cooked_bacon", fourHunger::new);
    public static final RegistryObject<oneHunger> CHICKEN = ITEMS.register("chicken", oneHunger::new);
    public static final RegistryObject<sixHunger> COOKED_CHICKEN = ITEMS.register("cooked_chicken", sixHunger::new);
    public static final RegistryObject<sixHunger> HOTDOG = ITEMS.register("hotdog", sixHunger::new);
    public static final RegistryObject<twoHunger> IJSJE = ITEMS.register("ijsje", twoHunger::new);
    public static final RegistryObject<fourHunger> KABELJAUW = ITEMS.register("kabeljauw", fourHunger::new);
    public static final RegistryObject<fiveHunger> PATAT = ITEMS.register("patat", fiveHunger::new);
    public static final RegistryObject<fiveHunger> PIZZA = ITEMS.register("pizza", fiveHunger::new);
    public static final RegistryObject<fourHunger> VLEESHAPJE = ITEMS.register("vleeshapje", fourHunger::new);
    public static final RegistryObject<twoHunger> Sushi = ITEMS.register("sushi", twoHunger::new);
    public static final RegistryObject<Weed> WEED = ITEMS.register("weed", Weed::new);
    public static final RegistryObject<Purple_Weed> PURPLE_WEED = ITEMS.register("purple_weed", Purple_Weed::new);
    public static final RegistryObject<Cocaine> COCAINE = ITEMS.register("cocaine", Cocaine::new);
    public static final RegistryObject<drakenvlees> DRAKENVLEES = ITEMS.register("drakenvlees", drakenvlees::new);
    public static final RegistryObject<eenhoornvlees> EENHOORNVLEES = ITEMS.register("eenhoornvlees", eenhoornvlees::new);
    public static final RegistryObject<fiveHunger> TROSDRUIVEN = ITEMS.register("trosdruiven", fiveHunger::new);
    public static final RegistryObject<fiveHunger> RODE_DRUIVEN = ITEMS.register("rode_druiven", fiveHunger::new);
    public static final RegistryObject<fourHunger> HOP = ITEMS.register("hop", fourHunger::new);
    public static final RegistryObject<fourHunger> AARDBEI = ITEMS.register("aardbei", fourHunger::new);
    public static final RegistryObject<twoHunger> AARDBEIEN_IJS = ITEMS.register("aardbeien_ijs", twoHunger::new);
    public static final RegistryObject<oneHunger> ALCOHOLFLES = ITEMS.register("alcoholfles", oneHunger::new);
    public static final RegistryObject<fiveHunger> APFELSTRUDEL = ITEMS.register("apfelstrudel", fiveHunger::new);
    public static final RegistryObject<threeHunger> BANAAN = ITEMS.register("banaan", threeHunger::new);
    public static final RegistryObject<sixHunger> BITTERBALLEN = ITEMS.register("bitterballen", sixHunger::new);
    public static final RegistryObject<fourHunger> BLIK_LINZEN_SOEP = ITEMS.register("blik_linzen_soep", fourHunger::new);
    public static final RegistryObject<oneHunger> PEPERNOOT = ITEMS.register("pepernoot", oneHunger::new);
    public static final RegistryObject<twoHunger> BONBONS = ITEMS.register("bonbons", twoHunger::new);
    public static final RegistryObject<fiveHunger> PATATJE_MAYO = ITEMS.register("patatje_mayo", fiveHunger::new);
    public static final RegistryObject<twoHunger> CHOCOLADE_IJS = ITEMS.register("chocolade_ijs", twoHunger::new);
    public static final RegistryObject<twoHunger> CHOCOLADE_KINDERIJSJE = ITEMS.register("chocolade_kinderijsje", twoHunger::new);
    public static final RegistryObject<twoHunger> KINDERIJSJE = ITEMS.register("kinderijsje", twoHunger::new);
    public static final RegistryObject<twoHunger> SMURFEN_IJS = ITEMS.register("smurfen_ijs", twoHunger::new);
    public static final RegistryObject<twoHunger> VANILLE_IJS = ITEMS.register("vanille_ijs", twoHunger::new);
    public static final RegistryObject<fiveHunger> VLAAMSE_FRITES = ITEMS.register("vlaamse_frites", fiveHunger::new);
    public static final RegistryObject<threeHunger> AVOCADO = ITEMS.register("avocado", threeHunger::new);
    public static final RegistryObject<threeHunger> BROWNIE = ITEMS.register("brownie", threeHunger::new);
    public static final RegistryObject<fourHunger> BROODJE_DONER = ITEMS.register("broodje_doner", fourHunger::new);
    public static final RegistryObject<Broodje_Gezond> BROODJE_GEZOND = ITEMS.register("broodje_gezond", Broodje_Gezond::new);
    public static final RegistryObject<oneHunger> TOMAAT = ITEMS.register("tomaat", oneHunger::new);

    //Potions (Need a rewrite!)
    public static final RegistryObject<noHunger> WATER_BOTTLE = ITEMS.register("water_bottle", noHunger::new);
    public static final RegistryObject<koffie> KOFFIE = ITEMS.register("koffie", koffie::new);
    public static final RegistryObject<wine> WINE = ITEMS.register("wine", wine::new);
    public static final RegistryObject<cocktail> COCKTAIL = ITEMS.register("cocktail", cocktail::new);
    public static final RegistryObject<Champagne> CHAMPAGNE_BOTTLE = ITEMS.register("champagne_bottle", Champagne::new);
    public static final RegistryObject<MilkShake> MILKSHAKE = ITEMS.register("milkshake", MilkShake::new);

    //Vitamines (All 'Vitamines' needs custom effects. Everything is not the same. This is because the game will crash otherwise.)
    public static final RegistryObject<Vitamine_B> VITAMINE_A = ITEMS.register("vitamine_a", Vitamine_B::new);
    public static final RegistryObject<Vitamine_B> VITAMINE_B = ITEMS.register("vitamine_b", Vitamine_B::new);
    public static final RegistryObject<Vitamine_B> VITAMINE_C = ITEMS.register("vitamine_c", Vitamine_B::new);
    public static final RegistryObject<Vitamine_B> VITAMINE_D = ITEMS.register("vitamine_d", Vitamine_B::new);
    public static final RegistryObject<Vitamine_B> VITAMINE_E = ITEMS.register("vitamine_e", Vitamine_B::new);
    public static final RegistryObject<Vitamine_B> VITAMINE_F = ITEMS.register("vitamine_f", Vitamine_B::new);
}