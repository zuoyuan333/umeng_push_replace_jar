package com.oppo.mobad.api.params;

import android.view.View;

import java.util.List;


public interface INativeAdData {
    int CREATIVE_TYPE_NO = 0;
    int CREATIVE_TYPE_TEXT = 1;
    int CREATIVE_TYPE_IMAGE = 2;
    int CREATIVE_TYPE_TEXT_ICON = 3;
    int CREATIVE_TYPE_VIDEO = 4;
    int CREATIVE_TYPE_FULL_IMAGE = 5;
    int CREATIVE_TYPE_TEXT_ICON_640X320 = 6;
    int CREATIVE_TYPE_TEXT_ICON_320X210 = 7;
    int CREATIVE_TYPE_TEXT_ICON_GROUP_320X210 = 8;
    int CREATIVE_TYPE_VIDEO_HTML = 9;
    int CREATIVE_TYPE_VIDEO_TIP_BAR = 10;
    int CREATIVE_TYPE_FULL_VIDEO = 11;
    int INTERACTION_TYPE_NO = 0;
    int INTERACTION_TYPE_SURFING = 1;
    int INTERACTION_TYPE_DOWNLOAD = 2;
    int INTERACTION_TYPE_MIDDLE_PAGE_DOWNLOAD = 3;
    int INTERACTION_TYPE_OPEN_HOME_PAGE = 4;
    int INTERACTION_TYPE_OPEN_DETAIL_PAGE = 5;
    int INTERACTION_TYPE_OPEN_INSTANT = 6;

    String getTitle();

    String getDesc();

    List<INativeAdFile> getIconFiles();

    List<INativeAdFile> getImgFiles();

    void onAdShow(View var1);

    void onAdClick(View var1);

    int getCreativeType();

    int getInteractionType();

    INativeAdFile getLogoFile();

    boolean isAdValid();

    String getExtra();

    String getClickBnText();

    boolean launchApp();

    boolean isCurrentApp(String var1);
}
