package com.ghostgamesdhg.minetopia.items;

import com.ghostgamesdhg.minetopia.MinetopiaExtra;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class fiveHunger extends Item {

    public fiveHunger() {
        super(new Properties()
                .group(MinetopiaExtra.TAB4)
                .food(new Food.Builder()
                        .hunger(5)
                        .saturation(1.2f)
                        .setAlwaysEdible()
                        .build())
        );
    }
}