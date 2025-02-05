package net.maceface.arcanegearsets.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.maceface.arcanegearsets.ArcaneGearsets;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item PRISMARINE_UPGRADE_TEMPLATE = registerItem("prismarine_upgrade_template", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(ArcaneGearsets.MOD_ID, name), item);
    }

    public static void registerModItems(){
        ArcaneGearsets.LOGGER.info("Restering Mod Items For " + ArcaneGearsets.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(PRISMARINE_UPGRADE_TEMPLATE);
        });
    }


}
