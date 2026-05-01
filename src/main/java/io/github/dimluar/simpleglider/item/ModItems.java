package io.github.dimluar.simpleglider.item;

import io.github.dimluar.simpleglider.SimpleGlider;
import io.github.dimluar.simpleglider.component.ModComponents;
import io.github.dimluar.simpleglider.item.custom.GliderItem;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ModItems {
    public static final Item WHITE_IRON_GLIDER = register("white_iron_glider", properties ->
            new GliderItem(properties.component(ModComponents.GLIDER_PROPERTIES,
                    new ModComponents.GliderProperties(0.30f, -0.75f))));

    public static final Item WHITE_DIAMOND_GLIDER = register("white_diamond_glider", properties ->
            new GliderItem(properties.component(ModComponents.GLIDER_PROPERTIES,
                    new ModComponents.GliderProperties(0.45f, -0.5f))));
    public static final Item WHITE_NETHERITE_GLIDER = register("white_netherite_glider", properties ->
            new GliderItem(properties.component(ModComponents.GLIDER_PROPERTIES,
                    new ModComponents.GliderProperties(0.60f, -0.25f))));


    private static Item register(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(SimpleGlider.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(SimpleGlider.MOD_ID, name)))));
    }

    public static void initialize() {
        SimpleGlider.LOGGER.info("Registering Items for " + SimpleGlider.MOD_ID + "!");

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register((creativeTab) -> {
            creativeTab.accept(WHITE_IRON_GLIDER);
            creativeTab.accept(WHITE_DIAMOND_GLIDER);
            creativeTab.accept(WHITE_NETHERITE_GLIDER);
        });
    }
}
