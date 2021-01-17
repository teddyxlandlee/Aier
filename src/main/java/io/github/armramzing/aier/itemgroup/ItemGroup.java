package io.github.armramzing.aier.itemgroup;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import static io.github.armramzing.aier.block.ice_furnace.ICE_FURNACE;
import static io.github.armramzing.aier.item.ice_core.ICE_CORE;
import static io.github.armramzing.aier.item.icy_iron_ingot.ICY_IRON_INGOT;


public class ItemGroup {

    public static final net.minecraft.item.ItemGroup AIER = FabricItemGroupBuilder.create(
            new Identifier("aier", "aier"))
            .icon(() -> new ItemStack(ICE_CORE))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(ICE_CORE));
                stacks.add(new ItemStack(ICY_IRON_INGOT));
                stacks.add(new ItemStack(ICE_FURNACE));
            })
            .build();


}