package net.sounderv4.tutorialmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.sounderv4.tutorialmod.block.ModBlocks;
import net.sounderv4.tutorialmod.item.ModItemGroups;
import net.sounderv4.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tutorialmod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		FuelRegistry.INSTANCE.add(ModItems.STARLIGHT_ASHES, 3000);

		ServerTickEvents.END_SERVER_TICK.register(server -> {
			server.getPlayerManager().getPlayerList().forEach(player -> {
				ItemStack mainHand = player.getMainHandStack();
				Item item = mainHand.getItem();

				boolean isSpeedTool = item == ModItems.SPEED_PICKAXE
						|| item == ModItems.SPEED_SHOVEL
						|| item == ModItems.SPEED_AXE
						|| item == ModItems.SPEED_HOE;

				boolean isLapiteTool = item == ModItems.LAPITE_INFUSED_NETHERITE_SWORD
						|| item == ModItems.LAPITE_INFUSED_NETHERITE_AXE
						|| item == ModItems.LAPITE_INFUSED_NETHERITE_SCYTHE;

				if (isSpeedTool) {
					// Give Haste if not already active
					if (!player.hasStatusEffect(StatusEffects.HASTE)) {
						player.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 20, 2, false, false, false));
					}
				} else {
					// Remove Haste if no longer holding
					if (player.hasStatusEffect(StatusEffects.HASTE)) {
						player.removeStatusEffect(StatusEffects.HASTE);
					}
				}

				if (isLapiteTool) {
					// Give Strength and Regeneration if not already active
					if (!player.hasStatusEffect(StatusEffects.STRENGTH)) {
						player.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 20, 1, false, false, false));
					}
					if (!player.hasStatusEffect(StatusEffects.REGENERATION)) {
						player.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20, 1, false, false, false));
					}
				} else {
					// Remove Strength and Regeneration if no longer holding
					if (player.hasStatusEffect(StatusEffects.STRENGTH)) {
						player.removeStatusEffect(StatusEffects.STRENGTH);
					}
					if (player.hasStatusEffect(StatusEffects.REGENERATION)) {
						player.removeStatusEffect(StatusEffects.REGENERATION);
					}
				}

			});
		});
	}
}
