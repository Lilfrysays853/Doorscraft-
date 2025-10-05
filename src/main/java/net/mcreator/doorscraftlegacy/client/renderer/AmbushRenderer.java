package net.mcreator.doorscraftlegacy.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.doorscraftlegacy.entity.AmbushEntity;

public class AmbushRenderer extends HumanoidMobRenderer<AmbushEntity, HumanoidModel<AmbushEntity>> {
	public AmbushRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<AmbushEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(AmbushEntity entity) {
		return ResourceLocation.parse("doorscraft_legacy:textures/entities/2024_04_21_ambush-22488442.png");
	}
}