package com.shindur.stoneplus.block;

import com.shindur.stoneplus.StonePlusMain;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
/**
 * Created by Shindur on 1/30/2017.
 */
public class CobbleSettings extends Block {

    public CobbleSettings(Material materialIn, String name)
    {
        super(materialIn);
        this.setUnlocalizedName(name);
        this.setCreativeTab(StonePlusMain.stoneTab);
        this.setHardness(1.5F);
        this.setResistance(10.0F);
        this.setSoundType(SoundType.STONE);

    }
}
