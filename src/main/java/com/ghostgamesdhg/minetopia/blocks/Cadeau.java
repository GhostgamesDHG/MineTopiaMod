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

public class Cadeau extends Block {

    private static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.makeCuboidShape(7, 5.5, 12.25, 9, 8.5, 12.75),
            Block.makeCuboidShape(7, 5.5, 3.25, 9, 8.5, 3.75),
            Block.makeCuboidShape(12.25, 5.5, 7, 12.75, 8.5, 9),
            Block.makeCuboidShape(7, 8, 3.75, 9, 8.5, 12.25),
            Block.makeCuboidShape(7, -0.025, 4, 9, 0.25, 12),
            Block.makeCuboidShape(3.75, 8, 7, 12.25, 8.5, 9),
            Block.makeCuboidShape(3.225, 5.475, 7.75, 12.775, 8.525, 8.25),
            Block.makeCuboidShape(7.75, 5.475, 3.225, 8.25, 8.525, 12.775),
            Block.makeCuboidShape(4, -0.025, 7, 12, 0.25, 9),
            Block.makeCuboidShape(3.25, 5.5, 7, 3.75, 8.5, 9),
            Block.makeCuboidShape(7, -0.025, 12, 9, 6, 12.5),
            Block.makeCuboidShape(7, -0.025, 3.5, 9, 6, 4),
            Block.makeCuboidShape(12, -0.025, 7, 12.5, 6, 9),
            Block.makeCuboidShape(3.5, -0.025, 7, 4, 6, 9),
            Block.makeCuboidShape(4, 0, 4, 12, 6, 12),
            Block.makeCuboidShape(3.75, 6, 3.75, 12.25, 8, 12.25)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public static final VoxelShape SHAPE_E = Stream.of(
            Block.makeCuboidShape(7, 5.5, 12.25, 9, 8.5, 12.75),
            Block.makeCuboidShape(7, 5.5, 3.25, 9, 8.5, 3.75),
            Block.makeCuboidShape(12.25, 5.5, 7, 12.75, 8.5, 9),
            Block.makeCuboidShape(7, 8, 3.75, 9, 8.5, 12.25),
            Block.makeCuboidShape(7, -0.025, 4, 9, 0.25, 12),
            Block.makeCuboidShape(3.75, 8, 7, 12.25, 8.5, 9),
            Block.makeCuboidShape(3.225, 5.475, 7.75, 12.775, 8.525, 8.25),
            Block.makeCuboidShape(7.75, 5.475, 3.225, 8.25, 8.525, 12.775),
            Block.makeCuboidShape(4, -0.025, 7, 12, 0.25, 9),
            Block.makeCuboidShape(3.25, 5.5, 7, 3.75, 8.5, 9),
            Block.makeCuboidShape(7, -0.025, 12, 9, 6, 12.5),
            Block.makeCuboidShape(7, -0.025, 3.5, 9, 6, 4),
            Block.makeCuboidShape(12, -0.025, 7, 12.5, 6, 9),
            Block.makeCuboidShape(3.5, -0.025, 7, 4, 6, 9),
            Block.makeCuboidShape(4, 0, 4, 12, 6, 12),
            Block.makeCuboidShape(3.75, 6, 3.75, 12.25, 8, 12.25)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public static final VoxelShape SHAPE_S = Stream.of(
            Block.makeCuboidShape(7, 5.5, 12.25, 9, 8.5, 12.75),
            Block.makeCuboidShape(7, 5.5, 3.25, 9, 8.5, 3.75),
            Block.makeCuboidShape(12.25, 5.5, 7, 12.75, 8.5, 9),
            Block.makeCuboidShape(7, 8, 3.75, 9, 8.5, 12.25),
            Block.makeCuboidShape(7, -0.025, 4, 9, 0.25, 12),
            Block.makeCuboidShape(3.75, 8, 7, 12.25, 8.5, 9),
            Block.makeCuboidShape(3.225, 5.475, 7.75, 12.775, 8.525, 8.25),
            Block.makeCuboidShape(7.75, 5.475, 3.225, 8.25, 8.525, 12.775),
            Block.makeCuboidShape(4, -0.025, 7, 12, 0.25, 9),
            Block.makeCuboidShape(3.25, 5.5, 7, 3.75, 8.5, 9),
            Block.makeCuboidShape(7, -0.025, 12, 9, 6, 12.5),
            Block.makeCuboidShape(7, -0.025, 3.5, 9, 6, 4),
            Block.makeCuboidShape(12, -0.025, 7, 12.5, 6, 9),
            Block.makeCuboidShape(3.5, -0.025, 7, 4, 6, 9),
            Block.makeCuboidShape(4, 0, 4, 12, 6, 12),
            Block.makeCuboidShape(3.75, 6, 3.75, 12.25, 8, 12.25)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public static final VoxelShape SHAPE_W = Stream.of(
            Block.makeCuboidShape(7, 5.5, 12.25, 9, 8.5, 12.75),
            Block.makeCuboidShape(7, 5.5, 3.25, 9, 8.5, 3.75),
            Block.makeCuboidShape(12.25, 5.5, 7, 12.75, 8.5, 9),
            Block.makeCuboidShape(7, 8, 3.75, 9, 8.5, 12.25),
            Block.makeCuboidShape(7, -0.025, 4, 9, 0.25, 12),
            Block.makeCuboidShape(3.75, 8, 7, 12.25, 8.5, 9),
            Block.makeCuboidShape(3.225, 5.475, 7.75, 12.775, 8.525, 8.25),
            Block.makeCuboidShape(7.75, 5.475, 3.225, 8.25, 8.525, 12.775),
            Block.makeCuboidShape(4, -0.025, 7, 12, 0.25, 9),
            Block.makeCuboidShape(3.25, 5.5, 7, 3.75, 8.5, 9),
            Block.makeCuboidShape(7, -0.025, 12, 9, 6, 12.5),
            Block.makeCuboidShape(7, -0.025, 3.5, 9, 6, 4),
            Block.makeCuboidShape(12, -0.025, 7, 12.5, 6, 9),
            Block.makeCuboidShape(3.5, -0.025, 7, 4, 6, 9),
            Block.makeCuboidShape(4, 0, 4, 12, 6, 12),
            Block.makeCuboidShape(3.75, 6, 3.75, 12.25, 8, 12.25)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public Cadeau() {
        super(Properties.create(Material.WOOL)
                .hardnessAndResistance(3.5f, 4.0f)
                .harvestLevel(0)
                .sound(SoundType.CLOTH));
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
