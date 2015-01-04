package com.lazerzes.auxi.block;

import com.lazerzes.auxi.creativetab.CreativeTabAuxi;
import com.lazerzes.auxi.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockAuxi extends Block{

    public BlockAuxi(Material material){

        super(material);
        this.setCreativeTab(CreativeTabAuxi.AUXI_TAB);

    }

    public BlockAuxi(){

        this(Material.rock);

    }

    @Override
    public String getUnlocalizedName(){

        return String.format("tile.%s%s", Reference.mod_id.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));

    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister){

        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));

    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName){

        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);

    }

}
