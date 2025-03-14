package net.maceface.arcanegearsets.item;

import net.maceface.arcanegearsets.ArcaneGearsets;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {

    public static final RegistryEntry<ArmorMaterial> TIDAL_ARMOR_MATERIAL = registerArmorMaterial("tidal",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), typeIntegerEnumMap -> {
                typeIntegerEnumMap.put(ArmorItem.Type.BOOTS, 3);
                typeIntegerEnumMap.put(ArmorItem.Type.LEGGINGS, 6);
                typeIntegerEnumMap.put(ArmorItem.Type.CHESTPLATE, 8);
                typeIntegerEnumMap.put(ArmorItem.Type.HELMET, 3);
                typeIntegerEnumMap.put(ArmorItem.Type.BODY, 11);
            }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(Items.PRISMARINE_SHARD),
                    List.of(new ArmorMaterial.Layer(Identifier.of(ArcaneGearsets.MOD_ID, "tidal"))), 3.0f, 1f));


    public static final RegistryEntry<ArmorMaterial> WAVE_BREAKER_ARMOR_MATERIAL = registerArmorMaterial("wave_breaker",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), typeIntegerEnumMap -> {
                typeIntegerEnumMap.put(ArmorItem.Type.BOOTS, 4);
                typeIntegerEnumMap.put(ArmorItem.Type.LEGGINGS, 7);
                typeIntegerEnumMap.put(ArmorItem.Type.CHESTPLATE, 9);
                typeIntegerEnumMap.put(ArmorItem.Type.HELMET, 4);
                typeIntegerEnumMap.put(ArmorItem.Type.BODY, 12);
            }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(Items.NAUTILUS_SHELL),
                    List.of(new ArmorMaterial.Layer(Identifier.of(ArcaneGearsets.MOD_ID, "wave_breaker"))), 4.0f, 1.5f));

    public static final RegistryEntry<ArmorMaterial> WITHERITE_ARMOR_MATERIAL = registerArmorMaterial("witherite",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), typeIntegerEnumMap -> {
                typeIntegerEnumMap.put(ArmorItem.Type.BOOTS, 4);
                typeIntegerEnumMap.put(ArmorItem.Type.LEGGINGS, 7);
                typeIntegerEnumMap.put(ArmorItem.Type.CHESTPLATE, 9);
                typeIntegerEnumMap.put(ArmorItem.Type.HELMET, 4);
                typeIntegerEnumMap.put(ArmorItem.Type.BODY, 12);
            }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(Items.WITHER_SKELETON_SKULL),
                    List.of(new ArmorMaterial.Layer(Identifier.of(ArcaneGearsets.MOD_ID, "witherite"))), 4.0f, 1.5f));

    public static final RegistryEntry<ArmorMaterial> HEAVY_ARMOR_MATERIAL = registerArmorMaterial("heavy",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), typeIntegerEnumMap -> {
                typeIntegerEnumMap.put(ArmorItem.Type.BOOTS, 3);
                typeIntegerEnumMap.put(ArmorItem.Type.LEGGINGS, 6);
                typeIntegerEnumMap.put(ArmorItem.Type.CHESTPLATE, 8);
                typeIntegerEnumMap.put(ArmorItem.Type.HELMET, 3);
                typeIntegerEnumMap.put(ArmorItem.Type.BODY, 11);
            }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(Items.BREEZE_ROD),
                    List.of(new ArmorMaterial.Layer(Identifier.of(ArcaneGearsets.MOD_ID, "heavy"))), 3.0f, 1f));



    public static RegistryEntry<ArmorMaterial> registerArmorMaterial(String name, Supplier<ArmorMaterial> material) {
        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(ArcaneGearsets.MOD_ID, name), material.get());
    }

}
