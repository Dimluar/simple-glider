package io.github.dimluar.simpleglider.util;

import io.github.dimluar.simpleglider.SimpleGlider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Items {
        public static final TagKey<Item> GLIDERS = createTag("gliders");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(SimpleGlider.MOD_ID, name));
        }
    }
}
