package org.broulf.test.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.broulf.test.Main;
import org.broulf.test.blocks.NewTestBlock;

public class ModBlocks {

    //Initializes the Blocks in this class
    public static final Block TEST_BLOCK;

    //Initializes the Block through a new class in org.broulf.test.blocks
    public static final Block NEW_TEST_BLOCK = new NewTestBlock();

    //Block Settings
    static {
        TEST_BLOCK = new Block(FabricBlockSettings
                .of(Material.EGG)
                .breakByTool(FabricToolTags.PICKAXES, 2)
                .requiresTool()
                .strength(5.0f, 30.0f)
                .sounds(BlockSoundGroup.METAL)
                .luminance(2));
    }

    //Registers Blocks
    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "test_block"), TEST_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "new_test_block"), NEW_TEST_BLOCK);
    }
}