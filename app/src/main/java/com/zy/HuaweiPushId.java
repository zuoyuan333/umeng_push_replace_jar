package com.zy;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import com.huawei.hms.support.api.push.PushReceiver;

public class HuaweiPushId extends PushReceiver {
    @Override
    public void onToken(Context context, String regId, Bundle bundle) {
        Log.i("zytag","HuaweiPushId-onToken-15--"+regId);
        MyApplication.token=regId;
    }
}
