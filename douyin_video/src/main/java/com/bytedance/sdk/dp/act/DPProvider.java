package com.bytedance.sdk.dp.act;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

/**
 * Copyright (C), 2016-2020,
 * FileName: DPProvider
 * Author: zy
 * Date: 2020/11/3 17:18
 * Description:
 * History:
 */
public class DPProvider extends ContentProvider {
    public DPProvider() {
    }

    public boolean onCreate() {
        return true;
    }

    
    public Cursor query( Uri var1,  String[] var2,  String var3,  String[] var4,  String var5) {
        return null;
    }

    
    public String getType( Uri var1) {
        return null;
    }

    
    public Uri insert( Uri var1,  ContentValues var2) {
        return null;
    }

    public int delete( Uri var1,  String var2,  String[] var3) {
        return 0;
    }

    public int update( Uri var1,  ContentValues var2,  String var3,  String[] var4) {
        return 0;
    }
}