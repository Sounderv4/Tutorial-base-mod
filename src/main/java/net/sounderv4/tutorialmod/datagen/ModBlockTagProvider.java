package net.sounderv4.tutorialmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.sounderv4.tutorialmod.block.ModBlocks;
import net.sounderv4.tutorialmod.block.custom.MagicBlock;
import net.sounderv4.tutorialmod.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)//Pick to mine
                .add(ModBlocks.PINK_GARNET_BLOCK)
                .add(ModBlocks.RAW_PINK_GARNET_BLOCK)
                .add(ModBlocks.PINK_GARNET_ORE)
                .add(ModBlocks.PINK_GARNET_DEEPSLATE_ORE)
                .add(ModBlocks.FROSTGEM_BLOCK)
                .add(ModBlocks.FROSTGEM_ORE)
                .add(ModBlocks.IPEAS)
                .add(ModBlocks.COMPRESSED_LAPIS_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)//diamond
                .add(ModBlocks.IPEAS)
                .add(ModBlocks.PINK_GARNET_DEEPSLATE_ORE)
                .add(ModBlocks.COMPRESSED_LAPIS_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)//Iron
                .add(ModBlocks.PINK_GARNET_BLOCK)
                .add(ModBlocks.RAW_PINK_GARNET_BLOCK)
                .add(ModBlocks.PINK_GARNET_ORE)
                .add(ModBlocks.FROSTGEM_BLOCK)
                .add(ModBlocks.FROSTGEM_ORE);
        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL) //stone
                .add(ModBlocks.MAGIC_BLOCK);


        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)//Hoe to mine
                .add(ModBlocks.MAGIC_BLOCK);

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_PINK_GARNET_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);
        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_SPEED_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.IPEAS);
        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_LAPITE_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);
    }
}
