package io.github.armramzing.aier.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class ice_furnace {

    public static final Block ICE_FURNACE = new Block(FabricBlockSettings.of(Material.METAL).hardness(2.0f));

    public ice_furnace(FabricBlockSettings hardness) {
    }

}
