package net.maceface.arcanegearsets.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.maceface.arcanegearsets.ArcaneGearsets;
import net.maceface.arcanegearsets.item.ModItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        offerSmithingTrimRecipe(recipeExporter, ModItems.DRAGON_SMITHING_TEMPLATE, Identifier.of(ArcaneGearsets.MOD_ID, "dragon"));
    }
}
