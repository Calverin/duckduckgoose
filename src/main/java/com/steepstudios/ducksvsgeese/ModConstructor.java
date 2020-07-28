package com.steepstudios.ducksvsgeese;

import com.steepstudios.ducksvsgeese.entities.ModEntityTypes;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class ModConstructor {
    public ModConstructor() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        duckAttributes();
    }

    public void duckAttributes(final RegistryEvent.Register<EntityType<?>> event) {
        GlobalEntityTypeAttributes.put(ModEntityTypes.DUCK.get(), LivingEntity.registerAttributes().create());
    }
}
