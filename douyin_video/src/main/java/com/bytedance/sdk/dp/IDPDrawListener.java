package com.bytedance.sdk.dp;

import java.util.List;
import java.util.Map;

/**
 * Copyright (C), 2016-2020,
 * FileName: IDPDrawListener
 * Author: zy
 * Date: 2020/11/3 17:23
 * Description:
 * History:
 */
public abstract class IDPDrawListener {
    public IDPDrawListener() {
    }

    public void onDPRefreshFinish() {
    }

    public void onDPPageChange(int var1) {
    }

    public void onDPVideoPlay(Map<String, Object> var1) {
    }

    public void onDPVideoPause(Map<String, Object> var1) {
    }

    public void onDPVideoContinue(Map<String, Object> var1) {
    }

    public void onDPVideoCompletion(Map<String, Object> var1) {
    }

    public void onDPVideoOver(Map<String, Object> var1) {
    }

    public void onDPClose() {
    }

    /** @deprecated */
    @Deprecated
    public void onDPReportResult(boolean var1) {
    }

    public void onDPReportResult(boolean var1, Map<String, Object> var2) {
    }

    public void onDPRequestStart( Map<String, Object> var1) {
    }

    public void onDPRequestFail(int var1, String var2,  Map<String, Object> var3) {
    }

    public void onDPRequestSuccess(List<Map<String, Object>> var1) {
    }

    public void onDPClickAvatar(Map<String, Object> var1) {
    }

    public void onDPClickAuthorName(Map<String, Object> var1) {
    }

    public void onDPClickComment(Map<String, Object> var1) {
    }

    public void onDPClickLike(boolean var1, Map<String, Object> var2) {
    }
}