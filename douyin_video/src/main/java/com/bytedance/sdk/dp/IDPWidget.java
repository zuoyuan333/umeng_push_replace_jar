package com.bytedance.sdk.dp;

import android.support.v4.app.Fragment;

/**
 * Copyright (C), 2016-2020,
 * FileName: IDPWidget
 * Author: zy
 * Date: 2020/11/3 17:12
 * Description:
 * History:
 */
public interface IDPWidget {
    Fragment getFragment();

    android.app.Fragment getFragment2();

    Fragment getReportFragment();

    android.app.Fragment getReportFragment2();

    void refresh();

    void scrollToTop();

    boolean canBackPress();

    void destroy();
}
