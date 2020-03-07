package com.albedo.expressionpattern;

import java.util.HashMap;

/**
 * 加法解析器
 */
public class SubSymbolExpression extends SymbolExpression {
    public SubSymbolExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}
