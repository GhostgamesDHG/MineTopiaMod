package com.ghostgamesdhg.minetopia.init;

import com.ghostgamesdhg.minetopia.MinetopiaExtra;
import com.ghostgamesdhg.minetopia.items.ItemPopetjes;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModPoppetjes {

    //This class registers the items in the mod.
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MinetopiaExtra.MOD_ID);

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
    public static final RegistryObject<Item> TEDDYBEER_ROZE = ITEMS.register("teddybeer_roze", ItemPopetjes::new);
    public static final RegistryObject<Item> TEDDYBEER_WIT = ITEMS.register("teddybeer_wit", ItemPopetjes::new);
}