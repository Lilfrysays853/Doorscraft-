/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.doorscraftlegacy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Block;

import net.mcreator.doorscraftlegacy.block.entity.RiftBlockEntity;
import net.mcreator.doorscraftlegacy.block.entity.DrawerBlockEntity;
import net.mcreator.doorscraftlegacy.DoorscraftLegacyMod;

public class DoorscraftLegacyModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, DoorscraftLegacyMod.MODID);
	public static final RegistryObject<BlockEntityType<RiftBlockEntity>> RIFT = register("rift", DoorscraftLegacyModBlocks.RIFT, RiftBlockEntity::new);
	public static final RegistryObject<BlockEntityType<DrawerBlockEntity>> DRAWER = register("drawer", DoorscraftLegacyModBlocks.DRAWER, DrawerBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static <T extends BlockEntity> RegistryObject<BlockEntityType<T>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<T> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}