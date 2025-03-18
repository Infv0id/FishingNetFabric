package net.infvoid.fishingnetfabric;

import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static final ScreenHandlerType<FishingTrapScreenHandler> FISHING_TRAP_SCREEN_HANDLER;

    static {
        FISHING_TRAP_SCREEN_HANDLER = Registry.register(
                Registries.SCREEN_HANDLER,
                Identifier.of(FishermensTrap.MOD_ID, "fishingnetfabric"),
                new ScreenHandlerType<>(FishingTrapScreenHandler::new, null) // ✅ FIXED: Added second argument
        );
    }

    public static void register() {
        // Placeholder method for future registrations
    }
}
