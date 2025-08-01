package com.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Rq {

    private final String cmd;
    private String actionName;
    private final Map<String, String> params = new HashMap<>();

    public Rq(String cmd) {
        this.cmd = cmd;
        init();
    }

    private void init() {
        if (!cmd.contains("?")) {
            actionName = cmd;
            return;
        }
        String[] cmdBits = cmd.split("\\?", 2);
        actionName = cmdBits[0];
        Arrays.stream(cmdBits[1].split("&"))
                .map(str -> str.split("=", 2))
                .filter(paramBits -> paramBits.length > 1 && !paramBits[1].isEmpty())
                .forEach(paramBits -> {
                    params.put(paramBits[0], paramBits[1]);
                });
    }

    public String getActionName() {
        return actionName;
    }

    public String getParam(String key, String defaultValue) {
        return params.getOrDefault(key, defaultValue);
    }

    public int getParamAsInt(String key, int defaultValue) {
        return Integer.parseInt(params.get(key));
    }
}
