package com.bytedance.sdk.dp;

/**
 * Copyright (C), 2016-2020,
 * FileName: DPSdk
 * Author: zy
 * Date: 2020/11/3 17:10
 * Description: 1
 * History:
 */
public final class DPSdk {
    private DPSdk() {

    }

    public static void init(Object o1,Object o2) {

    }
    public static IDPWidgetFactory factory() {
        return new abc();
    }



    public static String getVersion() {
        return "no_dp_sdk!!!";
    }
}
