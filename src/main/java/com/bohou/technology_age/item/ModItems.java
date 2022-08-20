package com.bohou.technology_age.item;

import com.bohou.technology_age.TechnologyAge;

import net.minecraft.world.item.CreativeModeTab;
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

    public static final RegistryObject<Item> OBSIDIAN_PWDER = ITEMS.register(
        "obsidian_powder",
        () -> new Item(new Item.Properties()
            .tab(CreativeModeTab.TAB_BUILDING_BLOCKS)
        )
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
