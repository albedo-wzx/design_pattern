package com.albedo.decorator_pattern;

/**
 * 修饰的抽象类
 */
public abstract class Decorator implements SchoolReport{
    private SchoolReport schoolReport;

    public Decorator(SchoolReport schoolReport) {
        this.schoolReport = schoolReport;
    }

    @Override
    public void report() {
        this.schoolReport.report();
    }

    @Override
    public void sign(String name) {
        this.schoolReport.sign(name);
    }
}
