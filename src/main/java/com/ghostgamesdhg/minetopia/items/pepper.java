package com.ghostgamesdhg.minetopia.items;

import com.ghostgamesdhg.minetopia.MinetopiaExtra;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class pepper extends Item {

    public pepper() {
        super(new Properties()
                .group(MinetopiaExtra.TAB4)
                .food(new Food.Builder()
                        .hunger(4)
                        .saturation(1.2f)
                        .effect(new EffectInstance(Effects.SPEED, 10*20, 2) ,1f)
                        .setAlwaysEdible()
                        .build())
        );
    }
}