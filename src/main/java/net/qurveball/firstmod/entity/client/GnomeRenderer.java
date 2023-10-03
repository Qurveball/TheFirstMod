package net.qurveball.firstmod.entity.client;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.qurveball.firstmod.entity.GnomeEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;


public class GnomeRenderer extends GeoEntityRenderer<GnomeEntity> {
    public GnomeRenderer(EntityRendererFactory.Context context) {
        super(context, new GnomeModel());
    }

}