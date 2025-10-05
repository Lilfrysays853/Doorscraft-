package net.mcreator.doorscraftlegacy.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class KnobItem extends Item {
	public KnobItem() {
		super(new Item.Properties().stacksTo(99).fireResistant().rarity(Rarity.UNCOMMON));
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0f;
	}
}