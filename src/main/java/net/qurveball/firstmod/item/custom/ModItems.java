package net.qurveball.firstmod.item.custom;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.qurveball.firstmod.FirstMod;

public class ModItems {
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new FabricItemSettings()));
    public static final Item ADAMANTINE = registerItem("adamantine", new AdamantineItem(new FabricItemSettings()));
    public static final Item RAW_ADAMANTINE = registerItem("raw_adamantine", new Item(new FabricItemSettings()));
    public static final Item WINE = registerItem("wine", new Item(new FabricItemSettings().food(ModFoodComponent.WINE)));
    public static final Item VODKA = registerItem("vodka", new Item(new FabricItemSettings().food(ModFoodComponent.VODKA)));
    public static final Item MEAD = registerItem("mead", new Item(new FabricItemSettings().food(ModFoodComponent.MEAD)));
    public static final Item BEER = registerItem("beer", new Item(new FabricItemSettings().food(ModFoodComponent.BEER)));



    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(RUBY);
        entries.add(RAW_RUBY);
        entries.add(ADAMANTINE);
        entries.add(RAW_ADAMANTINE);
        entries.add(WINE);
        entries.add(VODKA);
        entries.add(MEAD);
        entries.add(BEER);
    }
    private static Item registerItem (String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(FirstMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        FirstMod.LOGGER.info("Registering Mod Items for " + FirstMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);

    }


}
