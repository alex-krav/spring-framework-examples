package org.example.core.spel.reference.variables;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.SimpleEvaluationContext;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThisAndRoot {
    public static void main(String[] args) {
        // create an array of integers
        List<Integer> primesList = new ArrayList<>();
        primesList.addAll(Arrays.asList(2,3,5,7,11,13,17));

        // create parser and set variable 'primes' as the array of integers
        ExpressionParser parser = new SpelExpressionParser();
        EvaluationContext context = SimpleEvaluationContext.forReadOnlyDataBinding().build();
        context.setVariable("primesVar", primesList);
        context.setVariable("tenVar", 10);
        StandardEvaluationContext standardContext = new StandardEvaluationContext();
        standardContext.setRootObject(new HolderObject());

        // all prime numbers > 10 from the list (using selection ?{...})
        // evaluates to [11, 13, 17]
        List<Integer> primesGreaterThanTen = (List<Integer>) parser.parseExpression(
                "#root.primes.?[#this>#root.max]").getValue(standardContext);
        System.out.println(primesGreaterThanTen);
        int eleven = (int) parser.parseExpression(
                "#primesVar.^[#this>10]").getValue(context);
        System.out.println(eleven);
        int seventeen = (int) parser.parseExpression(
                "#primesVar.$[#this>#ten]").getValue(context);
        System.out.println(seventeen);
    }

    static class HolderObject {
        public List<Integer> primes = Arrays.asList(2,3,5,7,11,13,17);
        public int max = 10;
    }
}
