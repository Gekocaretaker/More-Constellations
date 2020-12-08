package com.gekocaretaker.mcas.common.registry;

import hellfirepvp.astralsorcery.AstralSorcery;
import hellfirepvp.astralsorcery.common.base.MoonPhase;
import hellfirepvp.astralsorcery.common.constellation.Constellation;
import hellfirepvp.astralsorcery.common.constellation.IConstellation;
import hellfirepvp.astralsorcery.common.constellation.SkyHandler;
import hellfirepvp.astralsorcery.common.constellation.star.StarLocation;
import hellfirepvp.astralsorcery.common.constellation.world.WorldContext;
import hellfirepvp.astralsorcery.common.lib.ItemsAS;
import hellfirepvp.astralsorcery.common.lib.TagsAS;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.World;
import net.minecraftforge.common.Tags;
import hellfirepvp.astralsorcery.common.registry.RegistryConstellations;

import static hellfirepvp.astralsorcery.common.lib.ColorsAS.*;
import static com.gekocaretaker.mcas.common.lib.ColorsMCAS.*;
import static hellfirepvp.astralsorcery.common.lib.ConstellationsAS.*;
import static com.gekocaretaker.mcas.common.lib.ConstellationsMCAS.*;

public class RegConstellations {
    public static void init() {
        buildConstellations();

        registerSignatureItems();
    }
    //
    private static void registerSignatureItems() {
        ignis.addSignatureItem(Tags.Items.DYES_RED);
        ignis.addSignatureItem(TagsAS.Items.INGOTS_STARMETAL);
        ignis.addSignatureItem(Tags.Items.ORES_COAL);
        ignis.addSignatureItem(Tags.Items.CROPS_NETHER_WART);
    }

    private static void buildConstellations() {
        StarLocation s11, s12, s13, s14, s15, s16, s17, s18, s19, s20;

        // Fire
        ignis = new Constellation.Major("ignis", CONSTELLATION_IGNIS);
        s11 = ignis.addStar(19,5);
        s12 = ignis.addStar(15,13);
        s13 = ignis.addStar(13,5);
        s14 = ignis.addStar(11,7);
        s15 = ignis.addStar(11,17);
        s16 = ignis.addStar(13,19);
        s17 = ignis.addStar(17,19);
        s18 = ignis.addStar(19,17);

        ignis.addConnection(s11, s12);
        ignis.addConnection(s12, s13);
        ignis.addConnection(s13, s14);
        ignis.addConnection(s14, s15);
        ignis.addConnection(s15, s16);
        ignis.addConnection(s16, s17);
        ignis.addConnection(s17, s18);
        ignis.addConnection(s18, s11);
        register(ignis);
    }

    private static void register(IConstellation cst) {
        AstralSorcery.getProxy().getRegistryPrimer().register(cst);
    }
}
