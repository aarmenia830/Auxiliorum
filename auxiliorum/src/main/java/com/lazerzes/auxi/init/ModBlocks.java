package com.lazerzes.auxi.init;

import com.lazerzes.auxi.block.BlockAuxi;
import com.lazerzes.auxi.block.BlockEnderInfuser;
import com.lazerzes.auxi.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {


    public static final BlockAuxi enderInfuser = new BlockEnderInfuser();

    public static void init(){

        GameRegistry.registerBlock(enderInfuser, Names.Blocks.enderInfuser);

    }

}