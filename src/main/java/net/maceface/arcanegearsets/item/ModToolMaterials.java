package net.maceface.arcanegearsets.item;

import com.google.common.base.Suppliers;
import net.maceface.arcanegearsets.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {

    TIDAL(ModTags.Blocks.INCORRECT_FOR_TIDAL_TOOL, 2031, 9F, 4.0F, 15, () -> Ingredient.ofItems(Items.PRISMARINE_SHARD)),

    WAVE_BREAKER(ModTags.Blocks.INCORRECT_FOR_WITHERITE_TOOL, 2031, 9F, 4.0F, 15, () -> Ingredient.ofItems(Items.NAUTILUS_SHELL)),
    WITHERITE(ModTags.Blocks.INCORRECT_FOR_WITHERITE_TOOL, 2031, 9F, 4.0F, 15, () -> Ingredient.ofItems(Items.WITHER_SKELETON_SKULL)),
    HEAVY(ModTags.Blocks.INCORRECT_FOR_HEAVY_TOOL, 2031, 9F, 4.0F, 15, () -> Ingredient.ofItems(Items.BREEZE_ROD));


    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    private ModToolMaterials(
            final TagKey<Block> inverseTag,
            final int itemDurability,
            final float miningSpeed,
            final float attackDamage,
            final int enchantability,
            final Supplier<Ingredient> repairIngredient
    ) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
}
