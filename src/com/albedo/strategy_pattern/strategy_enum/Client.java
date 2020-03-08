package com.albedo.strategy_pattern.strategy_enum;

public class Client {
    public static void main(String[] args) {
        int a=12;
        int b=23;
        System.out.println(Calculator.ADD.exec(a,b));
        System.out.println(Calculator.SUB.exec(b,a));
    }
}
