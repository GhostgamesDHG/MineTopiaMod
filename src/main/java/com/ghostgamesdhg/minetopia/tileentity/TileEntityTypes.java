package com.ghostgamesdhg.minetopia.tileentity;

import com.ghostgamesdhg.minetopia.MinetopiaExtra;
import com.ghostgamesdhg.minetopia.init.ModBlocks;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityTypes {

public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPE = DeferredRegister
        .create(ForgeRegistries.TILE_ENTITIES, MinetopiaExtra.MOD_ID);

    public static final RegistryObject<TileEntityType<OvenTileEntity>> OVEN = TILE_ENTITY_TYPE.register("oven",
            () -> TileEntityType.Builder.create(OvenTileEntity::new, ModBlocks.OVEN.get()).build(null));
}
