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

    }
}
