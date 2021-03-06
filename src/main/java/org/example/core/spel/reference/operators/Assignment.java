package org.example.core.spel.reference.operators;

import org.example.core.spel.Inventor;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.SimpleEvaluationContext;

public class Assignment {
    public static void main(String[] args) {
        Inventor inventor = new Inventor();
        ExpressionParser parser = new SpelExpressionParser();
        EvaluationContext context = SimpleEvaluationContext.forReadWriteDataBinding().build();

        parser.parseExpression("name").setValue(context, inventor, "Aleksandar Seovic");
        System.out.println(inventor.getName());

        // alternatively
        String aleks = parser.parseExpression(
                "name = 'Alex Kravchuk'").getValue(context, inventor, String.class);
        System.out.println(inventor.getName());
        System.out.println(aleks);

        // exception: not supported
//        parser.parseExpression("name = 'exp exp'").setValue(context, inventor, "set set");
//        System.out.println(inventor.getName());
    }
}
