package com.vivo.push;

import android.content.Context;

/**
 * 采用 静态内部类 实现单例
 */
public class PushManager {
    private PushManager(){}

    private static class SinglentonInstance{
        private static final PushManager INSTANCE=new PushManager();
    }
    public static PushManager getInstance(Context context){
        return SinglentonInstance.INSTANCE;
    }
    public String getVersion(){
        return "no_vivoPush_sdk!!!";
    }
    public String getRegId() {
        return "no_vivoPush_sdk!!!";
    }
}
