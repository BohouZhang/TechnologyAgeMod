package com.bohou.technology_age.block;

import java.util.function.Supplier;

import com.bohou.technology_age.TechnologyAge;
import com.bohou.technology_age.item.ModItems;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * 向游戏中添加各种竖着的半砖。原版游戏中没有竖半砖。半砖的量太大了，所以单独创建一个类进行注册
 * @author Bohou.Zhang
 */
public class StandingHalfBrickBlocks {

    public static final DeferredRegister<Block> BLOCKS =
        DeferredRegister.create(ForgeRegistries.BLOCKS, TechnologyAge.MOD_ID);

    protected static <T extends Block> RegistryObject<T> registerBlock(String name,CreativeModeTab tab, Supplier<T> block ) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
    
}
