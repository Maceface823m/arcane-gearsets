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

    public static final Item PRISMARINE_UPGRADE_TEMPLATE = registerItem("prismarine_upgrade_template", ArcaneTemplateItem.createPrismarineUpgrade());


    public static final Item PRISMARINE_HELMET = registerItem("prismarine_helmet",
            new ModArmorItem(ModArmorMaterials.PRISMARINE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(37))));

    public static final Item PRISMARINE_CHESTPLATE = registerItem("prismarine_chestplate",
            new ArmorItem(ModArmorMaterials.PRISMARINE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(37))));

    public static final Item PRISMARINE_LEGGINGS = registerItem("prismarine_leggings",
            new ArmorItem(ModArmorMaterials.PRISMARINE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(37))));

    public static final Item PRISMARINE_BOOTS = registerItem("prismarine_boots",
            new ArmorItem(ModArmorMaterials.PRISMARINE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(37))));






    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(ArcaneGearsets.MOD_ID, name), item);
    }


    public static void registerModItems(){
        ArcaneGearsets.LOGGER.info("Restering Mod Items For " + ArcaneGearsets.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(PRISMARINE_UPGRADE_TEMPLATE);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(PRISMARINE_HELMET);
            fabricItemGroupEntries.add(PRISMARINE_CHESTPLATE);
            fabricItemGroupEntries.add(PRISMARINE_LEGGINGS);
            fabricItemGroupEntries.add(PRISMARINE_BOOTS);
        });
    }

}
