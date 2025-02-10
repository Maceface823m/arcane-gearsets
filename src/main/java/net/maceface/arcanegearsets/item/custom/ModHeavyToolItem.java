package net.maceface.arcanegearsets.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterial;

public class ModHeavyToolItem extends ToolItem {

    public ModHeavyToolItem(ToolMaterial material, Settings settings) {
        super(material, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {

        target.addStatusEffect(new StatusEffectInstance(StatusEffects.WIND_CHARGED, 1200, 40), attacker);
        return super.postHit(stack, target, attacker);
    }


}
