package com.beep67.advenderite;

import com.beep67.advenderite.core.BlockRegistry;
import com.beep67.advenderite.core.ItemRegistry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("advenderite")
public class AdvEnderite {

    public static final String MOD_ID = "advenderite";

    private static final Logger LOGGER = LogManager.getLogger();

    public AdvEnderite() {

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BlockRegistry.BLOCKS.register(bus);
        ItemRegistry.ITEMS.register(bus);

    }

}
