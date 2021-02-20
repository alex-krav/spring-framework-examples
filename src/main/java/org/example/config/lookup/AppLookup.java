package org.example.config.lookup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.example.config.lookup")
public class AppLookup {

    @Bean
    @Scope("prototype")
    public MyCommand myCommand() {
        return new MyCommand();
    }

    @Bean
    public CommandManagerLookup commandManagerLookup() {
        return new CommandManagerLookup() {
            @Override
            protected MyCommand createCommand() {
                return myCommand();
            }
        };
    }

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppLookup.class);
        CommandManagerLookup bean = context.getBean(CommandManagerLookup.class);

        for(int i = 0; i < 5; i++) {
            bean.process();
            Thread.sleep(1000);
        }
    }
}
