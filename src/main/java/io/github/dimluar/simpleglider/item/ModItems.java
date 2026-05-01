package io.github.dimluar.simpleglider.item;

import io.github.dimluar.simpleglider.SimpleGlider;
import io.github.dimluar.simpleglider.component.ModComponents;
import io.github.dimluar.simpleglider.item.custom.GliderItem;
import io.github.dimluar.simpleglider.util.DyeUtils;
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
    public static final Item LIGHT_GRAY_IRON_GLIDER = register("light_gray_iron_glider", properties ->
                new GliderItem(properties.component(ModComponents.GLIDER_PROPERTIES,
                        new ModComponents.GliderProperties(0.30f, -0.75f))));
    public static final Item GRAY_IRON_GLIDER = register("gray_iron_glider", properties ->
            new GliderItem(properties.component(ModComponents.GLIDER_PROPERTIES,
                    new ModComponents.GliderProperties(0.30f, -0.75f))));
    public static final Item BLACK_IRON_GLIDER = register("black_iron_glider", properties ->
            new GliderItem(properties.component(ModComponents.GLIDER_PROPERTIES,
                    new ModComponents.GliderProperties(0.30f, -0.75f))));
    public static final Item BROWN_IRON_GLIDER = register("brown_iron_glider", properties ->
            new GliderItem(properties.component(ModComponents.GLIDER_PROPERTIES,
                    new ModComponents.GliderProperties(0.30f, -0.75f))));
    public static final Item RED_IRON_GLIDER = register("red_iron_glider", properties ->
            new GliderItem(properties.component(ModComponents.GLIDER_PROPERTIES,
                    new ModComponents.GliderProperties(0.30f, -0.75f))));
    public static final Item ORANGE_IRON_GLIDER = register("orange_iron_glider", properties ->
            new GliderItem(properties.component(ModComponents.GLIDER_PROPERTIES,
                    new ModComponents.GliderProperties(0.30f, -0.75f))));
    public static final Item YELLOW_IRON_GLIDER = register("yellow_iron_glider", properties ->
            new GliderItem(properties.component(ModComponents.GLIDER_PROPERTIES,
                    new ModComponents.GliderProperties(0.30f, -0.75f))));
    public static final Item LIME_IRON_GLIDER = register("lime_iron_glider", properties ->
            new GliderItem(properties.component(ModComponents.GLIDER_PROPERTIES,
                    new ModComponents.GliderProperties(0.30f, -0.75f))));
    public static final Item GREEN_IRON_GLIDER = register("green_iron_glider", properties ->
            new GliderItem(properties.component(ModComponents.GLIDER_PROPERTIES,
                    new ModComponents.GliderProperties(0.30f, -0.75f))));
    public static final Item CYAN_IRON_GLIDER = register("cyan_iron_glider", properties ->
            new GliderItem(properties.component(ModComponents.GLIDER_PROPERTIES,
                    new ModComponents.GliderProperties(0.30f, -0.75f))));
    public static final Item LIGHT_BLUE_IRON_GLIDER = register("light_blue_iron_glider", properties ->
            new GliderItem(properties.component(ModComponents.GLIDER_PROPERTIES,
                    new ModComponents.GliderProperties(0.30f, -0.75f))));
    public static final Item BLUE_IRON_GLIDER = register("blue_iron_glider", properties ->
            new GliderItem(properties.component(ModComponents.GLIDER_PROPERTIES,
                    new ModComponents.GliderProperties(0.30f, -0.75f))));
    public static final Item PURPLE_IRON_GLIDER = register("purple_iron_glider", properties ->
            new GliderItem(properties.component(ModComponents.GLIDER_PROPERTIES,
                    new ModComponents.GliderProperties(0.30f, -0.75f))));
    public static final Item MAGENTA_IRON_GLIDER = register("magenta_iron_glider", properties ->
            new GliderItem(properties.component(ModComponents.GLIDER_PROPERTIES,
                    new ModComponents.GliderProperties(0.30f, -0.75f))));
    public static final Item PINK_IRON_GLIDER = register("pink_iron_glider", properties ->
                new GliderItem(properties.component(ModComponents.GLIDER_PROPERTIES,
                        new ModComponents.GliderProperties(0.30f, -0.75f))));


    public static final Item WHITE_DIAMOND_GLIDER = register("white_diamond_glider", properties ->
            new GliderItem(properties.component(ModComponents.GLIDER_PROPERTIES,
                    new ModComponents.GliderProperties(0.45f, -0.5f))));
    public static final Item LIGHT_GRAY_DIAMOND_GLIDER = register("light_gray_diamond_glider", properties ->
            new GliderItem(properties.component(ModComponents.GLIDER_PROPERTIES,
                    new ModComponents.GliderProperties(0.45f, -0.5f))));
    public static final Item GRAY_DIAMOND_GLIDER = register("gray_diamond_glider", properties ->
            new GliderItem(properties.component(ModComponents.GLIDER_PROPERTIES,
                    new ModComponents.GliderProperties(0.45f, -0.5f))));
    public static final Item BLACK_DIAMOND_GLIDER = register("black_diamond_glider", properties ->
            new GliderItem(properties.component(ModComponents.GLIDER_PROPERTIES,
                    new ModComponents.GliderProperties(0.45f, -0.5f))));
    public static final Item BROWN_DIAMOND_GLIDER = register("brown_diamond_glider", properties ->
            new GliderItem(properties.component(ModComponents.GLIDER_PROPERTIES,
                    new ModComponents.GliderProperties(0.45f, -0.5f))));
    public static final Item RED_DIAMOND_GLIDER = register("red_diamond_glider", properties ->
            new GliderItem(properties.component(ModComponents.GLIDER_PROPERTIES,
                    new ModComponents.GliderProperties(0.45f, -0.5f))));
    public static final Item ORANGE_DIAMOND_GLIDER = register("orange_diamond_glider", properties ->
            new GliderItem(properties.component(ModComponents.GLIDER_PROPERTIES,
                    new ModComponents.GliderProperties(0.45f, -0.5f))));
    public static final Item YELLOW_DIAMOND_GLIDER = register("yellow_diamond_glider", properties ->
            new GliderItem(properties.component(ModComponents.GLIDER_PROPERTIES,
                    new ModComponents.GliderProperties(0.45f, -0.5f))));
    public static final Item LIME_DIAMOND_GLIDER = register("lime_diamond_glider", properties ->
            new GliderItem(properties.component(ModComponents.GLIDER_PROPERTIES,
                    new ModComponents.GliderProperties(0.45f, -0.5f))));
    public static final Item GREEN_DIAMOND_GLIDER = register("green_diamond_glider", properties ->
            new GliderItem(properties.component(ModComponents.GLIDER_PROPERTIES,
                    new ModComponents.GliderProperties(0.45f, -0.5f))));
    public static final Item CYAN_DIAMOND_GLIDER = register("cyan_diamond_glider", properties ->
            new GliderItem(properties.component(ModComponents.GLIDER_PROPERTIES,
                    new ModComponents.GliderProperties(0.45f, -0.5f))));
    public static final Item LIGHT_BLUE_DIAMOND_GLIDER = register("light_blue_diamond_glider", properties ->
            new GliderItem(properties.component(ModComponents.GLIDER_PROPERTIES,
                    new ModComponents.GliderProperties(0.45f, -0.5f))));
    public static final Item BLUE_DIAMOND_GLIDER = register("blue_diamond_glider", properties ->
            new GliderItem(properties.component(ModComponents.GLIDER_PROPERTIES,
                    new ModComponents.GliderProperties(0.45f, -0.5f))));
    public static final Item PURPLE_DIAMOND_GLIDER = register("purple_diamond_glider", properties ->
            new GliderItem(properties.component(ModComponents.GLIDER_PROPERTIES,
                    new ModComponents.GliderProperties(0.45f, -0.5f))));
    public static final Item MAGENTA_DIAMOND_GLIDER = register("magenta_diamond_glider", properties ->
            new GliderItem(properties.component(ModComponents.GLIDER_PROPERTIES,
                    new ModComponents.GliderProperties(0.45f, -0.5f))));
    public static final Item PINK_DIAMOND_GLIDER = register("pink_diamond_glider", properties ->
            new GliderItem(properties.component(ModComponents.GLIDER_PROPERTIES,
                    new ModComponents.GliderProperties(0.45f, -0.5f))));



    public static final Item WHITE_NETHERITE_GLIDER = register("white_netherite_glider", properties ->
            new GliderItem(properties.component(ModComponents.GLIDER_PROPERTIES,
                    new ModComponents.GliderProperties(0.60f, -0.25f))));
    public static final Item LIGHT_GRAY_NETHERITE_GLIDER = register("light_gray_netherite_glider", properties ->
            new GliderItem(properties.component(ModComponents.GLIDER_PROPERTIES,
                    new ModComponents.GliderProperties(0.60f, -0.25f))));
    public static final Item GRAY_NETHERITE_GLIDER = register("gray_netherite_glider", properties ->
            new GliderItem(properties.component(ModComponents.GLIDER_PROPERTIES,
                    new ModComponents.GliderProperties(0.60f, -0.25f))));
    public static final Item BLACK_NETHERITE_GLIDER = register("black_netherite_glider", properties ->
            new GliderItem(properties.component(ModComponents.GLIDER_PROPERTIES,
                    new ModComponents.GliderProperties(0.60f, -0.25f))));
    public static final Item BROWN_NETHERITE_GLIDER = register("brown_netherite_glider", properties ->
            new GliderItem(properties.component(ModComponents.GLIDER_PROPERTIES,
                    new ModComponents.GliderProperties(0.60f, -0.25f))));
    public static final Item RED_NETHERITE_GLIDER = register("red_netherite_glider", properties ->
            new GliderItem(properties.component(ModComponents.GLIDER_PROPERTIES,
                    new ModComponents.GliderProperties(0.60f, -0.25f))));
    public static final Item ORANGE_NETHERITE_GLIDER = register("orange_netherite_glider", properties ->
            new GliderItem(properties.component(ModComponents.GLIDER_PROPERTIES,
                    new ModComponents.GliderProperties(0.60f, -0.25f))));
    public static final Item YELLOW_NETHERITE_GLIDER = register("yellow_netherite_glider", properties ->
            new GliderItem(properties.component(ModComponents.GLIDER_PROPERTIES,
                    new ModComponents.GliderProperties(0.60f, -0.25f))));
    public static final Item LIME_NETHERITE_GLIDER = register("lime_netherite_glider", properties ->
            new GliderItem(properties.component(ModComponents.GLIDER_PROPERTIES,
                    new ModComponents.GliderProperties(0.60f, -0.25f))));
    public static final Item GREEN_NETHERITE_GLIDER = register("green_netherite_glider", properties ->
            new GliderItem(properties.component(ModComponents.GLIDER_PROPERTIES,
                    new ModComponents.GliderProperties(0.60f, -0.25f))));
    public static final Item CYAN_NETHERITE_GLIDER = register("cyan_netherite_glider", properties ->
            new GliderItem(properties.component(ModComponents.GLIDER_PROPERTIES,
                    new ModComponents.GliderProperties(0.60f, -0.25f))));
    public static final Item LIGHT_BLUE_NETHERITE_GLIDER = register("light_blue_netherite_glider", properties ->
            new GliderItem(properties.component(ModComponents.GLIDER_PROPERTIES,
                    new ModComponents.GliderProperties(0.60f, -0.25f))));
    public static final Item BLUE_NETHERITE_GLIDER = register("blue_netherite_glider", properties ->
            new GliderItem(properties.component(ModComponents.GLIDER_PROPERTIES,
                    new ModComponents.GliderProperties(0.60f, -0.25f))));
    public static final Item PURPLE_NETHERITE_GLIDER = register("purple_netherite_glider", properties ->
            new GliderItem(properties.component(ModComponents.GLIDER_PROPERTIES,
                    new ModComponents.GliderProperties(0.60f, -0.25f))));
    public static final Item MAGENTA_NETHERITE_GLIDER = register("magenta_netherite_glider", properties ->
            new GliderItem(properties.component(ModComponents.GLIDER_PROPERTIES,
                    new ModComponents.GliderProperties(0.60f, -0.25f))));
    public static final Item PINK_NETHERITE_GLIDER = register("pink_netherite_glider", properties ->
            new GliderItem(properties.component(ModComponents.GLIDER_PROPERTIES,
                    new ModComponents.GliderProperties(0.60f, -0.25f))));


    private static Item register(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(SimpleGlider.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(SimpleGlider.MOD_ID, name)))));
    }

    public static void initialize() {
        SimpleGlider.LOGGER.info("Registering Items for " + SimpleGlider.MOD_ID + "!");

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register((creativeTab) -> {
            int i = 0;
            for (i = 0; i < DyeUtils.LENGTH; i++) {
                creativeTab.accept(DyeUtils.IRON_GLIDERS[i]);
            }
            for (i = 0; i < DyeUtils.LENGTH; i++) {
                creativeTab.accept(DyeUtils.DIAMOND_GLIDERS[i]);
            }
            for (i = 0; i < DyeUtils.LENGTH; i++) {
                creativeTab.accept(DyeUtils.NETHERITE_GLIDERS[i]);
            }
        });
    }
}
