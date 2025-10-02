package com.user.autojumpresetter;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class AttackEventHandler {

    private long lastJumpTime = 0;
    private static final long COOLDOWN = 1000; // 1 second

    @SubscribeEvent
    public void onLivingHurt(LivingHurtEvent event) {
        // Condition 1: The entity being hurt is the player
        if (!(event.entityLiving instanceof EntityPlayer)) {
            return;
        }

        EntityPlayer player = (EntityPlayer) event.entityLiving;
        Minecraft mc = Minecraft.getMinecraft();

        // Ensure we are in the client world and it's the main player
        if (player != mc.thePlayer) {
            return;
        }

        // Condition 2: The damage source is another player
        if (!(event.source.getEntity() instanceof EntityPlayer)) {
            return;
        }

        // Condition 3: The player is on the ground
        if (!player.onGround) {
            return;
        }

        // Condition 4: The player is not manually jumping
        if (mc.gameSettings.keyBindJump.isKeyDown()) {
            return;
        }

        // Condition 5: The player is not using an item (e.g., blocking, eating)
        if (player.isUsingItem()) {
            return;
        }

        // Cooldown check
        long currentTime = System.currentTimeMillis();
        if (currentTime - lastJumpTime < COOLDOWN) {
            return;
        }

        // If all conditions are met, perform the jump
        player.jump();
        lastJumpTime = currentTime;
    }
}