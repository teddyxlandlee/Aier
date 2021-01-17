package io.github.armramzing.aier.screen;

import io.github.armramzing.aier.Aier;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

/**
 * @author squid233
 * @since 2021/01/17
 */
public final class ScreenHandlers {
    public static final ScreenHandlerType<IceFurnaceScreenHandler> ICE_FURNACE_SCREEN_HANDLER =
            register("ice_furnace", IceFurnaceScreenHandler::new);

    private static <T extends ScreenHandler> ScreenHandlerType<T>
    register(String id,
             ScreenHandlerRegistry.SimpleClientHandlerFactory<T> factory) {
        return ScreenHandlerRegistry.registerSimple(new Identifier(Aier.MODID, id), factory);
    }
}
