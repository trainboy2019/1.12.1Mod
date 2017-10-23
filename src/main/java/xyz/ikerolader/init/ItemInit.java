package xyz.ikerolader.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;
import xyz.ikerolader.item.LightningItem;
import xyz.ikerolader.item.ItemBase;

public class ItemInit {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();

	public static final Item ITEM_TEST = new ItemBase("itemTest");
	public static final Item ITEM_TERP = new ItemBase("itemTerp");
	public static final Item ITEM_LIGHTNING = new LightningItem("itemLightning");
	
}
