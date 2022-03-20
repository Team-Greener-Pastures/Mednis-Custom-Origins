package mods.mednis.id.lv.customoriginsmednis.mixin;

import io.github.apace100.apoli.component.PowerHolderComponent;
import mods.mednis.id.lv.customoriginsmednis.CustomOriginsMednis;
import mods.mednis.id.lv.customoriginsmednis.powers.FlyPower;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntity.class)
abstract class HungerCheckMixin {

    @Inject(at = @At("HEAD"), method = "tick")
    private void checkHungerFlyState(CallbackInfo ci) {
        Entity entity = (Entity) (Object) this;



        PowerHolderComponent powerHolder = PowerHolderComponent.KEY.get(entity);

        for (FlyPower flyPower : PowerHolderComponent.getPowers(entity, FlyPower.class)) {
            if(entity.isPlayer() || FlyPower.shouldStopFlight(entity)) {
                PlayerEntity player = (PlayerEntity) entity;
                CustomOriginsMednis.LOGGER.info("Should not be able to fly....");


                if (player.getAbilities().flying) {

                    player.getAbilities().flying = false;
                    CustomOriginsMednis.LOGGER.info("Stooping Flight!");
                }
            }
        }



    }


}
