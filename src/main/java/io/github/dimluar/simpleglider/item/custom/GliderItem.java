package io.github.dimluar.simpleglider.item.custom;

import io.github.dimluar.simpleglider.SimpleGlider;
import io.github.dimluar.simpleglider.component.ModComponents;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemActionResult;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.List;

public class GliderItem extends Item {
    public GliderItem(Settings settings) {
        super(settings
                .maxCount(1)
                .component(ModComponents.IS_GLIDING, false));
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack stack = user.getStackInHand(hand);

        if (world.isClient) {
            return TypedActionResult.success(stack);
        }


        boolean is_gliding = stack.getOrDefault(ModComponents.IS_GLIDING, false);

        SimpleGlider.LOGGER.info("IS_GLINDING_1: {}", is_gliding);

        stack.set(ModComponents.IS_GLIDING, !is_gliding);
        is_gliding = stack.getOrDefault(ModComponents.IS_GLIDING, false);

        SimpleGlider.LOGGER.info("IS_GLIDING_2: {}", is_gliding);

        return TypedActionResult.success(stack);
    }
}
