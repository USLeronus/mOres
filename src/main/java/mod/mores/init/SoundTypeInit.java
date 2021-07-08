package mod.mores.init;

import mod.mores.Mores;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SoundTypeInit {
    public static final DeferredRegister<SoundEvent> SOUND_TYPES = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Mores.MOD_ID);

    public static final RegistryObject<SoundEvent> LIVING_DUCK_SOUND = SOUND_TYPES.register(
            "living_duck_sound", () -> new SoundEvent(new ResourceLocation(Mores.MOD_ID, "living_duck_sound")));
    public static final RegistryObject<SoundEvent> DYING_DUCK_SOUND = SOUND_TYPES.register(
            "dying_duck_sound", () -> new SoundEvent(new ResourceLocation(Mores.MOD_ID, "dying_duck_sound")));
    public static final RegistryObject<SoundEvent> HURT_DUCK_SOUND = SOUND_TYPES.register(
            "hurt_duck_sound", () -> new SoundEvent(new ResourceLocation(Mores.MOD_ID, "hurt_duck_sound")));

    public static final RegistryObject<SoundEvent> DARUDE_SANDSTORM = SOUND_TYPES.register(
            "darude_sandstorm", () -> new SoundEvent(new ResourceLocation(Mores.MOD_ID, "darude_sandstorm")));
    public static final RegistryObject<SoundEvent> RICK_ASTLEY = SOUND_TYPES.register(
            "rick_astley", () -> new SoundEvent(new ResourceLocation(Mores.MOD_ID, "rick_astley")));
}