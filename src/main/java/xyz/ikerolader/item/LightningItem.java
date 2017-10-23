package xyz.ikerolader.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import xyz.ikerolader.Main;
import xyz.ikerolader.init.ItemInit;
import xyz.ikerolader.util.IExtendedReach;
import xyz.ikerolader.util.IHasModel;


public class LightningItem extends Item implements IHasModel, IExtendedReach{
	
	public LightningItem(String name) {
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
    public EnumAction getItemUseAction(ItemStack stack)
    {
        return EnumAction.DRINK;
    }
	
	@Override
	 public float getReach()
	    {
	        return 30.0F;
	    }
	
	 @Override
	 public EnumActionResult onItemUse(final EntityPlayer playerIn, final World worldIn, final BlockPos pos, final EnumHand hand, final EnumFacing facing, final float hitX, final float hitY, final float hitZ) {
		Entity bolt = new EntityLightningBolt(worldIn,pos.getX(), pos.getY(), pos.getZ(), false);
		playerIn.world.addWeatherEffect(bolt);
		return EnumActionResult.SUCCESS;
	}
	
	@Override
	public EnumRarity getRarity(ItemStack itemStack) {
		return EnumRarity.EPIC;
	}
	
	@Override
	public boolean hasEffect(ItemStack itemStack) {
		return true;
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
}

