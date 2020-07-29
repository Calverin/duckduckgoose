package com.steepstudios.duckduckgoose.items;

import com.steepstudios.duckduckgoose.DuckDuckGoose;
import com.steepstudios.duckduckgoose.entities.ModEntityTypes;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DuckDuckGoose.MODID);

    // This is a very simple Item. It has no special properties except for being on our creative tab.
    public static final RegistryObject<Item> DUCK_FEATHER = ITEMS.register("duck_feather", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ModdedSpawnEggItem> DUCK_SPAWN_EGG = ITEMS.register("duck_spawn_egg", () -> new ModdedSpawnEggItem(ModEntityTypes.DUCK, 0xFCFC00, 0xCEAF96, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ModdedSpawnEggItem> GOOSE_SPAWN_EGG = ITEMS.register("goose_spawn_egg", () -> new ModdedSpawnEggItem(ModEntityTypes.GOOSE, 0xE7E7E7, 0xF6B201, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
}
