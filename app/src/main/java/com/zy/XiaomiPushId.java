package com.zy;

import android.content.Context;
import android.util.Log;

import com.xiaomi.mipush.sdk.MiPushCommandMessage;
import com.xiaomi.mipush.sdk.PushMessageReceiver;

import java.util.List;

public class XiaomiPushId extends PushMessageReceiver {

    public void onReceiveRegisterResult(Context context, MiPushCommandMessage message) {
        String command = message.getCommand();
        List<String> arguments = message.getCommandArguments();
        String cmdArg1 = arguments != null && arguments.size() > 0 ? (String)arguments.get(0) : null;
        String regId = null;
        if ("register".equals(command) && message.getResultCode() == 0L) {
            regId = cmdArg1;
        }
        Log.i("zytag","XiaomiPushId-onReceiveRegisterResult-23--"+regId);
        MyApplication.token=regId;
    }
}