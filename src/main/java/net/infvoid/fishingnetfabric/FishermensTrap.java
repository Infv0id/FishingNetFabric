package net.infvoid.fishingnetfabric;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.infvoid.fishingnetfabric.ModItems;
import net.infvoid.fishingnetfabric.ModBlocks;
import net.infvoid.fishingnetfabric.ModBlockEntities;
import net.infvoid.fishingnetfabric.ModScreens;


public class FishermensTrap implements ModInitializer {
    public static final String MOD_ID = "fishermens_trap";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static Identifier modPrefix(String path) {
        return Identifier.of(FishermensTrap.MOD_ID, path);
    }


    @Override
    public void onInitialize() {
        LOGGER.info("Fishermen’s Trap is loading...");

        // Register Items & Blocks
        ModItems.register();
        ModBlocks.register();
        ModBlockEntities.register();
        ModScreens.register();

        // Register Server Events (if needed)
        ServerLifecycleEvents.SERVER_STARTED.register(server -> LOGGER.info("Fishermen’s Trap Server Started"));
        ServerTickEvents.END_WORLD_TICK.register(world -> LOGGER.debug("World Tick Event"));
    }
}
