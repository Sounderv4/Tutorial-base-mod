package net.sounderv4.tutorialmod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent CAULIFLOWER = new FoodComponent.Builder()
            .nutrition(9)
            .saturationModifier(0.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 1000), 0.15f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 1), 0.30f)
            .alwaysEdible()
            .build();
}
