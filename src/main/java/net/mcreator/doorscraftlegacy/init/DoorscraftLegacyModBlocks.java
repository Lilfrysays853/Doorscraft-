/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.doorscraftlegacy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.doorscraftlegacy.block.SkeletonLockBlock;
import net.mcreator.doorscraftlegacy.block.SeekGoopBlock;
import net.mcreator.doorscraftlegacy.block.RiftBlock;
import net.mcreator.doorscraftlegacy.block.HotelBlockBlock;
import net.mcreator.doorscraftlegacy.block.DrawerBlock;
import net.mcreator.doorscraftlegacy.block.DoorRoomBlock;
import net.mcreator.doorscraftlegacy.block.ClosetSideBlock;
import net.mcreator.doorscraftlegacy.block.ClosetDoorBlock;
import net.mcreator.doorscraftlegacy.DoorscraftLegacyMod;

public class DoorscraftLegacyModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DoorscraftLegacyMod.MODID);
	public static final RegistryObject<Block> CLOSET_DOOR = REGISTRY.register("closet_door", () -> new ClosetDoorBlock());
	public static final RegistryObject<Block> CLOSET_TOP = REGISTRY.register("closet_top", () -> new ClosetSideBlock());
	public static final RegistryObject<Block> SKELETON_LOCK = REGISTRY.register("skeleton_lock", () -> new SkeletonLockBlock());
	public static final RegistryObject<Block> DOOR_ROOM = REGISTRY.register("door_room", () -> new DoorRoomBlock());
	public static final RegistryObject<Block> HOTEL_BLOCK = REGISTRY.register("hotel_block", () -> new HotelBlockBlock());
	public static final RegistryObject<Block> RIFT = REGISTRY.register("rift", () -> new RiftBlock());
	public static final RegistryObject<Block> SEEK_GOOP = REGISTRY.register("seek_goop", () -> new SeekGoopBlock());
	public static final RegistryObject<Block> DRAWER = REGISTRY.register("drawer", () -> new DrawerBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}