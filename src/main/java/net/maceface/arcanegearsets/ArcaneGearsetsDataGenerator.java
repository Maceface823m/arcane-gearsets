package net.maceface.arcanegearsets;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.maceface.arcanegearsets.datagen.ModItemTagProvider;
import net.maceface.arcanegearsets.datagen.ModModelProvider;
import net.maceface.arcanegearsets.datagen.ModRecipeProvider;
import net.maceface.arcanegearsets.datagen.ModRegistryDataGenerator;
import net.maceface.arcanegearsets.trim.ModTrimPatterns;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

// comment
public class ArcaneGearsetsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRegistryDataGenerator::new);
		pack.addProvider(ModRecipeProvider::new);
	}


	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.TRIM_PATTERN, ModTrimPatterns::bootstrap);
	}
}
