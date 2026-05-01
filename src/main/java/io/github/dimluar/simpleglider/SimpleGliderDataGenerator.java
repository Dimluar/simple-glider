package io.github.dimluar.simpleglider;

import io.github.dimluar.simpleglider.datagen.ModEnglishLangProvider;
import io.github.dimluar.simpleglider.datagen.ModItemTagProvider;
import io.github.dimluar.simpleglider.datagen.ModModelProvider;
import io.github.dimluar.simpleglider.datagen.ModRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class SimpleGliderDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModEnglishLangProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRecipeProvider::new);
		pack.addProvider(ModItemTagProvider::new);
	}
}
