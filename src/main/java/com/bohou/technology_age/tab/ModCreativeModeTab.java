package com.bohou.technology_age.tab;

import com.bohou.technology_age.item.ModItems;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

/**
 * 科技时代模组创造模式物品页签
 * @author Bohou.Zhang
 */
public class ModCreativeModeTab {
    
    public static final CreativeModeTab BUILDING_BLOCK_TAB = new CreativeModeTab("buildingtab") {

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.OBSIDIAN_PWDER.get());
        }
        
    };

    public static final CreativeModeTab TECHNOLOGY_AGE_TOOLS_TAB = new CreativeModeTab("technology_age_tools_tab") {

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ULTRASONIC_MINERAL_CRUSHER.get());
        }
        
    };

}
