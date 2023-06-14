package com.ghostgamesdhg.minetopia.procedures.cabinet;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Map;

public class CabinetOpen {
    public static void executeProcedure(Map<String, Object> dependencies) {
    IWorld world = (IWorld) dependencies.get("world");
    double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
    double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
    double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (world instanceof World && !world.isRemote()) {
        ((World) world).playSound(null, new BlockPos(x, y, z), (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.barrel.open")), SoundCategory.NEUTRAL, (float) 0.3, (float) 1);
    } else {
        ((World) world).playSound(x, y, z, (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.barrel.open")), SoundCategory.NEUTRAL, (float) 0.3, (float) 1, true);
    }
}

}
