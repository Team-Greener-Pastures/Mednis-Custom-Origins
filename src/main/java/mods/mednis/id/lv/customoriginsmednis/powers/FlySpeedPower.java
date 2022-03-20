package mods.mednis.id.lv.customoriginsmednis.powers;

import io.github.apace100.apoli.power.Power;
import io.github.apace100.apoli.power.PowerType;
import mods.mednis.id.lv.customoriginsmednis.CustomOriginsMednis;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;

public class FlySpeedPower extends Power {

    public FlySpeedPower(PowerType<?> type, LivingEntity entity, Float speed) {
        super(type, entity);

        if (entity != null && entity.isPlayer()) {
            PlayerEntity player = (PlayerEntity) entity;
            CustomOriginsMednis.LOGGER.info("OG Fly Speed: {}",((PlayerEntity) entity).getAbilities().getFlySpeed());
            player.getAbilities().setFlySpeed(speed);
            CustomOriginsMednis.LOGGER.info("Changed Fly Speed: {}",((PlayerEntity) entity).getAbilities().getFlySpeed());
        }
    }
}
