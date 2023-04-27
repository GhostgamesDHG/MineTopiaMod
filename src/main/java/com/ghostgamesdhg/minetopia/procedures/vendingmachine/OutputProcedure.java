package com.ghostgamesdhg.minetopia.procedures.vendingmachine;

import com.ghostgamesdhg.minetopia.MinetopiaExtra;
import com.ghostgamesdhg.minetopia.init.ModItems;
import com.ghostgamesdhg.minetopia.util.GmmModVariables;
import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;
import java.util.function.Supplier;
import java.util.Map;

public class OutputProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MinetopiaExtra.LOGGER.warn("Failed to load dependency world for procedure Output!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MinetopiaExtra.LOGGER.warn("Failed to load dependency entity for procedure Output!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack geld;
		double amount;
		if (!GmmModVariables.MapVariables.get(world).devMode) {
			geld = new ItemStack(ModItems.MONEY2.get());
			if (entity instanceof PlayerEntity && ((PlayerEntity) entity).inventory.hasItemStack((geld))) {
				amount = (new Object() {
					public int getAmount(int sltid) {
						if (entity instanceof ServerPlayerEntity) {
							Container _current = ((ServerPlayerEntity) entity).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier<?>) _current).get();
								if (invobj instanceof Map) {
									ItemStack stack = ((Slot) ((Map<?, ?>) invobj).get(sltid)).getStack();
									return stack.getCount();
								}
							}
						}
						return 0;
					}
				}.getAmount((int) (0)));
				ItemStack _stktoremove = (geld);
				((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) amount,
						((PlayerEntity) entity).container.func_234641_j_());
			} else {
				{
					if (entity instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier<?>) _current).get();
							if (invobj instanceof Map) {
								((Slot) ((Map<?, ?>) invobj).get(1)).decrStackSize(10);
								_current.detectAndSendChanges();
							}
						}
					}
				}
			}
			geld = new ItemStack(Blocks.AIR);
		}
	}
}
