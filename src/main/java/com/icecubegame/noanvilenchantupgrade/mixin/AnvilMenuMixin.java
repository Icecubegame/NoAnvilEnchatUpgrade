package com.icecubegame.noanvilenchantupgrade.mixin;

import com.llamalad7.mixinextras.sugar.ref.LocalIntRef;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.world.inventory.AnvilMenu;
import org.spongepowered.asm.mixin.injection.ModifyVariable;



@Mixin(value = AnvilMenu.class, remap = false)
public class AnvilMenuMixin {

    @ModifyVariable(
            method = "createResult",
            name = "j2",
            at = @At(value = "STORE", ordinal = 0)
    )
    private int removeEnchantUpgrading(int j2, @Local(name = "i2") LocalIntRef i2) {
        if (j2 == i2.get()) {
            i2.set(0);
        }

        return j2;
    }
}
