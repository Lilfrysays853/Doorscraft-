/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.doorscraftlegacy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.doorscraftlegacy.fluid.types.SeekGoopFluidType;
import net.mcreator.doorscraftlegacy.DoorscraftLegacyMod;

public class DoorscraftLegacyModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, DoorscraftLegacyMod.MODID);
	public static final RegistryObject<FluidType> SEEK_GOOP_TYPE = REGISTRY.register("seek_goop", () -> new SeekGoopFluidType());
}