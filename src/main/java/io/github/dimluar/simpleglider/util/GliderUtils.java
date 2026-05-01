package io.github.dimluar.simpleglider.util;

import io.github.dimluar.simpleglider.component.ModComponents;
import io.github.dimluar.simpleglider.network.packet.ClientsideGlidingPayload;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.Vec3;

import java.util.logging.Level;

public class GliderUtils {
    public static void glide(ItemStack stack, Entity entity) {
        ServerPlayer player = (ServerPlayer) entity;
        ModComponents.GliderProperties glider = stack.get(ModComponents.GLIDER_PROPERTIES);
        double horizontalFactor = glider.horizontalFactor();
        double verticalMaxSpeed = glider.verticalMaxSpeed();
        Vec3 velocity = player.getDeltaMovement();
        double yaw = Math.toRadians(player.getYRot());
        double directionX = -1 * Math.sin(yaw);
        double directionZ = Math.cos(yaw);

        double verticalSpeed = Math.max(verticalMaxSpeed, velocity.y);

        Vec3 setVector = new Vec3(
                velocity.x,
                verticalSpeed,
                velocity.z
        );
        Vec3 addVector = new Vec3(
                newVelocity(directionX, velocity.x, horizontalFactor),
                0,
                newVelocity(directionZ, velocity.z, horizontalFactor)
                );
        ClientsideGlidingPayload payload = new ClientsideGlidingPayload(setVector, addVector);

        player.fallDistance = 0;
        ServerPlayNetworking.send(player, payload);
    }

    private static int dir(double number) {
        return (number > 0) ? +1 : -1;
    }

    private static double newVelocity(double direction, double velocity, double factor) {
        double newSpeed = direction * factor;
        double dirVelocity = dir(velocity);

        return (newSpeed + velocity > factor) ? dirVelocity * factor - velocity : newSpeed;
    }
}
