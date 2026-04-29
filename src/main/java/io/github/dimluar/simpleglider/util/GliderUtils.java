package io.github.dimluar.simpleglider.util;

import io.github.dimluar.simpleglider.item.custom.GliderItem;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Vec3d;

public class GliderUtils {
    public static double baseSpeed = 0.1;

    public static void glide(ItemStack stack, Entity entity) {
        PlayerEntity player = (PlayerEntity) entity;
        GliderItem glider = (GliderItem) stack.getItem();

        double horizontalFactor = glider.gliderHorizontalFactor;
        double verticalMaxSpeed = glider.gliderVerticalMaxSpeed;

        Vec3d velocity = player.getVelocity();
        double yaw = Math.toRadians(player.getYaw());
        double directionX = -1 * Math.sin(yaw);
        double directionZ = Math.cos(yaw);


        verticalMaxSpeed = Math.max(verticalMaxSpeed, velocity.y);

        player.setVelocity(
                velocity.x,
                verticalMaxSpeed,
                velocity.z
        );

        player.addVelocity(
                newVelocity(directionX, velocity.x, horizontalFactor, baseSpeed),
                0,
                newVelocity(directionZ, velocity.z, horizontalFactor, baseSpeed)
        );

        player.fallDistance = 0;
    }

    private static int dir(double number) {
        return (number > 0) ? +1 : -1;
    }

    private static double newVelocity(double direction, double velocity, double factor, double speed) {
        double newSpeed = direction * factor * baseSpeed;
        double dirVelocity = dir(velocity);

        return (newSpeed + velocity > factor) ? dirVelocity * factor - velocity : newSpeed;
    }
}
