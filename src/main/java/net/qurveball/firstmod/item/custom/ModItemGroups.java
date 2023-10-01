package net.qurveball.firstmod.item.custom;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.qurveball.firstmod.FirstMod;
import net.qurveball.firstmod.item.custom.ModItems;

public class ModItemGroups {

    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(FirstMod.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RAW_RUBY);
                        entries.add(ModItems.ADAMANTINE);
                        entries.add(ModItems.RAW_ADAMANTINE);
                        entries.add(ModItems.WINE);
                        entries.add(ModItems.VODKA);
                        entries.add(ModItems.BEER);
                        entries.add(ModItems.MEAD);


                    }).build());

    public static void registerItemGroups() {
        FirstMod.LOGGER.info("Registering Item Groups for " + FirstMod.MOD_ID);

    }


}
