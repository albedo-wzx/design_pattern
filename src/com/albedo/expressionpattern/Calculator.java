package com.albedo.expressionpattern;

import java.util.HashMap;
import java.util.Stack;

public class Calculator {
    private Expression expression;

    public Calculator(String expStr) {
        Stack<Expression> stack = new Stack<>();

        char[] chars = expStr.toCharArray();
        Expression left;
        Expression right;
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '+':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new AddSymbolExpression(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new SubSymbolExpression(left, right));
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(chars[i])));
            }

        }
        this.expression=stack.pop();
    }

    public int run(HashMap<String,Integer> var){
        return this.expression.interpreter(var);
    }
}
