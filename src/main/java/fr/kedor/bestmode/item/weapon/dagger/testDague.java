package fr.kedor.bestmode.item.weapon.dagger;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

import static fr.kedor.bestmode.item.ModItem.ITEMS;

public class testDague {
    public static final RegistryObject<Item> ROOKIE_DAGGER = ITEMS.register("rookie_dagger", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}
