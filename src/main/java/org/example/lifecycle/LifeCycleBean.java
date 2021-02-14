package org.example.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LifeCycleBean implements InitializingBean, DisposableBean {

    @PostConstruct
    public void postConstruct() {
        System.out.println("post-construct method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("after-properties-set method");
    }

    public void init() {
        System.out.println("init method");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("pre-destroy method");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy method");
    }

    public void cleanup() {
        System.out.println("clean-up method");
    }
}
