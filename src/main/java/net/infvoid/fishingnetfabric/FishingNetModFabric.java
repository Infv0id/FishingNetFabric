package net.infvoid.fishingnetfabric;

import net.fabricmc.api.ModInitializer;

import net.infvoid.fishingnetfabric.items.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FishingNetModFabric implements ModInitializer {
	public static final String MOD_ID = "fishingnetfabric";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

	}
}