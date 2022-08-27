package com.bohou.technology_age.item.custom;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.BlockState;

public class UltrasonicMineralCrusherItem extends Item {

    private final int DESTROY_DISTANCE = 5;

    public UltrasonicMineralCrusherItem(Properties properties) {
        super(properties);
    }

    /**
     * 使用超声波碎矿仪摧毁方块时，一并摧毁该方块周围5格内的相同方块
     */
    @Override
    public boolean onBlockStartBreak(ItemStack itemstack, BlockPos pos, Player player) {
        if (!player.level.isClientSide()) {
            List<BlockPos> blockToBeDestroy = getAroundBlockPos(pos, player);
            blockToBeDestroy.forEach(blockPos -> {
                player.level.destroyBlock(blockPos, true);
            });
        }
        return super.onBlockStartBreak(itemstack, pos, player);
    }

    /**
     * 根据一个方块的位置，获取它周围5格子内相同方块的坐标
     * @param blockPos 方块的位置信息
     * @param player 玩家信息
     * @return
     */
    private List<BlockPos> getAroundBlockPos(BlockPos blockPos, Player player) {
        List<BlockPos> blockPosList = new ArrayList<>();
        // 获取当前方块的信息
        BlockState currentBlock = player.level.getBlockState(blockPos);
        String currentBlockType = currentBlock.toString();
        // 获取当前方块的坐标
        int x = blockPos.getX();
        int y = blockPos.getY();
        int z = blockPos.getZ();
        // 遍历范围内所有方块，如果类型跟该方块一样，就加到blockPosList中
        for (int i = x - DESTROY_DISTANCE; i <= x + DESTROY_DISTANCE; i++) {
            for (int j = y - DESTROY_DISTANCE; j <= y + DESTROY_DISTANCE; j++) {
                for (int k = z - DESTROY_DISTANCE; k <= z + DESTROY_DISTANCE; k++) {
                    BlockPos tempBLockPos = new BlockPos(i, j, k);
                    BlockState tempBlockState = player.level.getBlockState(tempBLockPos);
                    if (currentBlockType.equals(tempBlockState.toString())) {
                        blockPosList.add(tempBLockPos);
                    }
                }
            }
        }
        return blockPosList;
    }

}
