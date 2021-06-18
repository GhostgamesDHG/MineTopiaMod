package com.ghostgamesdhg.minetopia;

import com.ghostgamesdhg.minetopia.init.*;
import com.ghostgamesdhg.minetopia.world.OreGeneration;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.EventListenerProxy;

    //Main class
@Mod("gmm")
public class MinetopiaExtra
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "gmm";

    public MinetopiaExtra() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        //The Block register
        ModBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

        //The Items register(Also the BlockItems)
        ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModBlockItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModFood.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModHats.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModArmor.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModPoppetjes.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModTools.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

        //Mod ore generation register
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::generateOres);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) { }

    private void doClientStuff(final FMLClientSetupEvent event) { }

    //The tabs register
    public static final ItemGroup TAB = new ItemGroup("MineTopiaItems") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.BLACK_PHONE.get());
        }
    };

    public static final ItemGroup TAB4 = new ItemGroup("MineTopiaFood") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModFood.MILKSHAKE.get());
        }
    };

    public static final ItemGroup TAB2 = new ItemGroup("MineTopiaBlocks") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.BLAUWE_KEUKENTEGELS.get());
        }
    };

    public static final ItemGroup TAB3 = new ItemGroup("MineTopiaTools") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModTools.BLUE_CRYSTAL_SWORD.get());
        }
    };

    public static final ItemGroup TAB5 = new ItemGroup("MineTopiaArmor") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModArmor.NORMAL_HELMET.get());
        }
    };

    public static final ItemGroup TAB6 = new ItemGroup("MineTopiaPopetjes") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModPoppetjes.PAPEGAAIPOPPETJE.get());
        }
    };

    public static final ItemGroup TAB7 = new ItemGroup("MineTopiaHats") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModHats.BEERHEAD.get());
        }
    };

    public static final ItemGroup TAB8 = new ItemGroup("MineTopiaTrophies") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.MOD_MAKER_TROPHIE.get());
        }
    };
}
