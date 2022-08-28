package com.bohou.technology_age.block;

import java.util.function.Supplier;

import com.bohou.technology_age.TechnologyAge;
import com.bohou.technology_age.block.custom.CarbyneArmorBlock;
import com.bohou.technology_age.enums.ExplosionProofConcreteEnum;
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

    // -------------------- 防爆混凝土 开始 -------------------- //

    /**
     * 防爆混凝土通用配置
     */
    private static BlockBehaviour.Properties explosionProofConcreteProperty = BlockBehaviour.Properties
        .of(Material.STONE)
        .strength(0.5f)
        .explosionResistance(18000000.0f)
        .requiresCorrectToolForDrops();

    /**
     * 白色防爆混凝土
     */
    public static final RegistryObject<Block> EXPLOSION_PROOF_CONCRETE_WHITE = ModBlocks.registerBlock(
        ExplosionProofConcreteEnum.EXPLOSION_PROOF_CONCRETE_WHITE.getName(),
        ModCreativeModeTab.BUILDING_BLOCK_TAB,
        () -> new Block(explosionProofConcreteProperty)
    );

    /**
     * 橙色防爆混凝土
     */
    public static final RegistryObject<Block> EXPLOSION_PROOF_CONCRETE_ORANGE = ModBlocks.registerBlock(
        ExplosionProofConcreteEnum.EXPLOSION_PROOF_CONCRETE_ORANGE.getName(),
        ModCreativeModeTab.BUILDING_BLOCK_TAB,
        () -> new Block(explosionProofConcreteProperty)
    );

    /**
     * 品红色防爆混凝土
     */
    public static final RegistryObject<Block> EXPLOSION_PROOF_CONCRETE_MAGENTA = ModBlocks.registerBlock(
        ExplosionProofConcreteEnum.EXPLOSION_PROOF_CONCRETE_MAGENTA.getName(), 
        ModCreativeModeTab.BUILDING_BLOCK_TAB, 
        () -> new Block(explosionProofConcreteProperty)
    );

    /**
     * 淡蓝色防爆混凝土
     */
    public static final RegistryObject<Block> EXPLOSION_PROOF_CONCRETE_LIGHT_BLUE = ModBlocks.registerBlock(
        ExplosionProofConcreteEnum.EXPLOSION_PROOF_CONCRETE_LIGHT_BLUE.getName(),
        ModCreativeModeTab.BUILDING_BLOCK_TAB,
        () -> new Block(explosionProofConcreteProperty)
    );

    /**
     * 黄色防爆混凝土
     */
    public static final RegistryObject<Block> EXPLOSION_PROOF_CONCRETE_YELLOW = ModBlocks.registerBlock(
        ExplosionProofConcreteEnum.EXPLOSION_PROOF_CONCRETE_YELLOW.getName(),
        ModCreativeModeTab.BUILDING_BLOCK_TAB,
        () -> new Block(explosionProofConcreteProperty)
    );

    /**
     * 黄绿色防爆混凝土
     */
    public static final RegistryObject<Block> EXPLOSION_PROOF_CONCRETE_LIME = ModBlocks.registerBlock(
        ExplosionProofConcreteEnum.EXPLOSION_PROOF_CONCRETE_LIME.getName(),
        ModCreativeModeTab.BUILDING_BLOCK_TAB,
        () -> new Block(explosionProofConcreteProperty)
    );

    /**
     * 粉红色防爆混凝土
     */
    public static final RegistryObject<Block> EXPLOSION_PROOF_CONCRETE_PINK = ModBlocks.registerBlock(
        ExplosionProofConcreteEnum.EXPLOSION_PROOF_CONCRETE_PINK.getName(),
        ModCreativeModeTab.BUILDING_BLOCK_TAB,
        () -> new Block(explosionProofConcreteProperty)
    );

    /**
     * 灰色防爆混凝土
     */
    public static final RegistryObject<Block> EXPLOSION_PROOF_CONCRETE_GRAY = ModBlocks.registerBlock(
        ExplosionProofConcreteEnum.EXPLOSION_PROOF_CONCRETE_GRAY.getName(),
        ModCreativeModeTab.BUILDING_BLOCK_TAB,
        () -> new Block(explosionProofConcreteProperty)
    );

    /**
     * 淡灰色防爆混凝土
     */
    public static final RegistryObject<Block> EXPLOSION_PROOF_CONCRETE_LIGHT_GRAY = ModBlocks.registerBlock(
        ExplosionProofConcreteEnum.EXPLOSION_PROOF_CONCRETE_LIGHT_GRAY.getName(),
        ModCreativeModeTab.BUILDING_BLOCK_TAB,
        () -> new Block(explosionProofConcreteProperty)
    );

    /**
     * 青色防爆混凝土
     */
    public static final RegistryObject<Block> EXPLOSION_PROOF_CONCRETE_CYAN = ModBlocks.registerBlock(
        ExplosionProofConcreteEnum.EXPLOSION_PROOF_CONCRETE_CYAN.getName(),
        ModCreativeModeTab.BUILDING_BLOCK_TAB,
        () -> new Block(explosionProofConcreteProperty)
    );

    /**
     * 紫色防爆混凝土
     */
    public static final RegistryObject<Block> EXPLOSION_PROOF_CONCRETE_PURPLE = ModBlocks.registerBlock(
        ExplosionProofConcreteEnum.EXPLOSION_PROOF_CONCRETE_PURPLE.getName(),
        ModCreativeModeTab.BUILDING_BLOCK_TAB,
        () -> new Block(explosionProofConcreteProperty)
    );

    /**
     * 蓝色防爆混凝土
     */
    public static final RegistryObject<Block> EXPLOSION_PROOF_CONCRETE_BLUE = ModBlocks.registerBlock(
        ExplosionProofConcreteEnum.EXPLOSION_PROOF_CONCRETE_BLUE.getName(),
        ModCreativeModeTab.BUILDING_BLOCK_TAB,
        () -> new Block(explosionProofConcreteProperty)
    );

    /**
     * 棕色防爆混凝土
     */
    public static final RegistryObject<Block> EXPLOSION_PROOF_CONCRETE_BROWN = ModBlocks.registerBlock(
        ExplosionProofConcreteEnum.EXPLOSION_PROOF_CONCRETE_BROWN.getName(),
        ModCreativeModeTab.BUILDING_BLOCK_TAB,
        () -> new Block(explosionProofConcreteProperty)
    );

    /**
     * 绿色防爆混凝土
     */
    public static final RegistryObject<Block> EXPLOSION_PROOF_CONCRETE_GREEN = ModBlocks.registerBlock(
        ExplosionProofConcreteEnum.EXPLOSION_PROOF_CONCRETE_GREEN.getName(),
        ModCreativeModeTab.BUILDING_BLOCK_TAB,
        () -> new Block(explosionProofConcreteProperty)
    );

    /**
     * 红色防爆混凝土
     */
    public static final RegistryObject<Block> EXPLOSION_PROOF_CONCRETE_RED = ModBlocks.registerBlock(
        ExplosionProofConcreteEnum.EXPLOSION_PROOF_CONCRETE_RED.getName(),
        ModCreativeModeTab.BUILDING_BLOCK_TAB,
        () -> new Block(explosionProofConcreteProperty)
    );

    /**
     * 黑色防爆混凝土
     */
    public static final RegistryObject<Block> EXPLOSION_PROOF_CONCRETE_BLACK = ModBlocks.registerBlock(
        ExplosionProofConcreteEnum.EXPLOSION_PROOF_CONCRETE_BLACK.getName(),
        ModCreativeModeTab.BUILDING_BLOCK_TAB,
        () -> new Block(explosionProofConcreteProperty)
    );

    // -------------------- 防爆混凝土 结束 -------------------- //

    public static final RegistryObject<Block> CARBYNE_ARMOR = ModBlocks.registerBlock(
        "carbyne_armor", 
        ModCreativeModeTab.BUILDING_BLOCK_TAB, 
        () -> new CarbyneArmorBlock(BlockBehaviour.Properties
            .of(Material.STONE)
            .strength(100.0f)
            .explosionResistance(18000000.0f)
            .requiresCorrectToolForDrops()
            .noOcclusion()
            .noCollission()
        )
    );

}
