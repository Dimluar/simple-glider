package io.github.dimluar.simpleglider.item.custom;

import io.github.dimluar.simpleglider.component.ModComponents;
import io.github.dimluar.simpleglider.util.GliderUtils;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class GliderItem extends Item {
    public double gliderHorizontalFactor;
    public double gliderVerticalMaxSpeed;

    public GliderItem(Settings settings, double horizontalFactor, double verticalMaxSpeed) {
        super(settings
                .maxCount(1)
                .component(ModComponents.IS_GLIDING, false)
                .component(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, false));

        gliderHorizontalFactor = horizontalFactor;
        gliderVerticalMaxSpeed = verticalMaxSpeed;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack stack = user.getStackInHand(hand);

        if (world.isClient) {
            return TypedActionResult.success(stack);
        }


        boolean is_gliding = stack.getOrDefault(ModComponents.IS_GLIDING, false);

        stack.set(ModComponents.IS_GLIDING, !is_gliding);
        is_gliding = stack.getOrDefault(ModComponents.IS_GLIDING, false);

        if (is_gliding) {
            stack.set(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true);
        } else {
            stack.set(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, false);
        }

        return TypedActionResult.success(stack);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        boolean is_gliding = stack.getOrDefault(ModComponents.IS_GLIDING, false);
        if (!selected) {
            stack.set(ModComponents.IS_GLIDING, false);
            stack.set(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, false);
        } else {
            if (is_gliding && !entity.isOnGround()) {
                GliderUtils.glide(stack, entity);
            }
        }
    }
}
