package io.github.armramzing.aier.block;

import io.github.armramzing.aier.Aier;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.function.Supplier;

public final class Blocks {
    public static final Block ICE_FURNACE = register("ice_furnace", new IceFurnace(Block.Settings.of(Material.METAL).strength(2)));
    public static final BlockEntityType<IceFurnaceEntity> ICE_FURNACE_ENTITY =
            register("bin_block", IceFurnaceEntity::new, ICE_FURNACE);

    private static <T extends BlockEntity>
    BlockEntityType<T> register(String id,
                                Supplier<T> supplier,
                                Block block) {
        return Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(Aier.MODID, id),
                BlockEntityType.Builder.create(supplier, block)
                        .build(null));
    }

    private static Block register(String id, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(Aier.MODID, id), block);
    }
}
