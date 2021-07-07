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
    public static final RegistryObject<twoHunger> PINEAPPLE = ITEMS.register("pineapple", twoHunger::new);
    public static final RegistryObject<fourHunger> BACON = ITEMS.register("bacon", fourHunger::new);
    public static final RegistryObject<fourHunger> COOKED_BACON = ITEMS.register("cooked_bacon", fourHunger::new);
    public static final RegistryObject<oneHunger> CHICKEN = ITEMS.register("chicken", oneHunger::new);
    public static final RegistryObject<sixHunger> COOKED_CHICKEN = ITEMS.register("cooked_chicken", sixHunger::new);
    public static final RegistryObject<sixHunger> HOTDOG = ITEMS.register("hotdog", sixHunger::new);
    public static final RegistryObject<twoHunger> ICE_CREAM = ITEMS.register("ice_cream", twoHunger::new);
    public static final RegistryObject<fourHunger> CODFISH = ITEMS.register("codfish", fourHunger::new);
    public static final RegistryObject<fiveHunger> FRIES = ITEMS.register("fries", fiveHunger::new);
    public static final RegistryObject<fiveHunger> PIZZA = ITEMS.register("pizza", fiveHunger::new);
    public static final RegistryObject<fourHunger> VLEESHAPJE = ITEMS.register("vleeshapje", fourHunger::new); //I don't know the official name for it now. I will come back to this.
    public static final RegistryObject<twoHunger> Sushi = ITEMS.register("sushi", twoHunger::new);
    public static final RegistryObject<Weed> WEED = ITEMS.register("weed", Weed::new);
    public static final RegistryObject<Purple_Weed> PURPLE_WEED = ITEMS.register("purple_weed", Purple_Weed::new);
    public static final RegistryObject<Cocaine> COCAINE = ITEMS.register("cocaine", Cocaine::new);
    public static final RegistryObject<drakenvlees> DRAGONFLESH = ITEMS.register("dragonflesh", drakenvlees::new);
    public static final RegistryObject<eenhoornvlees> UNICORNFLESH = ITEMS.register("unicornflesh", eenhoornvlees::new);
    public static final RegistryObject<fiveHunger> BUNCH_OF_GRAPES = ITEMS.register("bunch_of_grapes", fiveHunger::new);
    public static final RegistryObject<fiveHunger> RED_GRAPES = ITEMS.register("red_grapes", fiveHunger::new);
    public static final RegistryObject<fourHunger> HOP = ITEMS.register("hop", fourHunger::new);
    public static final RegistryObject<fourHunger> STRAWBERRY = ITEMS.register("strawberry", fourHunger::new);
    public static final RegistryObject<twoHunger> STRAWBERRY_ICECREAM = ITEMS.register("strawberry_icecream", twoHunger::new);
    public static final RegistryObject<oneHunger> ALCOHOL_BOTTLE = ITEMS.register("alcohol_bottle", oneHunger::new);
    public static final RegistryObject<fiveHunger> APFELSTRUDEL = ITEMS.register("apfelstrudel", fiveHunger::new);
    public static final RegistryObject<threeHunger> BANANA = ITEMS.register("banana", threeHunger::new);
    public static final RegistryObject<sixHunger> BITTERBALLEN = ITEMS.register("bitterballen", sixHunger::new);
    public static final RegistryObject<fourHunger> CAN_LENTILES_SOUP = ITEMS.register("can_lentiles_soup", fourHunger::new);
    public static final RegistryObject<oneHunger> PEPPERNUT = ITEMS.register("peppernut", oneHunger::new);
    public static final RegistryObject<twoHunger> CHOCOLATES = ITEMS.register("chocolates", twoHunger::new);
    public static final RegistryObject<fiveHunger> FRIES_MAYONNAISE = ITEMS.register("fries_mayonnaise", fiveHunger::new);
    public static final RegistryObject<twoHunger> CHOCOLATE_ICECREAM = ITEMS.register("chocolate_icecream", twoHunger::new);
    public static final RegistryObject<twoHunger> CHOCOLATE_KIDS_ICECREAM = ITEMS.register("chocolate_kids_icecream", twoHunger::new);
    public static final RegistryObject<twoHunger> KIDS_ICECREAM = ITEMS.register("kids_icecream", twoHunger::new);
    public static final RegistryObject<twoHunger> SMURFS_ICECREAM = ITEMS.register("smurfs_icecream", twoHunger::new);
    public static final RegistryObject<twoHunger> VANILLA_ICECREAM = ITEMS.register("vanilla_icecream", twoHunger::new);
    public static final RegistryObject<fiveHunger> FLEMISH_FRIES = ITEMS.register("flemish_fries", fiveHunger::new);
    public static final RegistryObject<threeHunger> AVOCADO = ITEMS.register("avocado", threeHunger::new);
    public static final RegistryObject<threeHunger> BROWNIE = ITEMS.register("brownie", threeHunger::new);
    public static final RegistryObject<fourHunger> DONER_SANDWICH = ITEMS.register("doner_sandwich", fourHunger::new);
    public static final RegistryObject<Broodje_Gezond> HEALTHY_SANDWICH = ITEMS.register("healthy_sandwich", Broodje_Gezond::new);
    public static final RegistryObject<oneHunger> TOMATO = ITEMS.register("tomato", oneHunger::new);
    public static final RegistryObject<fiveHunger> SAUSAGE_ROLL = ITEMS.register("sausage_roll", fiveHunger::new);
    public static final RegistryObject<threeHunger> WIENER_SCHNITZEL = ITEMS.register("wiener_schnitzel", threeHunger::new);

    //Potions (Need a rewrite!)
    public static final RegistryObject<noHunger> WATER_BOTTLE = ITEMS.register("water_bottle", noHunger::new);
    public static final RegistryObject<koffie> COFFEE = ITEMS.register("coffee", koffie::new);
    public static final RegistryObject<wine> WINE = ITEMS.register("wine", wine::new);
    public static final RegistryObject<cocktail> COCKTAIL = ITEMS.register("cocktail", cocktail::new);
    public static final RegistryObject<Champagne> CHAMPAGNE_BOTTLE = ITEMS.register("champagne_bottle", Champagne::new);
    public static final RegistryObject<MilkShake> MILKSHAKE = ITEMS.register("milkshake", MilkShake::new);

    //Vitamines (All 'Vitamines' needs custom effects. Everything is not the same. This is because the game will crash otherwise.)
    public static final RegistryObject<Vitamine_B> VITAMIN_A = ITEMS.register("vitamin_a", Vitamine_B::new);
    public static final RegistryObject<Vitamine_B> VITAMIN_B = ITEMS.register("vitamin_b", Vitamine_B::new);
    public static final RegistryObject<Vitamine_B> VITAMIN_C = ITEMS.register("vitamin_c", Vitamine_B::new);
    public static final RegistryObject<Vitamine_B> VITAMIN_D = ITEMS.register("vitamin_d", Vitamine_B::new);
    public static final RegistryObject<Vitamine_B> VITAMIN_E = ITEMS.register("vitamin_e", Vitamine_B::new);
    public static final RegistryObject<Vitamine_B> VITAMIN_F = ITEMS.register("vitamin_f", Vitamine_B::new);
}