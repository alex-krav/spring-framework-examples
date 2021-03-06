package org.example.core.spel.reference;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.SimpleEvaluationContext;

import java.util.Arrays;

public class Array_Construction {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        EvaluationContext context = SimpleEvaluationContext.forReadOnlyDataBinding().build();

        int[] numbers1 = (int[]) parser.parseExpression("new int[4]").getValue(context);
        System.out.println(Arrays.toString(numbers1));

        // Array with initializer
        int[] numbers2 = (int[]) parser.parseExpression("new int[]{1,2,3}").getValue(context);
        System.out.println(Arrays.toString(numbers2));

        // Multi dimensional array
        int[][] numbers3 = (int[][]) parser.parseExpression("new int[4][5]").getValue(context);
        System.out.println(Arrays.deepToString(numbers3));

//        int [][] numbers4 = new int[][]{{1,2},{3,4}};
        int[][] numbers4 = (int[][]) parser.parseExpression("new int[][]{{1,2},{3,4}}").getValue(context);
        System.out.println(Arrays.deepToString(numbers4));
    }
}
