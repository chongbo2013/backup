package com.kivvi.livewallpaper.flowerzen.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.kivvi.livewallpaper.flowerzen.LWPGame;

public class PortraitLauncher {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "Flower Zen 480 * 800";
		cfg.width = 480;
		cfg.height = 800;
		cfg.samples = 4;
		cfg.vSyncEnabled = false;
		cfg.resizable    = false;
		cfg.fullscreen   = false;
		cfg.foregroundFPS = 61;
		cfg.backgroundFPS = -1;
		
		 LWPGame.setStatisticsService(new DesktopAnalyticsService());
		new LwjglApplication(new LWPGame(), cfg);
	}
}