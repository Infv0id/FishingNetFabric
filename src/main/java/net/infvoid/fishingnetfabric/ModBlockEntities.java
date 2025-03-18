package net.infvoid.fishingnetfabric;

import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    // ✅ Register the Block Entity
    public static final BlockEntityType<FishingTrapBlockEntity> FISHING_TRAP_BLOCK_ENTITY = Registry.register(
            Registries.BLOCK_ENTITY_TYPE,
            Identifier.of("fishingnetfabric", "fishing_trap_entity"), // ✅ FIXED: Uses Identifier.of()
            BlockEntityType.Builder.create(FishingTrapBlockEntity::new, ModBlocks.FISHING_TRAP).build() // ✅ FIXED: Corrected Builder usage
    );

    public static void register() {
        // This method ensures block entities are properly loaded during mod initialization
    }
}
