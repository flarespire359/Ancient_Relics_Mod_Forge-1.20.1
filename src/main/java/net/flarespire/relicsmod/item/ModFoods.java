package net.flarespire.relicsmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties AETHERBERRY = new FoodProperties.Builder().nutrition(3).fast()
            .saturationMod(0.3f).effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 200), 0.3f)
            .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 250), 0.3f).build();

    public static final FoodProperties VOID_FRUIT = new FoodProperties.Builder().nutrition(3).fast()
            .saturationMod(0.3f).effect(() -> new MobEffectInstance(MobEffects.BLINDNESS, 200), 0.3f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 250), 0.3f).build();

}
