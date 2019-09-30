package com.huawei.hms.support.api.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public abstract class PushReceiver extends BroadcastReceiver {
    public void onToken(Context var1, String var2, Bundle var3) {
        this.onToken(var1, var2);
    }
    public void onToken(Context var1, String var2) {
    }

    @Override
    public void onReceive(Context context, Intent intent) {

    }
}
