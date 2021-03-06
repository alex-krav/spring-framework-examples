package org.example.core.spel.reference;

import org.example.core.spel.Inventor;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.SimpleEvaluationContext;

public class ElvisOperator {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        EvaluationContext context = SimpleEvaluationContext.forReadOnlyDataBinding().build();

        Inventor tesla = new Inventor("Nikola Tesla", "Serbian");
        String name = parser.parseExpression("name?:'Elvis Presley'").getValue(context, tesla, String.class);
        System.out.println(name);  // Nikola Tesla

        tesla.setName(null);
        name = parser.parseExpression("name?:'Elvis Presley'").getValue(context, tesla, String.class);
        System.out.println(name);  // Elvis Presley
    }
}
