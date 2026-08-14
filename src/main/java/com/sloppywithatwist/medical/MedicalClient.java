package com.sloppywithatwist.medical;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class MedicalClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (OPEN_HEALTH_PANEL.wasPressed()) {
                client.setScreen(new HealthPanel());
            }
        });
    }

    public static final KeyBinding OPEN_HEALTH_PANEL = KeyBindingHelper.registerKeyBinding(
            new KeyBinding(
                    "key.medicalmod.open_health_panel",
                    InputUtil.Type.KEYSYM,
                    GLFW.GLFW_KEY_H,
                    "category.medicalmod.keys"
            )
    );
}
