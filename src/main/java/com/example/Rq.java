package com.example;

public class Rq {

    private final String cmd;

    public Rq(String cmd) {
        this.cmd = cmd;
    }

    public String getActionName() {
        String[] cmdBits = cmd.split("\\?", 2);
        return cmdBits[0];
    }
}
