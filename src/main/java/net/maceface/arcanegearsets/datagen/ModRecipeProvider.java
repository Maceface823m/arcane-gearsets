package net.maceface.arcanegearsets.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.maceface.arcanegearsets.ArcaneGearsets;
import net.maceface.arcanegearsets.item.ModItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import org.intellij.lang.annotations.Identifier;


import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        //SmithingTransformRecipeJsonBuilder.create(
                //Ingredient.ofItems(ModItems.PRISMARINE_UPGRADE_TEMPLATE),
                //Ingredient.ofItems(Items.DIAMOND_HELMET),
                //Ingredient.ofItems(Items.HEART_OF_THE_SEA),
                        //RecipeCategory.MISC,
                        //ModItems.PRISMARINE_HELMET

                //)
                //.criterion("has_smithing_template", conditionsFromItem(ModItems.PRISMARINE_UPGRADE_TEMPLATE))
                //.offerTo(exporter, new Identifier("arcane", "custom_smithing_upgrade"));

        createPrismarineUpgrade(exporter, Items.DIAMOND_HELMET, RecipeCategory.COMBAT);
        createPrismarineUpgrade(exporter, Items.DIAMOND_CHESTPLATE, RecipeCategory.COMBAT);
        createPrismarineUpgrade(exporter, Items.DIAMOND_LEGGINGS, RecipeCategory.COMBAT);
        createPrismarineUpgrade(exporter, Items.DIAMOND_BOOTS, RecipeCategory.COMBAT);
    }

    public static void createPrismarineUpgrade(RecipeExporter exporter, Item base, RecipeCategory category) {
        SmithingTransformRecipeJsonBuilder.create(
                Ingredient.ofItems(ModItems.PRISMARINE_UPGRADE_TEMPLATE),
                Ingredient.ofItems(base),
                Ingredient.ofItems(Items.HEART_OF_THE_SEA),
                category,
                base
        ).criterion("has_heart_of_the_sea", conditionsFromItem(Items.HEART_OF_THE_SEA));

    }


}
