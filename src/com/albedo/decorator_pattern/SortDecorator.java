package com.albedo.decorator_pattern;

/**
 * 排名情况修饰类
 */
public class SortDecorator extends Decorator{
    public SortDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }

    private void reportSort(){
        System.out.println("这次我在班级的排名");
    }

    @Override
    public void report() {
        super.report();
        this.reportSort();
    }
}
