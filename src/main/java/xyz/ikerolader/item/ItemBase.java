package xyz.ikerolader.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import xyz.ikerolader.Main;
import xyz.ikerolader.init.ItemInit;
import xyz.ikerolader.util.IHasModel;

public class ItemBase extends Item implements IHasModel{
	
	public ItemBase(String name) {
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
}
