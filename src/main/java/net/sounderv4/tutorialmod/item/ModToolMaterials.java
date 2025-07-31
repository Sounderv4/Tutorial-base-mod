package net.sounderv4.tutorialmod.item;

import com.google.common.base.Suppliers;
import net.minecraft.block.Block;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.sounderv4.tutorialmod.util.ModTags;

import java.util.Objects;
import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    PINK_GARNET(ModTags.Blocks.INCORRECT_FOR_PINK_GARTNET_TOOL,
            900, 6.0F, 4.0F, 22, () -> Ingredient.ofItems(ModItems.PINK_GARNET)),
    SPEED(ModTags.Blocks.INCORRECT_FOR_SPEED_TOOL,
            320, 12.0F, 4.0F, 22, () -> Ingredient.ofItems(Items.GOLD_INGOT, Items.IRON_INGOT)),
    LAPITE(ModTags.Blocks.INCORRECT_FOR_LAPITE_TOOL,
            9000, 22.0F, 10.0F, 52, () -> Ingredient.ofItems(ModItems.LAPITE));
    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterials(final TagKey<Block> inverseTag, final int itemDurability, final float miningSpeed, final float attackDamage, final int enchantability, final Supplier<Ingredient> repairIngredient) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        Objects.requireNonNull(repairIngredient);
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}

