package com.opos.mobad.api.ad;

import android.content.Context;
import com.opos.mobad.api.listener.INativeAdListener;
import com.opos.mobad.api.params.NativeAdError;

public class NativeAd {

    public NativeAd(Context var1, String var2, INativeAdListener var3) {
        if (var3!=null){
//            var3.onAdError(new NativeAdError(1, "not_for_oppo_ad"), null);
        }
    }

    public NativeAd(Context var1, String var2, int var3, Object var4) {
    }

    public void loadAd() {
    }

    public void loadAd(Object var1) {
    }

    public void destroyAd() {
    }
}
