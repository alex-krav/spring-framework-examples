package org.example.core.ioc.proxy;

public class MyBean {
    private String name;

    public MyBean(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "bean [" + name + "]";
    }
}
