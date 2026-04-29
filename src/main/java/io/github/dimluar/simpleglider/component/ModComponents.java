package io.github.dimluar.simpleglider.component;

import com.mojang.serialization.Codec;
import io.github.dimluar.simpleglider.SimpleGlider;
import net.minecraft.component.ComponentType;
import net.minecraft.registry.BuiltinRegistries;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModComponents {
    public static final ComponentType<Boolean> IS_GLIDING = Registry.register(
            Registries.DATA_COMPONENT_TYPE,
            Identifier.of(SimpleGlider.MOD_ID, "is_gliding"),
            ComponentType.<Boolean>builder().codec(Codec.BOOL).build()
    );

    public static void initialize() {
        SimpleGlider.LOGGER.info("Registering components for " + SimpleGlider.MOD_ID + "!");
    }
}
