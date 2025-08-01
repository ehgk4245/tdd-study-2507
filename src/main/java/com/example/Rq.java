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
        if (!cmd.contains("?")) return defaultValue;
        String queryString = cmd.split("\\?", 2)[1];
        String[] queryStringBits = queryString.split("&");
        for (String param : queryStringBits) {
            String[] paramBits = param.split("=", 2);
            if (key.equals(paramBits[0])) {
                return paramBits[1];
            }
        }
        return defaultValue;
    }
}
