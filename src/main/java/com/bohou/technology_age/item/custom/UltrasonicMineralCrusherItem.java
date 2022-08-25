package com.bohou.technology_age.item.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public class UltrasonicMineralCrusherItem extends Item {

    public UltrasonicMineralCrusherItem(Properties properties) {
        super(properties);
    }

    /**
     * 右键使用，如果已经存了方块的信息，摧毁一定区域内所有相同方块
     */
    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if (level.isClientSide) {
            if (hand == InteractionHand.MAIN_HAND) {
                // 获取玩家当前点击的方块的信息
                BlockState currentBlock = player.getBlockStateOn();
                player.sendSystemMessage(Component.literal("主手点击" + currentBlock.getBlock().getName()));
            }
        }
        return super.use(level, player, hand);
    }

    /**
     * 禁止使用这个物品直接破坏方块
     */
    @Override
    public boolean canAttackBlock(BlockState blockState, Level level, BlockPos blockPos, Player player) {
        return false;
    }

}
