package com.opos.mobad.api.params;

public class NativeAdError {
    public int code;
    public String msg;

    public NativeAdError(int var1, String var2) {
        this.code = var1;
        this.msg = var2;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int var1) {
        this.code = var1;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String var1) {
        this.msg = var1;
    }

    public String toString() {
        return "NativeAdError{code=" + this.code + ", msg='" + this.msg + '\'' + '}';
    }
}
