package com.bohou.technology_age.tab;

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
            return null;
        }
        
    };

}
