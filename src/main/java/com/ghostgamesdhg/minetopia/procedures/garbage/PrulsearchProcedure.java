package com.ghostgamesdhg.minetopia.procedures.garbage;

import com.ghostgamesdhg.minetopia.MinetopiaExtra;
import com.ghostgamesdhg.minetopia.init.ModFood;
import com.ghostgamesdhg.minetopia.init.ModItems;
import com.ghostgamesdhg.minetopia.util.GmmModVariables;
import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import java.util.Map;

public class PrulsearchProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MinetopiaExtra.LOGGER.warn("Failed to load dependency world for procedure Prulsearch!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				MinetopiaExtra.LOGGER.warn("Failed to load dependency x for procedure Prulsearch!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				MinetopiaExtra.LOGGER.warn("Failed to load dependency y for procedure Prulsearch!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				MinetopiaExtra.LOGGER.warn("Failed to load dependency z for procedure Prulsearch!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MinetopiaExtra.LOGGER.warn("Failed to load dependency entity for procedure Prulsearch!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (!GmmModVariables.MapVariables.get(world).devMode) {
			if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.BARRIER) {
				if (entity.isSneaking()) {
					if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
						((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("This has already been searched"), (true));
					}
				}
			} else {
				if (entity.isSneaking()) {
					if (Math.random() < 0.3) {
						if (entity instanceof PlayerEntity)
							((PlayerEntity) entity).giveExperiencePoints((int) 0);
					} else if (Math.random() < 0.2) {
						if (entity instanceof PlayerEntity) {
							ItemStack _setstack = new ItemStack(Items.ROTTEN_FLESH);
							_setstack.setCount((int) 1);
							ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
						}
					} else if (Math.random() < 0.15) {
						if (entity instanceof PlayerEntity) {
							ItemStack _setstack = new ItemStack(ModItems.MONEY3.get());
							_setstack.setCount((int) 1);
							ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
						}
					} else if (Math.random() < 0.125) {
						if (entity instanceof PlayerEntity) {
							ItemStack _setstack = new ItemStack(ModFood.WEED_SEEDS.get());
							_setstack.setCount((int) 1);
							ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
						}
					} else if (Math.random() < 0.125) {
						if (entity instanceof PlayerEntity) {
							ItemStack _setstack = new ItemStack(ModItems.MONEY4.get());
							_setstack.setCount((int) 1);
							ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
						}
					}
					world.setBlockState(new BlockPos(x, y - 1, z), Blocks.BARRIER.getDefaultState(), 3);
				}
			}
		} else {
			if (entity.isSneaking()) {
				if (Math.random() < 0.3) {
					if (entity instanceof PlayerEntity)
						((PlayerEntity) entity).giveExperiencePoints((int) 0);
				} else if (Math.random() < 0.2) {
					if (entity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(Items.ROTTEN_FLESH);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
					}
				} else if (Math.random() < 0.15) {
					if (entity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(ModItems.MONEY3.get());
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
					}
				} else if (Math.random() < 0.125) {
					if (entity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(ModFood.WEED_SEEDS.get());
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
					}
				} else if (Math.random() < 0.125) {
					if (entity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(ModItems.MONEY4.get());
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
					}
				}
			}
		}
	}
}
