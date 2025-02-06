package net.maceface.arcanegearsets;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.maceface.arcanegearsets.datagen.ModItemTagProvider;
import net.maceface.arcanegearsets.datagen.ModModelProvider;

// comment
public class ArcaneGearsetsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModModelProvider::new);
		//pack.addProvider(ModRecipeProvider::new);
	}
}
