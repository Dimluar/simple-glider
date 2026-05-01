package io.github.dimluar.simpleglider.datagen;

import io.github.dimluar.simpleglider.util.DyeUtils;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.Locale;
import java.util.concurrent.CompletableFuture;

public class ModEnglishLangProvider extends FabricLanguageProvider {
    public ModEnglishLangProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        for (int i = 0; i < DyeUtils.LENGTH; i++) {
            genLang(translationBuilder, DyeUtils.COLORS[i], "Iron");
            genLang(translationBuilder, DyeUtils.COLORS[i], "Diamond");
            genLang(translationBuilder, DyeUtils.COLORS[i], "Netherite");
        }
    }

    private void genLang(TranslationBuilder translationBuilder, String color, String material) {
        translationBuilder.add(
                "item.simpleglider." + color.toLowerCase(Locale.ROOT).replace(' ', '_') + "_" +
                        material.toLowerCase(Locale.ROOT) + "_glider", color + " " + material + " Glider");
    }
}
