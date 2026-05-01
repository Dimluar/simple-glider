package io.github.dimluar.simpleglider.datagen;

import io.github.dimluar.simpleglider.item.ModItems;
import io.github.dimluar.simpleglider.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagsProvider.ItemTagsProvider {
    public ModItemTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        valueLookupBuilder(ModTags.Items.GLIDERS)
                .add(ModItems.WHITE_IRON_GLIDER)
                .add(ModItems.WHITE_DIAMOND_GLIDER)
                .add(ModItems.WHITE_NETHERITE_GLIDER);
    }
}
