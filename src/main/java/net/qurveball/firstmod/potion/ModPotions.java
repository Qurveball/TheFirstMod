package net.qurveball.firstmod.potion;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.recipe.BrewingRecipeRegistry;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.qurveball.firstmod.FirstMod;

public class ModPotions {

    public static final Potion WINE =
            Registry.register(Registries.POTION, new Identifier(FirstMod.MOD_ID, "wine"),
                    new Potion( new StatusEffectInstance(StatusEffects.NAUSEA, 400, 0)));
    public static final Potion BEER =
            Registry.register(Registries.POTION, new Identifier(FirstMod.MOD_ID, "beer"),
                    new Potion( new StatusEffectInstance(StatusEffects.NAUSEA, 200, 0)));
    public static final Potion VODKA =
            Registry.register(Registries.POTION, new Identifier(FirstMod.MOD_ID, "vodka"),
                    new Potion( new StatusEffectInstance(StatusEffects.NAUSEA, 600, 1)));
    public static final Potion MEAD =
            Registry.register(Registries.POTION, new Identifier(FirstMod.MOD_ID, "mead"),
                    new Potion( new StatusEffectInstance(StatusEffects.NAUSEA, 400, 0)));
    public static void registerPotions() {
    }

    public static void registerPotionsRecipes(){
        BrewingRecipeRegistry.registerPotionRecipe(Potions.WATER, Items.SWEET_BERRIES, ModPotions.WINE);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.WATER, Items.WHEAT, ModPotions.BEER);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.WATER, Items.POTATO, ModPotions.VODKA);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.WATER, Items.HONEYCOMB, ModPotions.MEAD);
    }
}
