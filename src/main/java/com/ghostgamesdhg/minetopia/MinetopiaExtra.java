package com.ghostgamesdhg.minetopia;

import com.ghostgamesdhg.minetopia.init.ModArmor;
import com.ghostgamesdhg.minetopia.init.ModBlockItems;
import com.ghostgamesdhg.minetopia.init.ModBlocks;
import com.ghostgamesdhg.minetopia.init.ModFood;
import com.ghostgamesdhg.minetopia.init.ModHats;
import com.ghostgamesdhg.minetopia.init.ModItems;
import com.ghostgamesdhg.minetopia.init.ModPoppetjes;
import com.ghostgamesdhg.minetopia.init.ModTools;
import com.ghostgamesdhg.minetopia.world.OreGeneration;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("gmm")
@Mod.EventBusSubscriber(modid = MinetopiaExtra.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MinetopiaExtra
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "gmm";

    public MinetopiaExtra() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        //ITEMS REGISTER (EVEN THE BLOCKS)
        ModBlocks.BLOCKS.register(bus);
        ModItems.ITEMS.register(bus);
        ModBlockItems.ITEMS.register(bus);
        ModFood.ITEMS.register(bus);
        ModHats.ITEMS.register(bus);
        ModArmor.ITEMS.register(bus);
        ModPoppetjes.ITEMS.register(bus);
        ModTools.ITEMS.register(bus);
        //ORE GENERATION
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::generateOres);
        MinecraftForge.EVENT_BUS.register(this);
    }

    //The tabs register
    public static final ItemGroup TAB = new ItemGroup("MineTopiaItems") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.IPHONE_7_BLACK.get());
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