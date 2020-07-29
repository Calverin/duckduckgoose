package com.steepstudios.duckduckgoose.client;

import com.steepstudios.duckduckgoose.client.render.entity.DuckRenderer;
import com.steepstudios.duckduckgoose.client.render.entity.GooseRenderer;
import com.steepstudios.duckduckgoose.entities.ModEntityTypes;
import com.steepstudios.duckduckgoose.DuckDuckGoose;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Subscribe to events from the MOD EventBus that should be handled on the PHYSICAL CLIENT side in this class
 *
 * @author Cadiboo
 */
@EventBusSubscriber(modid = DuckDuckGoose.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public final class ClientModEventSubscriber {

    private static final Logger LOGGER = LogManager.getLogger(DuckDuckGoose.MODID + " Client Mod Event Subscriber");

    /**
     * We need to register our renderers on the client because rendering code does not exist on the server
     * and trying to use it on a dedicated server will crash the game.
     * <p>
     * This method will be called by Forge when it is time for the mod to do its client-side setup
     * This method will always be called after the Registry events.
     * This means that all Blocks, Items, TileEntityTypes, etc. will all have been registered already
     */
    @SubscribeEvent
    public static void onFMLClientSetupEvent(final FMLClientSetupEvent event) {

        // Register Entity Renderers
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.DUCK.get(), DuckRenderer::new);
        // Register Entity Renderers
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.GOOSE.get(), GooseRenderer::new);
        LOGGER.debug("Registered Entity Renderers");

    }

}