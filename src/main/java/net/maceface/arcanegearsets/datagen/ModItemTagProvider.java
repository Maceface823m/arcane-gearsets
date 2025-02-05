package net.maceface.arcanegearsets.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.maceface.arcanegearsets.item.ModItems;
import net.maceface.arcanegearsets.util.ModTags;
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
                .add(ModItems.PRISMARINE_HELMET)
                .add(ModItems.PRISMARINE_CHESTPLATE)
                .add(ModItems.PRISMARINE_LEGGINGS)
                .add(ModItems.PRISMARINE_BOOTS);

        getOrCreateTagBuilder(ItemTags.TRIM_TEMPLATES)
                .add(ModItems.PRISMARINE_UPGRADE_TEMPLATE);

        getOrCreateTagBuilder(ItemTags.TRIM_MATERIALS)
                .add(Items.HEART_OF_THE_SEA);

    }
}
