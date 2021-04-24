package com.ghostgamesdhg.minetopia.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class keukentegels extends Block {
    public keukentegels() {
        super(AbstractBlock.Properties.create(Material.ROCK)
                .hardnessAndResistance(3.0f, 10.0f)
                .sound(SoundType.STONE)
                .harvestLevel(2) //1 = wood - 2 = stone - 3 = iron - 4 = diamond.
                .setRequiresTool()
                .harvestTool(ToolType.PICKAXE));

    }
}