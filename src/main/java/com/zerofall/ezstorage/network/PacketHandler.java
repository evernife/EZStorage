package com.zerofall.ezstorage.network;

import com.zerofall.ezstorage.container.ContainerStorageCore;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;

public class PacketHandler implements IMessageHandler<MyMessage, IMessage> {
	public IMessage onMessage(MyMessage message, MessageContext ctx) {
		EntityPlayer player = ctx.getServerHandler().playerEntity;
		Container container = player.openContainer;
		if ((container!=null)&&((container instanceof ContainerStorageCore))) {
			ContainerStorageCore storageContainer = (ContainerStorageCore) container;
			storageContainer.customSlotClick(message.index, message.button, message.mode, player);
		}
		return null;
	}
}
