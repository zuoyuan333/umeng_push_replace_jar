package com.opos.mobad.api.listener;

import com.opos.mobad.api.params.INativeAdData;
import com.opos.mobad.api.params.NativeAdError;

import java.util.ArrayList;
import java.util.List;

public interface INativeAdListener {
    String TAG = "INativeAdListener";
    INativeAdListener NONE = new INativeAdListener() {
        public final void onAdSuccess(List<INativeAdData> var1) {
        }

        public final void onAdFailed(NativeAdError var1) {
        }

        public final void onAdError(NativeAdError var1, INativeAdData var2) {}
    };

    void onAdSuccess(List<INativeAdData> var1);

    void onAdFailed(NativeAdError var1);

    void onAdError(NativeAdError var1, INativeAdData var2);
}
