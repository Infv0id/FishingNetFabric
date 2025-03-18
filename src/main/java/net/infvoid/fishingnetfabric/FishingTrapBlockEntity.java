package net.infvoid.fishingnetfabric;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.registry.RegistryWrapper;

public class FishingTrapBlockEntity extends BlockEntity {
    public FishingTrapBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.FISHING_TRAP_BLOCK_ENTITY, pos, state); // ✅ FIXED: Uses correct Fabric constructor
    }

    @Override
    public void readNbt(NbtCompound tag, RegistryWrapper.WrapperLookup lookup) { // ✅ FIXED: Uses correct parameter
        super.readNbt(tag, lookup);
    }

    @Override
    public void writeNbt(NbtCompound tag, RegistryWrapper.WrapperLookup lookup) { // ✅ FIXED: Uses correct parameter
        super.writeNbt(tag, lookup);
    }
}
