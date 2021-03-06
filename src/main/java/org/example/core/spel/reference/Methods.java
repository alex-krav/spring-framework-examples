package org.example.core.spel.reference;

import org.example.core.spel.Inventor;
import org.example.core.spel.Society;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.SimpleEvaluationContext;

import java.util.Collections;

public class Methods {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        EvaluationContext context = SimpleEvaluationContext.forReadOnlyDataBinding().build();

        // string literal, evaluates to "bc"
        String bc = parser.parseExpression("'abc'.substring(1, 3)").getValue(String.class);
        System.out.println(bc);

        Society ieee = new Society("ieee");
        ieee.setMembers(Collections.singletonList(new Inventor("Mihajlo Pupin", "serbian")));
        // evaluates to true
        boolean isMember = parser.parseExpression("isMember('Mihajlo Pupin')").getValue(
                ieee, Boolean.class);
        System.out.println(isMember);
    }
}
