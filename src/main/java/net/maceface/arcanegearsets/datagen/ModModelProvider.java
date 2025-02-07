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
        itemModelGenerator.register(ModItems.TRIAL_UPGRADE_TEMPLATE, Models.GENERATED);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TIDAL_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TIDAL_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TIDAL_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TIDAL_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.WAVE_BREAKER_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.WAVE_BREAKER_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.WAVE_BREAKER_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.WAVE_BREAKER_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.WITHERITE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.WITHERITE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.WITHERITE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.WITHERITE_BOOTS));

        itemModelGenerator.register(ModItems.TIDAL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TIDAL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TIDAL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TIDAL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TIDAL_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.WAVE_BREAKER_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.WAVE_BREAKER_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.WAVE_BREAKER_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.WAVE_BREAKER_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.WAVE_BREAKER_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.WITHERITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.WITHERITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.WITHERITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.WITHERITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.WITHERITE_HOE, Models.HANDHELD);


    }
}
