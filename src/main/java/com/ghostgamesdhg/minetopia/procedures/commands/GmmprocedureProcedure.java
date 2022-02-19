package com.ghostgamesdhg.minetopia.procedures.commands;

import com.ghostgamesdhg.minetopia.util.GmmModElements;
import com.ghostgamesdhg.minetopia.MinetopiaExtra;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.text.StringTextComponent;

import java.util.Map;

@GmmModElements.ModElement.Tag
public class GmmprocedureProcedure extends GmmModElements.ModElement {
	public GmmprocedureProcedure(GmmModElements instance) {
		super(instance, 3);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MinetopiaExtra.LOGGER.warn("Failed to load dependency entity for procedure Gmmprocedure!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.isAlive())) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A72\u00A7l====Info===="), (false));
			}
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A7aCurrent version: 2.0"), (false));
			}
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A7aCurrent commands:"), (false));
			}
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A7a/heal - Heals the player"), (false));
			}
			//	if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
		//		((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A7a/hat - Puts item in hand on your head"), (false));
		//	}
		}
	}
}
