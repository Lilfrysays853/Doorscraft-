/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.doorscraftlegacy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.doorscraftlegacy.DoorscraftLegacyMod;

public class DoorscraftLegacyModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, DoorscraftLegacyMod.MODID);
	public static final RegistryObject<SoundEvent> DAWN_OF_THE_DOORS = REGISTRY.register("dawn_of_the_doors", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("doorscraft_legacy", "dawn_of_the_doors")));
	public static final RegistryObject<SoundEvent> HERE_I_COME = REGISTRY.register("here_i_come", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("doorscraft_legacy", "here_i_come")));
	public static final RegistryObject<SoundEvent> UNHINGED = REGISTRY.register("unhinged", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("doorscraft_legacy", "unhinged")));
	public static final RegistryObject<SoundEvent> JEFFS_JINGLE = REGISTRY.register("jeffs-jingle", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("doorscraft_legacy", "jeffs-jingle")));
}