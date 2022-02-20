package com.ghostgamesdhg.minetopia.blocks.crops;

import com.ghostgamesdhg.minetopia.init.ModFood;
import net.minecraft.util.IItemProvider;

public class LettuceBlock extends PineAppleBlock{

    public LettuceBlock(Properties builder) {super(builder);}

    @Override
    protected IItemProvider getSeedsItem() {
        return ModFood.LETTUCE_SEEDS.get();
    }
}
