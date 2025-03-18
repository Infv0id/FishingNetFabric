package net.infvoid.fishingnetfabric;

import net.fabricmc.api.ClientModInitializer;

public class FishermensTrapClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // ✅ This runs only on the client side
        System.out.println("FishermensTrapClient initialized!");
    }
}
