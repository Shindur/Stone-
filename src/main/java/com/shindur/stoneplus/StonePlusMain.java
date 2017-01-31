package com.shindur.stoneplus;

import com.shindur.stoneplus.CreativeTab.CreativeTab;
import com.shindur.stoneplus.Proxy.CommonProxy;
import com.shindur.stoneplus.block.CobbleBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Shindur on 1/30/2017.
 */

@Mod (modid = StonePlusMain.MODID, version = StonePlusMain.VERSION, name = StonePlusMain.NAME)
public class StonePlusMain {
    public static final String MODID = "stoneplus";
    public static final String VERSION = "1.0";
    public static final String NAME = "Stone+";

    @SidedProxy(clientSide = "com.shindur.stoneplus.Proxy.ClientProxy", serverSide = "com.shindur.stoneplus.Proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static StonePlusMain instance;

    public static CreativeTab stoneTab;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        stoneTab = new CreativeTab(CreativeTabs.getNextID(), "Stone+");
        CobbleBlocks.preInit();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }

}
