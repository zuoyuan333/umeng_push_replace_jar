package com.zy;

import android.app.Application;
import android.util.Log;

import com.oppo.mobad.api.MobAdManager;

import org.android.agoo.huawei.HuaWeiRegister;
import org.android.agoo.oppo.OppoRegister;
import org.android.agoo.vivo.VivoRegister;
import org.android.agoo.xiaomi.MiPushRegistar;

public class MyApplication extends Application {
    public static String token="no_token";
    @Override
    public void onCreate() {
        super.onCreate();
        MiPushRegistar.register(this,"","");
        HuaWeiRegister.register(this);
        VivoRegister.register(this);
        OppoRegister.register(this,"","");
        MobAdManager.getInstance().init(this,"",null);
        //打开gradle面板，选择huawei_push/tasks/others/makeJar，生产的jar包在每个module的根目录中
        new android.os.Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.i("zytag","MyApplication-run-25-sdkVer-oppo-push__"+com.coloros.mcssdk.PushManager.getInstance().getSDKVersion());
                Log.i("zytag","MyApplication-run-27-sdkVer-vivo-push__"+com.vivo.push.PushManager.getInstance(MyApplication.this).getVersion());
                Log.i("zytag","MyApplication-run-28-sdkVer-huawei_push__"+ com.huawei.hms.api.HuaweiApiAvailability.HMS_SDK_VERSION_NAME);
                Log.i("zytag","MyApplication-run-29-sdkVer-xiaomi_push__--解压apk查看miui_push_version--");
                Log.i("zytag","MyApplication-run-30--------------------------------------------------------");
                Log.i("zytag","MyApplication-run-31-token-oppo-push"+com.coloros.mcssdk.PushManager.getInstance().getRegisterID());
                Log.i("zytag","MyApplication-run-32-token-vivo-push"+com.vivo.push.PushManager.getInstance(MyApplication.this).getRegId());
                Log.i("zytag","MyApplication-run-32-token-huawei-push"+token);
                Log.i("zytag","MyApplication-run-32-token-xiaomi-push"+token);
            }
        },10000);
    }
}
