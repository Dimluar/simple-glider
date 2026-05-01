package io.github.dimluar.simpleglider.datagen;

import io.github.dimluar.simpleglider.datagen.model.GliderModelGenerator;
import io.github.dimluar.simpleglider.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.ModelTemplates;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        GliderModelGenerator.registerGlider(ModItems.WHITE_IRON_GLIDER, itemModelGenerators);
        GliderModelGenerator.registerGlider(ModItems.WHITE_DIAMOND_GLIDER, itemModelGenerators);
        GliderModelGenerator.registerGlider(ModItems.WHITE_NETHERITE_GLIDER, itemModelGenerators);
    }
}
