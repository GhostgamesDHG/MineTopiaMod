package com.ghostgamesdhg.minetopia.util;

import com.ghostgamesdhg.minetopia.MinetopiaExtra;
import com.ghostgamesdhg.minetopia.client.screen.GreenBagScreen;
import com.ghostgamesdhg.minetopia.init.ContainerTypesInit;
import com.ghostgamesdhg.minetopia.init.ModBlocks;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = MinetopiaExtra.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        ScreenManager.registerFactory(ContainerTypesInit.GREEN_BAG_CONTAINER_TYPE.get(), GreenBagScreen::new);
        RenderTypeLookup.setRenderLayer(ModBlocks.OVEN.get(), RenderType.getTranslucent());
    }
}
