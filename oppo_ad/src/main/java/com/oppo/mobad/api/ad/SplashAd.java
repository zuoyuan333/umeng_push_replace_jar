package com.oppo.mobad.api.ad;

import android.app.Activity;
import android.util.Log;

import com.oppo.mobad.api.listener.ISplashAdListener;
import com.oppo.mobad.api.params.SplashAdParams;

public class SplashAd {
    private static final String TAG = "SplashAd";

    public SplashAd(Activity var1, String var2, ISplashAdListener var3, SplashAdParams var4) {
        if (var3!=null){
            var3.onAdFailed("not_for_oppo_ad");
        }
    }

    public void destroyAd() {

    }
}
