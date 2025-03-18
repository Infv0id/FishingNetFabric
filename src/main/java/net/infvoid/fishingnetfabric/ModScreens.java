package net.infvoid.fishingnetfabric;

import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.gui.screen.ingame.ScreenHandlerProvider;

public class ModScreens {
    public static void register() {
        HandledScreens.register(ModScreenHandlers.FISHING_TRAP_SCREEN_HANDLER, FishingTrapScreen::new); // ✅ FIXED: Using HandledScreens.register
    }
}
