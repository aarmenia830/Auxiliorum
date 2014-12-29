package com.lazerzes.auxi;

import com.lazerzes.auxi.init.ModBlocks;
import com.lazerzes.auxi.init.ModItems;
import com.lazerzes.auxi.reference.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.*;
import cpw.mods.fml.common.event.*;

@Mod(modid = Reference.mod_id, name = Reference.mod_name, guiFactory = Reference.mod_gui_factory)
public class Auxiliorum {

    @Instance(Reference.mod_id)
    public static Auxiliorum instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){

        ModItems.init();
        ModBlocks.init();

    }

    @EventHandler
    public void init(FMLInitializationEvent event){

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }

}
