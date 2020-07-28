package com.steepstudios.ducksvsgeese;

import com.steepstudios.ducksvsgeese.entities.ModEntityTypes;
import com.steepstudios.ducksvsgeese.items.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Calverin with help from Cadiboo
 */
@Mod(DucksVsGeese.MODID)
public final class DucksVsGeese {

    public static final String MODID = "ducksvsgeese";

    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public DucksVsGeese() {
        final ModLoadingContext modLoadingContext = ModLoadingContext.get();
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register Deferred Registers (Does not need to be before Configs)
        ModItems.ITEMS.register(modEventBus);
        ModEntityTypes.ENTITY_TYPES.register(modEventBus);
    }

}