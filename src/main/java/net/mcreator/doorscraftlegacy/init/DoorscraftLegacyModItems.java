/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.doorscraftlegacy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import net.mcreator.doorscraftlegacy.item.SkeletonKeyItem;
import net.mcreator.doorscraftlegacy.item.SeekGoopItem;
import net.mcreator.doorscraftlegacy.item.KnobItem;
import net.mcreator.doorscraftlegacy.item.CrucifixItem;
import net.mcreator.doorscraftlegacy.item.BandageItem;
import net.mcreator.doorscraftlegacy.DoorscraftLegacyMod;

public class DoorscraftLegacyModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DoorscraftLegacyMod.MODID);
	public static final RegistryObject<Item> CRUCIFIX = REGISTRY.register("crucifix", () -> new CrucifixItem());
	public static final RegistryObject<Item> SEEK_SPAWN_EGG = REGISTRY.register("seek_spawn_egg", () -> new ForgeSpawnEggItem(DoorscraftLegacyModEntities.SEEK, -16777216, -1, new Item.Properties()));
	public static final RegistryObject<Item> FIGURE_SPAWN_EGG = REGISTRY.register("figure_spawn_egg", () -> new ForgeSpawnEggItem(DoorscraftLegacyModEntities.FIGURE, -6750208, -1, new Item.Properties()));
	public static final RegistryObject<Item> CLOSET_DOOR = doubleBlock(DoorscraftLegacyModBlocks.CLOSET_DOOR);
	public static final RegistryObject<Item> CLOSET_TOP = block(DoorscraftLegacyModBlocks.CLOSET_TOP);
	public static final RegistryObject<Item> RUSH_SPAWN_EGG = REGISTRY.register("rush_spawn_egg", () -> new ForgeSpawnEggItem(DoorscraftLegacyModEntities.RUSH, -13421773, -16777216, new Item.Properties()));
	public static final RegistryObject<Item> AMBUSH_SPAWN_EGG = REGISTRY.register("ambush_spawn_egg", () -> new ForgeSpawnEggItem(DoorscraftLegacyModEntities.AMBUSH, -10027264, -16738048, new Item.Properties()));
	public static final RegistryObject<Item> SKELETON_KEY = REGISTRY.register("skeleton_key", () -> new SkeletonKeyItem());
	public static final RegistryObject<Item> SKELETON_LOCK = block(DoorscraftLegacyModBlocks.SKELETON_LOCK, new Item.Properties().stacksTo(1).fireResistant());
	public static final RegistryObject<Item> KNOB = REGISTRY.register("knob", () -> new KnobItem());
	public static final RegistryObject<Item> DOOR_ROOM = doubleBlock(DoorscraftLegacyModBlocks.DOOR_ROOM);
	public static final RegistryObject<Item> HOTEL_BLOCK = block(DoorscraftLegacyModBlocks.HOTEL_BLOCK);
	public static final RegistryObject<Item> BANDAGE = REGISTRY.register("bandage", () -> new BandageItem());
	public static final RegistryObject<Item> RIFT = block(DoorscraftLegacyModBlocks.RIFT);
	public static final RegistryObject<Item> SEEK_GOOP_BUCKET = REGISTRY.register("seek_goop_bucket", () -> new SeekGoopItem());
	public static final RegistryObject<Item> DRAWER = block(DoorscraftLegacyModBlocks.DRAWER, new Item.Properties().fireResistant());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return block(block, new Item.Properties());
	}

	private static RegistryObject<Item> block(RegistryObject<Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
		return doubleBlock(block, new Item.Properties());
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), properties));
	}
}