package org.broulf.test.items;

import net.minecraft.item.Item;
import org.broulf.test.Main;

public class NewNewItem extends Item {

    public NewNewItem() {
        super(new Settings()
                .group(Main.TEST_GROUP)
                .maxCount(64)
                .fireproof());
    }
}
