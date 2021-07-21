package com.ghostgamesdhg.minetopia.items;

import com.ghostgamesdhg.minetopia.MinetopiaExtra;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Broodje_Gezond extends Item {

    public Broodje_Gezond() {
        super(new Properties()
                .group(MinetopiaExtra.TAB4)
                .food(new Food.Builder()
                        .hunger(4)
                        .saturation(1.2f)
                        .setAlwaysEdible()
                        .effect(new EffectInstance(Effects.REGENERATION, 5*20, 1) ,1f)
                        .build())
        );
    }
}
