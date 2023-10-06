package net.qurveball.firstmod.entity.client;

import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.qurveball.firstmod.FirstMod;
import net.qurveball.firstmod.entity.GnomeEntity;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class GnomeModel extends DefaultedEntityGeoModel<GnomeEntity> {
    public GnomeModel() {
        super(new Identifier(FirstMod.MOD_ID, "monster/gnome"), true);
    }
}
