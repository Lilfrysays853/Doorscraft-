package net.mcreator.doorscraftlegacy.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.doorscraftlegacy.init.DoorscraftLegacyModFluids;

public class SeekGoopBlock extends LiquidBlock {
	public SeekGoopBlock() {
		super(() -> DoorscraftLegacyModFluids.SEEK_GOOP.get(),
				BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).strength(200f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}