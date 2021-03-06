package org.example.core.spel.reference;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.SimpleEvaluationContext;

public class Functions {
    public static void main(String[] args) throws NoSuchMethodException {
        ExpressionParser parser = new SpelExpressionParser();

        EvaluationContext context = SimpleEvaluationContext.forReadOnlyDataBinding().build();
        context.setVariable("reverseString",
                StringUtils.class.getDeclaredMethod("reverseString", String.class));

        String helloWorldReversed = parser.parseExpression(
                "#reverseString('hello')").getValue(context, String.class);
        System.out.println(helloWorldReversed);
    }
}
