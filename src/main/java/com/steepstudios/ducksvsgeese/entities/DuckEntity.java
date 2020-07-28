package com.steepstudios.ducksvsgeese.entities;

import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.entity.passive.horse.AbstractHorseEntity;
import net.minecraft.network.IPacket;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.IEntityAdditionalSpawnData;
import net.minecraftforge.fml.network.FMLPlayMessages;
import net.minecraftforge.fml.network.NetworkHooks;

public class DuckEntity extends ChickenEntity implements DuckEntityAttributes {

    public DuckEntity(final EntityType<? extends DuckEntity> entityType, final World world) {
        super(entityType, world);
    }

    /**
     * Creates a child new entity from the parent entity.
     * Can be used to set additional on the child entity based on the parent.
     *
     //* @param parent The entity that made this child
     //* @return A new Duck
     //* @see AbstractHorseEntity#setOffspringAttributes(AgeableEntity, AbstractHorseEntity)
     */
    @Override
    public DuckEntity createChild(final AgeableEntity parent) {
        // Use getType to support overrides in subclasses
        return (DuckEntity) getType().create(this.world);
    }

    @Override
    public IPacket<?> createSpawnPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }
}