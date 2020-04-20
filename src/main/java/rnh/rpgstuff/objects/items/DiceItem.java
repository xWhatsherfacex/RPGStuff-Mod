package rnh.rpgstuff.objects.items;

import java.util.Random;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import rnh.rpgstuff.init.ItemInit;

public class DiceItem extends Item{


	public DiceItem(Properties properties) {
		super(properties);
	}


	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn){
		String name = playerIn.getScoreboardName();
		Random rand = new Random();
		if (this == ItemInit.D100_ITEM.get()) {
			int n = rand.nextInt(100);
			n += 1;
			if (worldIn.isRemote) {
				if (n == 1) {
					playerIn.sendStatusMessage(new StringTextComponent(name + " rolled " + n + ", Critical Fail!"), false);
				} else if (n == 100) {
					playerIn.sendStatusMessage(new StringTextComponent(name + " rolled " + n + ", Critical Success!"), false);
				} else {
					playerIn.sendStatusMessage(new StringTextComponent(name + " rolled " + n + "!"), false);
				}
			}
		} else if (this == ItemInit.D20_ITEM.get()) {
			int n = rand.nextInt(20);
			n += 1;
			if (worldIn.isRemote) {
				if (n == 1) {
					playerIn.sendStatusMessage(new StringTextComponent(name + " rolled " + n + ", Critical Fail!"), false);
				} else if (n == 20) {
					playerIn.sendStatusMessage(new StringTextComponent(name + " rolled " + n + ", Critical Success!"), false);
				} else {
					playerIn.sendStatusMessage(new StringTextComponent(name + " rolled " + n + "!"), false);
				}
			}
		} else if (this == ItemInit.D12_ITEM.get()) {
			int n = rand.nextInt(12);
			n += 1;
			if (worldIn.isRemote) {
				if (n == 1) {
					playerIn.sendStatusMessage(new StringTextComponent(name + " rolled " + n + ", Critical Fail!"), false);
				} else if (n == 12) {
					playerIn.sendStatusMessage(new StringTextComponent(name + " rolled " + n + ", Critical Success!"), false);
				} else {
					playerIn.sendStatusMessage(new StringTextComponent(name + " rolled " + n + "!"), false);
				}
			}
		} else if (this == ItemInit.D10_ITEM.get()) {
			int n = rand.nextInt(10);
			n += 1;
			if (worldIn.isRemote) {
				if (n == 1) {
					playerIn.sendStatusMessage(new StringTextComponent(name + " rolled " + n + ", Critical Fail!"), false);
				} else if (n == 10) {
					playerIn.sendStatusMessage(new StringTextComponent(name + " rolled " + n + ", Critical Success!"), false);
				} else {
					playerIn.sendStatusMessage(new StringTextComponent(name + " rolled " + n + "!"), false);
				}
			}
		} else if (this == ItemInit.D8_ITEM.get()) {
			int n = rand.nextInt(8);
			n += 1;
			if (worldIn.isRemote) {
				if (n == 1) {
					playerIn.sendStatusMessage(new StringTextComponent(name + " rolled " + n + ", Critical Fail!"), false);
				} else if (n == 8) {
					playerIn.sendStatusMessage(new StringTextComponent(name + " rolled " + n + ", Critical Success!"), false);
				} else {
					playerIn.sendStatusMessage(new StringTextComponent(name + " rolled " + n + "!"), false);
				}
			}
		} else if (this == ItemInit.D6_ITEM.get()) {
			int n = rand.nextInt(6);
			n += 1;
			if (worldIn.isRemote) {
				if (n == 1) {
					playerIn.sendStatusMessage(new StringTextComponent(name + " rolled " + n + ", Critical Fail!"), false);
				} else if (n == 6) {
					playerIn.sendStatusMessage(new StringTextComponent(name + " rolled " + n + ", Critical Success!"), false);
				} else {
					playerIn.sendStatusMessage(new StringTextComponent(name + " rolled " + n + "!"), false);
				}
			}
		} else if (this == ItemInit.D4_ITEM.get()) {
			int n = rand.nextInt(4);
			n += 1;
			if (worldIn.isRemote) {
				if (n == 1) {
					playerIn.sendStatusMessage(new StringTextComponent(name + " rolled " + n + ", Critical Fail!"), false);
				} else if (n == 4) {
					playerIn.sendStatusMessage(new StringTextComponent(name + " rolled " + n + ", Critical Success!"), false);
				} else {
					playerIn.sendStatusMessage(new StringTextComponent(name + " rolled " + n + "!"), false);
				}
			}
		}
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}
}
