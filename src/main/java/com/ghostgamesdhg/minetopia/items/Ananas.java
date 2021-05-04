package com.ghostgamesdhg.minetopia.items;

import com.ghostgamesdhg.minetopia.MinetopiaExtra;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Ananas extends Item {

    public Ananas() {
        super(new Item.Properties()
                .group(MinetopiaExtra.TAB4)
                .food(new Food.Builder()
                        .hunger(2)
                        .saturation(1.2f)
                        .setAlwaysEdible()
                        .build())
        );
    }
}