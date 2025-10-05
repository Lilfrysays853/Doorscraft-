/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.doorscraftlegacy.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class DoorscraftLegacyModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == DoorscraftLegacyModVillagerProfessions.JEFF.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.GOLD_NUGGET, 15), new ItemStack(DoorscraftLegacyModItems.KNOB.get(), 52), new ItemStack(DoorscraftLegacyModItems.CRUCIFIX.get()), 1, 0, 0f));
		}
		if (event.getType() == DoorscraftLegacyModVillagerProfessions.JEFF.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.GOLD_NUGGET, 7), new ItemStack(DoorscraftLegacyModItems.KNOB.get(), 52), new ItemStack(DoorscraftLegacyModItems.SKELETON_KEY.get()), 1, 0, 0f));
		}
	}
}