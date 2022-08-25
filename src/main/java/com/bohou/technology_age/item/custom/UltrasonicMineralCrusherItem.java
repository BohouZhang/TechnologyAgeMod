package com.bohou.technology_age.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class UltrasonicMineralCrusherItem extends Item {

    public UltrasonicMineralCrusherItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {

        if (!level.isClientSide() && hand == InteractionHand.MAIN_HAND) {
            player.sendSystemMessage(Component.literal(String.valueOf(doSomething())));
        }

        return super.use(level, player, hand);
    }

    private int doSomething() {
        return RandomSource.createNewThreadLocalInstance().nextInt();
    }
    
}
