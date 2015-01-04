package com.lazerzes.auxi.init;

import com.lazerzes.auxi.item.ItemAuxi;
import com.lazerzes.auxi.item.ItemEnergizedEnderDiamond;
import com.lazerzes.auxi.item.ItemEnergizedEnderEye;
import com.lazerzes.auxi.reference.Names;
import com.lazerzes.auxi.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.mod_id)
public class ModItems {

    public static final ItemAuxi energizedEnderEye = new ItemEnergizedEnderEye();
    public static final ItemAuxi energizedEnderDiamond = new ItemEnergizedEnderDiamond();

    public static void init(){

        GameRegistry.registerItem(energizedEnderEye, Names.Items.e_enderEye);
        GameRegistry.registerItem(energizedEnderDiamond, Names.Items.e_enderDiamond);

    }

}
