package com.shindur.stoneplus.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import com.shindur.stoneplus.StonePlusMain;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
/**
 * Created by Shindur on 1/30/2017.
 */
public class CobbleBlocks {
    public static Block RedCobblestone;
    public static Block BlueCobblestone;
    public static Block WhiteCobblestone;
    public static Block LGrayCobblestone;
    public static Block GrayCobblestone;
    public static Block OrangeCobblestone;
    public static Block YellowCobblestone;
    public static Block LimeCobblestone;
    public static Block LBlueCobblestone;
    public static Block CyanCobblestone;
    public static Block PurpleCobblestone;
    public static Block MagentaCobblestone;
    public static Block PinkCobblestone;
    public static Block BrownCobblestone;
    public static Block BlackCobblestone;
    public static Block GreenCobblestone;

    public static void preInit()
    {
        RedCobblestone = new CobbleSettings(Material.ROCK, "Red Cobblestone");
        BlueCobblestone = new CobbleSettings(Material.ROCK, "Blue Cobblestone");
        WhiteCobblestone  = new CobbleSettings(Material.ROCK, "White Cobblestone");
        LGrayCobblestone  = new CobbleSettings(Material.ROCK, "Light Gray Cobblestone");
        GrayCobblestone = new CobbleSettings(Material.ROCK, "Gray Cobblestone");
        OrangeCobblestone = new CobbleSettings(Material.ROCK, "Orange Cobblestone");
        YellowCobblestone = new CobbleSettings(Material.ROCK, "Yellow Cobblestone");
        LimeCobblestone = new CobbleSettings(Material.ROCK, "Lime Cobblestone");
        LBlueCobblestone = new CobbleSettings(Material.ROCK, "Light Blue Cobblestone");
        CyanCobblestone = new CobbleSettings(Material.ROCK, "Cyan Cobblestone");
        PurpleCobblestone = new CobbleSettings(Material.ROCK, "Purple Cobblestone");
        MagentaCobblestone = new CobbleSettings(Material.ROCK, "Magenta Cobblestone");
        PinkCobblestone = new CobbleSettings(Material.ROCK, "Pink Cobblestone");
        BrownCobblestone = new CobbleSettings(Material.ROCK, "Brown Cobblestone");
        BlackCobblestone = new CobbleSettings(Material.ROCK, "Black Cobblestone");
        GreenCobblestone = new CobbleSettings(Material.ROCK, "Green Cobblestone");

        registerBlocks();
    }
    public static void registerBlocks()
    {
        registerBlock(RedCobblestone, "Red Cobblestone");
        registerBlock(BlueCobblestone, "Blue Cobblestone");
        registerBlock(WhiteCobblestone, "White Cobblestone");
        registerBlock(LGrayCobblestone, "Light Gray Cobblestone");
        registerBlock(GrayCobblestone, "Gray Cobblestone");
        registerBlock(OrangeCobblestone, "Orange Cobblestone");
        registerBlock(YellowCobblestone, "Yellow Cobblestone");
        registerBlock(LimeCobblestone, "Lime Cobblestone");
        registerBlock(LBlueCobblestone, "Light Blue Cobblestone");
        registerBlock(CyanCobblestone, "Cyan Cobblestone");
        registerBlock(PurpleCobblestone, "Purple Cobblestone");
        registerBlock(MagentaCobblestone, "Magenta Cobblestone");
        registerBlock(PinkCobblestone, "Pink Cobblestone");
        registerBlock(BrownCobblestone, "Brown Cobblestone");
        registerBlock(BlackCobblestone, "Black Cobblestone");
        registerBlock(GreenCobblestone, "Green Cobblestone");
    }

    public static void registerBlock(Block block, String name)
    {
        GameRegistry.register(block, new ResourceLocation(StonePlusMain.MODID, name));
        GameRegistry.register(new ItemBlock(block), new ResourceLocation(StonePlusMain.MODID, name));
    }

    public static void registerRenders()
    {
        registerRender(RedCobblestone);
        registerRender(BlueCobblestone);
    }

    public static void registerRender(Block block)
    {
        Item item = Item.getItemFromBlock(block);
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }

}
