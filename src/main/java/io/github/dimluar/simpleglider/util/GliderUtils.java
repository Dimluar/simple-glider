package io.github.dimluar.simpleglider.util;

import io.github.dimluar.simpleglider.item.custom.GliderItem;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Vec3d;

public class GliderUtils {
    public static void glide(ItemStack stack, Entity entity) {

        GliderItem glider = (GliderItem) stack.getItem();

        double horizontalFactor = glider.gliderHorizontalFactor;
        double verticalMaxSpeed = glider.gliderVerticalMaxSpeed;

        Vec3d velocity = entity.getVelocity();

        verticalMaxSpeed = Math.max(verticalMaxSpeed, velocity.y);

        entity.setVelocity(
                velocity.x * horizontalFactor,
                verticalMaxSpeed,
                velocity.z * horizontalFactor
        );

        entity.fallDistance = 0;
    }
}
