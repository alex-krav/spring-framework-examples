package org.example.core.spel.reference.operators;

import org.example.core.spel.Inventor;
import org.example.core.spel.Society;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.SimpleEvaluationContext;

import java.util.Arrays;

public class Logical {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        EvaluationContext context = SimpleEvaluationContext.forReadOnlyDataBinding().build();
        // -- AND --

        // evaluates to false
        boolean falseValue = parser.parseExpression("true and false").getValue(Boolean.class);
        System.out.println("false: " + falseValue);

        Inventor tesla = new Inventor("Nikola Tesla", "serbian");
        Inventor pupin = new Inventor("Mihajlo Pupin", "serbian");
        Society ieee = new Society("ieee");
        ieee.setMembers(Arrays.asList(tesla, pupin));

        // evaluates to true
        String expression = "isMember('Nikola Tesla') and isMember('Mihajlo Pupin')";
        boolean trueValue = parser.parseExpression(expression).getValue(ieee, Boolean.class);
        System.out.println("true: " + trueValue);

        // -- OR --

        // evaluates to true
        trueValue = parser.parseExpression("true or false").getValue(Boolean.class);
        System.out.println("true: " + trueValue);

        // evaluates to true
        expression = "isMember('Nikola Tesla') or isMember('Albert Einstein')";
        trueValue = parser.parseExpression(expression).getValue(ieee, Boolean.class);
        System.out.println("true: " + trueValue);

        // -- NOT --

        // evaluates to false
        falseValue = parser.parseExpression("!true").getValue(Boolean.class);
        System.out.println("false: " + falseValue);

        // -- AND and NOT --
        expression = "isMember('Nikola Tesla') and !isMember('Mihajlo Pupin')";
        falseValue = parser.parseExpression(expression).getValue(ieee, Boolean.class);
        System.out.println("false: " + falseValue);
    }
}
