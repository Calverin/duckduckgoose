package com.steepstudios.duckduckgoose.client.render.entity;

import com.steepstudios.duckduckgoose.DuckDuckGoose;
import com.steepstudios.duckduckgoose.entities.DuckEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.ChickenModel;
import net.minecraft.util.ResourceLocation;

/**
 * Handles rendering all WildBoar Entities.
 * The render method is called once each frame for every visible WildBoar.
 * <p>
 * We use a PigModel in our renderer and simply change it's texture.
 *
 * @author Cadiboo
 */
public class DuckRenderer extends MobRenderer<DuckEntity, ChickenModel<DuckEntity>> {

    private static final ResourceLocation DUCK_TEXTURE = new ResourceLocation(DuckDuckGoose.MODID, "textures/entity/duck/duck.png");

    public DuckRenderer(final EntityRendererManager manager) {
        super(manager, new ChickenModel<>(), 0.7F);
    }

    @Override
    public ResourceLocation getEntityTexture(final DuckEntity entity) {
        return DUCK_TEXTURE;
    }

}