package xyz.ikerolader.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TestItem extends Item{
	public static final String name = "TestItem";
	
	protected TestItem() {
		super();
		this.setUnlocalizedName(this.name);
		this.setCreativeTab(CreativeTabs.MISC);
	}

}
