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

public class Arcade extends Block {

    private static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.makeCuboidShape(1, 0, 10, 15, 16, 15),
            Block.makeCuboidShape(1, 0, 4, 15, 15, 10),
            Block.makeCuboidShape(15, 0, 3, 16, 16, 16),
            Block.makeCuboidShape(0, 0, 3, 1, 16, 16),
            Block.makeCuboidShape(1, 26, 4, 15, 30, 14),
            Block.makeCuboidShape(1, 14, 1, 15, 16, 10),
            Block.makeCuboidShape(1, 16, 7, 15, 27, 12),
            Block.makeCuboidShape(1, 16, 10, 15, 29, 15),
            Block.makeCuboidShape(15, 16, 3, 16, 32, 16),
            Block.makeCuboidShape(0, 16, 3, 1, 32, 16),
            Block.makeCuboidShape(12, 16, 3, 13, 18, 4),
            Block.makeCuboidShape(11.75, 17.5, 2.75, 13.25, 19, 4.25)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public static final VoxelShape SHAPE_E = Stream.of(
            Block.makeCuboidShape(1, 0, 1, 6, 16, 15),
            Block.makeCuboidShape(6, 0, 1, 12, 15, 15),
            Block.makeCuboidShape(0, 0, 15, 13, 16, 16),
            Block.makeCuboidShape(0, 0, 0, 13, 16, 1),
            Block.makeCuboidShape(2, 26, 1, 12, 30, 15),
            Block.makeCuboidShape(6, 14, 1, 15, 16, 15),
            Block.makeCuboidShape(4, 16, 1, 9, 27, 15),
            Block.makeCuboidShape(1, 16, 1, 6, 29, 15),
            Block.makeCuboidShape(0, 16, 15, 13, 32, 16),
            Block.makeCuboidShape(0, 16, 0, 13, 32, 1),
            Block.makeCuboidShape(12, 16, 12, 13, 18, 13),
            Block.makeCuboidShape(11.75, 17.5, 11.75, 13.25, 19, 13.25)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public static final VoxelShape SHAPE_S = Stream.of(
            Block.makeCuboidShape(1, 0, 1, 15, 16, 6),
            Block.makeCuboidShape(1, 0, 6, 15, 15, 12),
            Block.makeCuboidShape(0, 0, 0, 1, 16, 13),
            Block.makeCuboidShape(15, 0, 0, 16, 16, 13),
            Block.makeCuboidShape(1, 26, 2, 15, 30, 12),
            Block.makeCuboidShape(1, 14, 6, 15, 16, 15),
            Block.makeCuboidShape(1, 16, 4, 15, 27, 9),
            Block.makeCuboidShape(1, 16, 1, 15, 29, 6),
            Block.makeCuboidShape(0, 16, 0, 1, 32, 13),
            Block.makeCuboidShape(15, 16, 0, 16, 32, 13),
            Block.makeCuboidShape(3, 16, 12, 4, 18, 13),
            Block.makeCuboidShape(2.75, 17.5, 11.75, 4.25, 19, 13.25)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public static final VoxelShape SHAPE_W = Stream.of(
            Block.makeCuboidShape(10, 0, 1, 15, 16, 15),
            Block.makeCuboidShape(4, 0, 1, 10, 15, 15),
            Block.makeCuboidShape(3, 0, 0, 16, 16, 1),
            Block.makeCuboidShape(3, 0, 15, 16, 16, 16),
            Block.makeCuboidShape(4, 26, 1, 14, 30, 15),
            Block.makeCuboidShape(1, 14, 1, 10, 16, 15),
            Block.makeCuboidShape(7, 16, 1, 12, 27, 15),
            Block.makeCuboidShape(10, 16, 1, 15, 29, 15),
            Block.makeCuboidShape(3, 16, 0, 16, 32, 1),
            Block.makeCuboidShape(3, 16, 15, 16, 32, 16),
            Block.makeCuboidShape(3, 16, 3, 4, 18, 4),
            Block.makeCuboidShape(2.75, 17.5, 2.75, 4.25, 19, 4.25)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public Arcade() {
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
