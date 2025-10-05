package net.mcreator.doorscraftlegacy.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.doorscraftlegacy.entity.SeekEntity;

public class SeekRenderer extends HumanoidMobRenderer<SeekEntity, HumanoidModel<SeekEntity>> {
	public SeekRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<SeekEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(SeekEntity entity) {
		return ResourceLocation.parse("doorscraft_legacy:textures/entities/2024_05_04_--seek---22512034.png");
	}
}