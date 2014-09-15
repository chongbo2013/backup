package com.kivvi.theline.android.channel.anzhi;

import android.app.Activity;

import com.badlogic.gdx.Gdx;
import com.kivvi.theline.android.channel.IAds;
import com.kivvi.theline.android.channel.IChannel;
import com.kivvi.theline.resource.Data;

public class AnzhiChannel implements IChannel {

	private IAds ads;
	private Activity activity;

	public AnzhiChannel() {
		ads = new AnzhiAds();
	}

	@Override
	public void init(Activity activity) {
		this.activity = activity;

		ads.init(activity);
	}

	@Override
	public IAds getAds() {
		return ads;
	}

	@Override
	public String getShareString() {
		String share = "";

		// attach promotion.
		int bestScore = Gdx.app.getPreferences(Data.prefName)
				.getInteger("best");
		String prefix = "我今天得了";
		String suffix = "分，感觉自己萌萌哒！";
		share += prefix + bestScore + suffix;

		// attach url
		// FIXME: use 360 url temporary, has not been published on anzhi yet. 
		// String url = "http://www.anzhi.com/";
		String url = "http://zhushou.360.cn/detail/index/soft_id/1799380";
		share += url;

		return share;
	}

}
