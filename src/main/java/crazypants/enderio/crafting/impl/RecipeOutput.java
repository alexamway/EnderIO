package crazypants.enderio.crafting.impl;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;
import crazypants.enderio.crafting.IRecipeOutput;

public class RecipeOutput extends RecipeComponent implements IRecipeOutput {

  protected final float chance;

  public RecipeOutput(ItemStack itemPrototype) {
    this(itemPrototype, -1);
  }

  public RecipeOutput(ItemStack itemPrototype, int slot) {
    this(itemPrototype, slot, 1);
  }

  public RecipeOutput(ItemStack itemPrototype, float chance) {
    this(itemPrototype, -1, chance);
  }

  public RecipeOutput(ItemStack itemPrototype, int slot, float chance) {
    super(itemPrototype, slot);
    this.chance = chance;
  }

  public RecipeOutput(FluidStack fluidOutput, int slot) {
    super(fluidOutput, slot);
    chance = 1.0f;
  }

  @Override
  public float getChance() {
    return chance;
  }

  @Override
  public boolean isEquivalent(ItemStack candidate) {
    return isEqual(itemPrototype, candidate);
  }

}
