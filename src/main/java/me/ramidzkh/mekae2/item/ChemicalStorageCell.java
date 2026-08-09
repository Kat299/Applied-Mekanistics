package me.ramidzkh.mekae2.item;

import net.minecraft.world.item.ItemStack;

import me.ramidzkh.mekae2.ae2.MekanismKey;
import me.ramidzkh.mekae2.ae2.MekanismKeyType;
import mekanism.api.chemical.attribute.ChemicalAttributeValidator;

import appeng.api.stacks.AEKey;
import appeng.items.storage.BasicStorageCell;
import appeng.items.storage.StorageTier;

public class ChemicalStorageCell extends BasicStorageCell {

    public ChemicalStorageCell(Properties properties, StorageTier tier) {
        super(properties, tier.idleDrain(), tier.bytes() / 1024, tier.bytes() / 128, 5, MekanismKeyType.TYPE);
    }
}
