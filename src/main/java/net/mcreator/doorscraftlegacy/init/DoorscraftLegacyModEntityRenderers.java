/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.doorscraftlegacy.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.doorscraftlegacy.client.renderer.SeekRenderer;
import net.mcreator.doorscraftlegacy.client.renderer.RushRenderer;
import net.mcreator.doorscraftlegacy.client.renderer.FigureRenderer;
import net.mcreator.doorscraftlegacy.client.renderer.AmbushRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DoorscraftLegacyModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(DoorscraftLegacyModEntities.SEEK.get(), SeekRenderer::new);
		event.registerEntityRenderer(DoorscraftLegacyModEntities.FIGURE.get(), FigureRenderer::new);
		event.registerEntityRenderer(DoorscraftLegacyModEntities.RUSH.get(), RushRenderer::new);
		event.registerEntityRenderer(DoorscraftLegacyModEntities.AMBUSH.get(), AmbushRenderer::new);
	}
}