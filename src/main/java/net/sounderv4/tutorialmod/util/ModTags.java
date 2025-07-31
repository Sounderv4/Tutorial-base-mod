package net.sounderv4.tutorialmod.util;



import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.sounderv4.tutorialmod.Tutorialmod;

import javax.swing.text.html.HTML;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_PINK_GARNET_TOOL = createTag("needs_pink_garnet_tool");
        public static final TagKey<Block> INCORRECT_FOR_PINK_GARTNET_TOOL = createTag("incorrect_for_pink_garnet_tool");
        public static final TagKey<Block> NEEDS_SPEED_TOOL = createTag("needs_speed_tool");
        public static final TagKey<Block> INCORRECT_FOR_SPEED_TOOL = createTag("incorrect_for_speed_tool");
        public static final TagKey<Block> NEEDS_LAPITE_TOOL = createTag("needs_lapite_tool");
        public static final TagKey<Block> INCORRECT_FOR_LAPITE_TOOL = createTag("incorrect_for_lapite_tool");
        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(Tutorialmod.MOD_ID, name));


        }
    }

    public static class Items{
        public static final TagKey<Item> TRANSFORMABLE_ITEMS = createTag("transformable_items");


        private static TagKey<Item> createTag(String name){
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(Tutorialmod.MOD_ID, name));
        }
    }

}
