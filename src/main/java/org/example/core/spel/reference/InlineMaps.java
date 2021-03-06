package org.example.core.spel.reference;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.SimpleEvaluationContext;

import java.util.Map;

public class InlineMaps {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
//        EvaluationContext context = SimpleEvaluationContext.forReadOnlyDataBinding().build();

        // evaluates to a Java map containing the two entries
        Map inventorInfo = (Map) parser.parseExpression("{name:'Nikola',dob:'10-July-1856'}").getValue(/*context*/);
        System.out.println(inventorInfo);

        Map mapOfMaps = (Map) parser.parseExpression("{name:{first:'Nikola',last:'Tesla'},dob:{day:10,month:'July',year:1856}}").getValue(/*context*/);
        System.out.println(mapOfMaps);
    }
}
