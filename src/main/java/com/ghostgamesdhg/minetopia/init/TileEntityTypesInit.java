package com.ghostgamesdhg.minetopia.init;

import com.ghostgamesdhg.minetopia.MinetopiaExtra;
import com.ghostgamesdhg.minetopia.te.GreenBagTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityTypesInit {

    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPE = DeferredRegister
            .create(ForgeRegistries.TILE_ENTITIES, MinetopiaExtra.MOD_ID);

    public static final RegistryObject<TileEntityType<GreenBagTileEntity>> GREEN_BAG_TILE_ENTITY_TYPE = TILE_ENTITY_TYPE
            .register("green_bag", () -> TileEntityType.Builder.create(GreenBagTileEntity::new, ModBlocks.GREEN_BAG.get()).build(null));
}
