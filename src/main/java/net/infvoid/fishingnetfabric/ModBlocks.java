package net.infvoid.fishingnetfabric;

import net.minecraft.block.Block;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    // ✅ Define the Fishing Trap Block
    public static final Block FISHING_TRAP = new Block(
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.OAK_TAN) // ✅ FIXED: Replaced `WOOD`
                    .strength(1.5f)
                    .pistonBehavior(PistonBehavior.BLOCK) // ✅ Optional, prevents piston movement
    );

    public static void register() {
        // ✅ Register the Fishing Trap Block
        Registry.register(Registries.BLOCK, Identifier.of("fishingnetfabric", "fishing_trap"), FISHING_TRAP);
    }
}
