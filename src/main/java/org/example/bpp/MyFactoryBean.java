package org.example.bpp;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;

public class MyFactoryBean implements FactoryBean<Messenger> {
    @Override
    public Messenger getObject() throws Exception {
        return new Messenger();
    }

    @Override
    public Class<Messenger> getObjectType() {
        return Messenger.class;
    }
}
