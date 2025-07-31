package net.sounderv4.tutorialmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.sounderv4.tutorialmod.item.ModItems;
import net.sounderv4.tutorialmod.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Items.TRANSFORMABLE_ITEMS)
                .add(ModItems.PINK_GARNET)
                .add(ModItems.RAW_PINK_GARNET)
                .add(Items.COAL);

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.LAPITE_INFUSED_NETHERITE_SWORD)
                .add(ModItems.LAPITE_INFUSED_NETHERITE_SCYTHE)
                .add(ModItems.PINK_GARNET_SWORD)
                .add(ModItems.SPEED_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.LAPITE_INFUSED_NETHERITE_PICKAXE)
                .add(ModItems.PINK_GARNET_PICKAXE)
                .add(ModItems.SPEED_PICKAXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.LAPITE_INFUSED_NETHERITE_SHOVEL)
                .add(ModItems.PINK_GARNET_SHOVEL)
                .add(ModItems.SPEED_SHOVEL);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.LAPITE_INFUSED_NETHERITE_AXE)
                .add(ModItems.PINK_GARNET_AXE)
                .add(ModItems.SPEED_AXE);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.LAPITE_INFUSED_NETHERITE_SCYTHE)
                .add(ModItems.PINK_GARNET_HOE)
                .add(ModItems.SPEED_HOE);

    }
}
