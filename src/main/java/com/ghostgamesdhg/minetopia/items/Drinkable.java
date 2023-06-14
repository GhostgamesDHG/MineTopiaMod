package com.ghostgamesdhg.minetopia.items;

import com.ghostgamesdhg.minetopia.MinetopiaExtra;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.UseAction;
import net.minecraft.util.ActionResult;
import net.minecraft.util.DrinkHelper;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class Drinkable extends Item {

    public Drinkable() {
        super(new Properties()
                .group(MinetopiaExtra.TAB4)
        );
    }

    //   public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
    //      if (!worldIn.isRemote) entityLiving
    //   .addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, 60*20, 50));
    //     return stack;
    // }

    public int getUseDuration(ItemStack stack) {
        return 32;
    }

    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }

    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        return DrinkHelper.startDrinking(worldIn, playerIn, handIn);
    }
}