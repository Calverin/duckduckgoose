package com.steepstudios.ducksvsgeese.items;

import com.steepstudios.ducksvsgeese.DucksVsGeese;
import com.steepstudios.ducksvsgeese.items.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;
import java.util.function.Supplier;

/**
 * This class holds all our ItemGroups (Formerly called CreativeTabs).
 * Static initialisers are fine here.
 *
 * @author Cadiboo
 */
public final class ModItemGroups {

    public static final ItemGroup MOD_ITEM_GROUP = new ModItemGroup(DucksVsGeese.MODID, () -> new ItemStack(ModItems.DUCK_FEATHER.get()));

    public static final class ModItemGroup extends ItemGroup {

        @Nonnull
        private final Supplier<ItemStack> iconSupplier;

        public ModItemGroup(@Nonnull final String name, @Nonnull final Supplier<ItemStack> iconSupplier) {
            super(name);
            this.iconSupplier = iconSupplier;
        }

        @Override
        @Nonnull
        public ItemStack createIcon() {
            return iconSupplier.get();
        }

    }

}