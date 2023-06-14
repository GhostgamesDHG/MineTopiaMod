package com.ghostgamesdhg.minetopia.init;

import com.ghostgamesdhg.minetopia.MinetopiaExtra;
import com.ghostgamesdhg.minetopia.items.*;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModFood {

    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MinetopiaExtra.MOD_ID);

    public static final RegistryObject<Hamburger> HAMBURGER = ITEMS.register("hamburger", Hamburger::new);
    public static final RegistryObject<sixHunger> SANDWICH = ITEMS.register("sandwich", sixHunger::new);
    public static final RegistryObject<fourHunger> PINEAPPLE = ITEMS.register("pineapple", fourHunger::new);
    public static final RegistryObject<twoHunger> BACON = ITEMS.register("bacon", twoHunger::new);
    public static final RegistryObject<eightHunger> COOKED_BACON = ITEMS.register("cooked_bacon", eightHunger::new);
    public static final RegistryObject<twoHunger> CHICKEN = ITEMS.register("chicken", twoHunger::new);
    public static final RegistryObject<sixHunger> COOKED_CHICKEN = ITEMS.register("cooked_chicken", sixHunger::new);
    public static final RegistryObject<eightHunger> HOTDOG = ITEMS.register("hotdog", eightHunger::new);
    public static final RegistryObject<fourHunger> ICE_CREAM = ITEMS.register("ice_cream", fourHunger::new);
    public static final RegistryObject<fourHunger> CODFISH = ITEMS.register("codfish", fourHunger::new);
    public static final RegistryObject<sixHunger> FRIES = ITEMS.register("fries", sixHunger::new);
    public static final RegistryObject<sixHunger> PIZZA = ITEMS.register("pizza", sixHunger::new);
    public static final RegistryObject<eightHunger> CHICKENBUCKET = ITEMS.register("chickenbucket", eightHunger::new);
    public static final RegistryObject<fourHunger> FRUIT_SKEWER = ITEMS.register("fruit_skewer", fourHunger::new);
    public static final RegistryObject<sixHunger> SUSHI = ITEMS.register("sushi", sixHunger::new);
    public static final RegistryObject<sixHunger> SUSHI_PACKAGE = ITEMS.register("sushi_package", sixHunger::new);
    public static final RegistryObject<sixHunger> MUFFIN = ITEMS.register("muffin", sixHunger::new);
    public static final RegistryObject<sixHunger> VANILLA_MUFFIN = ITEMS.register("vanilla_muffin", sixHunger::new);
    public static final RegistryObject<sixHunger> CHOCOLATE_MUFFIN = ITEMS.register("chocolate_muffin", sixHunger::new);
    public static final RegistryObject<fourHunger> JELLYBEANS = ITEMS.register("jellybeans", fourHunger::new);
    public static final RegistryObject<twoHunger> CANDY_CANE = ITEMS.register("candy_cane", twoHunger::new);
    public static final RegistryObject<eightHunger> DOUBLE_SUSHI_PACKAGE = ITEMS.register("double_sushi_package", eightHunger::new);
    public static final RegistryObject<fourHunger> CUPCAKE = ITEMS.register("cupcake", fourHunger::new);
    public static final RegistryObject<fourHunger> CHEESE = ITEMS.register("cheese", fourHunger::new);
    public static final RegistryObject<Weed> WEED = ITEMS.register("weed", Weed::new);
    public static final RegistryObject<Purple_Weed> PURPLE_WEED = ITEMS.register("purple_weed", Purple_Weed::new);
    public static final RegistryObject<Cocaine> COCAINE = ITEMS.register("cocaine", Cocaine::new);
    public static final RegistryObject<drakenvlees> DRAGONFLESH = ITEMS.register("dragonflesh", drakenvlees::new);
    public static final RegistryObject<eenhoornvlees> UNICORNFLESH = ITEMS.register("unicornflesh", eenhoornvlees::new);
    public static final RegistryObject<fourHunger> GRAPES = ITEMS.register("grapes", fourHunger::new);
    public static final RegistryObject<fourHunger> RED_GRAPES = ITEMS.register("red_grapes", fourHunger::new);
    public static final RegistryObject<fourHunger> HOP = ITEMS.register("hop", fourHunger::new);
    public static final RegistryObject<sixHunger> CHIPS_NATURAL = ITEMS.register("chips_natural", sixHunger::new);
    public static final RegistryObject<fourHunger> DONUT_BLUEBERRIES = ITEMS.register("donut_blueberries", fourHunger::new);
    public static final RegistryObject<fourHunger> DONUT_CHOCOLATE = ITEMS.register("donut_chocolate", fourHunger::new);
    public static final RegistryObject<fourHunger> DONUT_HALLOWEEN = ITEMS.register("donut_halloween", fourHunger::new);
    public static final RegistryObject<fourHunger> DONUT_STRAWBERRY = ITEMS.register("donut_strawberry", fourHunger::new);
    public static final RegistryObject<fourHunger> DONUT_CHRISTMAS = ITEMS.register("donut_christmas", fourHunger::new);
    public static final RegistryObject<fourHunger> DONUT_WHITE = ITEMS.register("donut_white", fourHunger::new);
    public static final RegistryObject<threeHunger> STRAWBERRY = ITEMS.register("strawberry", threeHunger::new);
    public static final RegistryObject<threeHunger> STRAWBERRY_ICECREAM = ITEMS.register("strawberry_icecream", threeHunger::new);
    public static final RegistryObject<twoHunger> CHOCOLATE_LETTER = ITEMS.register("chocolate_letter", twoHunger::new);
    public static final RegistryObject<twoHunger> CHOCOLATE_BAR = ITEMS.register("chocolate_bar", twoHunger::new);
    public static final RegistryObject<fiveHunger> APFELSTRUDEL = ITEMS.register("apfelstrudel", fiveHunger::new);
    public static final RegistryObject<threeHunger> BANANA = ITEMS.register("banana", threeHunger::new);
    public static final RegistryObject<sixHunger> BITTERBALLEN = ITEMS.register("bitterballen", sixHunger::new);
    public static final RegistryObject<fiveHunger> CAN_LENTILES_SOUP = ITEMS.register("can_lentiles_soup", fiveHunger::new);
    public static final RegistryObject<oneHunger> PEPPERNUT = ITEMS.register("peppernut", oneHunger::new);
    public static final RegistryObject<twoHunger> CHOCOLATES = ITEMS.register("chocolates", twoHunger::new);
    public static final RegistryObject<fiveHunger> FRIES_MAYONNAISE = ITEMS.register("fries_mayonnaise", fiveHunger::new);
    public static final RegistryObject<threeHunger> CHOCOLATE_ICECREAM = ITEMS.register("chocolate_icecream", threeHunger::new);
    public static final RegistryObject<threeHunger> CHOCOLATE_KIDS_ICECREAM = ITEMS.register("chocolate_kids_icecream", threeHunger::new);
    public static final RegistryObject<threeHunger> KIDS_ICECREAM = ITEMS.register("kids_icecream", threeHunger::new);
    public static final RegistryObject<threeHunger> DEEP_FRIED_RAISIN_BUN = ITEMS.register("deep_fried_raisin_bun", threeHunger::new);
    public static final RegistryObject<threeHunger> SMURFS_ICECREAM = ITEMS.register("smurfs_icecream", threeHunger::new);
    public static final RegistryObject<threeHunger> VANILLA_ICECREAM = ITEMS.register("vanilla_icecream", threeHunger::new);
    public static final RegistryObject<fiveHunger> FLEMISH_FRIES = ITEMS.register("flemish_fries", fiveHunger::new);
    public static final RegistryObject<twoHunger> AVOCADO = ITEMS.register("avocado", twoHunger::new);
    public static final RegistryObject<fourHunger> BROWNIE = ITEMS.register("brownie", fourHunger::new);
    public static final RegistryObject<fiveHunger> DONER_SANDWICH = ITEMS.register("doner_sandwich", fiveHunger::new);
    public static final RegistryObject<Broodje_Gezond> HEALTHY_SANDWICH = ITEMS.register("healthy_sandwich", Broodje_Gezond::new);
    public static final RegistryObject<fiveHunger> SAUSAGE_ROLL = ITEMS.register("sausage_roll", fiveHunger::new);
    public static final RegistryObject<eightHunger> WIENER_SCHNITZEL = ITEMS.register("wiener_schnitzel", eightHunger::new);
    public static final RegistryObject<sixHunger> CROISSANT = ITEMS.register("croissant", sixHunger::new);
    public static final RegistryObject<fourHunger> DATES = ITEMS.register("dates", fourHunger::new);
    public static final RegistryObject<sixHunger> HERRING = ITEMS.register("herring", sixHunger::new);
    public static final RegistryObject<fourHunger> CHEESE_FONDUE = ITEMS.register("cheese_fondue", fourHunger::new);
    public static final RegistryObject<sixHunger> CARP = ITEMS.register("carp", sixHunger::new);
    public static final RegistryObject<fourHunger> CHRISTMAS_COOKIE = ITEMS.register("christmas_cookie", fourHunger::new);
    public static final RegistryObject<eightHunger> CHICKEN_NUGGETS = ITEMS.register("chicken_nuggets", eightHunger::new);
    public static final RegistryObject<eightHunger> LOBSTER = ITEMS.register("lobster", eightHunger::new);
    public static final RegistryObject<twoHunger> RED_LOLLYPOP = ITEMS.register("red_lollypop", twoHunger::new);
    public static final RegistryObject<twoHunger> LOLLYPOP = ITEMS.register("lollypop", twoHunger::new);
    public static final RegistryObject<fourHunger> LIEGE_WAFFLE = ITEMS.register("liege_waffle", fourHunger::new);
    public static final RegistryObject<fiveHunger> MUSSELS = ITEMS.register("mussels", fiveHunger::new);
    public static final RegistryObject<fourHunger> OYSTER = ITEMS.register("oyster", fourHunger::new);
    public static final RegistryObject<sixHunger> OYSTERS = ITEMS.register("oysters", sixHunger::new);
    public static final RegistryObject<fourHunger> DEEP_FRIED_DOUGHNUT_BALLS = ITEMS.register("deep_fried_doughnut_balls", fourHunger::new);
    public static final RegistryObject<fourHunger> PRETZEL = ITEMS.register("pretzel", fourHunger::new);
    public static final RegistryObject<sixHunger> REDFISH = ITEMS.register("redfish", sixHunger::new);
    public static final RegistryObject<sixHunger> PIKE = ITEMS.register("pike", sixHunger::new);
    public static final RegistryObject<twoHunger> SPARERIBS = ITEMS.register("spareribs", twoHunger::new);
    public static final RegistryObject<eightHunger> COOKED_SPARERIBS = ITEMS.register("cooked_spareribs", eightHunger::new);
    public static final RegistryObject<sixHunger> STURGEON = ITEMS.register("sturgeon", sixHunger::new);
    public static final RegistryObject<fourHunger> STROOPWAFEL = ITEMS.register("stroopwafel", fourHunger::new);
    public static final RegistryObject<eightHunger> TURKISH_PIZZA = ITEMS.register("turkish_pizza", eightHunger::new);
    public static final RegistryObject<fourHunger> WAFFLE = ITEMS.register("waffle", fourHunger::new);
    public static final RegistryObject<fourHunger> WHITE_GRAPES = ITEMS.register("white_grapes", fourHunger::new);
    public static final RegistryObject<sixHunger> SALTY_FISH = ITEMS.register("salty_fish", sixHunger::new);
    public static final RegistryObject<sixHunger> FRIED_FISH = ITEMS.register("fried_fish", sixHunger::new);
    public static final RegistryObject<fourHunger> OMELET = ITEMS.register("omelet", fourHunger::new);
    public static final RegistryObject<eightHunger> MEATBALLS = ITEMS.register("meatballs", eightHunger::new);
    public static final RegistryObject<eightHunger> LASAGNE = ITEMS.register("lasagne", eightHunger::new);
    public static final RegistryObject<sixHunger> POPCORN = ITEMS.register("popcorn", sixHunger::new);
    public static final RegistryObject<sixHunger> SPAGHETTI = ITEMS.register("spaghetti", sixHunger::new);
    public static final RegistryObject<fourHunger> WRAP = ITEMS.register("wrap", fourHunger::new);
    public static final RegistryObject<twoHunger> CHOCOLATE_EGG = ITEMS.register("chocolate_egg", twoHunger::new);
    public static final RegistryObject<twoHunger> LEMON = ITEMS.register("lemon", twoHunger::new);
    public static final RegistryObject<twoHunger> LETTUCE = ITEMS.register("lettuce", twoHunger::new);
    public static final RegistryObject<twoHunger> KIWI = ITEMS.register("kiwi", twoHunger::new);
    public static final RegistryObject<sixHunger> FRIKANDEL_BROODJE = ITEMS.register("frikandel_broodje", sixHunger::new);
    public static final RegistryObject<pepper> PEPPER = ITEMS.register("pepper", pepper::new);
    public static final RegistryObject<twoHunger> DROP = ITEMS.register("drop", twoHunger::new);
    public static final RegistryObject<twoHunger> CANDY_GREEN = ITEMS.register("candy_green", twoHunger::new);
    public static final RegistryObject<twoHunger> CANDY_PURPLE = ITEMS.register("candy_purple", twoHunger::new);
    public static final RegistryObject<twoHunger> CANDY_RED = ITEMS.register("candy_red", twoHunger::new);
    public static final RegistryObject<gelukskoekje> FORTUNE_COOKIE = ITEMS.register("fortune_cookie", gelukskoekje::new);
    public static final RegistryObject<fourHunger> ORANGE = ITEMS.register("orange", fourHunger::new);
    public static final RegistryObject<fourHunger> RASPBERRY = ITEMS.register("raspberry", fourHunger::new);
    public static final RegistryObject<fourHunger> PEAR = ITEMS.register("pear", fourHunger::new);
    public static final RegistryObject<sevenHunger> TOMATO_SOUP = ITEMS.register("tomato_soup", sevenHunger::new);
    public static final RegistryObject<eightHunger> ROOKWORST = ITEMS.register("rookworst", eightHunger::new);
    public static final RegistryObject<sixHunger> CHEESECAKE = ITEMS.register("cheesecake", sixHunger::new);
    public static final RegistryObject<fourHunger> BOSSCHE_BOL = ITEMS.register("bossche_bol", fourHunger::new);
    public static final RegistryObject<eightHunger> CHOCOLATE_CAKE = ITEMS.register("chocolate_cake", eightHunger::new);
    public static final RegistryObject<eightHunger> VANILLA_CAKE = ITEMS.register("vanilla_cake", eightHunger::new);
    public static final RegistryObject<twoHunger> SHRIMP = ITEMS.register("shrimp", twoHunger::new);
    public static final RegistryObject<eightHunger> COOKED_SHRIMP = ITEMS.register("cooked_shrimp", eightHunger::new);
    public static final RegistryObject<twoHunger> MERINGUE = ITEMS.register("meringue", twoHunger::new);
    public static final RegistryObject<twoHunger> TAAITAAI = ITEMS.register("taaitaai", twoHunger::new);
    public static final RegistryObject<twoHunger> SPICED_BESQUIT = ITEMS.register("spiced_besquit", twoHunger::new);
    public static final RegistryObject<twoHunger> TOMPOUCE = ITEMS.register("tompouce", twoHunger::new);
    public static final RegistryObject<twoHunger> TOMATO = ITEMS.register("tomato", twoHunger::new);
    public static final RegistryObject<twoHunger> CORN = ITEMS.register("corn", twoHunger::new);
    public static final RegistryObject<twoHunger> PAPRIKA = ITEMS.register("paprika", twoHunger::new);
    public static final RegistryObject<sixHunger> COOKED_CORN = ITEMS.register("cooked_corn", sixHunger::new);
    public static final RegistryObject<noHunger> FLOUR = ITEMS.register("flour", noHunger::new);

    //Potions (Need a rewrite!)
    public static final RegistryObject<Drinkable> WATER_BOTTLE = ITEMS.register("water_bottle", Drinkable::new);
    public static final RegistryObject<koffie> COFFEE = ITEMS.register("coffee", koffie::new);
    public static final RegistryObject<wine> BEER_BOTTLE = ITEMS.register("beer_bottle", wine::new);
    public static final RegistryObject<wine> BEER_GLASS = ITEMS.register("beer_glass", wine::new);
    public static final RegistryObject<MilkShake> MILKSHAKE = ITEMS.register("milkshake", MilkShake::new);
    public static final RegistryObject<Drinkable> ALCOHOL_BOTTLE = ITEMS.register("alcohol_bottle", Drinkable::new);
    public static final RegistryObject<Drinkable> ORANGE_JUICE = ITEMS.register("orange_juice", Drinkable::new);



    //Vitamines
    public static final RegistryObject<Vitamine_B> VITAMIN_A = ITEMS.register("vitamin_a", Vitamine_B::new);
    public static final RegistryObject<Vitamine_B> VITAMIN_B = ITEMS.register("vitamin_b", Vitamine_B::new);
    public static final RegistryObject<Vitamine_B> VITAMIN_C = ITEMS.register("vitamin_c", Vitamine_B::new);
    public static final RegistryObject<Vitamine_B> VITAMIN_D = ITEMS.register("vitamin_d", Vitamine_B::new);
    public static final RegistryObject<Vitamine_B> VITAMIN_E = ITEMS.register("vitamin_e", Vitamine_B::new);
    public static final RegistryObject<Vitamine_B> VITAMIN_F = ITEMS.register("vitamin_f", Vitamine_B::new);

    //ANIMAL FOOD (Need a custom code, Will do this later!)
    public static final RegistryObject<DogFood> DOG_FOOD = ITEMS.register("dog_food", DogFood::new);
    public static final RegistryObject<CatFood> CAT_FOOD = ITEMS.register("cat_food", CatFood::new);


    //CROPS(BlockItem for linking together)
    public static final RegistryObject<Item> CORN_SEEDS = ITEMS.register("corn_seeds",
            () -> new BlockItem(ModBlocks.CORN.get(), new Item.Properties()
                    .group(MinetopiaExtra.TAB4)));

    public static final RegistryObject<Item> PAPRIKA_SEEDS = ITEMS.register("paprika_seeds",
            () -> new BlockItem(ModBlocks.PAPRIKA.get(), new Item.Properties()
                    .group(MinetopiaExtra.TAB4)));

    public static final RegistryObject<Item> PINEAPPLE_SEEDS = ITEMS.register("pineapple_seeds",
            () -> new BlockItem(ModBlocks.PINEAPPLE.get(), new Item.Properties()
                    .group(MinetopiaExtra.TAB4)));

    public static final RegistryObject<Item> TOMATO_SEEDS = ITEMS.register("tomato_seeds",
            () -> new BlockItem(ModBlocks.TOMATO.get(), new Item.Properties()
                    .group(MinetopiaExtra.TAB4)));

    public static final RegistryObject<Item> STRAWBERRY_SEEDS = ITEMS.register("strawberry_seeds",
            () -> new BlockItem(ModBlocks.STRAWBERRY.get(), new Item.Properties()
                    .group(MinetopiaExtra.TAB4)));

    public static final RegistryObject<Item> HOP_SEEDS = ITEMS.register("hop_seeds",
            () -> new BlockItem(ModBlocks.HOP.get(), new Item.Properties()
                    .group(MinetopiaExtra.TAB4)));

    public static final RegistryObject<Item> PEPPER_SEEDS = ITEMS.register("pepper_seeds",
            () -> new BlockItem(ModBlocks.PEPPER.get(), new Item.Properties()
                    .group(MinetopiaExtra.TAB4)));

    public static final RegistryObject<Item> GRAPES_SEEDS = ITEMS.register("grapes_seeds",
            () -> new BlockItem(ModBlocks.GRAPES.get(), new Item.Properties()
                    .group(MinetopiaExtra.TAB4)));

    public static final RegistryObject<Item> RED_GRAPES_SEEDS = ITEMS.register("red_grapes_seeds",
            () -> new BlockItem(ModBlocks.RED_GRAPES.get(), new Item.Properties()
                    .group(MinetopiaExtra.TAB4)));

    public static final RegistryObject<Item> WHITE_GRAPES_SEEDS = ITEMS.register("white_grapes_seeds",
            () -> new BlockItem(ModBlocks.WHITE_GRAPES.get(), new Item.Properties()
                    .group(MinetopiaExtra.TAB4)));

    public static final RegistryObject<Item> LETTUCE_SEEDS = ITEMS.register("lettuce_seeds",
            () -> new BlockItem(ModBlocks.LETTUCE.get(), new Item.Properties()
                    .group(MinetopiaExtra.TAB4)));

    public static final RegistryObject<Item> WEED_SEEDS = ITEMS.register("weed_seeds",
            () -> new BlockItem(ModBlocks.WEED.get(), new Item.Properties()
                    .group(MinetopiaExtra.TAB4)));
}