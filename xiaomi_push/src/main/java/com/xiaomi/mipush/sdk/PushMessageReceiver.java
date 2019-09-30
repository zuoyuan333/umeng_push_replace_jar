package com.xiaomi.mipush.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public abstract class PushMessageReceiver extends BroadcastReceiver {
    public PushMessageReceiver() {
    }

    public final void onReceive(Context var1, Intent var2) {
    }
    @Deprecated
    public void onReceiveMessage(Context var1, Object var2) {
    }

}
