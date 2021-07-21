package com.ghostgamesdhg.minetopia.items;

import com.ghostgamesdhg.minetopia.MinetopiaExtra;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class gelukskoekje extends Item {

    public gelukskoekje() {
        super(new Properties()
                .group(MinetopiaExtra.TAB4)
                .food(new Food.Builder()
                        .hunger(5)
                        .saturation(1.2f)
                        .effect(new EffectInstance(Effects.LUCK, 40*20, 2) ,1f)
                        .effect(new EffectInstance(Effects.HERO_OF_THE_VILLAGE, 20*20, 1) ,0.05f)
                        .effect(new EffectInstance(Effects.FIRE_RESISTANCE, 30*20, 1) ,0.05f)
                        .effect(new EffectInstance(Effects.ABSORPTION, 30*20, 1) ,0.05f)
                        .effect(new EffectInstance(Effects.HEALTH_BOOST, 15*20, 1) ,0.05f)
                        .effect(new EffectInstance(Effects.CONDUIT_POWER, 10*20, 1) ,0.05f)
                        .effect(new EffectInstance(Effects.JUMP_BOOST, 15*20, 1) ,0.05f)
                        .effect(new EffectInstance(Effects.HASTE, 15*20, 1) ,0.05f)
                        .setAlwaysEdible()
                        .build())
        );
    }
}
