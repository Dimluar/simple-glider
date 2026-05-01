package io.github.dimluar.simpleglider.network;

import io.github.dimluar.simpleglider.network.packet.ClientsideGlidingPayload;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.world.entity.player.Player;

public class ClientsidePackets {
    public static void handleGlidingPayload(ClientsideGlidingPayload glidingPayload, ClientPlayNetworking.Context context) {
        Player player = context.player();

        player.setDeltaMovement(glidingPayload.setVector());
        player.addDeltaMovement(glidingPayload.addVector());
    }
}
