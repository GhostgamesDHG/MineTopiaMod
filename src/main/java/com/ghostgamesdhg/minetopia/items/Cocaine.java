package com.ghostgamesdhg.minetopia.items;

import com.ghostgamesdhg.minetopia.MinetopiaExtra;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Cocaine extends Item {

    public Cocaine() {
        super(new Item.Properties()
                .group(MinetopiaExtra.TAB4)
                .food(new Food.Builder()
                        .hunger(3)
                        .saturation(1.2f)
                        .effect(new EffectInstance(Effects.POISON, 8*20, 2) ,0.7f)
                        .effect(new EffectInstance(Effects.NAUSEA, 12*20, 2) ,1f)
                        .effect(new EffectInstance(Effects.SPEED, 40*20, 2) ,1f)
                        .effect(new EffectInstance(Effects.STRENGTH, 80*20, 3) ,1f)
                        .effect(new EffectInstance(Effects.LUCK, 80*20, 3) ,1f)
                        .setAlwaysEdible()
                        .build())
        );
    }
}