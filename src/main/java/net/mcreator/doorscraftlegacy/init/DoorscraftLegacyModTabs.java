/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.doorscraftlegacy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.doorscraftlegacy.DoorscraftLegacyMod;

public class DoorscraftLegacyModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DoorscraftLegacyMod.MODID);
	public static final RegistryObject<CreativeModeTab> DOORSCRAFT = REGISTRY.register("doorscraft",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.doorscraft_legacy.doorscraft")).icon(() -> new ItemStack(DoorscraftLegacyModItems.CRUCIFIX.get())).displayItems((parameters, tabData) -> {
				tabData.accept(DoorscraftLegacyModItems.SEEK_SPAWN_EGG.get());
				tabData.accept(DoorscraftLegacyModItems.FIGURE_SPAWN_EGG.get());
				tabData.accept(DoorscraftLegacyModItems.AMBUSH_SPAWN_EGG.get());
				tabData.accept(DoorscraftLegacyModItems.RUSH_SPAWN_EGG.get());
				tabData.accept(DoorscraftLegacyModItems.CRUCIFIX.get());
				tabData.accept(DoorscraftLegacyModItems.SKELETON_KEY.get());
				tabData.accept(DoorscraftLegacyModItems.KNOB.get());
				tabData.accept(DoorscraftLegacyModItems.SEEK_GOOP_BUCKET.get());
				tabData.accept(DoorscraftLegacyModBlocks.DRAWER.get().asItem());
			}).build());
	public static final RegistryObject<CreativeModeTab> DOORSCRAFT_1 = REGISTRY.register("doorscraft_1",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.doorscraft_legacy.doorscraft_1")).icon(() -> new ItemStack(DoorscraftLegacyModBlocks.SKELETON_LOCK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(DoorscraftLegacyModBlocks.CLOSET_DOOR.get().asItem());
				tabData.accept(DoorscraftLegacyModBlocks.CLOSET_TOP.get().asItem());
				tabData.accept(DoorscraftLegacyModBlocks.SKELETON_LOCK.get().asItem());
			}).withTabsBefore(DOORSCRAFT.getId()).build());
}