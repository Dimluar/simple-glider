package io.github.dimluar.simpleglider.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class ModEnglishLangProvider extends FabricLanguageProvider {
    public ModEnglishLangProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("item.simpleglider.white_iron_glider", "White Iron Glider");
        translationBuilder.add("item.simpleglider.white_diamond_glider", "White Diamond Glider");
        translationBuilder.add("item.simpleglider.white_netherite_glider", "White Netherite Glider");
    }
}
