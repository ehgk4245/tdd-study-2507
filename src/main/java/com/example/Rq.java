package com.example;

import java.util.HashMap;
import java.util.Map;

public class Rq {

    private final String cmd;
    private final Map<String, String> map = new HashMap<>();

    public Rq(String cmd) {
        this.cmd = cmd;
    }

    public String getActionName() {
        String[] cmdBits = cmd.split("\\?", 2);
        return cmdBits[0];
    }

    public String getParam(String key, String defaultValue) {
        String[] cmdBits = cmd.split("\\?", 2);
        if (cmdBits.length > 1) {
            String[] paramBits = cmdBits[1].split("=", 2);
            return paramBits[1];
        }
        return defaultValue;
    }
}
