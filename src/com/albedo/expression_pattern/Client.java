package com.albedo.expression_pattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Client {
    public static void main(String[] args) throws Exception {
        String expStr = getExpStr();
        HashMap<String,Integer> var = getValue(expStr);
        Calculator calculator = new Calculator(expStr);
        System.out.println("运算结果为：" + expStr + " = " + calculator.run(var));

    }

    static String getExpStr() throws Exception {
        System.out.print("请输入表达式：");
        return new BufferedReader(new InputStreamReader(System.in)).readLine();
    }

    static HashMap<String, Integer> getValue(String expStr) throws Exception {
        System.out.println();
        HashMap<String, Integer> map = new HashMap<>();
        for (char ch : expStr.toCharArray()) {

            if (ch != '+' && ch != '-') {
                if (!map.containsKey(String.valueOf(ch))) {
                    System.out.print("请输入" + ch + "的值：");
                    String in = new BufferedReader(new InputStreamReader(System.in)).readLine();
                    System.out.println();
                    map.put(String.valueOf(ch), Integer.valueOf(in));
                }
            }
        }
        return map;
    }
}
