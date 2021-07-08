package com.ghostgamesdhg.minetopia.handler;

import com.ghostgamesdhg.minetopia.init.ModBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class gmmForgeEventHandler {

    @SubscribeEvent
    private void clientSetup(final FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(ModBlocks.OVEN.get(), RenderType.getTranslucent());
    }
}
