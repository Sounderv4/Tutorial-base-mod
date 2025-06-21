package net.sounderv4.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.sounderv4.tutorialmod.Tutorialmod;
import net.sounderv4.tutorialmod.block.ModBlocks;
import net.sounderv4.tutorialmod.item.custom.ChiselItem;

public class ModItems {

    public static final Item CHISEL = registerItem("chisel", new ChiselItem(new Item.Settings().maxDamage(32)));

    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));
    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", new Item(new Item.Settings()));
    public static final Item FROSTGEM = registerItem("frostgem", new Item(new Item.Settings()));
    public static final Item FROSTGEM_SHARDS = registerItem("frostgem_shards", new Item(new Item.Settings()));

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
        });
    }
}
