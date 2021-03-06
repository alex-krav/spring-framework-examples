package org.example.core.spel.reference;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.common.TemplateParserContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class ExpressionTemplating {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
//        String randomPhrase = parser.parseExpression("T(java.lang.Math).random()").getValue(String.class);
        String randomPhrase = parser.parseExpression(
                "random number is #{T(java.lang.Math).random()}",
                new TemplateParserContext()).getValue(String.class);
        System.out.println(randomPhrase);
    }
}
