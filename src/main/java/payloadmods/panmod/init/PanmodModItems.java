
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package payloadmods.panmod.init;

import payloadmods.panmod.item.YellowNonstickPanItem;
import payloadmods.panmod.item.RedNonstickPanItem;
import payloadmods.panmod.item.PurpleNonstickPanItem;
import payloadmods.panmod.item.PinkNonstickPanItem;
import payloadmods.panmod.item.OrangeNonstickPanItem;
import payloadmods.panmod.item.MagentaNonstickPanItem;
import payloadmods.panmod.item.LimeNonstickPanItem;
import payloadmods.panmod.item.LightGreyNonstickPanItem;
import payloadmods.panmod.item.LightBlueNonstickPanItem;
import payloadmods.panmod.item.GreyNonstickPanItem;
import payloadmods.panmod.item.GreenNonstickPanItem;
import payloadmods.panmod.item.CyanNonstickPanItem;
import payloadmods.panmod.item.CopperNonstickPanItem;
import payloadmods.panmod.item.ColorableNonstickPanItem;
import payloadmods.panmod.item.CastIronPanItem;
import payloadmods.panmod.item.BrownNonstickPanItem;
import payloadmods.panmod.item.BlueNonstickPanItem;
import payloadmods.panmod.item.BlackNonstickPanItem;
import payloadmods.panmod.PanmodMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

public class PanmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PanmodMod.MODID);
	public static final RegistryObject<Item> CAST_IRON_PAN = REGISTRY.register("cast_iron_pan", () -> new CastIronPanItem());
	public static final RegistryObject<Item> COPPER_NONSTICK_PAN = REGISTRY.register("copper_nonstick_pan", () -> new CopperNonstickPanItem());
	public static final RegistryObject<Item> WHITE_NONSTICK_PAN = REGISTRY.register("white_nonstick_pan", () -> new ColorableNonstickPanItem());
	public static final RegistryObject<Item> RED_NONSTICK_PAN = REGISTRY.register("red_nonstick_pan", () -> new RedNonstickPanItem());
	public static final RegistryObject<Item> BLUE_NONSTICK_PAN = REGISTRY.register("blue_nonstick_pan", () -> new BlueNonstickPanItem());
	public static final RegistryObject<Item> BLACK_NONSTICK_PAN = REGISTRY.register("black_nonstick_pan", () -> new BlackNonstickPanItem());
	public static final RegistryObject<Item> BROWN_NONSTICK_PAN = REGISTRY.register("brown_nonstick_pan", () -> new BrownNonstickPanItem());
	public static final RegistryObject<Item> CYAN_NONSTICK_PAN = REGISTRY.register("cyan_nonstick_pan", () -> new CyanNonstickPanItem());
	public static final RegistryObject<Item> GREEN_NONSTICK_PAN = REGISTRY.register("green_nonstick_pan", () -> new GreenNonstickPanItem());
	public static final RegistryObject<Item> GREY_NONSTICK_PAN = REGISTRY.register("grey_nonstick_pan", () -> new GreyNonstickPanItem());
	public static final RegistryObject<Item> LIGHT_BLUE_NONSTICK_PAN = REGISTRY.register("light_blue_nonstick_pan", () -> new LightBlueNonstickPanItem());
	public static final RegistryObject<Item> LIGHT_GREY_NONSTICK_PAN = REGISTRY.register("light_grey_nonstick_pan", () -> new LightGreyNonstickPanItem());
	public static final RegistryObject<Item> LIME_NONSTICK_PAN = REGISTRY.register("lime_nonstick_pan", () -> new LimeNonstickPanItem());
	public static final RegistryObject<Item> MEGENTA_NONSTICK_PAN = REGISTRY.register("megenta_nonstick_pan", () -> new MagentaNonstickPanItem());
	public static final RegistryObject<Item> ORANGE_NONSTICK_PAN = REGISTRY.register("orange_nonstick_pan", () -> new OrangeNonstickPanItem());
	public static final RegistryObject<Item> PINK_NONSTICK_PAN = REGISTRY.register("pink_nonstick_pan", () -> new PinkNonstickPanItem());
	public static final RegistryObject<Item> PURPLE_NONSTICK_PAN = REGISTRY.register("purple_nonstick_pan", () -> new PurpleNonstickPanItem());
	public static final RegistryObject<Item> YELLOW_NONSTICK_PAN = REGISTRY.register("yellow_nonstick_pan", () -> new YellowNonstickPanItem());
}
