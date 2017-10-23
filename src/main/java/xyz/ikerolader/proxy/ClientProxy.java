package xyz.ikerolader.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy{
	
	@Override
	public void registerItemRenderer(Item item, int meta, String id) {
		System.out.println(item.getRegistryName());
		ModelResourceLocation test=new ModelResourceLocation(item.getRegistryName(), id);
		ModelLoader.setCustomModelResourceLocation(item, meta, test);
	}
	
}
