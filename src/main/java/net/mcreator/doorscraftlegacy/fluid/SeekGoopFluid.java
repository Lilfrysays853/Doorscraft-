package net.mcreator.doorscraftlegacy.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.doorscraftlegacy.init.DoorscraftLegacyModItems;
import net.mcreator.doorscraftlegacy.init.DoorscraftLegacyModFluids;
import net.mcreator.doorscraftlegacy.init.DoorscraftLegacyModFluidTypes;
import net.mcreator.doorscraftlegacy.init.DoorscraftLegacyModBlocks;

public abstract class SeekGoopFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> DoorscraftLegacyModFluidTypes.SEEK_GOOP_TYPE.get(), () -> DoorscraftLegacyModFluids.SEEK_GOOP.get(),
			() -> DoorscraftLegacyModFluids.FLOWING_SEEK_GOOP.get()).explosionResistance(200f).levelDecreasePerBlock(7).bucket(() -> DoorscraftLegacyModItems.SEEK_GOOP_BUCKET.get())
			.block(() -> (LiquidBlock) DoorscraftLegacyModBlocks.SEEK_GOOP.get());

	private SeekGoopFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.REVERSE_PORTAL;
	}

	public static class Source extends SeekGoopFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends SeekGoopFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}