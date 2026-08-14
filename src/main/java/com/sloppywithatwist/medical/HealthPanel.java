package com.sloppywithatwist.medical;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

public class HealthPanel extends Screen {
    public HealthPanel() {
        super(Text.literal("Health Panel"));
    }

    @Override
    protected void init() {
        super.init();
        // add buttons/widgets here if needed, e.g. a close button
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        this.renderBackground(context, mouseX, mouseY, delta);
        super.render(context, mouseX, mouseY, delta);

        // custom drawing goes here
        context.drawText(this.textRenderer, "Head: OK", 20, 20, 0xFFFFFF, true);
        context.drawText(this.textRenderer, "Torso: Bleeding", 20, 35, 0xFF5555, true);
        // pull real values from your player data component/attachment here instead of hardcoding
    }

    @Override
    public boolean shouldPause() {
        return false; // keep game running in multiplayer while GUI open
    }
}
