package io.github.dimluar.simpleglider.datagen;

import io.github.dimluar.simpleglider.SimpleGlider;
import io.github.dimluar.simpleglider.item.ModItems;
import io.github.dimluar.simpleglider.util.DyeUtils;
import io.github.dimluar.simpleglider.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import java.util.Locale;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {
                HolderLookup.RegistryLookup<Item> itemLookup = registries.lookupOrThrow(Registries.ITEM);

                for (int i = 0; i < DyeUtils.LENGTH; i++) {
                    String color = DyeUtils.COLORS[i];
                    Item ironGlider = DyeUtils.IRON_GLIDERS[i];
                    Item diamondGlider = DyeUtils.DIAMOND_GLIDERS[i];
                    Item netheriteGlider = DyeUtils.NETHERITE_GLIDERS[i];
                    Item wool = DyeUtils.WOOLS[i];
                    Item dye = DyeUtils.DYES[i];

                    shaped(RecipeCategory.TRANSPORTATION, ironGlider)
                            .pattern("WWW")
                            .pattern(" I ")
                            .pattern("III")
                            .define('W', wool)
                            .define('I', Items.IRON_INGOT)
                            .group("iron_glider")
                            .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                            .save(output);
                    shapeless(RecipeCategory.TRANSPORTATION, ironGlider)
                            .requires(ModTags.Items.IRON_GLIDERS)
                            .requires(dye)
                            .group("iron_glider_from_dye")
                            .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                            .save(output, color.toLowerCase(Locale.ROOT).replace(' ', '_')
                            + "_iron_glider_from_dye");

                    shaped(RecipeCategory.TRANSPORTATION, diamondGlider)
                            .pattern(" D ")
                            .pattern("DID")
                            .pattern(" D ")
                            .define('D', Items.DIAMOND)
                            .define('I', ironGlider)
                            .group("diamond_glider")
                            .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                            .save(output);
                    shapeless(RecipeCategory.TRANSPORTATION, diamondGlider)
                            .requires(ModTags.Items.DIAMOND_GLIDERS)
                            .requires(dye)
                            .group("diamond_glider_from_dye")
                            .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                            .save(output, color.toLowerCase(Locale.ROOT).replace(' ', '_')
                                    + "_diamond_glider_from_dye");

                    netheriteSmithing(diamondGlider, RecipeCategory.TRANSPORTATION, netheriteGlider);
                    shapeless(RecipeCategory.TRANSPORTATION, netheriteGlider)
                            .requires(ModTags.Items.NETHERITE_GLIDERS)
                            .requires(dye)
                            .group("netherite_glider_from_dye")
                            .unlockedBy(getHasName(Items.NETHERITE_INGOT), has(Items.NETHERITE_INGOT))
                            .save(output, color.toLowerCase(Locale.ROOT).replace(' ', '_')
                                    + "_netherite_glider_from_dye");
                }
            }
        };
    }

    @Override
    public String getName() {
        return "ModRecipeProvider";
    }


}
