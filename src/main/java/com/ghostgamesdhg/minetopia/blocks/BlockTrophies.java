package com.ghostgamesdhg.minetopia.blocks;

import com.ghostgamesdhg.minetopia.MinetopiaExtra;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

public class BlockTrophies extends BlockItem {

    //This put the Trophies blocks into the Trophies tab
    public BlockTrophies(Block block) {
        super(block, new Properties().group(MinetopiaExtra.TAB8));
    }
}
