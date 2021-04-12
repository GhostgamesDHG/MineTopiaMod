package com.ghostgamesdhg.minetopia.items;

import com.ghostgamesdhg.minetopia.MinetopiaExtra;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class blik_linzen_soep extends Item {

    public blik_linzen_soep() {
        super(new Properties()
                .group(MinetopiaExtra.TAB4)
                .food(new Food.Builder()
                        .hunger(4)
                        .saturation(1.2f)
                        .build())
        );
    }
}