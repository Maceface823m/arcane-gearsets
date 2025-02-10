package net.maceface.arcanegearsets.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.maceface.arcanegearsets.ArcaneGearsets;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup ARCANE_GEARSETS_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ArcaneGearsets.MOD_ID, "arcane_gearsets_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.AQUATIC_UPGRADE_TEMPLATE))
                    .displayName(Text.translatable("item.arcanegearsets.arcane_gearsets_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.AQUATIC_UPGRADE_TEMPLATE);
                        entries.add(ModItems.TRIAL_UPGRADE_TEMPLATE);


                        entries.add(ModItems.TIDAL_HELMET);
                        entries.add(ModItems.TIDAL_CHESTPLATE);
                        entries.add(ModItems.TIDAL_LEGGINGS);
                        entries.add(ModItems.TIDAL_BOOTS);

                        entries.add(ModItems.WAVE_BREAKER_HELMET);
                        entries.add(ModItems.WAVE_BREAKER_CHESTPLATE);
                        entries.add(ModItems.WAVE_BREAKER_LEGGINGS);
                        entries.add(ModItems.WAVE_BREAKER_BOOTS);

                        entries.add(ModItems.WITHERITE_HELMET);
                        entries.add(ModItems.WITHERITE_CHESTPLATE);
                        entries.add(ModItems.WITHERITE_LEGGINGS);
                        entries.add(ModItems.WITHERITE_BOOTS);

                        entries.add(ModItems.HEAVY_HELMET);
                        entries.add(ModItems.HEAVY_CHESTPLATE);
                        entries.add(ModItems.HEAVY_LEGGINGS);
                        entries.add(ModItems.HEAVY_BOOTS);

                        entries.add(ModItems.TIDAL_SWORD);
                        entries.add(ModItems.TIDAL_SHOVEL);
                        entries.add(ModItems.TIDAL_PICKAXE);
                        entries.add(ModItems.TIDAL_AXE);
                        entries.add(ModItems.TIDAL_HOE);

                        entries.add(ModItems.WAVE_BREAKER_SWORD);
                        entries.add(ModItems.WAVE_BREAKER_SHOVEL);
                        entries.add(ModItems.WAVE_BREAKER_PICKAXE);
                        entries.add(ModItems.WAVE_BREAKER_AXE);
                        entries.add(ModItems.WAVE_BREAKER_HOE);

                        entries.add(ModItems.WITHERITE_SWORD);
                        entries.add(ModItems.WITHERITE_SHOVEL);
                        entries.add(ModItems.WITHERITE_PICKAXE);
                        entries.add(ModItems.WITHERITE_AXE);
                        entries.add(ModItems.WITHERITE_HOE);

                        entries.add(ModItems.HEAVY_SWORD);
                        entries.add(ModItems.HEAVY_SHOVEL);
                        entries.add(ModItems.HEAVY_PICKAXE);
                        entries.add(ModItems.HEAVY_AXE);
                        entries.add(ModItems.HEAVY_HOE);
                    }).build());


    public static void registerItemGroups() {
        ArcaneGearsets.LOGGER.info("Registering Item Groups for" + ArcaneGearsets.MOD_ID);
    }



}
