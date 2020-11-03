package com.bytedance.sdk.dp;

import android.view.View;

/**
 * Copyright (C), 2016-2020,
 * FileName: IDPElement
 * Author: zy
 * Date: 2020/11/3 17:15
 * Description:
 * History:
 */
public interface IDPElement {
    View getView();

    String getTitle();

    String getUserName();

    int getCommentCount();

    long getPublishTime();

    void destroy();
}