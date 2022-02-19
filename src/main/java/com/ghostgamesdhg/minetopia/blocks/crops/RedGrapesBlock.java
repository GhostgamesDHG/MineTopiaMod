package com.ghostgamesdhg.minetopia.blocks.crops;

import com.ghostgamesdhg.minetopia.init.ModFood;
import net.minecraft.util.IItemProvider;

public class RedGrapesBlock extends GrapesBlock {
    public RedGrapesBlock(Properties builder) {
        super(builder);
    }

    @Override
    protected IItemProvider getSeedsItem() {
        return ModFood.RED_GRAPES_SEEDS.get();
    }
}