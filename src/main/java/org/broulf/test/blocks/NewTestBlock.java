package org.broulf.test.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class NewTestBlock extends Block {

    public NewTestBlock() {
        super(FabricBlockSettings
                .of(Material.EGG)
                .breakByTool(FabricToolTags.PICKAXES, 2)
                .requiresTool()
                .strength(5.0f, 30.0f)
                .sounds(BlockSoundGroup.METAL)
                .luminance(2));
    }
}