package net.qurveball.firstmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.qurveball.firstmod.entity.ModEntities;
import net.qurveball.firstmod.entity.client.GnomeRenderer;

public class FirstModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(ModEntities.GNOME, GnomeRenderer::new);
    }
}
