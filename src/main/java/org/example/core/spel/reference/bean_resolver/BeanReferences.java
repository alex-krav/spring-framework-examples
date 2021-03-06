package org.example.core.spel.reference.bean_resolver;

import org.example.core.ioc.event.App;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.Arrays;

public class BeanReferences {
    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        ExpressionParser parser = new SpelExpressionParser();
        StandardEvaluationContext context = new StandardEvaluationContext();
        context.setBeanResolver(new MyBeanResolver(appContext));

        Arrays.stream(appContext.getBeanDefinitionNames()).forEach(System.out::println);

        // This will end up calling resolve(context,"something") on MyBeanResolver during evaluation
        ExampleBean bean = (ExampleBean) parser.parseExpression("@exampleBean").getValue(context);
        System.out.println("\n"+bean.region);
    }
}
