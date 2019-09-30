package com.xiaomi.mipush.sdk;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MiPushCommandMessage {
    private static final long serialVersionUID = 1L;
    private static final String KEY_COMMAND = "command";
    private static final String KEY_RESULT_CODE = "resultCode";
    private static final String KEY_REASON = "reason";
    private static final String KEY_COMMAND_ARGUMENTS = "commandArguments";
    private static final String KEY_CATEGORY = "category";
    private String command;
    private long resultCode;
    private String reason;
    private List<String> commandArguments;
    private String category;

    public MiPushCommandMessage() {
    }

    public String getCommand() {
        return this.command;
    }

    public void setCommand(String var1) {
        this.command = var1;
    }

    public List<String> getCommandArguments() {
        return this.commandArguments;
    }

    public void setCommandArguments(List<String> var1) {
        this.commandArguments = var1;
    }

    public long getResultCode() {
        return this.resultCode;
    }

    public void setResultCode(long var1) {
        this.resultCode = var1;
    }

    public String getReason() {
        return this.reason;
    }

    public void setReason(String var1) {
        this.reason = var1;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String var1) {
        this.category = var1;
    }

    public String toString() {
        String var1 = "command={" + this.command + "}, resultCode={" + this.resultCode + "}, reason={" + this.reason + "}, category={" + this.category + "}, commandArguments={" + this.commandArguments + "}";
        return var1;
    }

    public Bundle toBundle() {
        Bundle var1 = new Bundle();
        var1.putString("command", this.command);
        var1.putLong("resultCode", this.resultCode);
        var1.putString("reason", this.reason);
        if (this.commandArguments != null) {
            var1.putStringArrayList("commandArguments", (ArrayList)this.commandArguments);
        }

        var1.putString("category", this.category);
        return var1;
    }

    public static MiPushCommandMessage fromBundle(Bundle var0) {
        MiPushCommandMessage var1 = new MiPushCommandMessage();
        var1.command = var0.getString("command");
        var1.resultCode = var0.getLong("resultCode");
        var1.reason = var0.getString("reason");
        var1.commandArguments = var0.getStringArrayList("commandArguments");
        var1.category = var0.getString("category");
        return var1;
    }
}
