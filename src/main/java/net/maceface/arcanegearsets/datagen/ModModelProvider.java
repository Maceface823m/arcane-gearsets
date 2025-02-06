package net.maceface.arcanegearsets.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.maceface.arcanegearsets.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.AQUATIC_UPGRADE_TEMPLATE, Models.GENERATED);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TIDAL_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TIDAL_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TIDAL_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TIDAL_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.WAVE_BREAKER_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.WAVE_BREAKER_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.WAVE_BREAKER_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.WAVE_BREAKER_BOOTS));
    }
}
