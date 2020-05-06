package com.heytap.mcssdk;

/**
 * 采用 静态内部类 实现单例
 */
public class PushManager {
    private PushManager(){}

    private static class SinglentonInstance{
        private static final PushManager INSTANCE=new PushManager();
    }
    public static PushManager getInstance(){
        return SinglentonInstance.INSTANCE;
    }
    public String getSDKVersion(){
        return "no_oppoPush_sdk!!!";
    }
    public String getRegisterID(){
        return "no_oppoPush_sdk!!!";
    }
}
