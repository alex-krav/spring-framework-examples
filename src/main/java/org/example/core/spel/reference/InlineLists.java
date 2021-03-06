package org.example.core.spel.reference;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.SimpleEvaluationContext;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.List;

public class InlineLists {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
//        EvaluationContext context = SimpleEvaluationContext.forReadOnlyDataBinding().build();
        EvaluationContext context = new StandardEvaluationContext();

        // evaluates to a Java list containing the four numbers
//        List numbers1 = (List) parser.parseExpression("{1,2,3,4}").getValue(context);
//        List numbers2 = (List) parser.parseExpression("{1,2,3,4}").getValue(context);
//        List listOfLists1 = (List) parser.parseExpression("{{'a','b'},{'x','y'}}").getValue(context);
//        List listOfLists2 = (List) parser.parseExpression("{{'a','b'},{'x','y'}}").getValue(context);

//        System.out.println(numbers1);
//        System.out.println(System.identityHashCode(numbers1));
//        System.out.println(numbers2);
//        System.out.println(System.identityHashCode(numbers2));
//        System.out.println(listOfLists1);
//        System.out.println(System.identityHashCode(listOfLists1));
//        System.out.println(listOfLists2);
//        System.out.println(System.identityHashCode(listOfLists2));

        List numbers3 = null;
        for(int i = 0; i < 3; i++) {
            numbers3 = (List) parser.parseExpression("{1,2,3,4}").getValue(context);
            System.out.println(System.identityHashCode(numbers3));
        }
    }
}
