package net.maceface.arcanegearsets.util;

import net.maceface.arcanegearsets.ArcaneGearsets;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.item.Item;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKey;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_TIDAL_TOOL = createTag("needs_tidal_tool");
        public static final TagKey<Block> INCORRECT_FOR_TIDAL_TOOL = createTag("incorrect_for_tidal_tool");

        public static final TagKey<Block> NEEDS_WAVE_BREAKER_TOOL = createTag("needs_wave_breaker_tool");
        public static final TagKey<Block> INCORRECT_FOR_WAVE_BREAKER_TOOL = createTag("incorrect_for_wave_breaker_tool");

        public static final TagKey<Block> NEEDS_WITHERITE_TOOL = createTag("needs_witherite_tool");
        public static final TagKey<Block> INCORRECT_FOR_WITHERITE_TOOL = createTag("incorrect_for_witherite_tool");

        public static final TagKey<Block> NEEDS_HEAVY_TOOL = createTag("needs_heavy_tool");
        public static final TagKey<Block> INCORRECT_FOR_HEAVY_TOOL = createTag("incorrect_for_heavy_tool");

        public static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK,Identifier.of(ArcaneGearsets.MOD_ID, name));
        }
    }

    public static class Items {

        public static final TagKey<Item> TRANSFORMABLE_ITEMS = createTag("transformable_items");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(ArcaneGearsets.MOD_ID, name));
        }
    }
}
