package com.brand.adabraniummod.stuff;

import com.brand.adabraniummod.AdabraniumMod;
import com.brand.adabraniummod.stuff.adamantium.MaterialAdamantiumArmor;
import com.brand.adabraniummod.stuff.adamantium.MaterialAdamantiumTool;
import com.brand.adabraniummod.stuff.oneshotium.MaterialOneshotiumTool;
import com.brand.adabraniummod.stuff.vibranium.MaterialVibraniumArmor;
import com.brand.adabraniummod.stuff.vibranium.MaterialVibraniumTool;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class FullStuffs {

		public static final MaterialVibraniumArmor materialVibraniumArmor = new MaterialVibraniumArmor();
		public static final MaterialVibraniumTool materialVibraniumTool = new MaterialVibraniumTool();		
		public static final MaterialAdamantiumArmor materialAdamantiumArmor = new MaterialAdamantiumArmor();
		public static final MaterialAdamantiumTool materialAdamantiumTool = new MaterialAdamantiumTool();
		public static final MaterialOneshotiumTool materialOneshotiumTool = new MaterialOneshotiumTool();	
		
		public static Item register(String name, Item item) {
		    return Registry.register(Registry.ITEM, new Identifier(AdabraniumMod.MOD_ID, name), item);
		}
	}

   