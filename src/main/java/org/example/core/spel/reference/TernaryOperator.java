package org.example.core.spel.reference;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class TernaryOperator {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        String falseString = parser.parseExpression(
                "false ? 'trueExp' : 'falseExp'").getValue(String.class);
        System.out.println(falseString);
    }
}
