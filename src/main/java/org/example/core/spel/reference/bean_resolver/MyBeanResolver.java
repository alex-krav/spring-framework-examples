package org.example.core.spel.reference.bean_resolver;

import org.springframework.context.ApplicationContext;
import org.springframework.expression.AccessException;
import org.springframework.expression.BeanResolver;
import org.springframework.expression.EvaluationContext;

public class MyBeanResolver implements BeanResolver {

    private ApplicationContext applicationContext;

    public MyBeanResolver(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public Object resolve(EvaluationContext context, String beanName) throws AccessException {
        return applicationContext.getBean(beanName);
    }
}
