package net.maceface.arcanegearsets.effect;

import net.maceface.arcanegearsets.ArcaneGearsets;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModEffects {

    public static final RegistryEntry<StatusEffect> WITHER_RESISTANCE = registerStatusEffect("wither_resistance",
            new WitherResistanceEffect(StatusEffectCategory.BENEFICIAL, 0x750082));


    private static RegistryEntry<StatusEffect> registerStatusEffect(String name, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(ArcaneGearsets.MOD_ID, name), statusEffect);
    }


    public static void registerEffects() {
        ArcaneGearsets.LOGGER.info("Registering effects for" + ArcaneGearsets.MOD_ID);
    }

}
