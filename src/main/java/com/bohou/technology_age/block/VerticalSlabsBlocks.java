package com.bohou.technology_age.block;

import java.util.function.Supplier;

import com.bohou.technology_age.TechnologyAge;
import com.bohou.technology_age.block.custom.StandingHalfBrickBlock;
import com.bohou.technology_age.item.ModItems;
import com.bohou.technology_age.tab.ModCreativeModeTab;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * 向游戏中添加各种竖着的半砖。原版游戏中没有竖半砖。半砖的量太大了，所以单独创建一个类进行注册
 * @author Bohou.Zhang
 */
public class VerticalSlabsBlocks {

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

    // -------------------- 木头材质竖半砖 开始 -------------------- //

    /**
     * 木质竖半砖通用配置
     */
    private static BlockBehaviour.Properties verticalWoodenSlabs = BlockBehaviour.Properties
        .of(Material.WOOD)
        .strength(3.0f)
        .explosionResistance(2.0f)
        .requiresCorrectToolForDrops()
        .noOcclusion();

    /**
     * 竖橡木半砖
     */
    public static final RegistryObject<Block> VERTICAL_OAK_SLAB = VerticalSlabsBlocks.registerBlock(
        "vertical_oak_slab", 
        ModCreativeModeTab.BUILDING_BLOCK_TAB,
        () -> new StandingHalfBrickBlock(verticalWoodenSlabs)
    );

    // -------------------- 木头材质竖半砖 结束 -------------------- //
    
}
