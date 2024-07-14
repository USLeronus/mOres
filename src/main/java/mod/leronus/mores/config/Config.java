package mod.leronus.mores.config;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import mod.leronus.mores.Mores;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.BooleanValue;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.loading.FMLPaths;

import java.io.File;

public class Config {
    public static CommentedFileConfig cfg;
    private static final ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();
    private static final String CATEGORY_ORES = "ores";
    private static final String SUB_CATEGORY_ORES_TIN = "tin";
    private static final String SUB_CATEGORY_ORES_SILVER = "silver";
    private static final String SUB_CATEGORY_ORES_COBALT = "cobalt";
    private static final String SUB_CATEGORY_ORES_TOPAZ = "topaz";
    private static final String SUB_CATEGORY_ORES_TOURMALINE = "tourmaline";
    private static final String SUB_CATEGORY_ORES_RUBY = "ruby";
    private static final String SUB_CATEGORY_ORES_SAPPHIRE = "sapphire";
    private static final String SUB_CATEGORY_ORES_MOISSANITE = "moissanite";
    private static final String SUB_CATEGORY_ORES_TANZANITE = "tanzanite";
    private static final String SUB_CATEGORY_ORES_TURQUOISE = "turquoise";
    private static final String SUB_CATEGORY_ORES_ONYX = "onyx";
    private static final String SUB_CATEGORY_ORES_ANTHRACITE = "anthracite";
    private static final String CATEGORY_SHIELDS = "shields";
    private static final String CATEGORY_ENTITY = "entities";
    private static final String CATEGORY_PAINTINGS = "paintings";
    private static final String CATEGORY_SOUNDS = "sounds";

    public static BooleanValue enableCustomPaintingsMores;
    public static BooleanValue spawnDuck;

    public static BooleanValue spawnTin;
    public static BooleanValue spawnCobalt;
    public static BooleanValue spawnSilver;
    public static BooleanValue spawnTourmaline;
    public static BooleanValue spawnTopaz;
    public static BooleanValue spawnMoissanite;
    public static BooleanValue spawnRuby;
    public static BooleanValue spawnSapphire;
    public static BooleanValue spawnTurquoise;
    public static BooleanValue spawnAnthracite;

    public static BooleanValue spawnTanzanite;
    public static BooleanValue spawnNetherMoissanite;
    public static BooleanValue spawnNetherRuby;
    public static BooleanValue spawnNetherSapphire;
    public static BooleanValue spawnNetherSilver;
    public static BooleanValue spawnNetherAnthracite;
    public static BooleanValue spawnEndOnyx;

    public static BooleanValue customShieldMaxReduction;
    public static ConfigValue<Integer> defaultDamageReduction;

    public static ConfigValue<Integer> tinDamageReduction;
    public static ConfigValue<Integer> copperDamageReduction;
    public static ConfigValue<Integer> silverDamageReduction;
    public static ConfigValue<Integer> bronzeDamageReduction;
    public static ConfigValue<Integer> cobaltDamageReduction;
    public static ConfigValue<Integer> obsidianDamageReduction;
    public static ConfigValue<Integer> sterlingDamageReduction;
    public static ConfigValue<Integer> steelDamageReduction;
    public static ConfigValue<Integer> amethystDamageReduction;
    public static ConfigValue<Integer> emeraldDamageReduction;
    public static ConfigValue<Integer> topazDamageReduction;
    public static ConfigValue<Integer> tourmalineDamageReduction;
    public static ConfigValue<Integer> tanzaniteDamageReduction;
    public static ConfigValue<Integer> rubyDamageReduction;
    public static ConfigValue<Integer> sapphireDamageReduction;
    public static ConfigValue<Integer> turquoiseDamageReduction;
    public static ConfigValue<Integer> moissaniteDamageReduction;
    public static ConfigValue<Integer> onyxDamageReduction;
    public static ConfigValue<Integer> grapheneDamageReduction;

    public static ConfigValue<Integer> tinDurability;
    public static ConfigValue<Integer> copperDurability;
    public static ConfigValue<Integer> silverDurability;
    public static ConfigValue<Integer> bronzeDurability;
    public static ConfigValue<Integer> cobaltDurability;
    public static ConfigValue<Integer> obsidianDurability;
    public static ConfigValue<Integer> sterlingDurability;
    public static ConfigValue<Integer> steelDurability;
    public static ConfigValue<Integer> amethystDurability;
    public static ConfigValue<Integer> emeraldDurability;
    public static ConfigValue<Integer> topazDurability;
    public static ConfigValue<Integer> tourmalineDurability;
    public static ConfigValue<Integer> tanzaniteDurability;
    public static ConfigValue<Integer> rubyDurability;
    public static ConfigValue<Integer> sapphireDurability;
    public static ConfigValue<Integer> turquoiseDurability;
    public static ConfigValue<Integer> moissaniteDurability;
    public static ConfigValue<Integer> onyxDurability;
    public static ConfigValue<Integer> grapheneDurability;


    public static ConfigValue<Integer> overworldTinUpperVeinsPerChunk;
    public static ConfigValue<Integer> overworldTinMiddleVeinsPerChunk;
    public static ConfigValue<Integer> overworldTinSmallVeinsPerChunk;
    public static ConfigValue<Integer> overworldSilverUpperVeinsPerChunk;
    public static ConfigValue<Integer> overworldSilverMiddleVeinsPerChunk;
    public static ConfigValue<Integer> overworldSilverSmallVeinsPerChunk;
    public static ConfigValue<Integer> overworldCobaltUpperVeinsPerChunk;
    public static ConfigValue<Integer> overworldCobaltMiddleVeinsPerChunk;
    public static ConfigValue<Integer> overworldCobaltSmallVeinsPerChunk;
    public static ConfigValue<Integer> overworldTourmalineSmallVeinsPerChunk;
    public static ConfigValue<Integer> overworldTourmalineLargeVeinsPerChunk;
    public static ConfigValue<Integer> overworldTourmalineBuriedVeinsPerChunk;
    public static ConfigValue<Integer> overworldTopazSmallVeinsPerChunk;
    public static ConfigValue<Integer> overworldTopazLargeVeinsPerChunk;
    public static ConfigValue<Integer> overworldTopazBuriedVeinsPerChunk;
    public static ConfigValue<Integer> overworldSapphireSmallVeinsPerChunk;
    public static ConfigValue<Integer> overworldSapphireLargeVeinsPerChunk;
    public static ConfigValue<Integer> overworldSapphireBuriedVeinsPerChunk;
    public static ConfigValue<Integer> overworldRubySmallVeinsPerChunk;
    public static ConfigValue<Integer> overworldRubyLargeVeinsPerChunk;
    public static ConfigValue<Integer> overworldRubyBuriedVeinsPerChunk;
    public static ConfigValue<Integer> overworldTurquoiseSmallVeinsPerChunk;
    public static ConfigValue<Integer> overworldTurquoiseLargeVeinsPerChunk;
    public static ConfigValue<Integer> overworldTurquoiseBuriedVeinsPerChunk;
    public static ConfigValue<Integer> overworldMoissaniteSmallVeinsPerChunk;
    public static ConfigValue<Integer> overworldMoissaniteLargeVeinsPerChunk;
    public static ConfigValue<Integer> overworldMoissaniteBuriedVeinsPerChunk;
    public static ConfigValue<Integer> netherMoissaniteVeinsPerChunk;
    public static ConfigValue<Integer> netherTanzaniteVeinsPerChunk;
    public static ConfigValue<Integer> netherSilverVeinsPerChunk;
    public static ConfigValue<Integer> endOnyxVeinsPerChunk;
    public static ConfigValue<Integer> netherSapphireVeinsPerChunk;
    public static ConfigValue<Integer> netherRubyVeinsPerChunk;
    public static ConfigValue<Integer> anthraciteUpperVeinsPerChunk;
    public static ConfigValue<Integer> anthraciteLowerVeinsPerChunk;
    public static ConfigValue<Integer> netherAnthraciteVeinsPerChunk;

    public static ConfigValue<Integer> overworldTinUpperTop;
    public static ConfigValue<Integer> overworldSilverUpperTop;
    public static ConfigValue<Integer> overworldCobaltUpperTop;
    public static ConfigValue<Integer> overworldTinUpperBottom;
    public static ConfigValue<Integer> overworldSilverUpperBottom;
    public static ConfigValue<Integer> overworldCobaltUpperBottom;
    public static ConfigValue<Integer> overworldAnthraciteUpperBottom;

    public static ConfigValue<Integer> overworldTinMiddleTop;
    public static ConfigValue<Integer> overworldSilverMiddleTop;
    public static ConfigValue<Integer> overworldCobaltMiddleTop;
    public static ConfigValue<Integer> overworldTinMiddleBottom;
    public static ConfigValue<Integer> overworldSilverMiddleBottom;
    public static ConfigValue<Integer> overworldCobaltMiddleBottom;
    public static ConfigValue<Integer> overworldTinSmallTop;
    public static ConfigValue<Integer> overworldSilverSmallTop;
    public static ConfigValue<Integer> overworldCobaltSmallTop;

    public static ConfigValue<Integer> overworldTopazSmallTop;
    public static ConfigValue<Integer> overworldTourmalineSmallTop;
    public static ConfigValue<Integer> overworldRubySmallTop;
    public static ConfigValue<Integer> overworldSapphireSmallTop;
    public static ConfigValue<Integer> overworldTurquoiseSmallTop;
    public static ConfigValue<Integer> overworldMoissaniteSmallTop;
    public static ConfigValue<Integer> overworldTopazSmallBottom;
    public static ConfigValue<Integer> overworldTourmalineSmallBottom;
    public static ConfigValue<Integer> overworldRubySmallBottom;
    public static ConfigValue<Integer> overworldSapphireSmallBottom;
    public static ConfigValue<Integer> overworldTurquoiseSmallBottom;
    public static ConfigValue<Integer> overworldMoissaniteSmallBottom;

    public static ConfigValue<Integer> overworldTopazLargeTop;
    public static ConfigValue<Integer> overworldTourmalineLargeTop;
    public static ConfigValue<Integer> overworldRubyLargeTop;
    public static ConfigValue<Integer> overworldSapphireLargeTop;
    public static ConfigValue<Integer> overworldTurquoiseLargeTop;
    public static ConfigValue<Integer> overworldMoissaniteLargeTop;
    public static ConfigValue<Integer> overworldTopazLargeBottom;
    public static ConfigValue<Integer> overworldTourmalineLargeBottom;
    public static ConfigValue<Integer> overworldRubyLargeBottom;
    public static ConfigValue<Integer> overworldSapphireLargeBottom;
    public static ConfigValue<Integer> overworldTurquoiseLargeBottom;
    public static ConfigValue<Integer> overworldMoissaniteLargeBottom;

    public static ConfigValue<Integer> overworldTopazBuriedTop;
    public static ConfigValue<Integer> overworldTourmalineBuriedTop;
    public static ConfigValue<Integer> overworldRubyBuriedTop;
    public static ConfigValue<Integer> overworldSapphireBuriedTop;
    public static ConfigValue<Integer> overworldTurquoiseBuriedTop;
    public static ConfigValue<Integer> overworldMoissaniteBuriedTop;
    public static ConfigValue<Integer> overworldTopazBuriedBottom;
    public static ConfigValue<Integer> overworldTourmalineBuriedBottom;
    public static ConfigValue<Integer> overworldRubyBuriedBottom;
    public static ConfigValue<Integer> overworldSapphireBuriedBottom;
    public static ConfigValue<Integer> overworldTurquoiseBuriedBottom;
    public static ConfigValue<Integer> overworldMoissaniteBuriedBottom;

    public static ConfigValue<Integer> overworldAnthraciteLowerBottom;
    public static ConfigValue<Integer> overworldAnthraciteLowerTop;
    public static ConfigValue<Integer> endOnyxTop;
    public static ConfigValue<Integer> endOnyxBottom;

    public static ConfigValue<Integer> netherSilverTop;
    public static ConfigValue<Integer> netherTanzaniteTop;
    public static ConfigValue<Integer> netherRubyTop;
    public static ConfigValue<Integer> netherSapphireTop;
    public static ConfigValue<Integer> netherMoissaniteTop;
    public static ConfigValue<Integer> netherSilverBottom;
    public static ConfigValue<Integer> netherTanzaniteBottom;
    public static ConfigValue<Integer> netherRubyBottom;
    public static ConfigValue<Integer> netherSapphireBottom;
    public static ConfigValue<Integer> netherMoissaniteBottom;
    public static ConfigValue<Integer> netherAnthraciteBottom;
    public static ConfigValue<Integer> netherAnthraciteTop;

    public static BooleanValue thornsOnShields;
    public static BooleanValue enableDamageReduction;

    public static BooleanValue enableCustomDeathSounds;
    public static BooleanValue enableCustomPlayerSleepingSound;
    public static BooleanValue enableCustomPlayerHurtSound;

    public static ForgeConfigSpec spec;

    public Config() {
        cfg = CommentedFileConfig
                .builder(new File(FMLPaths.CONFIGDIR.get().toString(), Mores.MODID + ".toml")).sync()
                .autosave().build();
        cfg.load();
        Config();
        ForgeConfigSpec spec = builder.build();
        Config.spec = spec;
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, spec, cfg.getFile().getName());
        spec.setConfig(cfg);
    }

    public static void Config(){
        builder.comment("""
                The ore configuration for this mod\s

                Metal ores (tin, silver, cobalt) are generated in 3 separate veins;
                \tfrequent veins relatively high in the world, referred to as 'upper'
                \tmedium veins distributed fairly evenly across the middle layer of the world, referred to as 'middle'
                \tsmaller veins that are generated in a very wide radius, referred to as 'small'
                
                For the 'upper' and 'middle' generation methods, the number is the amount of vertical blocks from bedrock (usually y=-64).
                For example, overworldTinUpperMaxHeight default value is 210 which means the ores will spawn up to a maximum height of -64 + 210 -> y = 146
                
                The 'small' generation methods are different. The minimum height is bedrock and the maximum height is the absolute y-level.
                For example, overworldTinSmallMaxHeight default value is -40 which means the ores will spawn up to a maximum height of y=-40

                Gem ores are also generated in 3 separate veins; Referred to as 'small', 'large' and 'buried'
                Ores that have been generated buried means they will not spawn in contact with air, meaning they are rare.
                The values for the vertical anchors correspond to the y value in your Minecraft world.
                
                These values may also be below the world border of y=-64.
                
                * Buried means an ore has less chance to spawn if the block next to it is air (no block).
                """).push(CATEGORY_ORES);

//        spawnTin = getBoolean(builder,"spawnTin", SUB_CATEGORY_ORES_TIN, true, "Should tin spawn in the overworld");
        overworldTinUpperVeinsPerChunk = getInt(builder,"overworldTinUpperVeinsPerChunk", SUB_CATEGORY_ORES_TIN, 12, 0, 100,"The amount of tin ore veins per chunk for the upper layer");
        overworldTinUpperBottom = getInt(builder,"overworldTinUpperMinHeight", SUB_CATEGORY_ORES_TIN, 85, 0, 256,"Minimum height from the bottom for the upper layer of tin ores");
        overworldTinUpperTop = getInt(builder,"overworldTinUpperMaxHeight", SUB_CATEGORY_ORES_TIN, 210, 0, 256,"Maximum height from the bottom for the upper layer of tin ores");
        overworldTinMiddleVeinsPerChunk = getInt(builder,"overworldTinMiddleVeinsPerChunk", SUB_CATEGORY_ORES_TIN, 7, 0, 100,"The amount of tin ore veins per chunk for the middle layer");
        overworldTinMiddleBottom = getInt(builder,"overworldTinMiddleMinHeight", SUB_CATEGORY_ORES_TIN, 40,0, 256, "Minimum height from the bottom for the middle layer of tin ores");
        overworldTinMiddleTop = getInt(builder,"overworldTinMiddleMaxHeight", SUB_CATEGORY_ORES_TIN, 85,0, 256, "Maximum height from the bottom for the middle layer of tin ores");
        overworldTinSmallVeinsPerChunk = getInt(builder,"overworldTinSmallVeinsPerChunk", SUB_CATEGORY_ORES_TIN, 3, 0, 100,"The amount of small tin ore veins per chunk");
        overworldTinSmallTop = getInt(builder,"overworldTinSmallMaxHeight", SUB_CATEGORY_ORES_TIN, -40, -64, 191,"Maximum VERTICAL Y-LEVEL for tin ore generation in small veins - NOTE: This generation method differs from the others. The bottom anchor for this generation cannot be changed (starts spawning from bedrock; y=-64)");


//        spawnSilver = getBoolean(builder,"spawnSilver", SUB_CATEGORY_ORES_SILVER, true, "Should silver spawn in the overworld");
        overworldSilverUpperVeinsPerChunk = getInt(builder,"overworldSilverUpperVeinsPerChunk", SUB_CATEGORY_ORES_SILVER, 11, 0, 100,"The amount of silver ore veins per chunk for the upper layer");
        overworldSilverUpperBottom = getInt(builder,"overworldSilverUpperMinHeight", SUB_CATEGORY_ORES_SILVER, 90,0, 256, "Minimum height from the bottom for the upper layer of silver ores");
        overworldSilverUpperTop = getInt(builder,"overworldSilverUpperMaxHeight", SUB_CATEGORY_ORES_SILVER, 190, 0, 256,"Maximum height from the bottom for the upper layer of silver ores");
        overworldSilverMiddleVeinsPerChunk = getInt(builder,"overworldSilverMiddleVeinsPerChunk", SUB_CATEGORY_ORES_SILVER, 8, 0, 100,"The amount of silver ore veins per chunk for the middle layer");
        overworldSilverMiddleBottom = getInt(builder,"overworldSilverMiddleMinHeight", SUB_CATEGORY_ORES_SILVER, 60,0, 256, "Minimum height from the bottom for the upper layer of silver ores");
        overworldSilverMiddleTop = getInt(builder,"overworldSilverMiddleMaxHeight", SUB_CATEGORY_ORES_SILVER, 90, 0, 256,"Maximum height from the bottom for the middle layer of silver ores");
        overworldSilverSmallVeinsPerChunk = getInt(builder,"overworldSilverSmallVeinsPerChunk", SUB_CATEGORY_ORES_SILVER, 4, 0, 100,"The amount of small silver ore veins per chunk for the upper layer");
        overworldSilverSmallTop = getInt(builder,"overworldSilverSmallMaxHeight", SUB_CATEGORY_ORES_SILVER, 0, -64, 191, "Maximum VERTICAL Y-LEVEL for silver ore generation in small veins - NOTE: This generation method differs from the others. The bottom anchor for this generation cannot be changed (starts spawning from bedrock; y=-64)");

//        spawnCobalt = getBoolean(builder,"spawnCobalt", SUB_CATEGORY_ORES_COBALT, true, "Should cobalt spawn in the overworld");
        overworldCobaltUpperVeinsPerChunk = getInt(builder,"overworldCobaltUpperVeinsPerChunk", SUB_CATEGORY_ORES_COBALT, 6, 0, 100,"The amount of cobalt ore veins per chunk for the upper layer");
        overworldCobaltUpperBottom = getInt(builder,"overworldCobaltUpperMinHeight", SUB_CATEGORY_ORES_COBALT, 100,0, 256, "Minimum height from the bottom for the upper layer of cobalt ores");
        overworldCobaltUpperTop = getInt(builder,"overworldCobaltUpperMaxHeight", SUB_CATEGORY_ORES_COBALT, 120, 0, 256,"Maximum height from the bottom for the upper layer of cobalt ores");
        overworldCobaltMiddleVeinsPerChunk = getInt(builder,"overworldCobaltMiddleVeinsPerChunk", SUB_CATEGORY_ORES_COBALT, 12, 0, 100,"The amount of cobalt ore veins per chunk for the middle layer");
        overworldCobaltMiddleBottom = getInt(builder,"overworldCobaltMiddleMinHeight", SUB_CATEGORY_ORES_COBALT, 60,0, 256, "Minimum height from the bottom for the upper layer of cobalt ores");
        overworldCobaltMiddleTop = getInt(builder,"overworldCobaltMiddleMaxHeight", SUB_CATEGORY_ORES_COBALT, 100, 0, 256,"Maximum height from the bottom for the middle layer of cobalt ores");
        overworldCobaltSmallVeinsPerChunk = getInt(builder,"overworldCobaltSmallVeinsPerChunk", SUB_CATEGORY_ORES_COBALT, 5, 0, 100,"The amount of small cobalt ore veins per chunk for the upper layer");
        overworldCobaltSmallTop = getInt(builder,"overworldCobaltSmallMaxHeight", SUB_CATEGORY_ORES_COBALT, -10,-64, 191,  "Maximum VERTICAL Y-LEVEL for cobalt ore generation in small veins - NOTE: This generation method differs from the others. The bottom anchor for this generation cannot be changed (starts spawning from bedrock; y=-64)");

//        spawnTourmaline = getBoolean(builder,"spawnTourmaline", SUB_CATEGORY_ORES_TOURMALINE, true, "Should tourmaline spawn in the overworld");
        overworldTourmalineSmallVeinsPerChunk = getInt(builder,"overworldTourmalineSmallVeinsPerChunk", SUB_CATEGORY_ORES_TOURMALINE, 9, 0, 100,"The amount of small tourmaline ore veins per chunk");
        overworldTourmalineSmallBottom = getInt(builder,"overworldTourmalineSmallMinHeight", SUB_CATEGORY_ORES_TOURMALINE, -64, -64, 256, "Minimum height from the bottom for the upper layer of tourmaline ores");
        overworldTourmalineSmallTop = getInt(builder,"overworldTourmalineSmallMaxHeight", SUB_CATEGORY_ORES_TOURMALINE, 110, -64, 256, "Maximum height from the bottom for the upper layer of tourmaline ores");
        overworldTourmalineLargeVeinsPerChunk = getInt(builder,"overworldTourmalineLargeVeinsPerChunk", SUB_CATEGORY_ORES_TOURMALINE, 8, 0, 100,"The amount of large tourmaline ore veins per chunk");
        overworldTourmalineLargeBottom = getInt(builder,"overworldTourmalineLargeMinHeight", SUB_CATEGORY_ORES_TOURMALINE, -64, -64, 256, "Minimum height from the bottom for the upper layer of tourmaline ores");
        overworldTourmalineLargeTop = getInt(builder,"overworldTourmalineLargeMaxHeight", SUB_CATEGORY_ORES_TOURMALINE, 110, -64, 256, "Maximum height from the bottom for the middle layer of tourmaline ores");
        overworldTourmalineBuriedVeinsPerChunk = getInt(builder,"overworldTourmalineBuriedVeinsPerChunk", SUB_CATEGORY_ORES_TOURMALINE, 5, 0, 100,"The amount of buried* tourmaline ore veins per chunk");
        overworldTourmalineBuriedBottom = getInt(builder,"overworldTourmalineBuriedMinHeight", SUB_CATEGORY_ORES_TOURMALINE, -64,-64, 256,  "Minimum height from the bottom for the buried layer of tourmaline ores");
        overworldTourmalineBuriedTop = getInt(builder,"overworldTourmalineBuriedMaxHeight", SUB_CATEGORY_ORES_TOURMALINE, 110,-64, 256,  "Maximum height from the bottom for the buried layer of tourmaline ores");

//        spawnTopaz = getBoolean(builder,"spawnTopaz", SUB_CATEGORY_ORES_TOPAZ, true, "Should topaz spawn in the overworld");
        overworldTopazSmallVeinsPerChunk = getInt(builder,"overworldTopazSmallVeinsPerChunk", SUB_CATEGORY_ORES_TOPAZ, 7, 0, 100,"The amount of small topaz ore veins per chunk");
        overworldTopazSmallBottom = getInt(builder,"overworldTopazSmallMinHeight", SUB_CATEGORY_ORES_TOPAZ, -64, -64, 256, "Minimum height from the bottom for the upper layer of topaz ores");
        overworldTopazSmallTop = getInt(builder,"overworldTopazSmallMaxHeight", SUB_CATEGORY_ORES_TOPAZ, 95,-64, 256,  "Maximum height from the bottom for the upper layer of topaz ores");
        overworldTopazLargeVeinsPerChunk = getInt(builder,"overworldTopazLargeVeinsPerChunk", SUB_CATEGORY_ORES_TOPAZ, 10, 0, 100,"The amount of large topaz ore veins per chunk");
        overworldTopazLargeBottom = getInt(builder,"overworldTopazLargeMinHeight", SUB_CATEGORY_ORES_TOPAZ, -64, -64, 256, "Minimum height from the bottom for the upper layer of topaz ores");
        overworldTopazLargeTop = getInt(builder,"overworldTopazLargeMaxHeight", SUB_CATEGORY_ORES_TOPAZ, 95, -64, 256, "Maximum height from the bottom for the middle layer of topaz ores");
        overworldTopazBuriedVeinsPerChunk = getInt(builder,"overworldTopazBuriedVeinsPerChunk", SUB_CATEGORY_ORES_TOPAZ, 6, 0, 100,"The amount of buried* topaz ore veins per chunk");
        overworldTopazBuriedBottom = getInt(builder,"overworldTopazBuriedMinHeight", SUB_CATEGORY_ORES_TOPAZ, -64, -64, 256, "Minimum height from the bottom for the buried layer of topaz ores");
        overworldTopazBuriedTop = getInt(builder,"overworldTopazBuriedMaxHeight", SUB_CATEGORY_ORES_TOPAZ, 95,-64, 256,  "Maximum height from the bottom for the buried layer of topaz ores");

//        spawnSapphire = getBoolean(builder,"spawnSapphire", SUB_CATEGORY_ORES_SAPPHIRE, true, "Should sapphire spawn in the overworld");
        overworldSapphireSmallVeinsPerChunk = getInt(builder,"overworldSapphireSmallVeinsPerChunk", SUB_CATEGORY_ORES_SAPPHIRE, 6, 0, 100,"The amount of small sapphire ore veins per chunk");
        overworldSapphireSmallBottom = getInt(builder,"overworldSapphireSmallMinHeight", SUB_CATEGORY_ORES_SAPPHIRE, -64,-64, 256,  "Minimum height from the bottom for the upper layer of sapphire ores");
        overworldSapphireSmallTop = getInt(builder,"overworldSapphireSmallMaxHeight", SUB_CATEGORY_ORES_SAPPHIRE, 65, -64, 256, "Maximum height from the bottom for the upper layer of sapphire ores");
        overworldSapphireLargeVeinsPerChunk = getInt(builder,"overworldSapphireLargeVeinsPerChunk", SUB_CATEGORY_ORES_SAPPHIRE, 7, 0, 100,"The amount of large sapphire ore veins per chunk");
        overworldSapphireLargeBottom = getInt(builder,"overworldSapphireLargeMinHeight", SUB_CATEGORY_ORES_SAPPHIRE, -64,-64, 256,  "Minimum height from the bottom for the upper layer of sapphire ores");
        overworldSapphireLargeTop = getInt(builder,"overworldSapphireLargeMaxHeight", SUB_CATEGORY_ORES_SAPPHIRE, 65, -64, 256, "Maximum height from the bottom for the middle layer of sapphire ores");
        overworldSapphireBuriedVeinsPerChunk = getInt(builder,"overworldSapphireBuriedVeinsPerChunk", SUB_CATEGORY_ORES_SAPPHIRE, 5, 0, 100,"The amount of buried* sapphire ore veins per chunk");
        overworldSapphireBuriedBottom = getInt(builder,"overworldSapphireBuriedMinHeight", SUB_CATEGORY_ORES_SAPPHIRE, -64,-64, 256,  "Minimum height from the bottom for the buried layer of sapphire ores");
        overworldSapphireBuriedTop = getInt(builder,"overworldSapphireBuriedMaxHeight", SUB_CATEGORY_ORES_SAPPHIRE, 65,-64, 256,  "Maximum height from the bottom for the buried layer of sapphire ores");

//        spawnRuby = getBoolean(builder,"spawnRuby", SUB_CATEGORY_ORES_RUBY, true, "Should ruby spawn in the overworld");
        overworldRubySmallVeinsPerChunk = getInt(builder,"overworldRubySmallVeinsPerChunk", SUB_CATEGORY_ORES_RUBY, 5, 0, 100,"The amount of small ruby ore veins per chunk");
        overworldRubySmallBottom = getInt(builder,"overworldRubySmallMinHeight", SUB_CATEGORY_ORES_RUBY, -64, -64, 256, "Minimum height from the bottom for the upper layer of ruby ores");
        overworldRubySmallTop = getInt(builder,"overworldRubySmallMaxHeight", SUB_CATEGORY_ORES_RUBY, 70, -64, 256,"Maximum height from the bottom for the upper layer of ruby ores");
        overworldRubyLargeVeinsPerChunk = getInt(builder,"overworldRubyLargeVeinsPerChunk", SUB_CATEGORY_ORES_RUBY, 6, 0, 100,"The amount of large ruby ore veins per chunk");
        overworldRubyLargeBottom = getInt(builder,"overworldRubyLargeMinHeight", SUB_CATEGORY_ORES_RUBY, -64,-64, 256, "Minimum height from the bottom for the upper layer of ruby ores");
        overworldRubyLargeTop = getInt(builder,"overworldRubyLargeMaxHeight", SUB_CATEGORY_ORES_RUBY, 70, -64, 256,"Maximum height from the bottom for the middle layer of ruby ores");
        overworldRubyBuriedVeinsPerChunk = getInt(builder,"overworldRubyBuriedVeinsPerChunk", SUB_CATEGORY_ORES_RUBY, 4, 0, 100,"The amount of buried* ruby ore veins per chunk");
        overworldRubyBuriedBottom = getInt(builder,"overworldRubyBuriedMinHeight", SUB_CATEGORY_ORES_RUBY, -64,-64, 256, "Minimum height from the bottom for the buried layer of ruby ores");
        overworldRubyBuriedTop = getInt(builder,"overworldRubyBuriedMaxHeight", SUB_CATEGORY_ORES_RUBY, 70, -64, 256,"Maximum height from the bottom for the buried layer of ruby ores");

//        spawnTurquoise = getBoolean(builder,"spawnTurquoise", SUB_CATEGORY_ORES_TURQUOISE, true, "Should turquoise spawn in the overworld");
        overworldTurquoiseSmallVeinsPerChunk = getInt(builder,"overworldTurquoiseSmallVeinsPerChunk", SUB_CATEGORY_ORES_TURQUOISE, 13, 0, 100,"The amount of small turquoise ore veins per chunk");
        overworldTurquoiseSmallBottom = getInt(builder,"overworldTurquoiseSmallMinHeight", SUB_CATEGORY_ORES_TURQUOISE, -64, -64, 256,"Minimum height from the bottom for the upper layer of turquoise ores");
        overworldTurquoiseSmallTop = getInt(builder,"overworldTurquoiseSmallMaxHeight", SUB_CATEGORY_ORES_TURQUOISE, 20,-64, 256, "Maximum height from the bottom for the upper layer of turquoise ores");
        overworldTurquoiseLargeVeinsPerChunk = getInt(builder,"overworldTurquoiseLargeVeinsPerChunk", SUB_CATEGORY_ORES_TURQUOISE, 17, 0, 100,"The amount of large turquoise ore veins per chunk");
        overworldTurquoiseLargeBottom = getInt(builder,"overworldTurquoiseLargeMinHeight", SUB_CATEGORY_ORES_TURQUOISE, -64,-64, 256, "Minimum height from the bottom for the upper layer of turquoise ores");
        overworldTurquoiseLargeTop = getInt(builder,"overworldTurquoiseLargeMaxHeight", SUB_CATEGORY_ORES_TURQUOISE, 20,-64, 256, "Maximum height from the bottom for the middle layer of turquoise ores");
        overworldTurquoiseBuriedVeinsPerChunk = getInt(builder,"overworldTurquoiseBuriedVeinsPerChunk", SUB_CATEGORY_ORES_TURQUOISE, 10, 0, 100,"The amount of buried* turquoise ore veins per chunk");
        overworldTurquoiseBuriedBottom = getInt(builder,"overworldTurquoiseBuriedMinHeight", SUB_CATEGORY_ORES_TURQUOISE, -64,-64, 256, "Minimum height from the bottom for the buried layer of turquoise ores");
        overworldTurquoiseBuriedTop = getInt(builder,"overworldTurquoiseBuriedMaxHeight", SUB_CATEGORY_ORES_TURQUOISE, 20,-64, 256, "Maximum height from the bottom for the buried layer of turquoise ores");

//        spawnMoissanite = getBoolean(builder,"spawnMoissanite", SUB_CATEGORY_ORES_MOISSANITE, true, "Should moissanite spawn in the overworld");
        overworldMoissaniteSmallVeinsPerChunk = getInt(builder,"overworldMoissaniteSmallVeinsPerChunk", SUB_CATEGORY_ORES_MOISSANITE, 6, 0, 100,"The amount of small moissanite ore veins per chunk");
        overworldMoissaniteSmallBottom = getInt(builder,"overworldMoissaniteSmallMinHeight", SUB_CATEGORY_ORES_MOISSANITE, -64,-64, 256, "Minimum height from the bottom for the upper layer of moissanite ores");
        overworldMoissaniteSmallTop = getInt(builder,"overworldMoissaniteSmallMaxHeight", SUB_CATEGORY_ORES_MOISSANITE, 40, -64, 256,"Maximum height from the bottom for the upper layer of moissanite ores");
        overworldMoissaniteLargeVeinsPerChunk = getInt(builder,"overworldMoissaniteLargeVeinsPerChunk", SUB_CATEGORY_ORES_MOISSANITE, 4, 0, 100,"The amount of large moissanite ore veins per chunk");
        overworldMoissaniteLargeBottom = getInt(builder,"overworldMoissaniteLargeMinHeight", SUB_CATEGORY_ORES_MOISSANITE, -64,-64, 256, "Minimum height from the bottom for the upper layer of moissanite ores");
        overworldMoissaniteLargeTop = getInt(builder,"overworldMoissaniteLargeMaxHeight", SUB_CATEGORY_ORES_MOISSANITE, 40, -64, 256,"Maximum height from the bottom for the middle layer of moissanite ores");
        overworldMoissaniteBuriedVeinsPerChunk = getInt(builder,"overworldMoissaniteBuriedVeinsPerChunk", SUB_CATEGORY_ORES_MOISSANITE, 3, 0, 100,"The amount of buried* moissanite ore veins per chunk");
        overworldMoissaniteBuriedBottom = getInt(builder,"overworldMoissaniteBuriedMinHeight", SUB_CATEGORY_ORES_MOISSANITE, -64,-64, 256, "Minimum height from the bottom for the buried layer of moissanite ores");
        overworldMoissaniteBuriedTop = getInt(builder,"overworldMoissaniteBuriedMaxHeight", SUB_CATEGORY_ORES_MOISSANITE, 40,-64, 256, "Maximum height from the bottom for the buried layer of moissanite ores");

//        spawnNetherMoissanite = getBoolean(builder,"spawnNetherMoissanite", SUB_CATEGORY_ORES_MOISSANITE, true, "Should moissanite spawn in the nether");
        netherMoissaniteVeinsPerChunk = getInt(builder,"netherMoissaniteVeinsPerChunk", SUB_CATEGORY_ORES_MOISSANITE, 7, 0, 100,"The amount of nether moissanite ore veins per chunk");
        netherMoissaniteBottom = getInt(builder,"netherMoissaniteMinHeight", SUB_CATEGORY_ORES_MOISSANITE, -64,-64, 256, "Minimum height from the bottom for nether moissanite ore");
        netherMoissaniteTop = getInt(builder,"netherMoissaniteMaxHeight", SUB_CATEGORY_ORES_MOISSANITE, 256, -64, 256, "Maximum height from the bottom for nether moissanite ore");

//        spawnTanzanite = getBoolean(builder,"spawnTanzanite", SUB_CATEGORY_ORES_TANZANITE, true, "Should tanzanite spawn in the nether");
        netherTanzaniteVeinsPerChunk = getInt(builder,"netherTanzaniteVeinsPerChunk", SUB_CATEGORY_ORES_TANZANITE, 10, 0, 100,"The amount of nether tanzanite ore veins per chunk");
        netherTanzaniteBottom = getInt(builder,"netherTanzaniteMinHeight", SUB_CATEGORY_ORES_TANZANITE, -64, -64, 256, "Minimum height from the bottom for nether tanzanite ore");
        netherTanzaniteTop = getInt(builder,"netherTanzaniteMaxHeight", SUB_CATEGORY_ORES_TANZANITE, 256, -64, 256, "Maximum height from the bottom for nether tanzanite ore");

//        spawnNetherSilver = getBoolean(builder,"spawnNetherSilver", SUB_CATEGORY_ORES_SILVER, true, "Should silver spawn in the nether");
        netherSilverVeinsPerChunk = getInt(builder,"netherSilverVeinsPerChunk", SUB_CATEGORY_ORES_SILVER, 18, 0, 100,"The amount of nether silver ore veins per chunk");
        netherSilverBottom = getInt(builder,"netherSilverMinHeight", SUB_CATEGORY_ORES_SILVER, -64, -64, 256, "Minimum height from the bottom for nether silver ore");
        netherSilverTop = getInt(builder,"netherSilverMaxHeight", SUB_CATEGORY_ORES_SILVER, 256, -64, 256, "Maximum height from the bottom for nether silver ore");

//        spawnEndOnyx = getBoolean(builder,"spawnEndOnyx", SUB_CATEGORY_ORES_ONYX, true, "Should onyx spawn in the end");
        endOnyxVeinsPerChunk = getInt(builder,"endOnyxVeinsPerChunk", SUB_CATEGORY_ORES_ONYX, 7, 0, 100,"The amount of end onyx ore veins per chunk");
        endOnyxBottom = getInt(builder,"endOnyxMinHeight", SUB_CATEGORY_ORES_ONYX, -64,-64, 256,  "Minimum height from the bottom for end onyx ore");
        endOnyxTop = getInt(builder,"endOnyxMaxHeight", SUB_CATEGORY_ORES_ONYX, 256, -64, 256, "Maximum height from the bottom for end onyx ore");

//        spawnNetherSapphire = getBoolean(builder,"spawnNetherSapphire", SUB_CATEGORY_ORES_SAPPHIRE, true, "Should sapphire spawn in the nether");
        netherSapphireVeinsPerChunk = getInt(builder,"netherSapphireVeinsPerChunk", SUB_CATEGORY_ORES_SAPPHIRE, 4, 0, 100,"The amount of nether sapphire ore veins per chunk");
        netherSapphireBottom = getInt(builder,"netherSapphireMinHeight", SUB_CATEGORY_ORES_SAPPHIRE, -64, -64, 256, "Minimum height from the bottom for nether sapphire ore");
        netherSapphireTop = getInt(builder,"netherSapphireMaxHeight", SUB_CATEGORY_ORES_SAPPHIRE, 256, -64, 256, "Maximum height from the bottom for nether sapphire ore");

//        spawnNetherRuby = getBoolean(builder,"spawnNetherRuby", SUB_CATEGORY_ORES_RUBY, true, "Should ruby spawn in the nether");
        netherRubyVeinsPerChunk = getInt(builder,"netherRubyVeinsPerChunk", SUB_CATEGORY_ORES_RUBY, 4, 0, 100,"The amount of nether ruby ore veins per chunk");
        netherRubyBottom = getInt(builder,"netherRubyMinHeight", SUB_CATEGORY_ORES_RUBY, -64,-64, 256,  "Minimum height from the bottom for nether ruby ore");
        netherRubyTop = getInt(builder,"netherRubyMaxHeight", SUB_CATEGORY_ORES_RUBY, 256, -64, 256, "Maximum height from the bottom for nether ruby ore");

//        spawnAnthracite = getBoolean(builder,"spawnAnthracite", SUB_CATEGORY_ORES_ANTHRACITE, true, "Should anthracite spawn in the overworld");
        anthraciteUpperVeinsPerChunk = getInt(builder,"anthraciteUpperVeinsPerChunk", SUB_CATEGORY_ORES_ANTHRACITE, 9, 0, 100,"The amount of anthracite ore veins per chunk for the upper layer");
        overworldAnthraciteUpperBottom = getInt(builder,"anthraciteUpperMinHeight", SUB_CATEGORY_ORES_ANTHRACITE, -64,-64, 256,  "Minimum height from the bottom for upper layer anthracite ore (Maximum height cannot be changed due to vertical anchor top!)");
        anthraciteLowerVeinsPerChunk = getInt(builder,"anthraciteLowerVeinsPerChunk", SUB_CATEGORY_ORES_ANTHRACITE, 6, 0, 100,"The amount of anthracite ore veins per chunk for the bottom layer");
        overworldAnthraciteLowerBottom = getInt(builder,"anthraciteLowerMinHeight", SUB_CATEGORY_ORES_ANTHRACITE, -64, -64, 256, "Minimum height from the bottom for bottom layer anthracite ore");
        overworldAnthraciteLowerTop = getInt(builder,"anthraciteLowerMaxHeight", SUB_CATEGORY_ORES_ANTHRACITE, 192,-64, 256,  "Maximum height from the bottom for bottom layer anthracite ore");

//        spawnNetherAnthracite = getBoolean(builder,"spawnNetherAnthracite", SUB_CATEGORY_ORES_ANTHRACITE, true, "Should anthracite spawn in the nether");
        netherAnthraciteVeinsPerChunk = getInt(builder,"netherAnthraciteVeinsPerChunk", SUB_CATEGORY_ORES_ANTHRACITE, 17, 0, 100,"The amount of nether anthracite ore veins per chunk");
        netherAnthraciteBottom = getInt(builder,"netherAnthraciteMinHeight", SUB_CATEGORY_ORES_ANTHRACITE, -64,-64, 256,  "Minimum height from the bottom for nether anthracite ore");
        netherAnthraciteTop = getInt(builder,"netherAnthraciteMaxHeight", SUB_CATEGORY_ORES_ANTHRACITE, 256, -64, 256, "Maximum height from the bottom for nether anthracite ore");
        builder.pop();

        builder.comment("The shield configuration for this mod").push(CATEGORY_SHIELDS).pop();
//        customShieldMaxReduction = getBoolean(builder,"customShieldMaxReduction", CATEGORY_SHIELDS, true,
//                "If set to true Shields added by other mods block 100% of the incoming damage, "
//                        + "if set to false they will block the amount set in defaultDamageReduction.");
//
//        defaultDamageReduction = getInt(builder,"defaultDamageReduction", CATEGORY_SHIELDS, 60, 0, 100,
//                "The portion of the incoming damage Vanilla Shields block in percent.");
//
//        copperDamageReduction = getInt(builder,"copperDamageReduction", CATEGORY_SHIELDS, 60,0, 100,
//                "The portion of the incoming damage Copper Shields block in percent.");
//        tinDamageReduction = getInt(builder,"tinDamageReduction", CATEGORY_SHIELDS, 60,0, 100,
//                "The portion of the incoming damage Tin Shields block in percent.");
//        silverDamageReduction = getInt(builder,"silverDamageReduction", CATEGORY_SHIELDS, 65,0, 100,
//                "The portion of the incoming damage Silver Shields block in percent.");
//        bronzeDamageReduction = getInt(builder,"bronzeDamageReduction", CATEGORY_SHIELDS, 65,0, 100,
//                "The portion of the incoming damage Bronze Shields block in percent.");
//        cobaltDamageReduction = getInt(builder,"cobaltDamageReduction", CATEGORY_SHIELDS, 65,0, 100,
//                "The portion of the incoming damage Cobalt Shields block in percent.");
//        obsidianDamageReduction = getInt(builder,"obsidianDamageReduction", CATEGORY_SHIELDS, 85,0, 100,
//                "The portion of the incoming damage Obsidian Shields block in percent.");
//        sterlingDamageReduction = getInt(builder,"sterlingDamageReduction", CATEGORY_SHIELDS, 75,0, 100,
//                "The portion of the incoming damage Sterling Silver Shields block in percent.");
//        steelDamageReduction = getInt(builder,"steelDamageReduction", CATEGORY_SHIELDS, 80,0, 100,
//                "The portion of the incoming damage Carbon Steel Shields block in percent.");
//        amethystDamageReduction = getInt(builder,"amethystDamageReduction", CATEGORY_SHIELDS, 70,0, 100,
//                "The portion of the incoming damage Amethyst Shields block in percent.");
//        emeraldDamageReduction = getInt(builder,"emeraldDamageReduction", CATEGORY_SHIELDS, 80,0, 100,
//                "The portion of the incoming damage Emerald Shields block in percent.");
//        topazDamageReduction = getInt(builder,"topazDamageReduction", CATEGORY_SHIELDS, 80,0, 100,
//                "The portion of the incoming damage Topaz Shields block in percent.");
//        tourmalineDamageReduction = getInt(builder,"tourmalineDamageReduction", CATEGORY_SHIELDS, 80,0, 100,
//                "The portion of the incoming damage Tourmaline Shields block in percent.");
//        tanzaniteDamageReduction = getInt(builder,"tanzaniteDamageReduction", CATEGORY_SHIELDS, 85,0, 100,
//                "The portion of the incoming damage Tanzanite Shields block in percent.");
//        rubyDamageReduction = getInt(builder,"rubyDamageReduction", CATEGORY_SHIELDS, 90,0, 100,
//                "The portion of the incoming damage Ruby Shields block in percent.");
//        sapphireDamageReduction = getInt(builder,"sapphireDamageReduction", CATEGORY_SHIELDS, 93,0, 100,
//                "The portion of the incoming damage Sapphire Shields block in percent.");
//        turquoiseDamageReduction = getInt(builder,"turquoiseDamageReduction", CATEGORY_SHIELDS, 95,0, 100,
//                "The portion of the incoming damage Sapphire Shields block in percent.");
//        moissaniteDamageReduction = getInt(builder,"moissaniteDamageReduction", CATEGORY_SHIELDS, 95,0, 100,
//                "The portion of the incoming damage Moissanite Shields block in percent.");
//        onyxDamageReduction = getInt(builder,"onyxDamageReduction", CATEGORY_SHIELDS, 95,0, 100,
//                "The portion of the incoming damage Onyx Shields block in percent.");
//        grapheneDamageReduction = getInt(builder,"grapheneDamageReduction", CATEGORY_SHIELDS, 100,0, 100,
//                "The portion of the incoming damage Graphene Shields block in percent.");

        copperDurability = getInt(builder,"copperDurability", CATEGORY_SHIELDS, 200, 1, 32767, "The durability of the Copper Shield.");
        tinDurability = getInt(builder,"tinDurability", CATEGORY_SHIELDS, 240, 1, 32767,"The durability of the Tin Shield.");
        silverDurability = getInt(builder,"silverDurability", CATEGORY_SHIELDS, 350,1, 32767, "The durability of the Silver Shield.");
        bronzeDurability = getInt(builder,"bronzeDurability", CATEGORY_SHIELDS, 385,1, 32767, "The durability of the Bronze Shield.");
        cobaltDurability = getInt(builder,"cobaltDurability", CATEGORY_SHIELDS, 500, 1, 32767,"The durability of the Cobalt Shield.");
        obsidianDurability = getInt(builder,"obsidianDurability", CATEGORY_SHIELDS, 1200,1, 32767, "The durability of the Obsidian Shield.");
        sterlingDurability = getInt(builder,"sterlingDurability", CATEGORY_SHIELDS, 600,1, 32767, "The durability of the Sterling Silver Shield.");
        steelDurability = getInt(builder,"steelDurability", CATEGORY_SHIELDS, 690,1, 32767, "The durability of the Steel Shield.");
        amethystDurability = getInt(builder,"amethystDurability", CATEGORY_SHIELDS, 550,1, 32767, "The durability of the Amethyst Shield.");
        emeraldDurability = getInt(builder,"emeraldDurability", CATEGORY_SHIELDS, 550,1, 32767, "The durability of the Emerald Shield.");
        topazDurability = getInt(builder,"topazDurability", CATEGORY_SHIELDS, 680, 1, 32767,"The durability of the Topaz Shield.");
        tourmalineDurability = getInt(builder,"tourmalineDurability", CATEGORY_SHIELDS, 700, 1, 32767,"The durability of the Tourmaline Shield.");
        tanzaniteDurability = getInt(builder,"tanzaniteDurability", CATEGORY_SHIELDS, 720,1, 32767, "The durability of the Tanzanite Shield.");
        rubyDurability = getInt(builder,"rubyDurability", CATEGORY_SHIELDS, 800,1, 32767, "The durability of the Ruby Shield.");
        sapphireDurability = getInt(builder,"sapphireDurability", CATEGORY_SHIELDS,  825,1, 32767, "The durability of the Sapphire Shield.");
        turquoiseDurability = getInt(builder,"turquoiseDurability", CATEGORY_SHIELDS, 1000, 1, 32767,"The durability of the Turquoise Shield.");
        moissaniteDurability = getInt(builder,"moissaniteDurability", CATEGORY_SHIELDS, 850, 1, 32767,"The durability of the Moissanite Shield.");
        onyxDurability = getInt(builder,"onyxDurability", CATEGORY_SHIELDS, 1500, 1, 32767,"The durability of the Onyx Shield.");
        grapheneDurability = getInt(builder,"grapheneDurability", CATEGORY_SHIELDS, 2000,1, 32767, "The durability of the Graphene Shield.");
//        diamondDurability = getInt(builder,"diamondDurability", CATEGORY_SHIELD, 4600,
//                "The durability of the Diamond Shield.");
//        netheriteDurability = getInt(builder,"netheriteDurability", CATEGORY_SHIELD, 6300,
//                "The durability of the Netherite Shield.");
//        thornsOnShields = getBoolean(builder,"thornsOnShields", CATEGORY_SHIELDS, true,
//                "Allows the Thorns enchantment to be applied to Shields");
//        enableDamageReduction = getBoolean(builder,"enableDamageReduction", CATEGORY_SHIELDS, true,
//                "Enables modified damage reduction values for shields.");

//        builder.comment("The entity configuration for this mod").push(CATEGORY_ENTITY).pop();
//        spawnDuck = getBoolean(builder,"spawnDuck", CATEGORY_ENTITY, true, "Whether ducks should generate naturally in your Minecraft world.");

        builder.comment("The sound configuration for this mod").push(CATEGORY_SOUNDS).pop();

        enableCustomDeathSounds = getBoolean(builder, "enableCustomDeathSounds", CATEGORY_SOUNDS, false, "Whether to enable custom death sounds. Includes bruh & uyêeh sounds.");
        enableCustomPlayerSleepingSound = getBoolean(builder, "enableCustomPlayerSleepingSound", CATEGORY_SOUNDS, false, "Whether to enable custom player sleeping sound. Aauugh.");
        enableCustomPlayerHurtSound = getBoolean(builder, "enableCustomPlayerHurtSound", CATEGORY_SOUNDS, false, "Whether to enable custom player hurting another player sound. Oof.");
    }

    private static BooleanValue getBoolean(ForgeConfigSpec.Builder builder, String name, String category, boolean defaultValue, String comment) {
        String path = category + "." + name;
        return builder.comment(comment, "Default: " + defaultValue).define(path, defaultValue);
    }

    private static ConfigValue<Integer> getInt(ForgeConfigSpec.Builder builder, String name, String category, int defaultValue, int min, int max, String comment) {
        String path = category + "." + name;
        return builder.comment(comment, "Default: " + defaultValue).defineInRange(path, defaultValue, min, max);
    }
}