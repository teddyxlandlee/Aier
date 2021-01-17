package io.github.armramzing.aier.item;

import io.github.armramzing.aier.Aier;
import io.github.armramzing.aier.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public final class Items {
    public static final Item ICE_CORE = register("ice_core", new Item(defaultGroup()));
    public static final Item ICE_FURNACE = register("ice_furnace", new BlockItem(Blocks.ICE_FURNACE, defaultGroup()));
    public static final Item ICY_IRON_INGOT = register("icy_iron_ingot", new Item(defaultGroup()));

    private static Item register(String id, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Aier.MODID, id), item);
    }

    private static Item.Settings defaultGroup() {
        return new Item.Settings().group(ItemGroups.AIER);
    }
}