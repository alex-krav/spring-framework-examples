package org.example.core.spel.reference.variables;

import org.example.core.spel.Inventor;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.SimpleEvaluationContext;

public class Variables {
    public static void main(String[] args) {
        Inventor tesla = new Inventor("Nikola Tesla", "Serbian");

        ExpressionParser parser = new SpelExpressionParser();
        EvaluationContext context = SimpleEvaluationContext.forReadWriteDataBinding().build();
        context.setVariable("newName", "Mike Tesla");

        Object value = parser.parseExpression("name = #newName").getValue(context, tesla);
        System.out.println(value);
        System.out.println(tesla.getName());  // "Mike Tesla"
    }
}
