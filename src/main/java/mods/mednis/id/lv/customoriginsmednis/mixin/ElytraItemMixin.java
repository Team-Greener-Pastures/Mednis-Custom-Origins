package mods.mednis.id.lv.customoriginsmednis.mixin;

import net.minecraft.item.ElytraItem;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ElytraItem.class)
public class ElytraItemMixin {
    @Inject(method = "isUsable(Lnet/minecraft/item/ItemStack;)Z", at = @At(value = "HEAD"), cancellable = true)
    private static void hookDisableFlight(ItemStack stack, CallbackInfoReturnable<Boolean> ci) {
        ci.setReturnValue(false);
    }
}
