package com.ghostgamesdhg.minetopia.blocks.crops;

import com.ghostgamesdhg.minetopia.init.ModFood;
import net.minecraft.block.Block;
import net.minecraft.block.CropsBlock;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.shapes.VoxelShape;

public class GrapesBlock extends CropsBlock {
    private static final VoxelShape[] SHAPE_BY_AGE = new VoxelShape[]{
            Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), //0 (GrowStage)
            Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.0D, 16.0D), //1
            Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D), //2
            Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 10.0D, 16.0D), //3
            Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D), //4
            Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 14.0D, 16.0D), //5
            Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D)}; //6


    public GrapesBlock(Properties builder) {
        super(builder);
    }

    @Override
    public int getMaxAge() {
        return 6;
    }

    @Override
    protected IItemProvider getSeedsItem() {
        return ModFood.GRAPES_SEEDS.get();
    }
}
