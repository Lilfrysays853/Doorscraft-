/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.doorscraftlegacy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.doorscraftlegacy.entity.SeekEntity;
import net.mcreator.doorscraftlegacy.entity.RushEntity;
import net.mcreator.doorscraftlegacy.entity.FigureEntity;
import net.mcreator.doorscraftlegacy.entity.AmbushEntity;
import net.mcreator.doorscraftlegacy.DoorscraftLegacyMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DoorscraftLegacyModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, DoorscraftLegacyMod.MODID);
	public static final RegistryObject<EntityType<SeekEntity>> SEEK = register("seek",
			EntityType.Builder.<SeekEntity>of(SeekEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SeekEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FigureEntity>> FIGURE = register("figure",
			EntityType.Builder.<FigureEntity>of(FigureEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FigureEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RushEntity>> RUSH = register("rush",
			EntityType.Builder.<RushEntity>of(RushEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RushEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AmbushEntity>> AMBUSH = register("ambush",
			EntityType.Builder.<AmbushEntity>of(AmbushEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AmbushEntity::new)

					.sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			SeekEntity.init();
			FigureEntity.init();
			RushEntity.init();
			AmbushEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SEEK.get(), SeekEntity.createAttributes().build());
		event.put(FIGURE.get(), FigureEntity.createAttributes().build());
		event.put(RUSH.get(), RushEntity.createAttributes().build());
		event.put(AMBUSH.get(), AmbushEntity.createAttributes().build());
	}
}