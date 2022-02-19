package com.ghostgamesdhg.minetopia.blocks.crops;

import com.ghostgamesdhg.minetopia.init.ModFood;
import net.minecraft.util.IItemProvider;

public class CornBlock extends PaprikaBlock {
    public CornBlock(Properties builder) {
        super(builder);
    }

    @Override
    protected IItemProvider getSeedsItem() {
        return ModFood.CORN_SEEDS.get();
    }
}