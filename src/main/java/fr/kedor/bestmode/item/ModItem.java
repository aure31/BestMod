package fr.kedor.bestmode.item;

import fr.kedor.bestmode.Main;
import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItem {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
