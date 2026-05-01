package io.github.dimluar.simpleglider.datagen;

import io.github.dimluar.simpleglider.item.ModItems;
import io.github.dimluar.simpleglider.util.DyeUtils;
import io.github.dimluar.simpleglider.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagsProvider.ItemTagsProvider {
    public ModItemTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        for (int i = 0; i < DyeUtils.LENGTH; i++) {
            valueLookupBuilder(ModTags.Items.IRON_GLIDERS)
                    .add(DyeUtils.IRON_GLIDERS[i]);
            valueLookupBuilder(ModTags.Items.DIAMOND_GLIDERS)
                    .add(DyeUtils.DIAMOND_GLIDERS[i]);
            valueLookupBuilder(ModTags.Items.NETHERITE_GLIDERS)
                    .add(DyeUtils.NETHERITE_GLIDERS[i]);

            valueLookupBuilder(ModTags.Items.GLIDERS)
                    .add(DyeUtils.IRON_GLIDERS[i])
                    .add(DyeUtils.DIAMOND_GLIDERS[i])
                    .add(DyeUtils.NETHERITE_GLIDERS[i]);
        }
    }
}
