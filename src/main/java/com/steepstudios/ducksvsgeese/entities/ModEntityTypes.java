package com.steepstudios.ducksvsgeese.entities;

import com.steepstudios.ducksvsgeese.DucksVsGeese;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Holds a list of all our {@link EntityType}s.
 * Suppliers that create EntityTypes are added to the DeferredRegister.
 * The DeferredRegister is then added to our mod event bus in our constructor.
 * When the EntityType Registry Event is fired by Forge and it is time for the mod to
 * register its EntityTypes, our EntityTypes are created and registered by the DeferredRegister.
 * The EntityType Registry Event will always be called after the Block and Item registries are filled.
 * Note: This supports registry overrides.
 *
 * @author Cadiboo
 */
public final class ModEntityTypes {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, DucksVsGeese.MODID);

    public static final String DUCK_NAME = "duck";
    public static final RegistryObject<EntityType<DuckEntity>> DUCK = ENTITY_TYPES.register(DUCK_NAME, () ->
            EntityType.Builder.<DuckEntity>create(DuckEntity::new, EntityClassification.CREATURE)
                    .size(EntityType.CHICKEN.getWidth(), EntityType.CHICKEN.getHeight())
                    .build(new ResourceLocation(DucksVsGeese.MODID, DUCK_NAME).toString())
    );

}