package com.ghostgamesdhg.minetopia.items;

import com.ghostgamesdhg.minetopia.MinetopiaExtra;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class wine extends Item {

    public wine() {
        super(new Properties()
                .group(MinetopiaExtra.TAB4)
                .food(new Food.Builder()
                        .hunger(0)
                        .effect(new EffectInstance(Effects.NAUSEA, 300, 2) ,0.2f)
                        .setAlwaysEdible()
                        .saturation(0f)
                        .build())
        );
    }
}