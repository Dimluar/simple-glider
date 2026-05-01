package io.github.dimluar.simpleglider.component;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.github.dimluar.simpleglider.SimpleGlider;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;

public class ModComponents {
    public static final DataComponentType<Boolean> IS_GLIDING = Registry.register(
            BuiltInRegistries.DATA_COMPONENT_TYPE,
            Identifier.fromNamespaceAndPath(SimpleGlider.MOD_ID, "is_gliding"),
            DataComponentType.<Boolean>builder().persistent(Codec.BOOL).build()
    );

    public record GliderProperties(float horizontalFactor, float verticalMaxSpeed) {
    }

    public static final Codec<GliderProperties> CODEC = RecordCodecBuilder.create(builder -> {
        return builder.group(
            Codec.FLOAT.fieldOf("horizontal_factor").forGetter(GliderProperties::horizontalFactor),
            Codec.FLOAT.fieldOf("vertical_max_speed").forGetter(GliderProperties::verticalMaxSpeed)
        ).apply(builder, GliderProperties::new);
    });

    public static final DataComponentType<GliderProperties> GLIDER_PROPERTIES = Registry.register(
            BuiltInRegistries.DATA_COMPONENT_TYPE,
            Identifier.fromNamespaceAndPath(SimpleGlider.MOD_ID, "glider_properties"),
            DataComponentType.<GliderProperties>builder().persistent(CODEC).build()
    );

    public static void initialize() {
        SimpleGlider.LOGGER.info("Registering components for " + SimpleGlider.MOD_ID + "!");
    }
}
