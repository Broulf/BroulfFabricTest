package org.broulf.test.registry;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.broulf.test.Main;
import org.broulf.test.items.NewTestItem;

public class ModItems {

    //Initializes the Items in this class
    public static final Item TEST_ITEM;
    public static final Item NEW_ITEM;

    //Initializes Items through a new class in org.broulf.test.items
    public static final Item NEW_TEST_ITEM = new NewTestItem();

    //Initializes the Block Items
    public static final BlockItem TEST_BLOCK;
    public static final BlockItem NEW_TEST_BLOCK;

    //Item Settings
    static {
        //Items
        TEST_ITEM = new Item(new Item.Settings()
                .group(Main.TEST_GROUP)
                .maxCount(64));
        NEW_ITEM = new Item(new Item.Settings()
                .group(Main.TEST_GROUP)
                .maxCount(64));
        //Block Items
        TEST_BLOCK = new BlockItem(ModBlocks.TEST_BLOCK, new Item.Settings()
                .group(Main.TEST_GROUP));
        NEW_TEST_BLOCK = new BlockItem(ModBlocks.NEW_TEST_BLOCK, new Item.Settings()
                .group(Main.TEST_GROUP));
    }

    //Registers Items
    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "test_item"), TEST_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "new_item"), NEW_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "test_block"), TEST_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "new_test_item"), NEW_TEST_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "new_test_block"), NEW_TEST_BLOCK);
    }
}