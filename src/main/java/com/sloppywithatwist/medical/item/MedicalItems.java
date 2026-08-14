package com.sloppywithatwist.medical.item;

import com.sloppywithatwist.medical.Medical;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MedicalItems {

    public static final Item BANDAGE = registerItem("bandage", new Item(new Item.Settings()));
    public static final Item ETHANOL = registerItem("ethanol", new Item(new Item.Settings()));
    public static final Item BLOOD_BAG = registerItem("blood_bag", new Item(new Item.Settings()));
    public static final Item AMMONIA = registerItem("ammonia", new Item(new Item.Settings()));
    public static final Item SULFURIC_ACID = registerItem("sulfuric_acid", new Item(new Item.Settings()));
    public static final Item OPIUM_POPPY = registerItem("opium_poppy", new Item(new Item.Settings()));
    public static final Item WET_OPIUM_POPPY = registerItem("wet_opium_poppy", new Item(new Item.Settings()));
    public static final Item CRUDE_MORPHINE = registerItem("crude_morphine", new Item(new Item.Settings()));
    public static final Item MORPHINE_POWDER = registerItem("morphine_powder", new Item(new Item.Settings()));
    public static final Item FENTANYL = registerItem("fentanyl", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Medical.MOD_ID, name), item);
    }

    public static void registerMedicalItems(){
        Medical.LOGGER.info("Registering Mod Items for " + Medical.MOD_ID);

        /*ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
           entries.add(BANDAGE);
           entries.add(BLOOD_BAG);
           entries.add(FENTANYL);
        });*/
    }
}
