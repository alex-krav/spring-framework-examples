package org.example.core.ioc.lookup;

public class MyCommand {

    private long time = System.currentTimeMillis();

    public long execute() {
        return time;
    }
}
