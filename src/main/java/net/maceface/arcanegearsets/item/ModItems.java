package net.maceface.arcanegearsets.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.maceface.arcanegearsets.ArcaneGearsets;
import net.maceface.arcanegearsets.item.custom.ModArmorItem;
import net.maceface.arcanegearsets.item.custom.ModWitheringToolItem;
import net.maceface.arcanegearsets.item.misc.ArcaneTemplateItem;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {

    public static final Item AQUATIC_UPGRADE_TEMPLATE = registerItem("aquatic_upgrade_template", ArcaneTemplateItem.createAquaticUpgrade());
    public static final Item TRIAL_UPGRADE_TEMPLATE = registerItem("trial_upgrade_template", ArcaneTemplateItem.createTrialUpgrade());


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
            new ModArmorItem(ModArmorMaterials.WAVE_BREAKER_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(37))));

    public static final Item WAVE_BREAKER_CHESTPLATE = registerItem("wave_breaker_chestplate",
            new ArmorItem(ModArmorMaterials.WAVE_BREAKER_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(37))));

    public static final Item WAVE_BREAKER_LEGGINGS = registerItem("wave_breaker_leggings",
            new ArmorItem(ModArmorMaterials.WAVE_BREAKER_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(37))));

    public static final Item WAVE_BREAKER_BOOTS = registerItem("wave_breaker_boots",
            new ArmorItem(ModArmorMaterials.WAVE_BREAKER_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(37))));



    public static final Item WITHERITE_HELMET = registerItem("witherite_helmet",
            new ModArmorItem(ModArmorMaterials.WITHERITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(37))));

    public static final Item WITHERITE_CHESTPLATE = registerItem("witherite_chestplate",
            new ArmorItem(ModArmorMaterials.WITHERITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(37))));

    public static final Item WITHERITE_LEGGINGS = registerItem("witherite_leggings",
            new ArmorItem(ModArmorMaterials.WITHERITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(37))));

    public static final Item WITHERITE_BOOTS = registerItem("witherite_boots",
            new ArmorItem(ModArmorMaterials.WITHERITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(37))));



    public static final Item TIDAL_SWORD = registerItem("tidal_sword",
            new SwordItem(ModToolMaterials.TIDAL, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.TIDAL, 3, -2.4f))));

    public static final Item TIDAL_PICKAXE = registerItem("tidal_pickaxe",
            new PickaxeItem(ModToolMaterials.TIDAL, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.TIDAL, 1, -2.8f))));

    public static final Item TIDAL_AXE = registerItem("tidal_axe",
            new AxeItem(ModToolMaterials.TIDAL, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.TIDAL, 5f, -3f))));

    public static final Item TIDAL_SHOVEL = registerItem("tidal_shovel",
            new ShovelItem(ModToolMaterials.TIDAL, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.TIDAL, 1.5f, -3f))));

    public static final Item TIDAL_HOE = registerItem("tidal_hoe",
            new HoeItem(ModToolMaterials.TIDAL, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.TIDAL, -4f, 0f))));



    public static final Item WAVE_BREAKER_SWORD = registerItem("wave_breaker_sword",
            new SwordItem(ModToolMaterials.WAVE_BREAKER, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.WAVE_BREAKER, 4, -1.4f))));

    public static final Item WAVE_BREAKER_PICKAXE = registerItem("wave_breaker_pickaxe",
            new PickaxeItem(ModToolMaterials.WAVE_BREAKER, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.WAVE_BREAKER, 2, -1.8f))));

    public static final Item WAVE_BREAKER_AXE = registerItem("wave_breaker_axe",
            new AxeItem(ModToolMaterials.WAVE_BREAKER, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.WAVE_BREAKER, 6f, -2f))));

    public static final Item WAVE_BREAKER_SHOVEL = registerItem("wave_breaker_shovel",
            new ShovelItem(ModToolMaterials.WAVE_BREAKER, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.WAVE_BREAKER, 2.5f, -2f))));

    public static final Item WAVE_BREAKER_HOE = registerItem("wave_breaker_hoe",
            new HoeItem(ModToolMaterials.WAVE_BREAKER, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.WAVE_BREAKER, -3f, 1))));




    public static final Item WITHERITE_SWORD = registerItem("witherite_sword",
            new ModWitheringToolItem(ModToolMaterials.WITHERITE, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.WITHERITE, 4, -1.4f))));

    public static final Item WITHERITE_PICKAXE = registerItem("witherite_pickaxe",
            new ModWitheringToolItem(ModToolMaterials.WITHERITE, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.WITHERITE, 2, -1.8f))));

    public static final Item WITHERITE_AXE = registerItem("witherite_axe",
            new ModWitheringToolItem(ModToolMaterials.WITHERITE, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.WITHERITE, 6f, -2f))));

    public static final Item WITHERITE_SHOVEL = registerItem("witherite_shovel",
            new ModWitheringToolItem(ModToolMaterials.WITHERITE, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.WITHERITE, 2.5f, -2f))));

    public static final Item WITHERITE_HOE = registerItem("witherite_hoe",
            new ModWitheringToolItem(ModToolMaterials.WITHERITE, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.WITHERITE, -3f, 1))));





    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(ArcaneGearsets.MOD_ID, name), item);
    }


    public static void registerModItems(){
        ArcaneGearsets.LOGGER.info("Restering Mod Items For " + ArcaneGearsets.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(AQUATIC_UPGRADE_TEMPLATE);
            fabricItemGroupEntries.add(TRIAL_UPGRADE_TEMPLATE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(TIDAL_SWORD);
            fabricItemGroupEntries.add(WAVE_BREAKER_SWORD);
            fabricItemGroupEntries.add(WITHERITE_SWORD);
            fabricItemGroupEntries.add(TIDAL_AXE);
            fabricItemGroupEntries.add(WAVE_BREAKER_AXE);
            fabricItemGroupEntries.add(WITHERITE_AXE);

            fabricItemGroupEntries.add(TIDAL_HELMET);
            fabricItemGroupEntries.add(TIDAL_CHESTPLATE);
            fabricItemGroupEntries.add(TIDAL_LEGGINGS);
            fabricItemGroupEntries.add(TIDAL_BOOTS);

            fabricItemGroupEntries.add(WAVE_BREAKER_HELMET);
            fabricItemGroupEntries.add(WAVE_BREAKER_CHESTPLATE);
            fabricItemGroupEntries.add(WAVE_BREAKER_LEGGINGS);
            fabricItemGroupEntries.add(WAVE_BREAKER_BOOTS);

            fabricItemGroupEntries.add(WITHERITE_HELMET);
            fabricItemGroupEntries.add(WITHERITE_CHESTPLATE);
            fabricItemGroupEntries.add(WITHERITE_LEGGINGS);
            fabricItemGroupEntries.add(WITHERITE_BOOTS);

        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            //fabricItemGroupEntries.addAfter();
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(TIDAL_SHOVEL);
            fabricItemGroupEntries.add(TIDAL_PICKAXE);
            fabricItemGroupEntries.add(TIDAL_AXE);
            fabricItemGroupEntries.add(TIDAL_HOE);

            fabricItemGroupEntries.add(WAVE_BREAKER_SHOVEL);
            fabricItemGroupEntries.add(WAVE_BREAKER_PICKAXE);
            fabricItemGroupEntries.add(WAVE_BREAKER_AXE);
            fabricItemGroupEntries.add(WAVE_BREAKER_HOE);

            fabricItemGroupEntries.add(WITHERITE_SHOVEL);
            fabricItemGroupEntries.add(WITHERITE_PICKAXE);
            fabricItemGroupEntries.add(WITHERITE_AXE);
            fabricItemGroupEntries.add(WITHERITE_HOE);

        });

    }

}
