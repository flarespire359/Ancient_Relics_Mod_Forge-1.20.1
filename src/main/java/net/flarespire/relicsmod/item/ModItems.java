package net.flarespire.relicsmod.item;

import net.flarespire.relicsmod.RelicsMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RelicsMod.MOD_ID);
//General Items.
    public static final RegistryObject<Item> CRYSTALLITE = ITEMS.register("crystallite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRYSTALLITE_OIL = ITEMS.register("crystallite_oil",
            () -> new Item(new Item.Properties()));
//Food Items.
    public static final RegistryObject<Item> AETHERBERRY = ITEMS.register("aetherberry",
        () -> new Item(new Item.Properties().food(ModFoods.AETHERBERRY)));
    public static final RegistryObject<Item> VOID_FRUIT = ITEMS.register("void_fruit",
            () -> new Item(new Item.Properties().food(ModFoods.VOID_FRUIT)));


    public static void register(IEventBus eventBus){
        ITEMS.register((eventBus));
    }
}
