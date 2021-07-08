package com.ghostgamesdhg.minetopia.init;

import com.ghostgamesdhg.minetopia.MinetopiaExtra;
import com.ghostgamesdhg.minetopia.container.GreenBagContainer;
import com.ghostgamesdhg.minetopia.te.GreenBagTileEntity;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ContainerTypesInit {

    public static final DeferredRegister<ContainerType<?>> CONTAINER_TYPES = DeferredRegister
            .create(ForgeRegistries.CONTAINERS, MinetopiaExtra.MOD_ID);

    public static final RegistryObject<ContainerType<GreenBagContainer>> GREEN_BAG_CONTAINER_TYPE = CONTAINER_TYPES
            .register("green_bag", () -> IForgeContainerType.create(GreenBagContainer::new));
}
