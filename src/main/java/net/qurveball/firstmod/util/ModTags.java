package net.qurveball.firstmod.util;

//import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.qurveball.firstmod.FirstMod;

public class ModTags {
    //public static class Blocks {
        //private static TagKey<Block> createTag(String name) {
        //    return TagKey.of(RegistryKeys.BLOCK, new Identifier(FirstMod.MOD_ID,name));
        //}
    //} IMPORT IS COMMENTED OUT UNTIL I ADD BLOCKS

    public static class Items {
        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(FirstMod.MOD_ID, name));
        }
        //I made this for the items in the game but need to reference the video before I add tags to items i made
    }
}
