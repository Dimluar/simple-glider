package io.github.dimluar.simpleglider.network;

import io.github.dimluar.simpleglider.SimpleGlider;
import io.github.dimluar.simpleglider.network.packet.ClientsideGlidingPayload;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.minecraft.network.RegistryFriendlyByteBuf;

public class ModPackets {
    private static void registerClientside(PayloadTypeRegistry<RegistryFriendlyByteBuf> registry) {
        registry.register(ClientsideGlidingPayload.TYPE, ClientsideGlidingPayload.CODEC);

        ClientPlayNetworking.registerGlobalReceiver(ClientsideGlidingPayload.TYPE, ClientsidePackets::handleGlidingPayload);
    }

    public static void initialize() {
        SimpleGlider.LOGGER.info("Registering payloads for " + SimpleGlider.MOD_ID + "!");
        registerClientside(PayloadTypeRegistry.clientboundPlay());
    }
}
