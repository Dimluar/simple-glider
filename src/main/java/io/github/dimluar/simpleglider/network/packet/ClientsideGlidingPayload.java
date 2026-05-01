package io.github.dimluar.simpleglider.network.packet;

import io.github.dimluar.simpleglider.SimpleGlider;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.Identifier;
import net.minecraft.world.phys.Vec3;

public record ClientsideGlidingPayload(Vec3 setVector, Vec3 addVector) implements CustomPacketPayload {
    public static final Identifier GLIDING_PAYLOAD_ID =
            Identifier.fromNamespaceAndPath(SimpleGlider.MOD_ID, "gliding_payload");
    public static final CustomPacketPayload.Type<ClientsideGlidingPayload> TYPE =
            new Type<>(GLIDING_PAYLOAD_ID);
    public static final StreamCodec<RegistryFriendlyByteBuf, ClientsideGlidingPayload> CODEC =
            StreamCodec.composite(
                    Vec3.STREAM_CODEC, ClientsideGlidingPayload::setVector,
                    Vec3.STREAM_CODEC, ClientsideGlidingPayload::addVector,
                    ClientsideGlidingPayload::new);
    @Override
    public Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }
}
