package io.github.dimluar.simpleglider.item;

import io.github.dimluar.simpleglider.SimpleGlider;
import io.github.dimluar.simpleglider.item.custom.GliderItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item GLIDER = register("glider", new GliderItem(
            new Item.Settings(), 1.1, -0.25));


    private static Item register(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SimpleGlider.MOD_ID, name), item);
    }

    public static void initialize() {
        SimpleGlider.LOGGER.info("Registering Items for " + SimpleGlider.MOD_ID + "!");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(GLIDER);
        });
    }
}
