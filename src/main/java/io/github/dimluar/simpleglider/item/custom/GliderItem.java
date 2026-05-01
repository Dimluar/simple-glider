package io.github.dimluar.simpleglider.item.custom;

import io.github.dimluar.simpleglider.component.ModComponents;
import io.github.dimluar.simpleglider.util.GliderUtils;
import net.minecraft.core.component.DataComponents;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class GliderItem extends Item {
    public GliderItem(Properties properties) {
        super(properties
                .stacksTo(1)
                .component(ModComponents.IS_GLIDING, false)
                .component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, false));
    }

    @Override
    public InteractionResult use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);

        if (level.isClientSide()) {
            return InteractionResult.SUCCESS;
        }

        boolean is_gliding = stack.getOrDefault(ModComponents.IS_GLIDING, false);

        stack.set(ModComponents.IS_GLIDING, !is_gliding);
        is_gliding = stack.getOrDefault(ModComponents.IS_GLIDING, false);

        if (is_gliding) {
            stack.set(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true);
        } else {
            stack.set(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, false);
        }

        return InteractionResult.SUCCESS;
    }

    @Override
    public void inventoryTick(ItemStack itemStack, ServerLevel level, Entity owner, EquipmentSlot slot) {
        boolean is_gliding = itemStack.getOrDefault(ModComponents.IS_GLIDING, false);
        if (slot == null || slot.getType() != EquipmentSlot.Type.HAND) {
            itemStack.set(ModComponents.IS_GLIDING, false);
            itemStack.set(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, false);
        } else {
            if (is_gliding && !owner.onGround() && owner.getDeltaMovement().y < 0) {
                GliderUtils.glide(itemStack, owner);
            }
        }
    }
}
