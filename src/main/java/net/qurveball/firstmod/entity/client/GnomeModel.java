package net.qurveball.firstmod.entity.client;

import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.qurveball.firstmod.FirstMod;
import net.qurveball.firstmod.entity.GnomeEntity;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class GnomeModel extends GeoModel<GnomeEntity> {
    @Override
    public Identifier getModelResource(GnomeEntity animatable) {
        return new Identifier(FirstMod.MOD_ID, "geo/gnome.geo.json");
    }

    @Override
    public Identifier getTextureResource(GnomeEntity animatable) {
        return new Identifier(FirstMod.MOD_ID, "textures/entity/gnome.png");
    }

    @Override
    public Identifier getAnimationResource(GnomeEntity animatable) {
        return new Identifier(FirstMod.MOD_ID, "animations/gnome.animation.json");
    }

    @Override
    public void setCustomAnimations(GnomeEntity animatable, long instanceId, AnimationState<GnomeEntity> animationState) {
        super.setCustomAnimations(animatable, instanceId, animationState);

        CoreGeoBone head = getAnimationProcessor().getBone("head");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);
            head.setRotX((entityData.headPitch() * MathHelper.RADIANS_PER_DEGREE));
            head.setRotY(entityData.netHeadYaw() * MathHelper.RADIANS_PER_DEGREE);
        }
    }
}
