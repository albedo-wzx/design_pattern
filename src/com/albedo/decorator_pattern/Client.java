package com.albedo.decorator_pattern;

public class Client {
    public static void main(String[] args) {
        SchoolReport schoolReport;
        schoolReport=new FouthGradeSchoolReport();
        schoolReport=new HighScoreDecorator(schoolReport);
        schoolReport=new SortDecorator(schoolReport);
        schoolReport.report();
        schoolReport.sign("albedo");
    }
}
