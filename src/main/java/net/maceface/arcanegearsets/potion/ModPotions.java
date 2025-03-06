package net.maceface.arcanegearsets.potion;

import net.maceface.arcanegearsets.ArcaneGearsets;
import net.maceface.arcanegearsets.effect.ModEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModPotions {

    public static final RegistryEntry<Potion> WITHER_RESISTANCE_POTION = registerPotion("wither_resistance_potion",
            new Potion(new StatusEffectInstance(ModEffects.WITHER_RESISTANCE, 3600, 0)));
    public static final RegistryEntry<Potion> LONG_WITHER_RESISTANCE_POTION = registerPotion("long_wither_resistance_potion",
            new Potion(new StatusEffectInstance(ModEffects.WITHER_RESISTANCE, 9600, 0)));

    private static RegistryEntry<Potion> registerPotion(String name, Potion potion) {
        return Registry.registerReference(Registries.POTION, Identifier.of(ArcaneGearsets.MOD_ID, name), potion);
    }


    public static void registerPotions() {
        ArcaneGearsets.LOGGER.info("Registering Mod Potions for " + ArcaneGearsets.MOD_ID);
    }

}
