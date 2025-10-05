/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.doorscraftlegacy.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.doorscraftlegacy.client.gui.TestScreen;
import net.mcreator.doorscraftlegacy.client.gui.RiftStorageScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DoorscraftLegacyModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(DoorscraftLegacyModMenus.RIFT_STORAGE.get(), RiftStorageScreen::new);
			MenuScreens.register(DoorscraftLegacyModMenus.DRAWER.get(), TestScreen::new);
		});
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}