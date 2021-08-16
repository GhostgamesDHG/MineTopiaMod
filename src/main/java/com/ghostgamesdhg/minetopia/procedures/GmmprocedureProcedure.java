package com.ghostgamesdhg.minetopia.procedures;

import com.ghostgamesdhg.minetopia.GMMElements;
import com.ghostgamesdhg.minetopia.MinetopiaExtra;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.text.StringTextComponent;

import java.util.Map;

@GMMElements.ModElement.Tag
public class GmmprocedureProcedure extends GMMElements.ModElement {
	public GmmprocedureProcedure(GMMElements instance) {
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
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A7aCurrent version: 1.9"), (false));
			}
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A7aCurrent commands:"), (false));
			}
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A7a/gmm - Shows this information"), (false));
			}
			//	if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
		//		((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A7a/hat - Puts item in hand on head"), (false));
		//	}
		}
	}
}
