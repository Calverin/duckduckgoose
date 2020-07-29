package com.steepstudios.duckduckgoose;

import com.steepstudios.duckduckgoose.entities.ModEntityTypes;
import com.steepstudios.duckduckgoose.items.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Calverin with help from Cadiboo
 */
@Mod(DuckDuckGoose.MODID)
public final class DuckDuckGoose {

    public static final String MODID = "duckduckgoose";

    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public DuckDuckGoose() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        // Register Deferred Registers (Does not need to be before Configs)
        ModItems.ITEMS.register(modEventBus);
        ModEntityTypes.ENTITY_TYPES.register(modEventBus);
    }

    private void setup(final FMLCommonSetupEvent event) {
        GlobalEntityTypeAttributes.put(ModEntityTypes.DUCK.get(), GlobalEntityTypeAttributes.getAttributesForEntity(EntityType.CHICKEN));
        GlobalEntityTypeAttributes.put(ModEntityTypes.GOOSE.get(), GlobalEntityTypeAttributes.getAttributesForEntity(EntityType.CHICKEN));
    }
}