package com.ghostgamesdhg.minetopia.items;

import com.ghostgamesdhg.minetopia.MinetopiaExtra;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Champagne extends Item {

    public Champagne() {
        super(new Properties()
                .group(MinetopiaExtra.TAB4)
                .food(new Food.Builder()
                        .hunger(1)
                        .saturation(1.2f)
                        .effect(new EffectInstance(Effects.BLINDNESS, 5*20, 1) ,0.5f)
                        .effect(new EffectInstance(Effects.POISON, 8*20, 1) ,0.9f)
                        .effect(new EffectInstance(Effects.NAUSEA, 10*20, 1), 1f)
                        .setAlwaysEdible()
                        .build())
        );
    }
}
