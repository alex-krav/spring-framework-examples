package org.example.core.spel;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import java.util.GregorianCalendar;

public class EvaluationObject {
    public static void main(String[] args) {
        // Create and set a calendar
        GregorianCalendar c = new GregorianCalendar();
        c.set(1856, 7, 9);

// The constructor arguments are name, birthday, and nationality.
        InventorPublic tesla = new InventorPublic("Nikola Tesla", c.getTime(), "Serbian");

        ExpressionParser parser = new SpelExpressionParser();

        Expression exp = parser.parseExpression("name"); // Parse name as an expression
        String name = (String) exp.getValue(tesla);
// name == "Nikola Tesla"
        System.out.println(name);

        exp = parser.parseExpression("name == 'Nikola Tesla'");
        boolean result = exp.getValue(tesla, Boolean.class);
// result == true
        System.out.println(result);
    }
}
