
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package payloadmods.panmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PanmodModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("panmod", "fryingpan_01"), new SoundEvent(new ResourceLocation("panmod", "fryingpan_01")));
		REGISTRY.put(new ResourceLocation("panmod", "fryingpan_02"), new SoundEvent(new ResourceLocation("panmod", "fryingpan_02")));
		REGISTRY.put(new ResourceLocation("panmod", "fryingpan_03"), new SoundEvent(new ResourceLocation("panmod", "fryingpan_03")));
		REGISTRY.put(new ResourceLocation("panmod", "fryingpan_04"), new SoundEvent(new ResourceLocation("panmod", "fryingpan_04")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
