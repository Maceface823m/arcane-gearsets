package net.maceface.arcanegearsets.item;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.maceface.arcanegearsets.ArcaneGearsets;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.List;


public class ModItems {

    public static final Item PRISMARINE_UPGRADE_TEMPLATE = registerItem("prismarine_upgrade_template", SmithingTemplateItem.createNetheriteUpgrade());
    //public static final Item PRISMARINE_UPGRADE_TEMPLATE = registerItem("prismarine_upgrade_template", new Item(new Item.Settings()));
            //new SmithingTemplateItem(
                    //Text.translatable("upgrade.yourmodid.prismarine_upgrade"), // Title
                    //Text.translatable("upgrade.yourmodid.prismarine_upgrade_applies_to"), // Applies to
                    //Text.translatable("upgrade.yourmodid.prismarine_upgrade_ingredients"), // Ingredients
                    //Text.translatable("upgrade.yourmodid.prismarine_upgrade_base_slot"), // Base slot
                    //Text.translatable("upgrade.yourmodid.prismarine_upgrade_additions_slot"), // Additions slot
                    //List.of(Items.DIAMOND_HELMET, Items.DIAMOND_CHESTPLATE, Items.DIAMOND_LEGGINGS, Items.DIAMOND_BOOTS), // Base items
                    //List.of(new Identifier("minecraft", "heart_of_the_sea")) // Addition items



    public static final Item PRISMARINE_HELMET = registerItem("prismarine_helmet",
            new ArmorItem(ModArmorMaterials.PRISMARINE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
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

    public static String getUpgradeDescription(String key) {
        return "upgrade.arcane" + key;
    }

    public static void registerModItems(){
        ArcaneGearsets.LOGGER.info("Restering Mod Items For " + ArcaneGearsets.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(PRISMARINE_UPGRADE_TEMPLATE);
        });
    }

}
