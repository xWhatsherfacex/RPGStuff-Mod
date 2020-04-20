package rnh.rpgstuff.init;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import rnh.rpgstuff.Main;
import rnh.rpgstuff.objects.items.DiceItem;

public class ItemInit {
	
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Main.MODID);
	
	public static final RegistryObject<Item> D100_ITEM = ITEMS.register("d100_item", () -> new DiceItem(new Item.Properties().group(Main.MainItemGroup.instance)));
	public static final RegistryObject<Item> D20_ITEM = ITEMS.register("d20_item", () -> new DiceItem(new Item.Properties().group(Main.MainItemGroup.instance)));
	public static final RegistryObject<Item> D12_ITEM = ITEMS.register("d12_item", () -> new DiceItem(new Item.Properties().group(Main.MainItemGroup.instance)));
	public static final RegistryObject<Item> D10_ITEM = ITEMS.register("d10_item", () -> new DiceItem(new Item.Properties().group(Main.MainItemGroup.instance)));
	public static final RegistryObject<Item> D8_ITEM = ITEMS.register("d8_item", () -> new DiceItem(new Item.Properties().group(Main.MainItemGroup.instance)));
	public static final RegistryObject<Item> D6_ITEM = ITEMS.register("d6_item", () -> new DiceItem(new Item.Properties().group(Main.MainItemGroup.instance)));
	public static final RegistryObject<Item> D4_ITEM = ITEMS.register("d4_item", () -> new DiceItem(new Item.Properties().group(Main.MainItemGroup.instance)));

}
