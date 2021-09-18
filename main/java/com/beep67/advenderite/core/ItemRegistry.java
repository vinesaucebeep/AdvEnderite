package com.beep67.advenderite.core;

import com.beep67.advenderite.AdvEnderite;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AdvEnderite.MOD_ID);

    // INGOTS
    public static final RegistryObject<Item> ENDERITE_IRON_INGOT = ITEMS.register("enderite_iron_ingot",
            () -> new Item(new Item.Properties().tab(AdvEnderite.TAB_ADVANCED_ENDERITE).fireResistant()));
    public static final RegistryObject<Item> ENDERITE_GOLD_INGOT = ITEMS.register("enderite_gold_ingot",
            () -> new Item(new Item.Properties().tab(AdvEnderite.TAB_ADVANCED_ENDERITE).fireResistant()));
    public static final RegistryObject<Item> ENDERITE_EMERALD_INGOT = ITEMS.register("enderite_emerald_ingot",
            () -> new Item(new Item.Properties().tab(AdvEnderite.TAB_ADVANCED_ENDERITE).fireResistant()));

    // ARMOURS
    // ENDERITE/IRON
    public static final RegistryObject<Item> ENDERITE_IRON_HELMET = ITEMS.register("enderite_iron_helmet",
            () -> new ArmorItem(EnderiteArmorTiers.ENDERITE_IRON, EquipmentSlotType.HEAD, (new Item.Properties()
                    .tab(AdvEnderite.TAB_ADVANCED_ENDERITE).fireResistant())));
    public static final RegistryObject<Item> ENDERITE_IRON_CHESTPLATE = ITEMS.register("enderite_iron_chestplate",
            () -> new ArmorItem(EnderiteArmorTiers.ENDERITE_IRON, EquipmentSlotType.CHEST, (new Item.Properties()
                    .tab(AdvEnderite.TAB_ADVANCED_ENDERITE).fireResistant())));
    public static final RegistryObject<Item> ENDERITE_IRON_LEGGINGS = ITEMS.register("enderite_iron_leggings",
            () -> new ArmorItem(EnderiteArmorTiers.ENDERITE_IRON, EquipmentSlotType.LEGS, (new Item.Properties()
                    .tab(AdvEnderite.TAB_ADVANCED_ENDERITE).fireResistant())));
    public static final RegistryObject<Item> ENDERITE_IRON_BOOTS = ITEMS.register("enderite_iron_boots",
            () -> new ArmorItem(EnderiteArmorTiers.ENDERITE_IRON, EquipmentSlotType.FEET, (new Item.Properties()
                    .tab(AdvEnderite.TAB_ADVANCED_ENDERITE).fireResistant())));

    // ENDERITE/GOLD
    public static final RegistryObject<Item> ENDERITE_GOLD_HELMET = ITEMS.register("enderite_gold_helmet",
            () -> new ArmorItem(EnderiteArmorTiers.ENDERITE_GOLD, EquipmentSlotType.HEAD, (new Item.Properties()
                    .tab(AdvEnderite.TAB_ADVANCED_ENDERITE).fireResistant())));
    public static final RegistryObject<Item> ENDERITE_GOLD_CHESTPLATE = ITEMS.register("enderite_gold_chestplate",
            () -> new ArmorItem(EnderiteArmorTiers.ENDERITE_GOLD, EquipmentSlotType.CHEST, (new Item.Properties()
                    .tab(AdvEnderite.TAB_ADVANCED_ENDERITE).fireResistant())));
    public static final RegistryObject<Item> ENDERITE_GOLD_LEGGINGS = ITEMS.register("enderite_gold_leggings",
            () -> new ArmorItem(EnderiteArmorTiers.ENDERITE_GOLD, EquipmentSlotType.LEGS, (new Item.Properties()
                    .tab(AdvEnderite.TAB_ADVANCED_ENDERITE).fireResistant())));
    public static final RegistryObject<Item> ENDERITE_GOLD_BOOTS = ITEMS.register("enderite_gold_boots",
            () -> new ArmorItem(EnderiteArmorTiers.ENDERITE_GOLD, EquipmentSlotType.FEET, (new Item.Properties()
                    .tab(AdvEnderite.TAB_ADVANCED_ENDERITE).fireResistant())));

    // ENDERITE/EMERALD
    public static final RegistryObject<Item> ENDERITE_EMERALD_HELMET = ITEMS.register("enderite_emerald_helmet",
            () -> new ArmorItem(EnderiteArmorTiers.ENDERITE_EMERALD, EquipmentSlotType.HEAD, (new Item.Properties()
                    .tab(AdvEnderite.TAB_ADVANCED_ENDERITE).fireResistant())));
    public static final RegistryObject<Item> ENDERITE_EMERALD_CHESTPLATE = ITEMS.register("enderite_emerald_chestplate",
            () -> new ArmorItem(EnderiteArmorTiers.ENDERITE_EMERALD, EquipmentSlotType.CHEST, (new Item.Properties()
                    .tab(AdvEnderite.TAB_ADVANCED_ENDERITE).fireResistant())));
    public static final RegistryObject<Item> ENDERITE_EMERALD_LEGGINGS = ITEMS.register("enderite_emerald_leggings",
            () -> new ArmorItem(EnderiteArmorTiers.ENDERITE_EMERALD, EquipmentSlotType.LEGS, (new Item.Properties()
                    .tab(AdvEnderite.TAB_ADVANCED_ENDERITE).fireResistant())));
    public static final RegistryObject<Item> ENDERITE_EMERALD_BOOTS = ITEMS.register("enderite_emerald_boots",
            () -> new ArmorItem(EnderiteArmorTiers.ENDERITE_EMERALD, EquipmentSlotType.FEET, (new Item.Properties()
                    .tab(AdvEnderite.TAB_ADVANCED_ENDERITE).fireResistant())));

    // BLOCK ITEMS
    public static final RegistryObject<Item> ENDERITE_IRON_BLOCKITEM = ITEMS.register("enderite_iron_block",
            () -> new BlockItem(BlockRegistry.ENDERITE_IRON_BLOCK.get(), new Item.Properties().tab(AdvEnderite.TAB_ADVANCED_ENDERITE).fireResistant()));
    public static final RegistryObject<Item> ENDERITE_GOLD_BLOCKITEM = ITEMS.register("enderite_gold_block",
            () -> new BlockItem(BlockRegistry.ENDERITE_GOLD_BLOCK.get(), new Item.Properties().tab(AdvEnderite.TAB_ADVANCED_ENDERITE).fireResistant()));
    public static final RegistryObject<Item> ENDERITE_EMERALD_BLOCKITEM = ITEMS.register("enderite_emerald_block",
            () -> new BlockItem(BlockRegistry.ENDERITE_EMERALD_BLOCK.get(), new Item.Properties().tab(AdvEnderite.TAB_ADVANCED_ENDERITE).fireResistant()));



}