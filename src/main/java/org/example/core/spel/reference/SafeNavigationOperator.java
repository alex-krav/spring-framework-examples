package org.example.core.spel.reference;

import org.example.core.spel.Inventor;
import org.example.core.spel.PlaceOfBirth;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.SimpleEvaluationContext;

public class SafeNavigationOperator {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        EvaluationContext context = SimpleEvaluationContext.forReadOnlyDataBinding().build();

        Inventor tesla = new Inventor("Nikola Tesla", "Serbian");
        tesla.setPlaceOfBirth(new PlaceOfBirth("Smiljan"));

        String city = parser.parseExpression("placeOfBirth?.city").getValue(context, tesla, String.class);
        System.out.println(city);  // Smiljan

        tesla.setPlaceOfBirth(null);
        city = parser.parseExpression("placeOfBirth?.city").getValue(context, tesla, String.class);
        System.out.println(city);  // null - does not throw NullPointerException!!!
    }
}
