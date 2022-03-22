package mod.mores.core.tabs;

import mod.mores.core.init.BlockInit;
import mod.mores.core.init.ItemInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

/**
 * Class that adds custom itemgroup tabs for the items and blocks added by mOres
 * @author Leronus
 */
public class MoresTabs extends CreativeModeTab {
    /**
     * Declaring all the itemgroups
     */
    public static final CreativeModeTab MORES_MATERIALS = (new MoresTabs(12, "mores_materials") {
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.RUBY_GEM.get());
        }
    }).setRecipeFolderName("mores_tools");

    public static final CreativeModeTab MORES_BLOCKS = (new MoresTabs(13, "mores_blocks") {
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(BlockInit.GRAPHENE_BLOCK.get());
        }
    }).setRecipeFolderName("mores_blocks");

    public static final CreativeModeTab MORES_ORES = (new MoresTabs(14, "mores_ores") {
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(BlockInit.DEEPSLATE_TOURMALINE_ORE.get());
        }
    }).setRecipeFolderName("mores_ores");

    public static final CreativeModeTab MORES_TOOLS = (new MoresTabs(15, "mores_tools") {
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.COBALT_PICKAXE.get());
        }
    }).setRecipeFolderName("mores_tools");

    public static final CreativeModeTab MORES_WEAPONS = (new MoresTabs(16, "mores_weapons") {
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.SAPPHIRE_BATTLEAXE.get());
        }
    }).setRecipeFolderName("mores_weapons");

    //TODO Fix shields
//    public static final CreativeModeTab MORES_SHIELDS = (new MoresTabs(17, "mores_shields") {
//        @OnlyIn(Dist.CLIENT)
//        public ItemStack makeIcon() {
//            return new ItemStack(ItemInit.COPPER_SHIELD.get());
//        }
//    }).setRecipeFolderName("mores_shields");

    public static final CreativeModeTab MORES_ARMOR = (new MoresTabs(18, "mores_armor") {
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.MOISSANITE_CHESTPLATE.get());
        }
    }).setRecipeFolderName("mores_armor");

    public static final CreativeModeTab MORES_HORSE_ARMOR = (new MoresTabs(19, "mores_horse_armor") {
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.AMETHYST_HORSE_ARMOR.get());
        }
    }).setRecipeFolderName("mores_horse_armor");

    public static final CreativeModeTab MORES_FOODS = (new MoresTabs(20, "mores_foods") {
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.SILVER_APPLE.get());
        }
    }).setRecipeFolderName("mores_foods");

    //TODO Fix entities
//    public static final CreativeModeTab MORES_ENTITIES = (new MoresTabs(21, "mores_entities") {
//        @OnlyIn(Dist.CLIENT)
//        public ItemStack makeIcon() {
//            return new ItemStack(ItemInit.DUCK_SPAWN_EGG.get());
//        }
//    }).setRecipeFolderName("mores_entities");

    /**
     * Constructor that adds the itemgroups
     * @param index Position of itemgroup in creative menu
     * @param label Name of itemgroup
     */
    public MoresTabs(int index, String label) {
        super(index, label);
    }

    /**
     * Default icon
     * @return Item for icon
     */
    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemInit.TOPAZ_BATTLEAXE.get());
    }
}

