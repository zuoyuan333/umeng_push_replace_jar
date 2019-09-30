package com.oppo.mobad.api.listener;

public interface ISplashAdListener {
    String TAG = "ISplashAdListener";
    ISplashAdListener NONE = new ISplashAdListener() {
        public final void onAdDismissed() {

        }

        public final void onAdShow() {

        }

        public final void onAdFailed(String var1) {

        }

        public final void onAdClick() {
        }
    };

    void onAdDismissed();
    void onAdShow();
    void onAdFailed(String s);
    void onAdClick();
}
