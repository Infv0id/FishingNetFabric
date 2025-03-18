package net.infvoid.fishingnetfabric;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    // ✅ Register the Fishing Trap as a BlockItem (Fixes Placement Issue)
    public static final Item FISHING_TRAP_ITEM = new BlockItem(ModBlocks.FISHING_TRAP, new Item.Settings());

    public static void register() {
        // ✅ Register the Fishing Trap Block Item (Corrected Name)
        Registry.register(Registries.ITEM, Identifier.of("fishingnetfabric", "fishing_trap"), FISHING_TRAP_ITEM);

        // ✅ Add to Creative Tab
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(FISHING_TRAP_ITEM));
    }
}
