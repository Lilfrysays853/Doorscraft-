package net.mcreator.doorscraftlegacy.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.doorscraftlegacy.entity.RushEntity;

public class RushRenderer extends HumanoidMobRenderer<RushEntity, HumanoidModel<RushEntity>> {
	public RushRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<RushEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(RushEntity entity) {
		return ResourceLocation.parse("doorscraft_legacy:textures/entities/2024_04_24_doors-rush-22493941.png");
	}
}