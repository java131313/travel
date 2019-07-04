package com.it;

public class Stu {
    private String name;
    private double score;// 成绩

    public Stu(String name, double score) {
        this.name = name;
        this.score = score;
    }
    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
