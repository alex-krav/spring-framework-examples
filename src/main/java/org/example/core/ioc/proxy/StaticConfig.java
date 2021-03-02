package org.example.core.ioc.proxy;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Configuration
@Scope(proxyMode=ScopedProxyMode.INTERFACES)
public class StaticConfig implements Config {
//    @Bean
//    public static MyBean staticBean() {
//        return new MyBean("static");
//    }

    @Override
    public String getName() {
        return "[staticConfig]";
    }
}
