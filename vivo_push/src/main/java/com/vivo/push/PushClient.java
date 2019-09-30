package com.vivo.push;

import android.content.Context;

public class PushClient {
    public static PushClient getInstance(Context context) {
        return new PushClient();
    }
    public void checkManifest() throws Exception {

    }
}
