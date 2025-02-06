package net.maceface.arcanegearsets.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.maceface.arcanegearsets.ArcaneGearsets;
import net.maceface.arcanegearsets.item.custom.ModArmorItem;
import net.maceface.arcanegearsets.item.misc.ArcaneTemplateItem;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {

    public static final Item AQUATIC_UPGRADE_TEMPLATE = registerItem("aquatic_upgrade_template", ArcaneTemplateItem.createAquaticUpgrade());


    public static final Item TIDAL_HELMET = registerItem("tidal_helmet",
            new ModArmorItem(ModArmorMaterials.TIDAL_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(37))));

    public static final Item TIDAL_CHESTPLATE = registerItem("tidal_chestplate",
            new ArmorItem(ModArmorMaterials.TIDAL_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(37))));

    public static final Item TIDAL_LEGGINGS = registerItem("tidal_leggings",
            new ArmorItem(ModArmorMaterials.TIDAL_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(37))));

    public static final Item TIDAL_BOOTS = registerItem("tidal_boots",
            new ArmorItem(ModArmorMaterials.TIDAL_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(37))));


    public static final Item WAVE_BREAKER_HELMET = registerItem("wave_breaker_helmet",
            new ModArmorItem(ModArmorMaterials.TIDAL_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(37))));

    public static final Item WAVE_BREAKER_CHESTPLATE = registerItem("wave_breaker_chestplate",
            new ArmorItem(ModArmorMaterials.TIDAL_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(37))));

    public static final Item WAVE_BREAKER_LEGGINGS = registerItem("wave_breaker_leggings",
            new ArmorItem(ModArmorMaterials.TIDAL_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(37))));

    public static final Item WAVE_BREAKER_BOOTS = registerItem("wave_breaker_boots",
            new ArmorItem(ModArmorMaterials.TIDAL_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(37))));






    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(ArcaneGearsets.MOD_ID, name), item);
    }


    public static void registerModItems(){
        ArcaneGearsets.LOGGER.info("Restering Mod Items For " + ArcaneGearsets.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(AQUATIC_UPGRADE_TEMPLATE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(TIDAL_BOOTS);
            fabricItemGroupEntries.add(TIDAL_LEGGINGS);
            fabricItemGroupEntries.add(TIDAL_CHESTPLATE);
            fabricItemGroupEntries.add(TIDAL_HELMET);
            fabricItemGroupEntries.add(WAVE_BREAKER_BOOTS);
            fabricItemGroupEntries.add(WAVE_BREAKER_LEGGINGS);
            fabricItemGroupEntries.add(WAVE_BREAKER_CHESTPLATE);
            fabricItemGroupEntries.add(WAVE_BREAKER_HELMET);
        });
    }

}
