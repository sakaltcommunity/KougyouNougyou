package com.sakalti.creative.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.FoodComponent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BreadItems {

    // パンスライス（1個で回復量2）
    public static final Item BREAD_SLICE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).build()));

    // トースト（1個で回復量5）
    public static final Item TOAST = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(5).saturationModifier(0.6f).build()));

    // アイテムの登録
    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier("creative", "bread_slice"), BREAD_SLICE);
        Registry.register(Registry.ITEM, new Identifier("creative", "toast"), TOAST);
    }
}
