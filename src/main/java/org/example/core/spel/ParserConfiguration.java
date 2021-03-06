package org.example.core.spel;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.SpelParserConfiguration;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import java.util.List;

public class ParserConfiguration {
    public static void main(String[] args) {
        // Turn on:
        // - auto null reference initialization
        // - auto collection growing
        SpelParserConfiguration config = new SpelParserConfiguration(true,true);
        ExpressionParser parser = new SpelExpressionParser(config);
        Expression expression = parser.parseExpression("list[3]");

        Demo demo = new Demo();

        Object o = expression.getValue(demo);
        System.out.println("'"+o+"'");

        // demo.list will now be a real collection of 4 entries
        // Each entry is a new empty String
    }
}

class Demo {
    public List<String> list;
}

