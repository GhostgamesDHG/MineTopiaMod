package com.ghostgamesdhg.minetopia.blocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Direction;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;
import javax.annotation.Nullable;

public class Honden_Bedje extends Block {

    private static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    public Honden_Bedje() {
        super(Properties.create(Material.WOOD)
                .hardnessAndResistance(3.5f, 4.0f)
                .harvestLevel(2)
                .sound(SoundType.WOOD)
                .harvestTool(ToolType.AXE)
                .setRequiresTool());
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader world, BlockPos pos, ISelectionContext context) {
        Vector3d offset = state.getOffset(world, pos);
        switch ((Direction) state.get(FACING)) {
            case NORTH :
            default :
                return VoxelShapes.or(makeCuboidShape(-6, 0.5, 0, 22, 8, 16)).withOffset(offset.x, offset.y, offset.z);
            case EAST :
                return VoxelShapes.or(makeCuboidShape(0, 0.5, -6, 16, 8, 22)).withOffset(offset.x, offset.y, offset.z);
            case SOUTH:
                return VoxelShapes.or(makeCuboidShape(-6, 0.5, 0, 22, 8, 16)).withOffset(offset.x, offset.y, offset.z);
            case WEST :
                return VoxelShapes.or(makeCuboidShape(0, 0.5, -6, 16, 8, 22)).withOffset(offset.x, offset.y, offset.z);
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
