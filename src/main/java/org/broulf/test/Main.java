package org.broulf.test;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.broulf.test.registry.ModBlocks;
import org.broulf.test.registry.ModItems;

public class Main implements ModInitializer {

    //ModId
    public static final String MOD_ID = "brofabtest";

    //Creative Tabs
    public static final ItemGroup TEST_GROUP;
    public static final ItemGroup NEW_TEST_GROUP;

    //Creative Tab Settings
    static {
        //Base Creative Tab
        TEST_GROUP = FabricItemGroupBuilder.build(
                new Identifier(MOD_ID, "test_group"),
                () -> new ItemStack(ModItems.TEST_ITEM)
        );

        //Creative Tab with custom load order
        NEW_TEST_GROUP = FabricItemGroupBuilder.create(
                new Identifier(MOD_ID, "new_test_group"))
                .icon(() -> new ItemStack(ModBlocks.TEST_BLOCK))
                //The load order for the items in the Creative Tab
                .appendItems(stacks -> {
                    stacks.add(new ItemStack(ModBlocks.TEST_BLOCK));
                    stacks.add(new ItemStack(ModItems.TEST_ITEM));
                    stacks.add(new ItemStack(ModItems.NEW_TEST_ITEM));
                    stacks.add(new ItemStack(ModItems.NEW_TEST_BLOCK));
                })
                .build();
    }

    //Initializes the Register Items/Blocks classes
    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
    }
}