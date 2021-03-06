package com.brand.adabraniummod.blocks;

import com.brand.adabraniummod.AdabraniumMod;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class VibraniumBlock extends Block {
	
public VibraniumBlock(String name, float hardness, float resistance) {
	super(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 3).strength(hardness, resistance).build());
	Registry.register(Registry.BLOCK, new Identifier(AdabraniumMod.MOD_ID, name), this);
	Registry.register(Registry.ITEM,new Identifier(AdabraniumMod.MOD_ID, name), new BlockItem(this, new Item.Settings().maxCount(64).group(AdabraniumMod.ADABRANIUM_GROUP)));

    }
}
