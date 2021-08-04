package com.ghostgamesdhg.minetopia.procedures;

import com.ghostgamesdhg.minetopia.GMMElements;
import com.ghostgamesdhg.minetopia.GmmModVariables;
import com.ghostgamesdhg.minetopia.MinetopiaExtra;
import com.ghostgamesdhg.minetopia.init.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandlerModifiable;

import java.util.Map;

@GMMElements.ModElement.Tag
public class ChestSpawnerBlockAddedProcedure extends GMMElements.ModElement {
	public ChestSpawnerBlockAddedProcedure(GMMElements instance) {
		super(instance, 15);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				MinetopiaExtra.LOGGER.warn("Failed to load dependency x for procedure ChestSpawnerBlockAdded!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				MinetopiaExtra.LOGGER.warn("Failed to load dependency y for procedure ChestSpawnerBlockAdded!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				MinetopiaExtra.LOGGER.warn("Failed to load dependency z for procedure ChestSpawnerBlockAdded!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MinetopiaExtra.LOGGER.warn("Failed to load dependency world for procedure ChestSpawnerBlockAdded!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		double TotalInputSlots = 0;
		double LootFrequecy = 0;
		double AtInputSlot = 0;
		double RandomNumber = 0;
		for (int index0 = 0; index0 < (int) (2); index0++) {
			if (((GmmModVariables.MapVariables.get(world).devmode) == (false))) {
				TotalInputSlots = (double) Math.round(27);
				LootFrequecy = (double) Math.round(4);
				AtInputSlot = (double) 0;
				AtInputSlot = (double) ((AtInputSlot) + Math.ceil((Math.random() * (LootFrequecy))));
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.CHEST.getDefaultState(), 3);
				while (((AtInputSlot) <= ((TotalInputSlots) - 1))) {
					RandomNumber = (double) Math.random();
					if ((Math.random() < 0.05)) {
						{
							TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
							if (_ent != null) {
								final int _sltid = (int) ((AtInputSlot));
								final ItemStack _setstack = new ItemStack(ModItems.WEED_SEEDS.get(), (int) (1));
								_setstack.setCount((int) Math.round(((RandomNumber) * 2)));
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable) {
										((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
									}
								});
							}
						}
					} else if ((Math.random() < 0.2)) {
						{
							TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
							if (_ent != null) {
								final int _sltid = (int) ((AtInputSlot));
								final ItemStack _setstack = new ItemStack(Items.CARROT, (int) (1));
								_setstack.setCount((int) Math.round(((RandomNumber) * 4)));
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable) {
										((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
									}
								});
							}
						}
					} else if ((Math.random() < 0.2)) {
						{
							TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
							if (_ent != null) {
								final int _sltid = (int) ((AtInputSlot));
								final ItemStack _setstack = new ItemStack(Items.POTATO, (int) (1));
								_setstack.setCount((int) Math.round(((RandomNumber) * 3)));
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable) {
										((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
									}
								});
							}
						}
					} else if ((Math.random() < 0.1)) {
						{
							TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
							if (_ent != null) {
								final int _sltid = (int) ((AtInputSlot));
								final ItemStack _setstack = new ItemStack(Items.POTION, (int) (1));
								_setstack.setCount((int) Math.round(((RandomNumber) * 1)));
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable) {
										((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
									}
								});
							}
						}
					} else if ((Math.random() < 0.3)) {
						{
							TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
							if (_ent != null) {
								final int _sltid = (int) ((AtInputSlot));
								final ItemStack _setstack = new ItemStack(Blocks.OAK_PLANKS, (int) (1));
								_setstack.setCount((int) Math.round(((RandomNumber) * 4)));
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable) {
										((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
									}
								});
							}
						}
					} else {
						{
							TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
							if (_ent != null) {
								final int _sltid = (int) ((AtInputSlot));
								final ItemStack _setstack = new ItemStack(Items.STICK, (int) (1));
								_setstack.setCount((int) Math.round(((RandomNumber) * 2)));
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable) {
										((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
									}
								});
							}
						}
					}
					AtInputSlot = (double) ((AtInputSlot) + Math.ceil((Math.random() * (LootFrequecy))));
				}
			}
		}
	}
}
