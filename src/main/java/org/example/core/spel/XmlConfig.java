package org.example.core.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlConfig {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("core/spel/spel.xml");
        NumberGuess numberGuess = context.getBean(NumberGuess.class);
        System.out.println(numberGuess);
        TaxCalculator calculator = context.getBean(TaxCalculator.class);
        System.out.println(calculator);
        ShapeGuess shape = context.getBean(ShapeGuess.class);
        System.out.println(shape.getInitialShapeSeed());
    }
}
