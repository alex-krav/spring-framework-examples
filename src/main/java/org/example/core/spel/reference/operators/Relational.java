package org.example.core.spel.reference.operators;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Relational {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        /*// evaluates to true
        boolean trueValue = parser.parseExpression("2 == 2").getValue(Boolean.class);
        System.out.println(trueValue);

        // evaluates to false
        boolean falseValue = parser.parseExpression("2 < -5.0").getValue(Boolean.class);
        System.out.println(falseValue);

        // evaluates to true
        trueValue = parser.parseExpression("'black' < 'block'").getValue(Boolean.class);
        System.out.println(trueValue);*/

//        int x = 5;
        boolean boolVal = parser.parseExpression("5 ge null").getValue(Boolean.class);
        System.out.println(boolVal);

//        x = -5;
        boolVal = parser.parseExpression("-5 GE null").getValue(Boolean.class);
        System.out.println(boolVal);

        // evaluates to false
        /*boolean falseValue = parser.parseExpression(
                "'xyz' instanceof T(Integer)").getValue(Boolean.class);
        System.out.println(falseValue);

        // evaluates to true
        boolean trueValue = parser.parseExpression(
                "'5.00' matches '^-?\\d+(\\.\\d{2})?$'").getValue(Boolean.class);
        System.out.println(trueValue);

        //evaluates to false
        falseValue = parser.parseExpression(
                "'5.0067' matches '^-?\\d+(\\.\\d{2})?$'").getValue(Boolean.class);
        System.out.println(falseValue);*/

        /*boolean falseValue = parser.parseExpression(
                "123 instanceof T(int)").getValue(Boolean.class);
        System.out.println(falseValue);

        boolean trueValue = parser.parseExpression(
                "123 instanceof T(Integer)").getValue(Boolean.class);
        System.out.println(trueValue);*/
    }
}
