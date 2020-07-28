package com.steepstudios.ducksvsgeese.client.render.entity;

import com.steepstudios.ducksvsgeese.DucksVsGeese;
import com.steepstudios.ducksvsgeese.entities.GooseEntity;
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
public class GooseRenderer extends MobRenderer<GooseEntity, ChickenModel<GooseEntity>> {

    private static final ResourceLocation GOOSE_TEXTURE = new ResourceLocation(DucksVsGeese.MODID, "textures/entity/goose/goose.png");

    public GooseRenderer(final EntityRendererManager manager) {
        super(manager, new ChickenModel<>(), 0.7F);
    }

    @Override
    public ResourceLocation getEntityTexture(final GooseEntity entity) {
        return GOOSE_TEXTURE;
    }

}