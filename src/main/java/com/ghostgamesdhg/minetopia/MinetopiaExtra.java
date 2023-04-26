package com.ghostgamesdhg.minetopia;

import com.ghostgamesdhg.minetopia.init.ModArmor;
import com.ghostgamesdhg.minetopia.init.BlockItems;
import com.ghostgamesdhg.minetopia.init.ModBlocks;
import com.ghostgamesdhg.minetopia.init.ModFood;
import com.ghostgamesdhg.minetopia.init.ModHats;
import com.ghostgamesdhg.minetopia.init.ModItems;
import com.ghostgamesdhg.minetopia.init.ModPaintings;
import com.ghostgamesdhg.minetopia.init.ModPoppetjes;
import com.ghostgamesdhg.minetopia.init.ModTools;
import com.ghostgamesdhg.minetopia.init.OreGeneration;
import com.ghostgamesdhg.minetopia.util.GmmModElements;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.network.NetworkRegistry;
import net.minecraftforge.fml.network.simple.SimpleChannel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.function.Supplier;

@Mod("gmm")
@Mod.EventBusSubscriber(modid = MinetopiaExtra.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MinetopiaExtra
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "gmm";
    private static final String PROTOCOL_VERSION = "1";
    public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation("gmm", "gmm"), () -> PROTOCOL_VERSION,
            PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
    public GmmModElements elements;

    public MinetopiaExtra() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        elements = new GmmModElements();

        ModBlocks.BLOCKS.register(bus);
        ModItems.ITEMS.register(bus);
        BlockItems.ITEMS.register(bus);
        ModFood.ITEMS.register(bus);
        ModHats.ITEMS.register(bus);
        ModArmor.ITEMS.register(bus);
        ModPoppetjes.ITEMS.register(bus);
        ModTools.ITEMS.register(bus);
        ModPaintings.PAINTING_TYPES.register(bus);

        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::generateOres);
        MinecraftForge.EVENT_BUS.register(this);
        bus.register(this);
        bus.addListener(this::init);
        bus.addListener(this::clientLoad);
        MinecraftForge.EVENT_BUS.register(new GmmModFMLBusEvents(this));
    }

    private void init(FMLCommonSetupEvent event) {
        elements.getElements().forEach(element -> element.init(event));
    }

    public void clientLoad(FMLClientSetupEvent event) {
        elements.getElements().forEach(element -> element.clientLoad(event));
    }

    @SubscribeEvent
    public void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(elements.getBlocks().stream().map(Supplier::get).toArray(Block[]::new));
    }

    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(elements.getItems().stream().map(Supplier::get).toArray(Item[]::new));
    }

    @SubscribeEvent
    public void registerEntities(RegistryEvent.Register<EntityType<?>> event) {
        event.getRegistry().registerAll(elements.getEntities().stream().map(Supplier::get).toArray(EntityType[]::new));
    }

    @SubscribeEvent
    public void registerEnchantments(RegistryEvent.Register<Enchantment> event) {
        event.getRegistry().registerAll(elements.getEnchantments().stream().map(Supplier::get).toArray(Enchantment[]::new));
    }

    @SubscribeEvent
    public void registerSounds(RegistryEvent.Register<net.minecraft.util.SoundEvent> event) {
        elements.registerSounds(event);
    }
    private static class GmmModFMLBusEvents {
        private final MinetopiaExtra parent;
        GmmModFMLBusEvents(MinetopiaExtra parent) {
            this.parent = parent;
        }

        @SubscribeEvent
        public void serverLoad(FMLServerStartingEvent event) {
            this.parent.elements.getElements().forEach(element -> element.serverLoad(event));
        }
    }

    public static final ItemGroup TAB = new ItemGroup("MineTopiaItems") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.IPHONE_7_BLACK.get());
        }
    };

    public static final ItemGroup TAB4 = new ItemGroup("MineTopiaFood") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModFood.HOTDOG.get());
        }
    };

    public static final ItemGroup TAB2 = new ItemGroup("MineTopiaBlocks") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.PIN_AUTOMAAT.get());
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

    public static final ItemGroup TAB8 = new ItemGroup("MineTopiaHalloween") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.PUMPKIN.get());
        }
    };

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(ModBlocks.OVEN.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.LANTAARN.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.OIL_CAN.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.KRANS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.KERST_SLINGERS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.CORN.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.PAPRIKA.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TOMATO.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.PINEAPPLE.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.STRAWBERRY.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.HOP.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.PEPPER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.GRAPES.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.WHITE_GRAPES.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.RED_GRAPES.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.LETTUCE.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.WEED.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.PUMPKIN.get(), RenderType.getCutout());
        event.enqueueWork(() -> {
            RenderTypeLookup.setRenderLayer(ModBlocks.BUNKER_DOOR.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.WOODEN_DOOR.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.RICH_QUARTZ_DOOR.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.STEEL_DOOR.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.QUARTZ_DOOR.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.SITTING_SKELETON.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.MONSTERBOOK.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.CLEAVER.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.OWL.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.RAT.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.GLOBE.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.FIRE_PIT.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.TABLE_PLANT.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.SMALL_TREE.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.ZOMBIE_ARM.get(), RenderType.getCutout());
        });
    }
}