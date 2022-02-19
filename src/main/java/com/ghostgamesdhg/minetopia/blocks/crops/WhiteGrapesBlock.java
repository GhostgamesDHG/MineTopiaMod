package com.ghostgamesdhg.minetopia.blocks.crops;

import com.ghostgamesdhg.minetopia.init.ModFood;
import net.minecraft.util.IItemProvider;

public class WhiteGrapesBlock extends GrapesBlock {
    public WhiteGrapesBlock(Properties builder) {
        super(builder);
    }

    @Override
    protected IItemProvider getSeedsItem() {
        return ModFood.WHITE_GRAPES_SEEDS.get();
    }
}