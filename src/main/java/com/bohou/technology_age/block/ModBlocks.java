package com.bohou.technology_age.block;

import java.util.function.Supplier;

import com.bohou.technology_age.TechnologyAge;
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
 * 科技时代模组 方块
 * @author Bohou.Zhang
 */
public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
        DeferredRegister.create(ForgeRegistries.BLOCKS, TechnologyAge.MOD_ID);

    public static final RegistryObject<Block> EXPLOSION_PROOF_CONCRETE = registerBlock(
        "explosion_proof_concrete",
        ModCreativeModeTab.BUILDING_BLOCK_TAB,
        () -> new Block(
            BlockBehaviour.Properties.of(Material.STONE)
                .strength(0.5f)
                .explosionResistance(18000000.0f)
                .requiresCorrectToolForDrops()
        )
    );

    private static <T extends Block> RegistryObject<T> registerBlock(String name,CreativeModeTab tab, Supplier<T> block ) {
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
