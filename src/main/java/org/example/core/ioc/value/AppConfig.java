package org.example.core.ioc.value;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:com/something/application.properties")
public class AppConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

//    @Bean
//    public ConversionService conversionService() {
//        DefaultFormattingConversionService conversionService = new DefaultFormattingConversionService();
//        conversionService.addConverter(new MyCustomConverter());
//        return conversionService;
//    }
}
