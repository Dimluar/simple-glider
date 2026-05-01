package io.github.dimluar.simpleglider.datagen.model;

import io.github.dimluar.simpleglider.SimpleGlider;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.*;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;

import java.util.Optional;

public class GliderModelGenerator {
    public static final ModelTemplate GLIDER = item("glider", TextureSlot.LAYER0);

    public static void registerGlider(Item item, ItemModelGenerators generator) {
        Identifier itemModel = GLIDER.create(item, TextureMapping.singleSlot(TextureSlot.LAYER0, new Material(
                ModelLocationUtils.getModelLocation(item)
        )), generator.modelOutput);
        generator.itemModelOutput.accept(item, ItemModelUtils.plainModel(itemModel));
    }

    @SuppressWarnings("SameParameterValue")
    private static ModelTemplate item(String parent, TextureSlot requiredTextureKeys) {
        return new ModelTemplate(Optional.of(Identifier.fromNamespaceAndPath(
                SimpleGlider.MOD_ID, "item/" + parent)), Optional.empty(), requiredTextureKeys);
    }

}
