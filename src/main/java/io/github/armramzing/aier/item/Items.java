package io.github.armramzing.aier.item;

import io.github.armramzing.aier.Aier;
import io.github.armramzing.aier.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public final class Items {
    public static final Item ICE_CORE = register("ice_core", new Item(new Item.Settings().group(ItemGroups.AIER)));
    public static final Item ICE_FURNACE = register("ice_furnace", new BlockItem(Blocks.ICE_FURNACE, new Item.Settings().group(ItemGroups.AIER)));

    private static Item register(String id, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Aier.MODID, id), item);
    }
}