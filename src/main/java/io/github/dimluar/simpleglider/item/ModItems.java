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
    public static final Item WHITE_IRON_GLIDER = register("white_iron_glider", new GliderItem(
            new Item.Settings(), 1.05, -0.75));
    public static final Item WHITE_DIAMOND_GLIDER = register("white_diamond_glider", new GliderItem(
            new Item.Settings(), 1.1, -0.5));
    public static final Item WHITE_NETHERITE_GLIDER = register("white_netherite_glider", new GliderItem(
            new Item.Settings().fireproof(), 1.15, -0.25));


    private static Item register(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SimpleGlider.MOD_ID, name), item);
    }

    public static void initialize() {
        SimpleGlider.LOGGER.info("Registering Items for " + SimpleGlider.MOD_ID + "!");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(WHITE_IRON_GLIDER);
            entries.add(WHITE_DIAMOND_GLIDER);
            entries.add(WHITE_NETHERITE_GLIDER);
        });
    }
}
