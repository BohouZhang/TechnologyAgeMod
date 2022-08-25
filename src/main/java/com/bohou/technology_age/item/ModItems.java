package com.bohou.technology_age.item;

import com.bohou.technology_age.TechnologyAge;
import com.bohou.technology_age.item.custom.UltrasonicMineralCrusherItem;
import com.bohou.technology_age.tab.ModCreativeModeTab;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * 科技时代Mod  物品
 * @author Bohou.Zhang
 */
public class ModItems {
    
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, TechnologyAge.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    /**
     * 黑曜石粉末
     */
    public static final RegistryObject<Item> OBSIDIAN_PWDER = ITEMS.register(
        "obsidian_powder",
        () -> new Item(new Item.Properties()
            .tab(ModCreativeModeTab.BUILDING_BLOCK_TAB)
        )
    );

    public static final RegistryObject<Item> ULTRASONIC_MINERAL_CRUSHER = ITEMS.register(
        "ultrasonic_mineral_crusher", 
        () -> new UltrasonicMineralCrusherItem(new Item.Properties()
            .tab(ModCreativeModeTab.TECHNOLOGY_AGE_TOOLS_TAB)
        )
    );

}
