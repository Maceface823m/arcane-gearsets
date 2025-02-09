package net.maceface.arcanegearsets;

import net.fabricmc.api.ModInitializer;

import net.maceface.arcanegearsets.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArcaneGearsets implements ModInitializer {


	public static final String MOD_ID = "arcane";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}