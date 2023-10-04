package net.qurveball.firstmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.qurveball.firstmod.FirstMod;
import net.qurveball.firstmod.entity.ModEntities;
import net.qurveball.firstmod.item.custom.AdamantineItem;

public class ModItems {
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new FabricItemSettings()));
    public static final Item ADAMANTINE = registerItem("adamantine", new AdamantineItem(new FabricItemSettings()));
    public static final Item RAW_ADAMANTINE = registerItem("raw_adamantine", new Item(new FabricItemSettings()));
    public static final Item GNOME_SPAWN_EGG = registerItem("gnome_spawn_egg", new SpawnEggItem(ModEntities.GNOME,0x0096FF, 0xff0000,new FabricItemSettings()));

    private static Item registerItem (String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(FirstMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        FirstMod.LOGGER.info("Registering Mod Items for " + FirstMod.MOD_ID);
   }


}
