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
    public static final Item FENTANYL = registerItem("fentanyl", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Medical.MOD_ID, name), item);
    }

    public static void registerMedicalItems(){
        Medical.LOGGER.info("Registering Mod Items for " + Medical.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
           entries.add(BANDAGE);
           entries.add(FENTANYL);
        });
    }
}
