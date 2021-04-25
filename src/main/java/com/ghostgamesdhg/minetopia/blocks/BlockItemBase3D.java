package com.ghostgamesdhg.minetopia.blocks;

import com.ghostgamesdhg.minetopia.MinetopiaExtra;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase3D extends BlockItem {

    public BlockItemBase3D(Block block) {
        super(block, new Item.Properties().group(MinetopiaExtra.TAB2));
    }
}
