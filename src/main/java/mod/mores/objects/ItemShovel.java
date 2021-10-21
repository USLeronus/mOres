package mod.mores.objects;

import mod.mores.init.ItemInit;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.*;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import java.util.List;

public class ItemShovel extends ShovelItem {
    private final String bonus = "Auto Smelting";

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;


    public ItemShovel(IItemTier toolMaterial, float attackDamage, float attackSpeed, Properties itemProperties) {
        super(toolMaterial, attackDamage, attackSpeed, itemProperties);
        this.harvestLevel = toolMaterial.getLevel();
        this.maxUses = toolMaterial.getUses();
        this.efficiency = toolMaterial.getSpeed();
    }

    @Override
    public void appendHoverText(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn){
        super.appendHoverText(stack, worldIn, tooltip, flagIn);
        //Making the tooltips
        //tooltip.add("Text: " + TextFormatting.COLOR + toolMaterial.get);
        tooltip.add(ITextComponent.nullToEmpty("Harvest Level: " + TextFormatting.GOLD + harvestLevel));
        tooltip.add(ITextComponent.nullToEmpty("Max Uses: " + TextFormatting.LIGHT_PURPLE + maxUses));
        tooltip.add(ITextComponent.nullToEmpty("Efficiency: " + TextFormatting.RED + efficiency));

        if (stack.getItem() == ItemInit.RUBY_SHOVEL.get()){
            tooltip.add(ITextComponent.nullToEmpty("Bonus: " + TextFormatting.DARK_RED + bonus));
        }
    }

    @Override
    public Item asItem() {
        return this;
    }
}
