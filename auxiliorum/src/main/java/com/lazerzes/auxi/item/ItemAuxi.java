package com.lazerzes.auxi.item;

import com.lazerzes.auxi.creativetab.CreativeTabAuxi;
import com.lazerzes.auxi.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemAuxi extends Item{

    public ItemAuxi(){

        super();
        this.setCreativeTab(CreativeTabAuxi.AUXI_TAB);

    }

    @Override
    public String getUnlocalizedName(){

        return String.format("item.%s%s", Reference.mod_id.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));

    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack){

        return String.format("item.%s%s", Reference.mod_id.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));

    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister){

        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));

    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName){

        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);

    }

}
