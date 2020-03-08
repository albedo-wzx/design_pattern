package com.albedo.decorator_pattern;

/**
 * 最高成绩修饰类
 */
public class HighScoreDecorator extends Decorator{
    public HighScoreDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }

    private void reportHighScore(){
        System.out.println("这次语文最高成绩，数学最高成绩，英语最高成绩");
    }

    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }
}
