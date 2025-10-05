package net.mcreator.doorscraftlegacy.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.doorscraftlegacy.init.DoorscraftLegacyModFluids;

public class SeekGoopItem extends BucketItem {
	public SeekGoopItem() {
		super(DoorscraftLegacyModFluids.SEEK_GOOP, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.UNCOMMON));
	}
}