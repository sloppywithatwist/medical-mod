package com.sloppywithatwist.medical.block;

import com.sloppywithatwist.medical.Medical;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class MedicalBlocks {
    public static final Block DRIED_BLOOD_BLOCK = registerBlock("dried_blood_block", new Block(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.STONE)));
    public static final Block BIOHAZARD_WASTE = registerBlock("biohazard_waste", new Block(AbstractBlock.Settings.create().strength(1f).sounds(BlockSoundGroup.BASALT)));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Medical.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(Medical.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }

    public static void registerMedicalBlocks() {
        Medical.LOGGER.info("Registering Mod Blocks for " + Medical.MOD_ID);

        /*ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(MedicalBlocks.DRIED_BLOOD_BLOCK);
            entries.add(MedicalBlocks.BIOHAZARD_WASTE);
        });*/
    }
}
