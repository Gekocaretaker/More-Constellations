package com.gekocaretaker.mcas;

import com.gekocaretaker.mcas.common.registry.RegConstellations;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod("mcas")
public class MCAS {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "mcas";

    public MCAS() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        RegConstellations.init();
    }

    private void doClientStuff(final FMLClientSetupEvent event) {

    }
}
