package net.qurveball.firstmod.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Rarity;

public class AdamantineItem extends Item {
    public AdamantineItem(Settings settings) {
        super(settings
                .maxCount(1)
                .rarity(Rarity.EPIC)
                .fireproof()
        );
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {

        if (!user.getWorld().isClient() & hand == Hand.MAIN_HAND) {

            entity.setOnFireFor(10);
        }


        return super.useOnEntity(stack, user, entity, hand);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
