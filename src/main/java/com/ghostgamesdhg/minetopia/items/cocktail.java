package com.ghostgamesdhg.minetopia.items;

import com.ghostgamesdhg.minetopia.MinetopiaExtra;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class cocktail extends Item {

    public cocktail() {
        super(new Properties()
                .group(MinetopiaExtra.TAB4)
                .food(new Food.Builder()
                        .hunger(0)
                        .setAlwaysEdible()
                        .saturation(0f)
                        .build())
        );
    }
}