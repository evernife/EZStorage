package com.zerofall.ezstorage.gui;

import com.zerofall.ezstorage.container.ContainerStorageCoreCrafting;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class GuiCraftingCore
		extends GuiStorageCore {
	public GuiCraftingCore(EntityPlayer player, World world, int x, int y, int z) {
		super(new ContainerStorageCoreCrafting(player, world, x, y, z), world, x, y, z);
		this.xSize = 195;
		this.ySize = 244;
	}

	public int rowsVisible() {
		return 4;
	}

	protected ResourceLocation getBackground() {
		return new ResourceLocation("ezstorage:textures/gui/storageCraftingGui.png");
	}
}
