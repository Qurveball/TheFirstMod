package net.qurveball.firstmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.qurveball.firstmod.entity.GnomeEntity;
import net.qurveball.firstmod.entity.ModEntities;
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
		FabricDefaultAttributeRegistry.register(ModEntities.GNOME, GnomeEntity.setAttributes());
	}

	//TODO
	//Make the Gnome a vanilla entity
	//Make a 3 custom hats for the Gnome and have him wear it
	// Already made the straw hat, need to add it but have no help with geocko lib 
	//Edit AI so the gnome can can drink alcohol
	//
	//
	//
	//
	//
	//
}
