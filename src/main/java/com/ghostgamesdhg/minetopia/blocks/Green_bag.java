package com.ghostgamesdhg.minetopia.blocks;

import com.ghostgamesdhg.minetopia.init.TileEntityTypesInit;
import com.ghostgamesdhg.minetopia.te.GreenBagTileEntity;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;
//import net.minecraft.entity.player.PlayerEntity;
//import net.minecraft.entity.player.ServerPlayerEntity;
//import net.minecraft.util.ActionResultType;
//import net.minecraft.util.Hand;
//import net.minecraft.util.math.BlockPos;
//import net.minecraft.util.math.BlockRayTraceResult;
//import net.minecraft.world.World;
//import net.minecraftforge.fml.network.NetworkHooks;

public class Green_bag extends Block {

    public Green_bag() {
        super(AbstractBlock.Properties.create(Material.WOOL, MaterialColor.GREEN).hardnessAndResistance(15f)
                .sound(SoundType.CLOTH));
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return TileEntityTypesInit.GREEN_BAG_TILE_ENTITY_TYPE.get().create();
    }

 // CRASH WARNING (DO NOT ADD THIS CODE FOR NOW)

 //   @SuppressWarnings("deprecation")
 //   @Override
 //   public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
 //       if (worldIn.isRemote()) {
 //           TileEntity te = worldIn.getTileEntity(pos);
 //           if (te instanceof GreenBagTileEntity) {
 //               NetworkHooks.openGui((ServerPlayerEntity) player,(GreenBagTileEntity) te, pos);
 //           }
 //       }
 //       return super.onBlockActivated(state, worldIn, pos, player, handIn, hit);
 //   }
}
