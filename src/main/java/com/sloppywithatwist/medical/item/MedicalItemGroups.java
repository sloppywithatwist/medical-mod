package com.sloppywithatwist.medical.item;

import com.sloppywithatwist.medical.Medical;
import com.sloppywithatwist.medical.block.MedicalBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class MedicalItemGroups {
    public static final ItemGroup MEDICAL_ITEMS = Registry.register(Registries.ITEM_GROUP, Identifier.of(Medical.MOD_ID,
            "medical_items"), FabricItemGroup.builder().icon(() -> new ItemStack(MedicalItems.BANDAGE))
            .displayName(Text.translatable("itemgroup.medical.medical_items"))
            .entries((displayContext, entries) -> {
                entries.add(MedicalItems.BANDAGE);
                entries.add(MedicalItems.ETHANOL);
                entries.add(MedicalItems.BLOOD_BAG);
                entries.add(MedicalItems.AMMONIA);
                entries.add(MedicalItems.SULFURIC_ACID);
                entries.add(MedicalItems.OPIUM_POPPY);
                entries.add(MedicalItems.WET_OPIUM_POPPY);
                entries.add(MedicalItems.CRUDE_MORPHINE);
                entries.add(MedicalItems.MORPHINE_POWDER);
                entries.add(MedicalItems.FENTANYL);

                entries.add(MedicalBlocks.DRIED_BLOOD_BLOCK);
                entries.add(MedicalBlocks.BIOHAZARD_WASTE);
            }).build());

    public static void registerItemGroups(){
        Medical.LOGGER.info("Registering Item Groups for " + Medical.MOD_ID);
    }
}
