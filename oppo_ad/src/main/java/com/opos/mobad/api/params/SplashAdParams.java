package com.opos.mobad.api.params;

import android.view.View;

public class SplashAdParams {
    public final long fetchTimeout;
    public final String title;
    public final String desc;
    public final boolean showPreLoadPage;
    public final View bottomArea;
    public final boolean isUseSurfaceView;

    public SplashAdParams(SplashAdParams.Builder var1) {
        this.fetchTimeout = var1.fetchTimeout;
        this.title = var1.title;
        this.desc = var1.desc;
        this.showPreLoadPage = var1.showPreLoadPage;
        this.bottomArea = var1.bottomArea;
        this.isUseSurfaceView = var1.isUseSurfaceView;
    }

    public String toString() {
        return "SplashAdParams{fetchTimeout=" + this.fetchTimeout + ", title='" + this.title + '\'' + ", desc='" + this.desc + '\'' + ", showPreLoadPage=" + this.showPreLoadPage + ", bottomArea=" + (this.bottomArea != null ? this.bottomArea : "null") + ", isUseSurfaceView=" + this.isUseSurfaceView + '}';
    }

    public static class Builder {
        private static final long MAX_FETCH_TIMEOUT = 5000L;
        private static final long MIX_FETCH_TIMEOUT = 3000L;
        private static final boolean DEFAULT_SHOW_PRE_LOAD_PAGE = true;
        private long fetchTimeout = 5000L;
        private String title;
        private String desc;
        private boolean showPreLoadPage = true;
        private View bottomArea = null;
        private boolean isUseSurfaceView = false;

        public Builder() {
        }

        public SplashAdParams.Builder setFetchTimeout(long var1) {
            if (var1 >= 3000L && var1 <= 5000L) {
                this.fetchTimeout = var1;
            }

            return this;
        }

        public SplashAdParams.Builder setTitle(String var1) {
            return this;
        }

        public SplashAdParams.Builder setDesc(String var1) {
            return this;
        }

        public SplashAdParams.Builder setShowPreLoadPage(boolean var1) {
            this.showPreLoadPage = var1;
            return this;
        }

        public SplashAdParams.Builder setBottomArea(View var1) {
            if (var1 != null) {
                this.bottomArea = var1;
            }

            return this;
        }

        public SplashAdParams.Builder setSurfaceView(boolean var1) {
            this.isUseSurfaceView = var1;
            return this;
        }

        public SplashAdParams build() {
            return new SplashAdParams(this);
        }
    }
}
