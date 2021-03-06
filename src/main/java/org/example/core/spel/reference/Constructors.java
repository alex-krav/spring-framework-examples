package org.example.core.spel.reference;

import org.example.core.spel.Inventor;
import org.example.core.spel.Society;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.SimpleEvaluationContext;

public class Constructors {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
//        EvaluationContext context = SimpleEvaluationContext.forReadOnlyDataBinding().build();

        Inventor einstein = parser.parseExpression(
                "new org.example.core.spel.Inventor('Albert Einstein', 'German')")
                .getValue(Inventor.class);
        System.out.println(einstein);

        Society ieee = new Society("ieee");
        //create new inventor instance within add method of List
        parser.parseExpression(
                "Members.add(new org.example.core.spel.Inventor('Albert Einstein', 'German'))").getValue(ieee);
        System.out.println(ieee.getMembers());
    }
}
