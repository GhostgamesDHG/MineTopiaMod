package com.ghostgamesdhg.minetopia.items;

import com.ghostgamesdhg.minetopia.MinetopiaExtra;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class ItemBaseMoney extends Item {

    public ItemBaseMoney() {
        super(new Properties().group(MinetopiaExtra.TAB));
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {

        tooltip.add(new TranslationTextComponent("tooltip.ghostgamesdhg.money"));
        tooltip.add(new TranslationTextComponent("tooltip.ghostgamesdhg.money1"));
        tooltip.add(new TranslationTextComponent("tooltip.ghostgamesdhg.money2"));

        super.addInformation(stack, worldIn, tooltip, flagIn);
    }
}
