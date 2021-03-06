package org.example.core.spel.reference.operators;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Mathematical {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        // Addition
        int two = parser.parseExpression("1 + 1").getValue(Integer.class);  // 2
        System.out.println("2: " + 2);

        String testString = parser.parseExpression(
                "'test' + ' ' + 'string'").getValue(String.class);  // 'test string'
        System.out.println("test string: " + testString);

        // Subtraction
        int four = parser.parseExpression("1 - -3").getValue(Integer.class);  // 4
        System.out.println("4: " + 4);

        double d = parser.parseExpression("1000.00 - 1e4").getValue(Double.class);  // -9000
        System.out.println("-9000: " + d);

        // Multiplication
        int six = parser.parseExpression("-2 * -3").getValue(Integer.class);  // 6
        System.out.println("6: " + six);

        double twentyFour = parser.parseExpression("2.0 * 3e0 * 4").getValue(Double.class);  // 24.0
        System.out.println("24: " + twentyFour);

        // Division
        int minusTwo = parser.parseExpression("6 / -3").getValue(Integer.class);  // -2
        System.out.println("-2: " + minusTwo);

        double one = parser.parseExpression("8.0 / 4e0 / 2").getValue(Double.class);  // 1.0
        System.out.println("1: " + one);

        // Modulus
        int three = parser.parseExpression("7 % 4").getValue(Integer.class);  // 3
        System.out.println("3: " + three);

        one = parser.parseExpression("8 / 5 % 2").getValue(Integer.class);  // 1
        System.out.println("1: " + one);

        // Operator precedence
        int minusTwentyOne = parser.parseExpression("1+2-3*8").getValue(Integer.class);  // -21
        System.out.println("-21: " + minusTwentyOne);
    }
}
