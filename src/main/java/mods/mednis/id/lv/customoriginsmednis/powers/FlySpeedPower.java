package mods.mednis.id.lv.customoriginsmednis.powers;

import io.github.apace100.apoli.power.Power;
import io.github.apace100.apoli.power.PowerType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;

public class FlySpeedPower extends Power {

    public FlySpeedPower(PowerType<?> type, LivingEntity entity, Float speed) {
        super(type, entity);

        if (entity != null && entity.isPlayer()) {

            PlayerEntity player = (PlayerEntity) entity; // cast to player

            //if (!player.isSpectator()) { // Don't do any speed adjustments in spectator mode!

                if (player.getAbilities().creativeMode) { // If we're in creative, don't add the speed change!

                    player.getAbilities().setFlySpeed(0.05F); // Set it to a fast default speed!

                } else {

                    player.getAbilities().setFlySpeed(speed); // Change the player speed!

                }
            //}
        }
    }
}
