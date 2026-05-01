package io.github.dimluar.simpleglider.datagen;

import io.github.dimluar.simpleglider.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

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

                shaped(RecipeCategory.TRANSPORTATION, ModItems.WHITE_IRON_GLIDER, 1)
                        .pattern("WWW")
                        .pattern(" I ")
                        .pattern("III")
                        .define('W', Items.WHITE_WOOL)
                        .define('I', Items.IRON_INGOT)
                        .group("iron_glider")
                        .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                        .save(output);

                shaped(RecipeCategory.TRANSPORTATION, ModItems.WHITE_DIAMOND_GLIDER, 1)
                        .pattern(" D ")
                        .pattern("DID")
                        .pattern(" D ")
                        .define('D', Items.DIAMOND)
                        .define('I', ModItems.WHITE_IRON_GLIDER)
                        .group("diamond_glider")
                        .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                        .save(output);

                netheriteSmithing(ModItems.WHITE_DIAMOND_GLIDER, RecipeCategory.TRANSPORTATION, ModItems.WHITE_NETHERITE_GLIDER);
            }
        };
    }

    @Override
    public String getName() {
        return "ModRecipeProvider";
    }
}
