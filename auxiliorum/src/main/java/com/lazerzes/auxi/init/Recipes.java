package com.lazerzes.auxi.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes {

    //Vanilla
    public static final ItemStack redstoneStack = new ItemStack(Items.redstone);
    public static final ItemStack enderEyeStack = new ItemStack(Items.ender_eye);
    public static final ItemStack diamondStack = new ItemStack(Items.diamond);

    public static final ItemStack obsidianStack = new ItemStack(Blocks.obsidian);

    //Mod
    public static final ItemStack eEnderEyeStack = new ItemStack(ModItems.energizedEnderEye);
    public static final ItemStack eEnderDiamondStack = new ItemStack(ModItems.energizedEnderDiamond);

    public static final ItemStack enderInfuserStack = new ItemStack(ModBlocks.enderInfuser);

    public static void init(){

        //Items
       GameRegistry.addRecipe(eEnderEyeStack, " r ", "rer", " r ", 'r', redstoneStack, 'e', enderEyeStack);
       GameRegistry.addShapelessRecipe(eEnderDiamondStack, diamondStack, eEnderEyeStack);

        //Blocks
        GameRegistry.addRecipe(enderInfuserStack, "   ", "oeo", "ooo", 'o', obsidianStack, 'e', eEnderDiamondStack);

    }

}
