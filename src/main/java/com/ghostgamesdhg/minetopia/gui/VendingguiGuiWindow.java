
package com.ghostgamesdhg.minetopia.gui;

import com.ghostgamesdhg.minetopia.MinetopiaExtra;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class VendingguiGuiWindow extends ContainerScreen<VendingguiGui.GuiContainerMod> {
	private World world;
	private int xx, yy, zz;
	private PlayerEntity entity;
	public VendingguiGuiWindow(VendingguiGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.xx = container.xx;
		this.yy = container.yy;
		this.zz = container.zz;
		this.entity = container.entity;
		this.xSize = 276;
		this.ySize = 166;
	}
	private static final ResourceLocation texture = new ResourceLocation("gmm:textures/vendinggui.png");
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
		this.font.drawString(ms, "Vending machine", 15, 3, -12829636);
		this.font.drawString(ms, "Vending storage", 150, 3, -12829636);
		this.font.drawString(ms, "Inventory", 164, 72, -12829636);
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
		this.addButton(new Button(this.guiLeft + 10, this.guiTop + 77, 85, 20, new StringTextComponent("Hop"), e -> {
			if (true) {
				MinetopiaExtra.PACKET_HANDLER.sendToServer(new VendingguiGui.ButtonPressedMessage(0, xx, yy, zz));
				VendingguiGui.handleButtonAction(entity, 0, xx, yy, zz);
			}
		}));
		this.addButton(new Button(this.guiLeft + 10, this.guiTop + 14, 85, 20, new StringTextComponent("Banana"), e -> {
			if (true) {
				MinetopiaExtra.PACKET_HANDLER.sendToServer(new VendingguiGui.ButtonPressedMessage(1, xx, yy, zz));
				VendingguiGui.handleButtonAction(entity, 1, xx, yy, zz);
			}
		}));
		this.addButton(new Button(this.guiLeft + 10, this.guiTop + 35, 85, 20, new StringTextComponent("Strawberry"), e -> {
			if (true) {
				MinetopiaExtra.PACKET_HANDLER.sendToServer(new VendingguiGui.ButtonPressedMessage(2, xx, yy, zz));
				VendingguiGui.handleButtonAction(entity, 2, xx, yy, zz);
			}
		}));
		this.addButton(new Button(this.guiLeft + 10, this.guiTop + 56, 85, 20, new StringTextComponent("Hamburger"), e -> {
			if (true) {
				MinetopiaExtra.PACKET_HANDLER.sendToServer(new VendingguiGui.ButtonPressedMessage(3, xx, yy, zz));
				VendingguiGui.handleButtonAction(entity, 3, xx, yy, zz);
			}
		}));
		this.addButton(new Button(this.guiLeft + 10, this.guiTop + 98, 85, 20, new StringTextComponent("Pineapple"), e -> {
			if (true) {
				MinetopiaExtra.PACKET_HANDLER.sendToServer(new VendingguiGui.ButtonPressedMessage(4, xx, yy, zz));
				VendingguiGui.handleButtonAction(entity, 4, xx, yy, zz);
			}
		}));
		this.addButton(new Button(this.guiLeft + 10, this.guiTop + 119, 85, 20, new StringTextComponent("Hotdog"), e -> {
			if (true) {
				MinetopiaExtra.PACKET_HANDLER.sendToServer(new VendingguiGui.ButtonPressedMessage(5, xx, yy, zz));
				VendingguiGui.handleButtonAction(entity, 5, xx, yy, zz);
			}
		}));
		this.addButton(new Button(this.guiLeft + 10, this.guiTop + 140, 85, 20, new StringTextComponent("Sandwich"), e -> {
			if (true) {
				MinetopiaExtra.PACKET_HANDLER.sendToServer(new VendingguiGui.ButtonPressedMessage(6, xx, yy, zz));
				VendingguiGui.handleButtonAction(entity, 6, xx, yy, zz);
			}
		}));
	}
}
