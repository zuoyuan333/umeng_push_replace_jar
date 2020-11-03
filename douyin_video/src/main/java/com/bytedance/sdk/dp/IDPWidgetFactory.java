package com.bytedance.sdk.dp;

/**
 * Copyright (C), 2016-2020,
 * FileName: IDPWidgetFactory
 * Author: zy
 * Date: 2020/11/3 17:12
 * Description:
 * History:
 */
public interface IDPWidgetFactory {
    IDPWidget createDraw(Object o1);

    IDPWidget createGrid(Object o1);

    IDPWidget createNewsTabs(Object o1);

    IDPWidget createNewsOneTab(Object o1);

    void loadVideoCard(Object o1, Object o2);

    void loadSmallVideoCard(Object o1, Object o2);

    void loadVideoSingleCard(Object o1, Object o2);

    void loadVideoSingleCard4News(Object o1, Object o2);

    public interface Callback {
        void onError(int var1, String var2);

        void onSuccess(IDPElement var1);
    }
}
