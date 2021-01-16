package io.github.armramzing.aier.itemgroup;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ItemGroup implements ModInitializer {

    public static final Item ICE_CORE = new Item(new Item.Settings().group(ItemGroup.AIER));

    public static final net.minecraft.item.ItemGroup AIER = FabricItemGroupBuilder.build(
            new Identifier("aier","aier"),
            () -> new ItemStack(ICE_CORE))
            .appendStacks(stacks -> {
             stacks.add(new ItemStack(ICE_CORE));
    });

    public void onInitialize(){

        Registry.register(Registry.ITEM,new Identifier("aier", "ice_core"),ICE_CORE);

    }

}
