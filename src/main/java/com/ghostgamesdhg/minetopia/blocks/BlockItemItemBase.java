package com.ghostgamesdhg.minetopia.blocks;

import com.ghostgamesdhg.minetopia.MinetopiaExtra;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

public class BlockItemItemBase extends BlockItem {

    //The blocks that are supposed to be an item
    public BlockItemItemBase(Block block) {
        super(block, new Properties().group(MinetopiaExtra.TAB));
    }
}
