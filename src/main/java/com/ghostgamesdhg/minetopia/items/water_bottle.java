package com.ghostgamesdhg.minetopia.items;

import com.ghostgamesdhg.minetopia.MinetopiaExtra;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class water_bottle extends Item {

    public water_bottle() {
        super(new Properties()
                .group(MinetopiaExtra.TAB4)
                .food(new Food.Builder()
                        .hunger(0)
                        .saturation(0f)
                        .setAlwaysEdible()
                        .build())
        );
    }
}