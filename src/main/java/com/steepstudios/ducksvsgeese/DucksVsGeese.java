package com.steepstudios.ducksvsgeese;

import com.steepstudios.ducksvsgeese.entities.ModEntityTypes;
import com.steepstudios.ducksvsgeese.items.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
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