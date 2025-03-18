package net.infvoid.fishingnetfabric;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.screen.ingame.ScreenHandlerProvider;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class FishingTrapScreen extends HandledScreen<FishingTrapScreenHandler> {
    private static final Identifier TEXTURE = Identifier.of(FishermensTrap.MOD_ID, "textures/gui/fishing_trap.png"); // ✅ FIXED: Identifier.of(...) instead of new Identifier(...)

    public FishingTrapScreen(FishingTrapScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }

    @Override
    protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) { // ✅ FIXED: Corrected method signature
        // Draw GUI background here
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) { // ✅ FIXED: Updated to use DrawContext
        super.render(context, mouseX, mouseY, delta);
        this.drawMouseoverTooltip(context, mouseX, mouseY); // ✅ FIXED: Now uses DrawContext instead of MatrixStack
    }
}
