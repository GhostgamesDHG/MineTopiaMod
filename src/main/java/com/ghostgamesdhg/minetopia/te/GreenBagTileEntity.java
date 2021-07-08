package com.ghostgamesdhg.minetopia.te;

import com.ghostgamesdhg.minetopia.MinetopiaExtra;
import com.ghostgamesdhg.minetopia.container.GreenBagContainer;
import com.ghostgamesdhg.minetopia.init.TileEntityTypesInit;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.LockableLootTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class GreenBagTileEntity extends LockableLootTileEntity {

    public static int slots = 1;

    protected  NonNullList<ItemStack> items = NonNullList.withSize(slots, ItemStack.EMPTY);

    protected  GreenBagTileEntity(TileEntityType<?> typeIn) {
        super(typeIn);
    }

    @Override
    protected ITextComponent getDefaultName() {
        return new TranslationTextComponent("container." + MinetopiaExtra.MOD_ID + ".green_bag");
    }

    @Override
    protected Container createMenu(int id, PlayerInventory player) {
        return new GreenBagContainer(id, player, this);
    }

    @Override
    protected NonNullList<ItemStack> getItems() {
        return this.items;
    }

    @Override
    protected void setItems(NonNullList<ItemStack> itemsIn) {
        this.items = itemsIn;
    }

    public GreenBagTileEntity() {
        this(TileEntityTypesInit.GREEN_BAG_TILE_ENTITY_TYPE.get());
    }

    @Override
    public int getSizeInventory() {
        return slots;
    }


    //THIS IS THE NBT SAVE (STORES THE ITEM IN THE BLOCK)
    @Override
    public CompoundNBT write(CompoundNBT compound) {
        super.write(compound);
        if(!this.checkLootAndWrite(compound)) {
            ItemStackHelper.saveAllItems(compound, this.items);
        }

        return compound;
    }

    @Override
    public void read(BlockState state, CompoundNBT nbt) {
        this.items = NonNullList.withSize(getSizeInventory(), ItemStack.EMPTY);
        if (!this.checkLootAndRead(nbt)) {
            ItemStackHelper.loadAllItems(nbt, this.items);
        }
    }
}
