package com.bytedance.sdk.dp;

/**
 * Copyright (C), 2016-2020,
 * FileName: DPSdkConfig
 * Author: zy
 * Date: 2020/11/3 17:09
 * Description:
 * History:
 */
public class DPSdkConfig {
    public static final class Builder {
        boolean a;
        private boolean b;
        private DPSdkConfig.InitListener c;
        private String d;
        private String e;
        private String f;
        private String g;
        private String h;
        private boolean i = false;

        public Builder() {
        }



        public DPSdkConfig.Builder preloadDraw(boolean var1) {
            this.i = var1;
            return this;
        }

        public DPSdkConfig.Builder oldPartner(String var1) {
            this.g = var1;
            return this;
        }

        public DPSdkConfig.Builder oldUUID(String var1) {
            this.h = var1;
            return this;
        }

        public DPSdkConfig.Builder debug(boolean var1) {
            this.a = var1;
            return this;
        }

        public DPSdkConfig.Builder needInitAppLog(boolean var1) {
            this.b = var1;
            return this;
        }

        public DPSdkConfig.Builder appId(String var1) {
            this.f = var1;
            return this;
        }

        public DPSdkConfig.Builder partner(String var1) {
            this.d = var1;
            return this;
        }

        public DPSdkConfig.Builder secureKey(String var1) {
            this.e = var1;
            return this;
        }

        public DPSdkConfig.Builder initListener(DPSdkConfig.InitListener var1) {
            this.c = var1;
            return this;
        }

        public DPSdkConfig build() {
            return new DPSdkConfig();
        }
    }
    public interface InitListener {
        void onInitComplete(boolean var1);
    }

}
