package io.github.dimluar.simpleglider.datagen;

import io.github.dimluar.simpleglider.datagen.model.GliderModelGenerator;
import io.github.dimluar.simpleglider.item.ModItems;
import io.github.dimluar.simpleglider.util.DyeUtils;
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
        for (int i = 0; i < DyeUtils.LENGTH; i++) {
            GliderModelGenerator.registerGlider(DyeUtils.IRON_GLIDERS[i], itemModelGenerators);
            GliderModelGenerator.registerGlider(DyeUtils.DIAMOND_GLIDERS[i], itemModelGenerators);
            GliderModelGenerator.registerGlider(DyeUtils.NETHERITE_GLIDERS[i], itemModelGenerators);
        }
    }
}
