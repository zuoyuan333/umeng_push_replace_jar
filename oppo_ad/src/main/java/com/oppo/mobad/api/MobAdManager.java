package com.oppo.mobad.api;

import android.content.Context;
import android.util.Log;

public class MobAdManager {
    private static MobAdManager sMobAdManager;
    public static MobAdManager getInstance() {
        return new MobAdManager();
    }
    public void init(Context var1, String var2, InitParams var3) {
        Log.i("zytag","MobAdManager-init-11--not_for_oppo_ad");
    }
    public void exit(Context c){}
}
