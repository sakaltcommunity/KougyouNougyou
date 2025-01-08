package com.sakalti.creative;

import com.sakalti.creative.items.BreadItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CreativeMod implements ModInitializer {

    @Override
    public void onInitialize() {
        // アイテムの登録
        BreadItems.registerItems();
    }
}
