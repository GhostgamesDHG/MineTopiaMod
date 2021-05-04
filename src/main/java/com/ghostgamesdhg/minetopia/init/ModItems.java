package com.ghostgamesdhg.minetopia.init;

import com.ghostgamesdhg.minetopia.MinetopiaExtra;
import com.ghostgamesdhg.minetopia.blocks.BlockInvis;
import com.ghostgamesdhg.minetopia.blocks.BlockItemBase;
import com.ghostgamesdhg.minetopia.blocks.BlockTrophies;
import com.ghostgamesdhg.minetopia.items.*;
import com.ghostgamesdhg.minetopia.util.enums.ModArmorMaterial;
import com.ghostgamesdhg.minetopia.util.enums.ModItemTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    
    //This class registers the items in the mod.
    
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MinetopiaExtra.MOD_ID);

    // Items place
    public static final RegistryObject<Item> BLACK_PHONE = ITEMS.register("black_phone", ItemBase::new);
    public static final RegistryObject<Item> PINK_PHONE = ITEMS.register("pink_phone", ItemBase::new);
    public static final RegistryObject<Item> YELLOW_PHONE = ITEMS.register("yellow_phone", ItemBase::new);
    public static final RegistryObject<Item> GREEN_PHONE = ITEMS.register("green_phone", ItemBase::new);
    public static final RegistryObject<Item> BLUE_PHONE = ITEMS.register("blue_phone", ItemBase::new);
    public static final RegistryObject<Item> RED_PHONE = ITEMS.register("red_phone", ItemBase::new);
    public static final RegistryObject<Item> SLEUTEL = ITEMS.register("sleutel", ItemBase::new);
    public static final RegistryObject<Item> MONEY1 = ITEMS.register("0.10euro", ItemBase::new);
    public static final RegistryObject<Item> MONEY2 = ITEMS.register("1euro", ItemBase::new);
    public static final RegistryObject<Item> MONEY3 = ITEMS.register("5euro", ItemBase::new);
    public static final RegistryObject<Item> MONEY4 = ITEMS.register("10euro", ItemBase::new);
    public static final RegistryObject<Item> MONEY5 = ITEMS.register("20euro", ItemBase::new);
    public static final RegistryObject<Item> MONEY6 = ITEMS.register("50euro", ItemBase::new);
    public static final RegistryObject<Item> MONEY7 = ITEMS.register("100euro", ItemBase::new);
    public static final RegistryObject<Item> MONEY8 = ITEMS.register("200euro", ItemBase::new);
    public static final RegistryObject<Item> MONEY9 = ITEMS.register("500euro", ItemBase::new);
    public static final RegistryObject<Item> MONEY10 = ITEMS.register("1000euro", ItemBase::new);
    public static final RegistryObject<Item> MONEY11 = ITEMS.register("100dollard", ItemBase::new);
    public static final RegistryObject<Item> MONEY12 = ITEMS.register("1000dollard", ItemBase::new);
    public static final RegistryObject<Item> MONEY13 = ITEMS.register("5000dollard", ItemBase::new);
    public static final RegistryObject<Item> MONEY14 = ITEMS.register("10000dollard", ItemBase::new);
    public static final RegistryObject<Item> MONEY15 = ITEMS.register("25000dollard", ItemBase::new);
    public static final RegistryObject<Item> MONEY16 = ITEMS.register("50000dollard", ItemBase::new);
    public static final RegistryObject<Item> INGBANKPAS = ITEMS.register("ingbankpas", ItemBase::new);
    public static final RegistryObject<Item> BLUE_CRYSTAL = ITEMS.register("blue_crystal", ItemBase::new);
    public static final RegistryObject<Item> BALLON_ROZE = ITEMS.register("ballon_roze", ItemBase::new);
    public static final RegistryObject<Item> BALLON_ROOD = ITEMS.register("ballon_rood", ItemBase::new);
    public static final RegistryObject<Item> BALLON_ORANJE = ITEMS.register("ballon_oranje", ItemBase::new);
    public static final RegistryObject<Item> BALLON_GROEN = ITEMS.register("ballon_groen", ItemBase::new);
    public static final RegistryObject<Item> BALLON_GEEL = ITEMS.register("ballon_geel", ItemBase::new);
    public static final RegistryObject<Item> BALLON_BLAUW = ITEMS.register("ballon_blauw", ItemBase::new);
    public static final RegistryObject<Item> SPORTHORLOGE = ITEMS.register("sporthorloge", ItemBase::new);
    public static final RegistryObject<Item> WANDELTAK = ITEMS.register("wandeltak", ItemBase::new);
    public static final RegistryObject<Item> WANDELSTOK = ITEMS.register("wandelstok", ItemBase::new);
    public static final RegistryObject<Item> RING = ITEMS.register("ring", ItemBase::new);
    public static final RegistryObject<Item> PARAPLU_BLAUWWIT = ITEMS.register("paraplu_blauwwit", ItemBase::new);
    public static final RegistryObject<Item> PARAPLU_RAINBOW = ITEMS.register("paraplu_rainbow", ItemBase::new);
    public static final RegistryObject<Item> PARAPLU_ROODWIT = ITEMS.register("paraplu_roodwit", ItemBase::new);
    public static final RegistryObject<Item> STONE_SLEUTEL = ITEMS.register("stone_sleutel", ItemBase::new);
    public static final RegistryObject<Item> MINETOPIABAG = ITEMS.register("minetopiabag", ItemBase::new);
    public static final RegistryObject<Item> POMPOENLANTAARN = ITEMS.register("pompoenlantaarn", ItemBase::new);
    public static final RegistryObject<Item> NEKTASJE = ITEMS.register("nektasje", ItemBase::new);
    public static final RegistryObject<Item> DUIKFLES = ITEMS.register("duikfles", ItemBase::new);
    public static final RegistryObject<Item> PEPPERSPRAY = ITEMS.register("pepperspray", ItemBase::new);
    public static final RegistryObject<Item> GOUDENHORLOGE = ITEMS.register("goudenhorloge", ItemBase::new);
    public static final RegistryObject<Item> WHEELCOIN = ITEMS.register("wheelcoin", ItemBase::new);
    public static final RegistryObject<Item> LUCKYSHARD = ITEMS.register("luckyshard", ItemBase::new);
    public static final RegistryObject<Item> BRONZE_PRISONCOIN = ITEMS.register("bronze_prisoncoin", ItemBase::new);
    public static final RegistryObject<Item> ZILVEREN_PRISONCOIN = ITEMS.register("zilveren_prisoncoin", ItemBase::new);
    public static final RegistryObject<Item> GRAYCOIN = ITEMS.register("graycoin", ItemBase::new);
    public static final RegistryObject<Item> MTCASINO_BLAUW = ITEMS.register("mtcasino_blauw", ItemBase::new);
    public static final RegistryObject<Item> MTCASINO_GOLD = ITEMS.register("mtcasino_gold", ItemBase::new);
    public static final RegistryObject<Item> MTCASINO_GROEN = ITEMS.register("mtcasino_groen", ItemBase::new);
    public static final RegistryObject<Item> MTCASINO_ORANJE = ITEMS.register("mtcasino_oranje", ItemBase::new);
    public static final RegistryObject<Item> MTCASINO_ROOD = ITEMS.register("mtcasino_rood", ItemBase::new);
    public static final RegistryObject<Item> MTCASINO_SILVER = ITEMS.register("mtcasino_silver", ItemBase::new);
    public static final RegistryObject<Item> LEGEND_50 = ITEMS.register("legend_50", ItemBase::new);
    public static final RegistryObject<Item> LEGEND_1 = ITEMS.register("legend_1", ItemBase::new);
    public static final RegistryObject<Item> EPIC_10 = ITEMS.register("epic_10", ItemBase::new);
    public static final RegistryObject<Item> EPIC_5 = ITEMS.register("epic_5", ItemBase::new);
    public static final RegistryObject<Item> EPIC_1 = ITEMS.register("epic_1", ItemBase::new);
    public static final RegistryObject<Item> COMMON_50 = ITEMS.register("common_50", ItemBase::new);
    public static final RegistryObject<Item> COMMON_10 = ITEMS.register("common_10", ItemBase::new);
    public static final RegistryObject<Item> COMMON_1 = ITEMS.register("common_1", ItemBase::new);
    public static final RegistryObject<Item> MODERN_WANDELSTOK = ITEMS.register("modern_wandelstok", ItemBase::new);
    public static final RegistryObject<Item> ZAK_PARAPLU = ITEMS.register("zak_paraplu", ItemBase::new);
    public static final RegistryObject<Item> SKISTOKKEN = ITEMS.register("skistokken", ItemBase::new);
    public static final RegistryObject<Item> MAGICWAND = ITEMS.register("magicwand", ItemBase::new);
    public static final RegistryObject<Item> MAGICWAND_BLUE = ITEMS.register("magicwand_blue", ItemBase::new);
    public static final RegistryObject<Item> MAGICWAND_GREEN = ITEMS.register("magicwand_green", ItemBase::new);
    public static final RegistryObject<Item> MAGICWAND_RED = ITEMS.register("magicwand_red", ItemBase::new);
    public static final RegistryObject<Item> MAGICWAND_YELLOW = ITEMS.register("magicwand_yellow", ItemBase::new);
    public static final RegistryObject<Item> JETPACK_DIAMOND = ITEMS.register("jetpack_diamond", ItemBase::new);
    public static final RegistryObject<Item> JETPACK_GOLD = ITEMS.register("jetpack_gold", ItemBase::new);
    public static final RegistryObject<Item> JETPACK_GRIJS = ITEMS.register("jetpack_grijs", ItemBase::new);
    public static final RegistryObject<Item> JETPACK_IRON = ITEMS.register("jetpack_iron", ItemBase::new);
    public static final RegistryObject<Item> KEY_DOBBELSTEEN_BRONZE = ITEMS.register("key_dobbelsteen_bronze", ItemBase::new);
    public static final RegistryObject<Item> KEY_DOBBELSTEEN_DIAMOND = ITEMS.register("key_dobbelsteen_diamond", ItemBase::new);
    public static final RegistryObject<Item> KEY_DOBBELSTEEN_EMERALD = ITEMS.register("key_dobbelsteen_emerald", ItemBase::new);
    public static final RegistryObject<Item> KEY_DOBBELSTEEN_GOLD = ITEMS.register("key_dobbelsteen_gold", ItemBase::new);
    public static final RegistryObject<Item> KEY_DOBBELSTEEN_MYSTIC = ITEMS.register("key_dobbelsteen_mystic", ItemBase::new);
    public static final RegistryObject<Item> KEY_DOBBELSTEEN_REDSTONE = ITEMS.register("key_dobbelsteen_redstone", ItemBase::new);
    public static final RegistryObject<Item> KEY_DOBBELSTEEN_SILVER = ITEMS.register("key_dobbelsteen_silver", ItemBase::new);
    public static final RegistryObject<Item> KEY_HAMER_BRONZE = ITEMS.register("key_hamer_bronze", ItemBase::new);
    public static final RegistryObject<Item> KEY_HAMER_DIAMOND = ITEMS.register("key_hamer_diamond", ItemBase::new);
    public static final RegistryObject<Item> KEY_HAMER_EMERALD = ITEMS.register("key_hamer_emerald", ItemBase::new);
    public static final RegistryObject<Item> KEY_HAMER_GOLD = ITEMS.register("key_hamer_gold", ItemBase::new);
    public static final RegistryObject<Item> KEY_HAMER_MYSTIC = ITEMS.register("key_hamer_mystic", ItemBase::new);
    public static final RegistryObject<Item> KEY_HAMER_REDSTONE = ITEMS.register("key_hamer_redstone", ItemBase::new);
    public static final RegistryObject<Item> KEY_HAMER_SILVER = ITEMS.register("key_hamer_silver", ItemBase::new);

    //Items (Not in tab) (/give command only)
    public static final RegistryObject<DiamondCore> DIAMONDCORE = ITEMS.register("diamondcore", DiamondCore::new);
    public static final RegistryObject<EmeraldCoin> EMERALDCOIN = ITEMS.register("emeraldcoin", EmeraldCoin::new);

    //Popetjes
    public static final RegistryObject<Item> OLAF = ITEMS.register("olaf", ItemPopetjes::new);
    public static final RegistryObject<Item> SKELETONPOPPETJE = ITEMS.register("skeletonpoppetje", ItemPopetjes::new);
    public static final RegistryObject<Item> PAPEGAAIPOPPETJE = ITEMS.register("papegaaipoppetje", ItemPopetjes::new);
    public static final RegistryObject<Item> COWPOPPETJE = ITEMS.register("cowpoppetje", ItemPopetjes::new);
    public static final RegistryObject<Item> DUCKPOPPETJE = ITEMS.register("duckpoppetje", ItemPopetjes::new);
    public static final RegistryObject<Item> HAAIPOPPETJE = ITEMS.register("haaipoppetje", ItemPopetjes::new);
    public static final RegistryObject<Item> HULKPOPPETJE = ITEMS.register("hulkpoppetje", ItemPopetjes::new);
    public static final RegistryObject<Item> DINOPOPPETJE = ITEMS.register("dinopoppetje", ItemPopetjes::new);
    public static final RegistryObject<Item> FLAMINGOPOPPETJE = ITEMS.register("flamingopoppetje", ItemPopetjes::new);
    public static final RegistryObject<Item> IJSBEERPOPPETJE = ITEMS.register("ijsbeerpoppetje", ItemPopetjes::new);
    public static final RegistryObject<Item> KERSTMANPOPPETJE = ITEMS.register("kerstmanpoppetje", ItemPopetjes::new);
    public static final RegistryObject<Item> KILLERCLOWNPOPPETJE = ITEMS.register("killerclownpoppetje", ItemPopetjes::new);
    public static final RegistryObject<Item> LEEUWPOPPEJT = ITEMS.register("leeuwpoppetje", ItemPopetjes::new);
    public static final RegistryObject<Item> MINIONPOPPETJE = ITEMS.register("minionpoppetje", ItemPopetjes::new);
    public static final RegistryObject<Item> OLIFANTPOPPETJE = ITEMS.register("olifantpoppetje", ItemPopetjes::new);
    public static final RegistryObject<Item> PIKACHUPOPPETJE = ITEMS.register("pikachupoppetje", ItemPopetjes::new);
    public static final RegistryObject<Item> PINGUINPOPPETJE = ITEMS.register("pinguinpoppetje", ItemPopetjes::new);
    public static final RegistryObject<Item> RENDIERPOPPETJE = ITEMS.register("rendierpoppetje", ItemPopetjes::new);
    public static final RegistryObject<Item> SCHAAPPOPPETJE = ITEMS.register("schaappoppetje", ItemPopetjes::new);
    public static final RegistryObject<Item> SLANGPOPPETJE = ITEMS.register("slangpoppetje", ItemPopetjes::new);
    public static final RegistryObject<Item> SNORLAXPOPPETJE = ITEMS.register("snorlaxpoppetje", ItemPopetjes::new);
    public static final RegistryObject<Item> TIJGERPOPPETJE = ITEMS.register("tijgerpoppetje", ItemPopetjes::new);
    public static final RegistryObject<Item> TJIRDPOPPETJE = ITEMS.register("tjirdpoppetje", ItemPopetjes::new);
    public static final RegistryObject<Item> WOODYPOPPETJE = ITEMS.register("woodypoppetje", ItemPopetjes::new);
    public static final RegistryObject<Item> ZEBRAPOPPETJE = ITEMS.register("zebrapoppetje", ItemPopetjes::new);
    public static final RegistryObject<Item> SNEEUWPOPPETJE = ITEMS.register("sneeuwpoppetje", ItemPopetjes::new);
    public static final RegistryObject<Item> TEDDYBEER = ITEMS.register("teddybeer", ItemPopetjes::new);
    public static final RegistryObject<Item> LEGOPOPPETJE = ITEMS.register("legopoppetje", ItemPopetjes::new);
    public static final RegistryObject<Item> AMONGUSRED = ITEMS.register("amongusred", ItemPopetjes::new);

    //Hats
    public static final RegistryObject<Item> DOLLARBRIL = ITEMS.register("dollarbril", ItemHats::new);
    public static final RegistryObject<Item> SOMBRERO = ITEMS.register("sombrero", ItemHats::new);
    public static final RegistryObject<Item> BEERHEAD = ITEMS.register("beerhead", ItemHats::new);
    public static final RegistryObject<Item> IJSBEERHEAD = ITEMS.register("ijsbeerhead", ItemHats::new);
    public static final RegistryObject<Item> DROLHOED = ITEMS.register("drolhoed", ItemHats::new);
    public static final RegistryObject<Item> GOKUHAIR = ITEMS.register("gokuhair", ItemHats::new);
    public static final RegistryObject<Item> BLUEGOKUHAIR = ITEMS.register("bluegokuhair", ItemHats::new);
    public static final RegistryObject<Item> ORANGEGOKUHAIR = ITEMS.register("orangegokuhair", ItemHats::new);
    public static final RegistryObject<Item> PINKGOKUHAIR = ITEMS.register("pinkgokuhair", ItemHats::new);
    public static final RegistryObject<Item> GREENGOKUHAIR = ITEMS.register("greengokuhair", ItemHats::new);
    public static final RegistryObject<Item> BOUWHELM = ITEMS.register("bouwhelm", ItemHats::new);
    public static final RegistryObject<Item> DUIKBRIL_BLAUW = ITEMS.register("duikbril_blauw", ItemHats::new);
    public static final RegistryObject<Item> DUIKBRIL_GEEL = ITEMS.register("duikbril_geel", ItemHats::new);
    public static final RegistryObject<Item> DUIKBRIL_GROEN = ITEMS.register("duikbril_groen", ItemHats::new);
    public static final RegistryObject<Item> DUIKBRIL_ROZE = ITEMS.register("duikbril_roze", ItemHats::new);
    public static final RegistryObject<Item> HEKSENHOED = ITEMS.register("heksenhoed", ItemHats::new);
    public static final RegistryObject<Item> ELFENHOED = ITEMS.register("elfenhoed", ItemHats::new);
    public static final RegistryObject<Item> TIARA = ITEMS.register("tiara", ItemHats::new);
    public static final RegistryObject<Item> PLANGA_GEEL = ITEMS.register("planga_geel", ItemHats::new);
    public static final RegistryObject<Item> PLANGA_GOUD = ITEMS.register("planga_goud", ItemHats::new);
    public static final RegistryObject<Item> PLANGA_GRIJS = ITEMS.register("planga_grijs", ItemHats::new);
    public static final RegistryObject<Item> PLANGA_GROEN = ITEMS.register("planga_groen", ItemHats::new);
    public static final RegistryObject<Item> PLANGA_MAGENTA = ITEMS.register("planga_magenta", ItemHats::new);
    public static final RegistryObject<Item> PLANGA_ORANJE = ITEMS.register("planga_oranje", ItemHats::new);
    public static final RegistryObject<Item> PLANGA_PAARS = ITEMS.register("planga_paars", ItemHats::new);
    public static final RegistryObject<Item> PLANGA_ROOD = ITEMS.register("planga_rood", ItemHats::new);
    public static final RegistryObject<Item> PLANGA_ROZE = ITEMS.register("planga_roze", ItemHats::new);
    public static final RegistryObject<Item> PLANGA_WIT = ITEMS.register("planga_wit", ItemHats::new);
    public static final RegistryObject<Item> HELO = ITEMS.register("helo", ItemHats::new);
    public static final RegistryObject<Item> KERSTMUTS = ITEMS.register("kerstmuts", ItemHats::new);
    public static final RegistryObject<Item> EENHOORNHEAD = ITEMS.register("eenhoornhead", ItemHats::new);
    public static final RegistryObject<Item> HOLLANDBRIL = ITEMS.register("hollandbril", ItemHats::new);
    public static final RegistryObject<Item> HALLOWEEN_MASK = ITEMS.register("halloween_mask", ItemHats::new);
    public static final RegistryObject<Item> HEADSET = ITEMS.register("headset", ItemHats::new);
    public static final RegistryObject<Item> PINGUINHEAD = ITEMS.register("pinguinhead", ItemHats::new);
    public static final RegistryObject<Item> WOLFHEAD = ITEMS.register("wolfhead", ItemHats::new);
    public static final RegistryObject<Item> PYROS_HEAD = ITEMS.register("pyros_head", ItemHats::new);
    public static final RegistryObject<Item> ROBOTA_HEAD = ITEMS.register("robota_head", ItemHats::new);
    public static final RegistryObject<Item> BLACK_KNIGHT_HEAD = ITEMS.register("black_knight_head", ItemHats::new);
    public static final RegistryObject<Item> ENGEL_HEAD = ITEMS.register("engel_head", ItemHats::new);
    public static final RegistryObject<Item> RED_KNIGHT_HEAD = ITEMS.register("red_knight_head", ItemHats::new);
    public static final RegistryObject<Item> PHOENIX_HEAD = ITEMS.register("phoenix_head", ItemHats::new);
    public static final RegistryObject<Item> WITTESTRIK = ITEMS.register("wittestrik", ItemHats::new);
    public static final RegistryObject<Item> WITTEBRIL = ITEMS.register("wittebril", ItemHats::new);
    public static final RegistryObject<Item> VERREKIJKER = ITEMS.register("verrekijker", ItemHats::new);
    public static final RegistryObject<Item> TWBRIL = ITEMS.register("twbril", ItemHats::new);
    public static final RegistryObject<Item> THUGLIFEBRIL = ITEMS.register("thuglifebril", ItemHats::new);
    public static final RegistryObject<Item> STERREBRIL = ITEMS.register("sterrebril", ItemHats::new);
    public static final RegistryObject<Item> ORANJEPET = ITEMS.register("oranjepet", ItemHats::new);
    public static final RegistryObject<Item> BLAUWEHELM = ITEMS.register("blauwehelm", ItemHats::new);
    public static final RegistryObject<Item> BLAUWESTRIK = ITEMS.register("blauwestrik", ItemHats::new);
    public static final RegistryObject<Item> GELEHELM = ITEMS.register("gelehelm", ItemHats::new);
    public static final RegistryObject<Item> RENDIERHEAD = ITEMS.register("rendierhead", ItemHats::new);
    public static final RegistryObject<Item> KERSTMANHEAD = ITEMS.register("kerstmanhead", ItemHats::new);
    public static final RegistryObject<Item> GOUDEHEADSET = ITEMS.register("goudeheadset", ItemHats::new);
    public static final RegistryObject<Item> SMILLEYMASK = ITEMS.register("smilleymask", ItemHats::new);
    public static final RegistryObject<Item> ROZEPET = ITEMS.register("rozepet", ItemHats::new);
    public static final RegistryObject<Item> GESLAAGDHOED = ITEMS.register("geslaagdhoed", ItemHats::new);
    public static final RegistryObject<Item> KOALAHEAD = ITEMS.register("koalahead", ItemHats::new);
    public static final RegistryObject<Item> NIGHTRIDERHELM = ITEMS.register("nightriderhelm", ItemHats::new);
    public static final RegistryObject<Item> ONSTOPPERHEAD = ITEMS.register("onstopperhead", ItemHats::new);
    public static final RegistryObject<Item> ZWARTE_PET = ITEMS.register("zwarte_pet", ItemHats::new);
    public static final RegistryObject<Item> ZWARTE_PET_BACK = ITEMS.register("zwarte_pet_back", ItemHats::new);
    public static final RegistryObject<Item> POKEMONPET = ITEMS.register("pokemonpet", ItemHats::new);
    public static final RegistryObject<Item> POKEMONPET_BACK = ITEMS.register("pokemonpet_back", ItemHats::new);
    public static final RegistryObject<Item> PROPELLORPET = ITEMS.register("propellorpet", ItemHats::new);
    public static final RegistryObject<Item> RODEHELM = ITEMS.register("rodehelm", ItemHats::new);
    public static final RegistryObject<Item> RODEHOGEHOED = ITEMS.register("rodehogehoed", ItemHats::new);
    public static final RegistryObject<Item> PUMPKINMASK = ITEMS.register("pumpkinmask", ItemHats::new);
    public static final RegistryObject<Item> RODESTRIK = ITEMS.register("rodestrik", ItemHats::new);
    public static final RegistryObject<Item> GIRAFFE_PET = ITEMS.register("giraffe_pet", ItemHats::new);
    public static final RegistryObject<Item> MINING_HELMET = ITEMS.register("mining_helmet", ItemHats::new);
    public static final RegistryObject<Item> DARTHVADERHEAD = ITEMS.register("darthvaderhead", ItemHats::new);
    public static final RegistryObject<Item> AMONGUSHEAD = ITEMS.register("amongushead", ItemHats::new);
    public static final RegistryObject<Item> DEMONHEAD = ITEMS.register("demonhead", ItemHats::new);
    public static final RegistryObject<Item> MARIOHEAD = ITEMS.register("mariohead", ItemHats::new);
    public static final RegistryObject<Item> PANDAHEAD = ITEMS.register("pandahead", ItemHats::new);
    public static final RegistryObject<Item> SORTINGHAT = ITEMS.register("sortinghat", ItemHats::new);
    public static final RegistryObject<Item> SKIBRIL_ROOD = ITEMS.register("skibril_rood", ItemHats::new);
    public static final RegistryObject<Item> MINI_MOUSE = ITEMS.register("mini_mouse", ItemHats::new);
    public static final RegistryObject<Item> MICKEY_MOUSE = ITEMS.register("mickey_mouse", ItemHats::new);
    public static final RegistryObject<Item> HOGEHOED = ITEMS.register("hogehoed", ItemHats::new);
    public static final RegistryObject<Item> DOGEARS = ITEMS.register("dogears", ItemHats::new);
    public static final RegistryObject<Item> GOLFPET = ITEMS.register("golfpet", ItemHats::new);
    public static final RegistryObject<Item> SNOR = ITEMS.register("snor", ItemHats::new);
    public static final RegistryObject<Item> VISSERSHOEDJE = ITEMS.register("vissershoedje", ItemHats::new);
    public static final RegistryObject<Item> VISSERSHOEDJE_BLAUW = ITEMS.register("vissershoedje_blauw", ItemHats::new);
    public static final RegistryObject<Item> VISSERSHOEDJE_GEEL = ITEMS.register("vissershoedje_geel", ItemHats::new);
    public static final RegistryObject<Item> VISSERSHOEDJE_GROEN = ITEMS.register("vissershoedje_groen", ItemHats::new);
    public static final RegistryObject<Item> VISSERSHOEDJE_ORANJE = ITEMS.register("vissershoedje_oranje", ItemHats::new);
    public static final RegistryObject<Item> VISSERSHOEDJE_PAARS = ITEMS.register("vissershoedje_paars", ItemHats::new);
    public static final RegistryObject<Item> VISSERSHOEDJE_ROOD = ITEMS.register("vissershoedje_rood", ItemHats::new);
    public static final RegistryObject<Item> VISSERSHOEDJE_ROZE = ITEMS.register("vissershoedje_roze", ItemHats::new);
    public static final RegistryObject<Item> PANAMA_BRUIN = ITEMS.register("panama_bruin", ItemHats::new);
    public static final RegistryObject<Item> PANAMA_GRIJS = ITEMS.register("panama_grijs", ItemHats::new);
    public static final RegistryObject<Item> PANAMA_WIT = ITEMS.register("panama_wit", ItemHats::new);
    public static final RegistryObject<Item> PANAMA_ZWART = ITEMS.register("panama_zwart", ItemHats::new);

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

    //Potions (Need a rewrite!)
    public static final RegistryObject<water_bottle> WATER_BOTTLE = ITEMS.register("water_bottle", water_bottle::new);
    public static final RegistryObject<cocktail> COCKTAIL = ITEMS.register("cocktail", cocktail::new);
    public static final RegistryObject<MilkShake> MILKSHAKE = ITEMS.register("milkshake", MilkShake::new);

    // Tools place
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

    public static final RegistryObject<PickaxeItem> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", () ->
            new PickaxeItem(ModItemTier.BLUE_CRYSTAL, 0, 1F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<PickaxeItem> ICE_PICKAXE = ITEMS.register("ice_pickaxe", () ->
            new PickaxeItem(ModItemTier.BLUE_CRYSTAL, 0, 1F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<PickaxeItem> LAPIS_PICKAXE = ITEMS.register("lapis_pickaxe", () ->
            new PickaxeItem(ModItemTier.BLUE_CRYSTAL, 0, 1F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<PickaxeItem> MAGMA_PICKAXE = ITEMS.register("magma_pickaxe", () ->
            new PickaxeItem(ModItemTier.BLUE_CRYSTAL, 0, 1F, new Item.Properties().group(MinetopiaExtra.TAB3)));

    public static final RegistryObject<PickaxeItem> OBSIDIAN_PICKAXE = ITEMS.register("obsidian_pickaxe", () ->
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

    // Armors place
    public static final RegistryObject<ArmorItem> NORMAL_HELMET = ITEMS.register("normal_helmet", () ->
            new ArmorItem(ModArmorMaterial.NORMAL, EquipmentSlotType.HEAD, new Item.Properties().group(MinetopiaExtra.TAB5)));

    public static final RegistryObject<ArmorItem> NORMAL_HOODIE = ITEMS.register("normal_hoodie", () ->
            new ArmorItem(ModArmorMaterial.NORMAL, EquipmentSlotType.CHEST, new Item.Properties().group(MinetopiaExtra.TAB5)));

    public static final RegistryObject<ArmorItem> NORMAL_LEGGINGS = ITEMS.register("normal_leggings", () ->
            new ArmorItem(ModArmorMaterial.NORMAL, EquipmentSlotType.LEGS, new Item.Properties().group(MinetopiaExtra.TAB5)));

    public static final RegistryObject<ArmorItem> NORMAL_BOOTS= ITEMS.register("normal_boots", () ->
            new ArmorItem(ModArmorMaterial.NORMAL, EquipmentSlotType.FEET, new Item.Properties().group(MinetopiaExtra.TAB5)));

    public static final RegistryObject<ArmorItem> POLITIE_NEDERLAND_HELMET= ITEMS.register("politie_nederland_helmet", () ->
            new ArmorItem(ModArmorMaterial.POLITIE_NEDERLAND, EquipmentSlotType.HEAD, new Item.Properties().group(MinetopiaExtra.TAB5)));

    public static final RegistryObject<ArmorItem> POLITIE_NEDERLAND_CHESTPLATE= ITEMS.register("politie_nederland_chestplate", () ->
            new ArmorItem(ModArmorMaterial.POLITIE_NEDERLAND, EquipmentSlotType.CHEST, new Item.Properties().group(MinetopiaExtra.TAB5)));

    public static final RegistryObject<ArmorItem> POLITIE_NEDERLAND_LEGGINGS= ITEMS.register("politie_nederland_leggings", () ->
            new ArmorItem(ModArmorMaterial.POLITIE_NEDERLAND, EquipmentSlotType.LEGS, new Item.Properties().group(MinetopiaExtra.TAB5)));

    public static final RegistryObject<ArmorItem> POLITIE_NEDERLAND_BOOTS= ITEMS.register("politie_nederland_boots", () ->
            new ArmorItem(ModArmorMaterial.POLITIE_NEDERLAND, EquipmentSlotType.FEET, new Item.Properties().group(MinetopiaExtra.TAB5)));

    public static final RegistryObject<ArmorItem> POLITIEBELGIE_HELMET= ITEMS.register("politiebelgie_helmet", () ->
            new ArmorItem(ModArmorMaterial.POLITIEBELGIE, EquipmentSlotType.HEAD, new Item.Properties().group(MinetopiaExtra.TAB5)));

    public static final RegistryObject<ArmorItem> POLITIEBELGIE_CHESTPLATE= ITEMS.register("politiebelgie_chestplate", () ->
            new ArmorItem(ModArmorMaterial.POLITIEBELGIE, EquipmentSlotType.CHEST, new Item.Properties().group(MinetopiaExtra.TAB5)));

    public static final RegistryObject<ArmorItem> POLITIEBELGIE_LEGGINGS= ITEMS.register("politiebelgie_leggings", () ->
            new ArmorItem(ModArmorMaterial.POLITIEBELGIE, EquipmentSlotType.LEGS, new Item.Properties().group(MinetopiaExtra.TAB5)));

    public static final RegistryObject<ArmorItem> POLITIEBELGIE_BOOTS= ITEMS.register("politiebelgie_boots", () ->
            new ArmorItem(ModArmorMaterial.POLITIEBELGIE, EquipmentSlotType.FEET, new Item.Properties().group(MinetopiaExtra.TAB5)));

    public static final RegistryObject<ArmorItem> POLITIEDUBAI_HELMET= ITEMS.register("politiedubai_helmet", () ->
            new ArmorItem(ModArmorMaterial.POLITIEDUBAI, EquipmentSlotType.HEAD, new Item.Properties().group(MinetopiaExtra.TAB5)));

    public static final RegistryObject<ArmorItem> POLITIEDUBAI_CHESTPLATE= ITEMS.register("politiedubai_chestplate", () ->
            new ArmorItem(ModArmorMaterial.POLITIEDUBAI, EquipmentSlotType.CHEST, new Item.Properties().group(MinetopiaExtra.TAB5)));

    public static final RegistryObject<ArmorItem> POLITIEDUBAI_LEGGINGS= ITEMS.register("politiedubai_leggings", () ->
            new ArmorItem(ModArmorMaterial.POLITIEDUBAI, EquipmentSlotType.LEGS, new Item.Properties().group(MinetopiaExtra.TAB5)));

    public static final RegistryObject<ArmorItem> POLITIEDUBAI_BOOTS= ITEMS.register("politiedubai_boots", () ->
            new ArmorItem(ModArmorMaterial.POLITIEDUBAI, EquipmentSlotType.FEET, new Item.Properties().group(MinetopiaExtra.TAB5)));


    // Armor Hat
    public static final RegistryObject<ArmorItem> BIVAK= ITEMS.register("bivak", () ->
            new ArmorItem(ModArmorMaterial.BIVAK, EquipmentSlotType.HEAD, new Item.Properties().group(MinetopiaExtra.TAB7)));


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
}
