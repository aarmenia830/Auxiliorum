package com.lazerzes.auxi.creativetab;

import com.lazerzes.auxi.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CreativeTabAuxi {

    public static final CreativeTabs AUXI_TAB = new CreativeTabs(Reference.mod_id.toLowerCase()) {
        @Override
        public Item getTabIconItem() {
            return Items.ender_eye;
        }
    };

}
