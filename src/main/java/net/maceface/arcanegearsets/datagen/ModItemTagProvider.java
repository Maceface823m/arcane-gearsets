package net.maceface.arcanegearsets.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.maceface.arcanegearsets.item.ModItems;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {


        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.TIDAL_HELMET)
                .add(ModItems.TIDAL_CHESTPLATE)
                .add(ModItems.TIDAL_LEGGINGS)
                .add(ModItems.TIDAL_BOOTS)
                .add(ModItems.WAVE_BREAKER_HELMET)
                .add(ModItems.WAVE_BREAKER_CHESTPLATE)
                .add(ModItems.WAVE_BREAKER_LEGGINGS)
                .add(ModItems.WAVE_BREAKER_BOOTS);

        getOrCreateTagBuilder(ItemTags.TRIM_MATERIALS)
                .add(Items.HEART_OF_THE_SEA);

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.TIDAL_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.TIDAL_PICKAXE);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.TIDAL_AXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.TIDAL_SHOVEL);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.TIDAL_HOE);

        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR_ENCHANTABLE)
                .add(ModItems.TIDAL_HELMET)
                .add(ModItems.WAVE_BREAKER_HELMET);
        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR_ENCHANTABLE)
                .add(ModItems.TIDAL_CHESTPLATE)
                .add(ModItems.WAVE_BREAKER_CHESTPLATE);
        getOrCreateTagBuilder(ItemTags.LEG_ARMOR_ENCHANTABLE)
                .add(ModItems.TIDAL_LEGGINGS)
                .add(ModItems.WAVE_BREAKER_LEGGINGS);
        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR_ENCHANTABLE)
                .add(ModItems.TIDAL_BOOTS)
                .add(ModItems.WAVE_BREAKER_BOOTS);

    }
}
