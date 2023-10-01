package net.qurveball.firstmod;

import net.fabricmc.api.ModInitializer;

import net.qurveball.firstmod.item.ModItemGroups;
import net.qurveball.firstmod.item.ModItems;
import net.qurveball.firstmod.potion.ModPotions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FirstMod implements ModInitializer {
	public static final String MOD_ID = "firstmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModPotions.registerPotions();
		ModPotions.registerPotionsRecipes();
	}
}