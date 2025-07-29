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
    public static final Item STARLIGHT_ASHES = registerItem("starlight_ashes", new Item(new Item.Settings()));
    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));
    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", new Item(new Item.Settings()));
    public static final Item FROSTGEM = registerItem("frostgem", new Item(new Item.Settings()){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.tutorialmod.frostgem.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item FROSTGEM_SHARDS = registerItem("frostgem_shards", new Item(new Item.Settings()));

    public static Item PINK_GARNET_SWORD = registerItem("pink_garnet_sword",
            new SwordItem(ModToolMaterials.PINK_GARNET, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.PINK_GARNET, 2, -2.4f))));
    public static Item PINK_GARNET_PICKAXE = registerItem("pink_garnet_pickaxe",
            new PickaxeItem(ModToolMaterials.PINK_GARNET, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.PINK_GARNET, -1, -2.8f))));
    public static Item PINK_GARNET_SHOVEL = registerItem("pink_garnet_shovel",
            new ShovelItem(ModToolMaterials.PINK_GARNET, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.PINK_GARNET, -.5f, -3))));
    public static Item PINK_GARNET_AXE = registerItem("pink_garnet_axe",
            new AxeItem(ModToolMaterials.PINK_GARNET, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.PINK_GARNET, 4, -3))));
    public static Item PINK_GARNET_HOE = registerItem("pink_garnet_hoe",
            new HoeItem(ModToolMaterials.PINK_GARNET, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.PINK_GARNET, -4, 0))));

    public static Item SPEED_SWORD = registerItem("speed_sword",
            new SwordItem(ToolMaterials.IRON, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.PINK_GARNET, 1, -1.8f))));
    public static Item SPEED_PICKAXE = registerItem("speed_pickaxe",
            new PickaxeItem(ToolMaterials.IRON, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.PINK_GARNET, -1, -2.8f))));
    public static Item SPEED_SHOVEL = registerItem("speed_shovel",
            new ShovelItem(ToolMaterials.IRON, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.PINK_GARNET, -.5f, -2.5f))));
    public static Item SPEED_AXE = registerItem("speed_axe",
            new AxeItem(ToolMaterials.IRON, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.PINK_GARNET, 3, -2.5f))));
    public static Item SPEED_HOE = registerItem("speed_hoe",
            new HoeItem(ToolMaterials.IRON, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.PINK_GARNET, -4, 0))));



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
