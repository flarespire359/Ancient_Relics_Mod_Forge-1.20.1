package net.flarespire.relicsmod.item;

import net.flarespire.relicsmod.RelicsMod;
import net.flarespire.relicsmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RelicsMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> RELICS_TAB = CREATIVE_MODE_TABS.register("relics_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CRYSTALLITE.get()))
                    .title(Component.translatable("creativetab.relics_mod_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.CRYSTALLITE.get());
                        pOutput.accept(ModItems.CRYSTALLITE_OIL.get());


                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> RELICS_TAB_2 = CREATIVE_MODE_TABS.register("relics_tab_2",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.CRYSTALLITE_BLOCK.get()))
                    .title(Component.translatable("creativetab.relics_mod_tab_2"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.CRYSTALLITE_BLOCK.get());
                        pOutput.accept(ModBlocks.CRYSTALLITE_ORE.get());
                        pOutput.accept(ModBlocks.DS_CRYSTALLITE_ORE.get());


                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> RELICS_TAB_3 = CREATIVE_MODE_TABS.register("relics_tab_3",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AETHERBERRY.get()))
                    .title(Component.translatable("creativetab.relics_mod_tab_3"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.AETHERBERRY.get());
                        pOutput.accept(ModItems.VOID_FRUIT.get());


                    })
                    .build());

    public static void  register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
