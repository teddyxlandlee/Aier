package io.github.armramzing.aier;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static io.github.armramzing.aier.block.ice_furnace.ICE_FURNACE;
import static io.github.armramzing.aier.item.ice_core.ICE_CORE;
import static io.github.armramzing.aier.item.icy_iron_ingot.ICY_IRON_INGOT;
import static io.github.armramzing.aier.itemgroup.ItemGroup.AIER;

public class Aier implements ModInitializer {

    public static final Logger logger = LogManager.getLogger();

    @Override
    public void onInitialize() {

        logger.info("[AIER]Anti-internal Energy Revolution has been start");
        logger.info("[AIER]Thanks for your playing");
        logger.info("[AIER]From ARMrAmzing, the creator of AmazingRabbit Studio");


        Registry.register(Registry.BLOCK, new Identifier("aier", "ice_furnace"), ICE_FURNACE);
        Registry.register(Registry.ITEM, new Identifier("aier", "ice_furnace"), new BlockItem(ICE_FURNACE, new Item.Settings().group(AIER)));
        Registry.register(Registry.ITEM,new Identifier("aier", "ice_core"),ICE_CORE);
        Registry.register(Registry.ITEM,new Identifier("aier", "ice_core"),ICY_IRON_INGOT);

    }

}
