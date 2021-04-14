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
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;
import java.util.stream.Stream;

public class boombox extends Block {

    private static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    private static final VoxelShape SHAPE_N = Stream.of(
            VoxelShapes.combineAndSimplify(Block.makeCuboidShape(17.5016, 8.9636, 9.9804, 18.1472, 23.4792, 10.6444),
                    Block.makeCuboidShape(-4, 0, 4, 19, 9, 11), IBooleanFunction.OR)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public static final VoxelShape SHAPE_E = Stream.of(
            VoxelShapes.combineAndSimplify(Block.makeCuboidShape(5.355600000000001, 8.9636, 17.5016, 6.0196000000000005, 23.4792, 18.1472),
                    Block.makeCuboidShape(5, 0, -4, 12, 9, 19), IBooleanFunction.OR)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public static final VoxelShape SHAPE_S = Stream.of(
            VoxelShapes.combineAndSimplify(Block.makeCuboidShape(-2.485000000000003, 8.9636, 5.355600000000001, -1.8394000000000013, 23.4792, 6.0196000000000005),
                    Block.makeCuboidShape(-3.3378000000000014, 0, 5, 19.6622, 9, 12), IBooleanFunction.OR)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public static final VoxelShape SHAPE_W = Stream.of(
            VoxelShapes.combineAndSimplify(Block.makeCuboidShape(9.642599999999998, 8.9636, -2.485000000000003, 10.306599999999998, 23.4792, -1.8394000000000013),
                    Block.makeCuboidShape(3.6621999999999986, 0, -3.3378000000000014, 10.662199999999999, 9, 19.6622), IBooleanFunction.OR)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public boombox() {
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
