package org.example.core.spel.reference;

import org.example.core.spel.Inventor;
import org.example.core.spel.PlaceOfBirth;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.SimpleEvaluationContext;

import java.util.Arrays;
import java.util.List;

public class CollectionProjection {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        Inventor tesla = new Inventor("Nikola Tesla", "serbian");
        tesla.setPlaceOfBirth(new PlaceOfBirth("Smiljan", "Serbia"));
        Inventor kravchuk = new Inventor("Alex Kravchuk", "ukrainian");
        kravchuk.setPlaceOfBirth(new PlaceOfBirth("Zhytomyr", "Ukraine"));
        List<Inventor> members = Arrays.asList(tesla, kravchuk);
        EvaluationContext context = SimpleEvaluationContext.forReadOnlyDataBinding().build();
        context.setVariable("members", members);

        // returns ['Smiljan', 'Idvor' ]
        List placesOfBirth = (List)parser.parseExpression("#members.![placeOfBirth.city]").getValue(context);
        System.out.println(placesOfBirth);
    }
}
