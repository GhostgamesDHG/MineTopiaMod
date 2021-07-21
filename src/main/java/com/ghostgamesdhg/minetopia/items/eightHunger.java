package com.ghostgamesdhg.minetopia.items;

import com.ghostgamesdhg.minetopia.MinetopiaExtra;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class eightHunger extends Item {

    public eightHunger() {
        super(new Properties()
                .group(MinetopiaExtra.TAB4)
                .food(new Food.Builder()
                        .hunger(8)
                        .saturation(1.2f)
                        .setAlwaysEdible()
                        .build())
        );
    }
}