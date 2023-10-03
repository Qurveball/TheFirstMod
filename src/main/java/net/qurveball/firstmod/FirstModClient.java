package net.qurveball.firstmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.qurveball.firstmod.entity.ModEntities;
import net.qurveball.firstmod.entity.client.GnomeRenderer;
import software.bernie.example.client.renderer.entity.BikeRenderer;
import software.bernie.example.registry.EntityRegistry;

public class FirstModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(ModEntities.GNOME, GnomeRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.BIKE, BikeRenderer::new);

    }
}
