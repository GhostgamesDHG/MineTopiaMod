package com.ghostgamesdhg.minetopia.items;

import com.ghostgamesdhg.minetopia.MinetopiaExtra;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Purple_Weed extends Item {

    public Purple_Weed() {
        super(new Properties()
                .group(MinetopiaExtra.TAB4)
                .food(new Food.Builder()
                        .hunger(3)
                        .saturation(1.0f)
                        .effect(new EffectInstance(Effects.NAUSEA, 30*20, 2) ,1f)
                        .effect(new EffectInstance(Effects.SPEED, 80*20, 2) ,1f)
                        .effect(new EffectInstance(Effects.STRENGTH, 90*20, 3) ,1f)
                        .effect(new EffectInstance(Effects.INSTANT_DAMAGE, 20, 1) ,1f) //Same as '1x20'
                        .effect(new EffectInstance(Effects.NIGHT_VISION, 50*20, 3) ,1f)
                        .effect(new EffectInstance(Effects.BLINDNESS, 9*20, 3) ,1f)
                        .effect(new EffectInstance(Effects.POISON, 25*20, 3) ,1f)
                        .fastToEat()
                        .setAlwaysEdible()
                        .build())
        );
    }
}