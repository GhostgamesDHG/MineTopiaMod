
package com.ghostgamesdhg.minetopia.gui.vending;

import com.ghostgamesdhg.minetopia.MinetopiaExtra;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class VendingguiGuiWindow extends ContainerScreen<VendingguiGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = VendingguiGui.guistate;

	public VendingguiGuiWindow(VendingguiGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 176;
		this.ySize = 206;
	}

	private static final ResourceLocation texture = new ResourceLocation("gmm:textures/screens/vendinggui.png");

	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.color4f(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		Minecraft.getInstance().getTextureManager().bindTexture(texture);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.blit(ms, k, l, 0, 0, this.xSize, this.ySize, this.xSize, this.ySize);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
	}

	@Override
	public void init(Minecraft minecraft, int width, int height) {
		super.init(minecraft, width, height);
		minecraft.keyboardListener.enableRepeatEvents(true);
		this.addButton(new Button(this.guiLeft + 6, this.guiTop + 6, 70, 10, new StringTextComponent("Chips"), e -> {
			if (true) {
				MinetopiaExtra.PACKET_HANDLER.sendToServer(new VendingguiGui.ButtonPressedMessage(0, x, y, z));
				VendingguiGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 6, this.guiTop + 15, 70, 11, new StringTextComponent("Chocolate"), e -> {
			if (true) {
				MinetopiaExtra.PACKET_HANDLER.sendToServer(new VendingguiGui.ButtonPressedMessage(1, x, y, z));
				VendingguiGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 6, this.guiTop + 26, 70, 11, new StringTextComponent("Chicken"), e -> {
			if (true) {
				MinetopiaExtra.PACKET_HANDLER.sendToServer(new VendingguiGui.ButtonPressedMessage(2, x, y, z));
				VendingguiGui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 6, this.guiTop + 37, 70, 11, new StringTextComponent("Pizza"), e -> {
			if (true) {
				MinetopiaExtra.PACKET_HANDLER.sendToServer(new VendingguiGui.ButtonPressedMessage(3, x, y, z));
				VendingguiGui.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 6, this.guiTop + 48, 70, 11, new StringTextComponent("Fries"), e -> {
			if (true) {
				MinetopiaExtra.PACKET_HANDLER.sendToServer(new VendingguiGui.ButtonPressedMessage(4, x, y, z));
				VendingguiGui.handleButtonAction(entity, 4, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 6, this.guiTop + 59, 70, 11, new StringTextComponent("Sandwich"), e -> {
			if (true) {
				MinetopiaExtra.PACKET_HANDLER.sendToServer(new VendingguiGui.ButtonPressedMessage(5, x, y, z));
				VendingguiGui.handleButtonAction(entity, 5, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 6, this.guiTop + 92, 70, 11, new StringTextComponent("Water bottle"), e -> {
			if (true) {
				MinetopiaExtra.PACKET_HANDLER.sendToServer(new VendingguiGui.ButtonPressedMessage(6, x, y, z));
				VendingguiGui.handleButtonAction(entity, 6, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 6, this.guiTop + 103, 70, 11, new StringTextComponent("Milkshake"), e -> {
			if (true) {
				MinetopiaExtra.PACKET_HANDLER.sendToServer(new VendingguiGui.ButtonPressedMessage(7, x, y, z));
				VendingguiGui.handleButtonAction(entity, 7, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 6, this.guiTop + 70, 70, 11, new StringTextComponent("N/A"), e -> {
			if (true) {
				MinetopiaExtra.PACKET_HANDLER.sendToServer(new VendingguiGui.ButtonPressedMessage(8, x, y, z));
				VendingguiGui.handleButtonAction(entity, 8, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 6, this.guiTop + 81, 70, 11, new StringTextComponent("N/A"), e -> {
			if (true) {
				MinetopiaExtra.PACKET_HANDLER.sendToServer(new VendingguiGui.ButtonPressedMessage(9, x, y, z));
				VendingguiGui.handleButtonAction(entity, 9, x, y, z);
			}
		}));
	}
}
