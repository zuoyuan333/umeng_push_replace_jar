package com.opos.mobad.api.listener;

public interface IBaseAdListener {
    void onAdShow();

    @Deprecated
    void onAdFailed(String var1);

    void onAdFailed(int var1, String var2);

    void onAdClick();
}
