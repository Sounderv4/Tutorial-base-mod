package net.sounderv4.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.sounderv4.tutorialmod.Tutorialmod;
import net.sounderv4.tutorialmod.block.ModBlocks;
import net.sounderv4.tutorialmod.item.custom.ChiselItem;

import java.util.List;

public class ModItems {

    public static final Item CHISEL = registerItem("chisel", new ChiselItem(new Item.Settings().maxDamage(32)));
    public static final Item CAULIFLOWER = registerItem("cauliflower", new Item(new Item.Settings().food(ModFoodComponents.CAULIFLOWER)){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.tutorialmod.cauliflower.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item COMPRESSED_LAPIS_BLOCK_ITEM = registerItem("compressed_lapis_block",
            new BlockItem(ModBlocks.COMPRESSED_LAPIS_BLOCK, new Item.Settings()) {
                @Override
                public boolean hasGlint(ItemStack stack) {
                    return true;
                }
            });

    public static final Item STARLIGHT_ASHES = registerItem("starlight_ashes", new Item(new Item.Settings()));
    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));
    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", new Item(new Item.Settings()));
    public static final Item FROSTGEM_SHARDS = registerItem("frostgem_shards", new Item(new Item.Settings()));
    public static final Item LAPITE = registerItem("lapite", new Item(new Item.Settings()) {
        @Override
        public boolean hasGlint(ItemStack stack) {
            return true;
        }
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.tutorialmod.lapite.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item FROSTGEM = registerItem("frostgem", new Item(new Item.Settings()){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.tutorialmod.frostgem.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item PINK_GARNET_SWORD = registerItem("pink_garnet_sword",
            new SwordItem(ModToolMaterials.PINK_GARNET, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.PINK_GARNET, 2, -2.4f))));
    public static final Item PINK_GARNET_PICKAXE = registerItem("pink_garnet_pickaxe",
            new PickaxeItem(ModToolMaterials.PINK_GARNET, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.PINK_GARNET, -1, -2.8f))));
    public static final Item PINK_GARNET_SHOVEL = registerItem("pink_garnet_shovel",
            new ShovelItem(ModToolMaterials.PINK_GARNET, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.PINK_GARNET, -.5f, -3))));
    public static final Item PINK_GARNET_AXE = registerItem("pink_garnet_axe",
            new AxeItem(ModToolMaterials.PINK_GARNET, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.PINK_GARNET, 4, -3))));
    public static final Item PINK_GARNET_HOE = registerItem("pink_garnet_hoe",
            new HoeItem(ModToolMaterials.PINK_GARNET, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.PINK_GARNET, -4, 0))));

    public static final Item SPEED_SWORD = registerItem("speed_sword",
            new SwordItem(ToolMaterials.IRON, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.IRON, 3, -1.8f))));
    public static final Item SPEED_PICKAXE = registerItem("speed_pickaxe",
            new PickaxeItem(ToolMaterials.IRON, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.IRON, 1, -2.8f))));
    public static final Item SPEED_SHOVEL = registerItem("speed_shovel",
            new ShovelItem(ToolMaterials.IRON, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ToolMaterials.IRON, 1.5f, -2.5f))));
    public static final Item SPEED_AXE = registerItem("speed_axe",
            new AxeItem(ToolMaterials.IRON, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ToolMaterials.IRON, 4, -2.8f))));
    public static final Item SPEED_HOE = registerItem("speed_hoe",
            new HoeItem(ToolMaterials.IRON, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ToolMaterials.IRON, -2, 0))));

    public static final Item LAPITE_INFUSED_NETHERITE_SWORD = registerItem("lapite_infused_netherite_sword",
            new SwordItem(ModToolMaterials.LAPITE, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.LAPITE, 4, -2f))));
    public static final Item LAPITE_INFUSED_NETHERITE_PICKAXE = registerItem("lapite_infused_netherite_pickaxe",
            new PickaxeItem(ModToolMaterials.LAPITE, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.LAPITE, 2, -2.4f))));
    public static final Item LAPITE_INFUSED_NETHERITE_SHOVEL = registerItem("lapite_infused_netherite_shovel",
            new ShovelItem(ModToolMaterials.LAPITE, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.LAPITE, 2, -2.4f))));
    public static final Item LAPITE_INFUSED_NETHERITE_AXE = registerItem("lapite_infused_netherite_axe",
            new AxeItem(ModToolMaterials.LAPITE, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.LAPITE, 5, -2.9f))));
    public static final Item LAPITE_INFUSED_NETHERITE_SCYTHE = registerItem("lapite_infused_netherite_scythe",
            new HoeItem(ModToolMaterials.LAPITE, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.LAPITE, 4, -2f))));





    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Tutorialmod.MOD_ID, name), item);
    }


    public static void registerModItems(){

        Tutorialmod.LOGGER.info("Registering Mod Items for " + Tutorialmod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries ->{
            entries.add(PINK_GARNET);
            entries.add(RAW_PINK_GARNET);
            entries.add(FROSTGEM);
            entries.add(FROSTGEM_SHARDS);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries ->{
            entries.add(ModBlocks.PINK_GARNET_BLOCK);
            entries.add(ModBlocks.PINK_GARNET_ORE);
            entries.add(ModBlocks.PINK_GARNET_DEEPSLATE_ORE);
            entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
            entries.add(ModBlocks.FROSTGEM_ORE);
            entries.add(ModBlocks.FROSTGEM_BLOCK);
            entries.add(ModBlocks.IPEAS);
            entries.add(ModBlocks.MAGIC_BLOCK);

        });
    }
}
