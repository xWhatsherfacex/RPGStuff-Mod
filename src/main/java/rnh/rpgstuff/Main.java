package rnh.rpgstuff;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;
import rnh.rpgstuff.init.BlockInit;
import rnh.rpgstuff.init.ItemInit;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("rpgstuff")
@Mod.EventBusSubscriber(modid = Main.MODID, bus = Bus.MOD)
public class Main
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "rpgstuff";
    public static Main instance;
    
    public Main() {
    	
    	final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    	modEventBus.addListener(this::setup);
        
    	ItemInit.ITEMS.register(modEventBus);
    	BlockInit.BLOCKS.register(modEventBus);

    	modEventBus.addListener(this::doClientStuff);

    	
        instance = this;
        MinecraftForge.EVENT_BUS.register(this);
      }

    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
    	final IForgeRegistry<Item> registry = event.getRegistry();
    		BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
    			final Item.Properties properties = new Item.Properties().group(MainItemGroup.instance);
    			final BlockItem blockItem = new BlockItem(block, properties);
    			blockItem.setRegistryName(block.getRegistryName());
    			registry.register(blockItem);
    		});
    		LOGGER.debug("Registered BlockItems!");
    }
    
    
    private void setup(final FMLCommonSetupEvent event){

    }

    private void doClientStuff(final FMLClientSetupEvent event) {

    }
    
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
    	
    }

    @SubscribeEvent
    public static void loadCompleteEvent(FMLLoadCompleteEvent event) {
    }
    
    
    public static class MainItemGroup extends ItemGroup{
   
    	public static final MainItemGroup instance = new MainItemGroup(ItemGroup.GROUPS.length,"maintab");
    	
    	private MainItemGroup(int index, String label) {
    		super(index, label);
    	}
    		@Override
    		public ItemStack createIcon() {
    			return new ItemStack(ItemInit.D20_ITEM.get());
    	}
    }
}