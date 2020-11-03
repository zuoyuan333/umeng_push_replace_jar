package com.bytedance.sdk.dp;

/**
 * Copyright (C), 2016-2020,
 * FileName: DPWidgetDrawParams
 * Author: zy
 * Date: 2020/11/3 17:11
 * Description:
 * History:
 */
public class DPWidgetDrawParams {
    public static DPWidgetDrawParams obtain() {
        return new DPWidgetDrawParams();
    }
    public DPWidgetDrawParams adCodeId(String var1) {
        return this;
    }

    public DPWidgetDrawParams adOffset(int var1) {
        return this;
    }

    public DPWidgetDrawParams hideClose(boolean var1, Object o2) {
        return this;
    }

    public DPWidgetDrawParams showGuide(boolean var1) {
        return this;
    }

    public DPWidgetDrawParams listener( IDPDrawListener var1) {
        return this;
    }

    public DPWidgetDrawParams adListener(Object o2) {
        return this;
    }

    public DPWidgetDrawParams progressBarStyle(int var1) {
        return this;
    }
}
