package com.zerofall.ezstorage.util;

import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;

public class EZStorageUtils {
	public static List<BlockRef> getNeighbors(final int xCoord, final int yCoord, final int zCoord, final World world) {
		final List<BlockRef> blockList = new ArrayList<BlockRef>();
		blockList.add(new BlockRef(world.getBlock(xCoord-1, yCoord, zCoord), xCoord-1, yCoord, zCoord));
		blockList.add(new BlockRef(world.getBlock(xCoord+1, yCoord, zCoord), xCoord+1, yCoord, zCoord));
		blockList.add(new BlockRef(world.getBlock(xCoord, yCoord-1, zCoord), xCoord, yCoord-1, zCoord));
		blockList.add(new BlockRef(world.getBlock(xCoord, yCoord+1, zCoord), xCoord, yCoord+1, zCoord));
		blockList.add(new BlockRef(world.getBlock(xCoord, yCoord, zCoord-1), xCoord, yCoord, zCoord-1));
		blockList.add(new BlockRef(world.getBlock(xCoord-1, yCoord, zCoord), xCoord-1, yCoord, zCoord));
		blockList.add(new BlockRef(world.getBlock(xCoord, yCoord, zCoord+1), xCoord, yCoord, zCoord+1));
		return blockList;
	}
}
