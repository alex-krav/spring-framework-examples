package org.example.core.spel.reference;

import org.example.core.spel.Inventor;
import org.example.core.spel.PlaceOfBirth;
import org.example.core.spel.Society;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.SimpleEvaluationContext;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Arrays_Lists_Maps {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        EvaluationContext context = SimpleEvaluationContext.forReadOnlyDataBinding().build();

        // Inventions Array

        Inventor tesla = new Inventor("Nikola Tesla", "serbian");
        tesla.setInventions(new String[]{"a","b","c","d","e","f","g"});
        // evaluates to "Induction motor"
        String inventionD = parser.parseExpression("inventions[3]").getValue(
                context, tesla, String.class);
        System.out.println(inventionD);

        // Members List

        Society ieee = new Society("IEEE");
        ieee.setMembers(Collections.singletonList(tesla));
        // evaluates to "Nikola Tesla"
        String name = parser.parseExpression("members[0].name").getValue(
                context, ieee, String.class);

        // List and Array navigation
        // evaluates to "Wireless communication"
        String inventionG = parser.parseExpression("members[0].inventions[6]").getValue(
                context, ieee, String.class);
        System.out.println(inventionG);

        // Officer's Dictionary
        Inventor president = new Inventor("Pupin", "ukrainian");
        president.setPlaceOfBirth(new PlaceOfBirth("Zhytomyr", "Ukraine"));
        Inventor advisor = new Inventor("Idvor", "belarussian");
        advisor.setPlaceOfBirth(new PlaceOfBirth("Minsk", "Belarus"));
        Map officers = new HashMap<>();
        officers.put(Society.President, president);
        officers.put(Society.Advisors, Collections.singletonList(advisor));
        ieee.setOfficers(officers);

        Inventor pupin = parser.parseExpression("officers['president']").getValue(
                ieee, Inventor.class);
        System.out.println(pupin.getName());

        // evaluates to "Idvor"
        String city = parser.parseExpression("officers['president'].placeOfBirth.city").getValue(
                ieee, String.class);
        System.out.println(city);

        // setting values
        parser.parseExpression("officers['advisors'][0].placeOfBirth.country").setValue(
                ieee, "Croatia");
        System.out.println(advisor.getPlaceOfBirth());
    }
}
