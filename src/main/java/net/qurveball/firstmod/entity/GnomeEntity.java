package net.qurveball.firstmod.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.qurveball.firstmod.item.ModItems;
import software.bernie.geckolib.GeckoLib;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.*;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.util.GeckoLibUtil;



public class GnomeEntity extends PathAwareEntity implements GeoEntity {
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);


    public GnomeEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
   }




    public static DefaultAttributeContainer.Builder setAttributes() {
        return PathAwareEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH,20)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE,1.0f)
                .add(EntityAttributes.GENERIC_ATTACK_SPEED,2.0f)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED,0.4f);
    }
    protected void initGoals() {
        super.initGoals();
        this.goalSelector.add(0,new SwimGoal(this));
        this.goalSelector.add(3,new LookAtEntityGoal(this, PlayerEntity.class, 12.0f));
        this.goalSelector.add(3,new WanderAroundGoal(this, 0.6f));
        this.goalSelector.add(2, new TemptGoal(this, 1, Ingredient.ofItems(Items.COOKIE), false));
        this.goalSelector.add(2, new HoldInHandsGoal<>(this, new ItemStack(ModItems.ADAMANTINE), null, gnome -> this.getWorld().isDay()));
    }

    @Override
    protected ActionResult interactMob(PlayerEntity player, Hand hand) {
        ItemStack stack = player.getStackInHand(hand);

        if (this.getWorld().isClient() || stack.isEmpty())
            return super.interactMob(player, hand);

        EquipmentSlot slot = LivingEntity.getPreferredEquipmentSlot(stack);

        equipStack(slot, stack.copy());
        player.sendMessage(Text.translatable("entity." + GeckoLib.MOD_ID + ".mutant_zombie.equip", stack.toHoverableText()));

        if (slot == EquipmentSlot.MAINHAND || slot == EquipmentSlot.OFFHAND)
            triggerAnim(getLeftHand() == hand ? "Left Hand" : "Right Hand", "interact");

        return ActionResult.SUCCESS;
    }

    private Hand getLeftHand() {
        return this.isLeftHanded() ? Hand.MAIN_HAND : Hand.OFF_HAND;
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<GeoAnimatable>(this, "controller", 0, this::predicate));
    }
    private PlayState predicate(AnimationState tAnimationState) {
        if (tAnimationState.isMoving()) {
            tAnimationState.getController().setAnimation(RawAnimation.begin().then("animation.gnome.walk", Animation.LoopType.LOOP));
        }
        else {
            tAnimationState.getController().setAnimation(RawAnimation.begin().then("animation.gnome.idle", Animation.LoopType.LOOP));
        }
        return PlayState.CONTINUE;
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }
}
