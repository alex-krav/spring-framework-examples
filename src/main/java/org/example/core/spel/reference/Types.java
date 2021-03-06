package org.example.core.spel.reference;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Types {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();

        Class dateClass = parser.parseExpression("T(java.util.Date)").getValue(Class.class);
        System.out.println(dateClass);

        Class stringClass = parser.parseExpression("T(String)").getValue(Class.class);
        System.out.println(stringClass);

        boolean trueValue = parser.parseExpression(
                "T(java.math.RoundingMode).CEILING < T(java.math.RoundingMode).FLOOR")
                .getValue(Boolean.class);
        System.out.println(trueValue);
    }
}
