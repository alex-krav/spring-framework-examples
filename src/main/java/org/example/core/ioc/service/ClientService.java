package org.example.core.ioc.service;

public class ClientService {
    private static ClientService clientService = new ClientService();

    private ClientService() {}

    public static ClientService createInstance() {
        return clientService;
    }

    public static SomeThing createInstanceOfAnotherClass() {
        return new SomeThing();
    }
}