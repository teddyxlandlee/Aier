package io.github.armramzing.aier.block;

import io.github.armramzing.aier.itemgroup.ItemGroup;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ice_furnace implements ModInitializer {

    public static final Block ICE_FURNACE = new Block(FabricBlockSettings.of(Material.METAL).hardness(2.0f));

    public ice_furnace(FabricBlockSettings hardness) {
    }

    @Override
    public void onInitialize() {

        Registry.register(Registry.BLOCK, new Identifier("aier", "ice_furnace"), ICE_FURNACE);
        Registry.register(Registry.ITEM, new Identifier("aier", "ice_furnace"), new BlockItem(ICE_FURNACE, new Item.Settings().group(ItemGroup.AIER)));

    }

}
