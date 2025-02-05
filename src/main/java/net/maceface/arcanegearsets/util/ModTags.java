package net.maceface.arcanegearsets.util;

import net.maceface.arcanegearsets.ArcaneGearsets;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.item.Item;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKey;

public class ModTags {
    public static class Blocks {
        public static class Block {


        }
    }

    public static class Items {

        public static final TagKey<Item> TRANSFORMABLE_ITEMS = createTag("transformable_items");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(ArcaneGearsets.MOD_ID, name));
        }
    }
}
