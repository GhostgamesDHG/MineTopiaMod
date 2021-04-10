package com.ghostgamesdhg.minetopia.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;
import java.util.stream.Stream;

public class Notebook extends Block {

    private static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    private static final VoxelShape SHAPE_N = VoxelShapes.combineAndSimplify(Block.makeCuboidShape(1.4, 0, 2.91481, 14.5, 0.2, 11.91481),
            Block.makeCuboidShape(1.4, 2.77318, 12.19523, 14.5, 11.77318, 12.39523), IBooleanFunction.OR);

    public static final VoxelShape SHAPE_E = VoxelShapes.combineAndSimplify(Block.makeCuboidShape(3.5925900000000013, 0, 1.5, 12.592590000000001, 0.20000000000000018, 14.600000000000001),
            Block.makeCuboidShape(3.1121700000000008, 2.77318, 1.5, 3.31217, 11.77318, 14.600000000000001), IBooleanFunction.OR);

    public static final VoxelShape SHAPE_S = VoxelShapes.combineAndSimplify(Block.makeCuboidShape(1.5, 0, 4.1499900000000025, 14.600000000000001, 0.20000000000000018, 13.149990000000003),
            Block.makeCuboidShape(1.5, 2.77318, 3.669570000000002, 14.600000000000001, 11.77318, 3.8695700000000013), IBooleanFunction.OR);

    public static final VoxelShape SHAPE_W = VoxelShapes.combineAndSimplify(Block.makeCuboidShape(3.4074099999999987, 0, 1.5, 12.407409999999999, 0.20000000000000018, 14.600000000000001),
            Block.makeCuboidShape(12.68783, 2.77318, 1.5, 12.88783, 11.77318, 14.600000000000001), IBooleanFunction.OR);

    public Notebook() {
        super(Properties.create(Material.IRON)
                .hardnessAndResistance(3.5f, 4.0f)
                .harvestLevel(0)
                .sound(SoundType.STONE));
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        switch (state.get(FACING)) {
            case NORTH:
                return SHAPE_N;
            case EAST:
                return  SHAPE_E;
            case SOUTH:
                return SHAPE_S;
            case WEST:
                return SHAPE_W;
            default:
                return SHAPE_N;
        }
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this .getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rot) {
        return state.with(FACING, rot.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.toRotation(state.get(FACING)));
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}
