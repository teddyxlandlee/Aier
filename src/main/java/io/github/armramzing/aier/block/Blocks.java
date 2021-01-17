package io.github.armramzing.aier.block;

import io.github.armramzing.aier.Aier;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public final class Blocks {
    public static final Block ICE_FURNACE = register("ice_furnace", new Block(Block.Settings.of(Material.METAL).strength(2)));

    private static Block register(String id, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(Aier.MODID, id), block);
    }
}
