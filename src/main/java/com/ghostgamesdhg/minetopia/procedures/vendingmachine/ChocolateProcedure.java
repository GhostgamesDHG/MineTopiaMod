package com.ghostgamesdhg.minetopia.procedures.vendingmachine;

import com.ghostgamesdhg.minetopia.MinetopiaExtra;
import com.ghostgamesdhg.minetopia.init.ModFood;
import com.ghostgamesdhg.minetopia.init.ModItems;
import com.ghostgamesdhg.minetopia.util.GmmModVariables;
import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import java.util.function.Supplier;
import java.util.Map;

public class ChocolateProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MinetopiaExtra.LOGGER.warn("Failed to load dependency world for procedure chocolate!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MinetopiaExtra.LOGGER.warn("Failed to load dependency entity for procedure chocolate!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		double count;
		ItemStack output;
		count = 2*8;
		output = new ItemStack(ModFood.CHOCOLATE_BAR.get());
		if (entity instanceof PlayerEntity) {
			Container _current = ((PlayerEntity) entity).openContainer;
			if (_current instanceof Supplier) {
				Object invobj = ((Supplier<?>) _current).get();
				if (invobj instanceof Map) {
					ItemStack _setstack = new ItemStack(ModItems.MONEY2.get());
					_setstack.setCount((int) count);
					((Slot) ((Map<?, ?>) invobj).get(0)).putStack(_setstack);
					_current.detectAndSendChanges();
				}
			}
		}
		if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)).getCount() >= count
				&& (entity instanceof PlayerEntity && ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(ModItems.MONEY2.get())))) {
			Container _current = ((PlayerEntity) entity).openContainer;
			if (_current instanceof Supplier) {
				Object invobj = ((Supplier<?>) _current).get();
				if (invobj instanceof Map) {
					(output).setCount(10);
					((Slot) ((Map<?, ?>) invobj).get(1)).putStack((output));
					_current.detectAndSendChanges();
				}
			}
		} else {
			if (entity instanceof PlayerEntity) {
				Container _current = ((PlayerEntity) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier<?>) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(Blocks.AIR);
						_setstack.setCount(10);
						((Slot) ((Map<?, ?>) invobj).get(1)).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
		}
		GmmModVariables.MapVariables.get(world).paycheck = (output);
		GmmModVariables.MapVariables.get(world).syncData(world);
	}
}
