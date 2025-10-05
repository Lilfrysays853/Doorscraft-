/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.doorscraftlegacy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.doorscraftlegacy.fluid.SeekGoopFluid;
import net.mcreator.doorscraftlegacy.DoorscraftLegacyMod;

public class DoorscraftLegacyModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, DoorscraftLegacyMod.MODID);
	public static final RegistryObject<FlowingFluid> SEEK_GOOP = REGISTRY.register("seek_goop", () -> new SeekGoopFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_SEEK_GOOP = REGISTRY.register("flowing_seek_goop", () -> new SeekGoopFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(SEEK_GOOP.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_SEEK_GOOP.get(), RenderType.translucent());
		}
	}
}