package com.github.fasde345.aspectmod189;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = "aspectmod", useMetadata=true)
public class ExampleMod {
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("Dirt: " + Blocks.dirt.getUnlocalizedName());
		// Below is a demonstration of an access-transformed class access.
        System.out.println("Color State: " + new GlStateManager.Color());
    }
}
