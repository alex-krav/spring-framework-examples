package org.example.core.spel;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.SimpleEvaluationContext;

import java.util.ArrayList;
import java.util.List;

public class TypeConversion {
    public static void main(String[] args) {
        Simple simple = new Simple();
        simple.booleanList.add(true);
        System.out.println(simple.booleanList);

        EvaluationContext context = SimpleEvaluationContext.forReadOnlyDataBinding().build();
        ExpressionParser parser = new SpelExpressionParser();
        // "false" is passed in here as a String. SpEL and the conversion service
        // will recognize that it needs to be a Boolean and convert it accordingly.
        parser.parseExpression("booleanList[0]").setValue(context, simple, "false");

        // b is false
        Boolean b = simple.booleanList.get(0);
        System.out.println(simple.booleanList);
    }
}

class Simple {
    public List<Boolean> booleanList = new ArrayList<>();
}


