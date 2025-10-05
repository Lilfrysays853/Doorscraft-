/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.doorscraftlegacy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.Minecraft;

import net.mcreator.doorscraftlegacy.world.inventory.TestMenu;
import net.mcreator.doorscraftlegacy.world.inventory.RiftStorageMenu;
import net.mcreator.doorscraftlegacy.network.MenuStateUpdateMessage;
import net.mcreator.doorscraftlegacy.DoorscraftLegacyMod;

import java.util.Map;

public class DoorscraftLegacyModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, DoorscraftLegacyMod.MODID);
	public static final RegistryObject<MenuType<RiftStorageMenu>> RIFT_STORAGE = REGISTRY.register("rift_storage", () -> IForgeMenuType.create(RiftStorageMenu::new));
	public static final RegistryObject<MenuType<TestMenu>> DRAWER = REGISTRY.register("drawer", () -> IForgeMenuType.create(TestMenu::new));

	public interface MenuAccessor {
		Map<String, Object> getMenuState();

		Map<Integer, Slot> getSlots();

		default void sendMenuStateUpdate(Player player, int elementType, String name, Object elementState, boolean needClientUpdate) {
			getMenuState().put(elementType + ":" + name, elementState);
			if (player instanceof ServerPlayer serverPlayer) {
				DoorscraftLegacyMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new MenuStateUpdateMessage(elementType, name, elementState));
			} else if (player.level().isClientSide) {
				if (Minecraft.getInstance().screen instanceof DoorscraftLegacyModScreens.ScreenAccessor accessor && needClientUpdate)
					accessor.updateMenuState(elementType, name, elementState);
				DoorscraftLegacyMod.PACKET_HANDLER.sendToServer(new MenuStateUpdateMessage(elementType, name, elementState));
			}
		}

		default <T> T getMenuState(int elementType, String name, T defaultValue) {
			try {
				return (T) getMenuState().getOrDefault(elementType + ":" + name, defaultValue);
			} catch (ClassCastException e) {
				return defaultValue;
			}
		}
	}
}