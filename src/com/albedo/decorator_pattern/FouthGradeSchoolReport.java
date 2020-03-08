package com.albedo.decorator_pattern;

public class FouthGradeSchoolReport implements SchoolReport{
    @Override
    public void report() {
        System.out.println("我的成绩");
        System.out.println("        家长签名       ");
    }

    @Override
    public void sign(String name) {
        System.out.println("家长签名："+name);
    }
}
