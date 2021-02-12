package org.example.service;

public class DefaultServiceLocator {
    private static SomeThing clientService = new SomeThing();

    public SomeThing createClientServiceInstance() {
        return clientService;
    }
}
