package com.albedo.expression_pattern;

import java.util.HashMap;

/**
 * 抽象表达式类
 */
public interface Expression {
    int interpreter(HashMap<String,Integer> var);
}
