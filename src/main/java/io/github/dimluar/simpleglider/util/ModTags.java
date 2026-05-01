package io.github.dimluar.simpleglider.util;

import io.github.dimluar.simpleglider.SimpleGlider;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {
    public static class Items {
        public static final TagKey<Item> GLIDERS = createTag("gliders");

        private static TagKey<Item> createTag(String name) {
            return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(SimpleGlider.MOD_ID, name));
        }
    }
}
