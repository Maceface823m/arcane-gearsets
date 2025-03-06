package net.maceface.arcanegearsets;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.maceface.arcanegearsets.effect.ModEffects;
import net.maceface.arcanegearsets.effect.WitherResistanceEffect;
import net.maceface.arcanegearsets.item.ModItemGroups;
import net.maceface.arcanegearsets.item.ModItems;
import net.maceface.arcanegearsets.potion.ModPotions;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.registry.Registries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArcaneGearsets implements ModInitializer {


	public static final String MOD_ID = "arcane";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModEffects.registerEffects();
		ModPotions.registerPotions();

		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(
					Potions.AWKWARD,
					Items.WITHER_ROSE,
					ModPotions.WITHER_RESISTANCE_POTION
			);
		});



	}
}