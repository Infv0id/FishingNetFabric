package net.infvoid.fishingnetfabric;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.screen.slot.Slot;

public class FishingTrapScreenHandler extends ScreenHandler {
    private final Inventory inventory;

    public FishingTrapScreenHandler(int syncId, PlayerInventory playerInventory) {
        super(ModScreenHandlers.FISHING_TRAP_SCREEN_HANDLER, syncId);
        this.inventory = new SimpleInventory(9);

        // Add inventory slots (example: 9 slots)
        for (int i = 0; i < 9; i++) {
            this.addSlot(new Slot(inventory, i, 8 + i * 18, 18));
        }
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return this.inventory.canPlayerUse(player);
    }

    @Override
    public ItemStack quickMove(PlayerEntity player, int index) {
        return ItemStack.EMPTY;  // ✅ Placeholder implementation for quick-moving items
    }
}
