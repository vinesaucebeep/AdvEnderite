package com.beep67.advenderite;

import com.beep67.advenderite.core.ItemRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class CreativeTab extends ItemGroup {

    public CreativeTab(String name) {
        super(name);
    }

    @Override
    public ItemStack makeIcon() {
        return ItemRegistry.ENDERITE_GOLD_INGOT.get().getDefaultInstance();
    }

    @Override
    public void fillItemList(NonNullList<ItemStack> items) {
        super.fillItemList(items);
    }
}
