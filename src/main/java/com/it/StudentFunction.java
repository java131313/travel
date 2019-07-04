package com.it;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class StudentFunction {
    static class Student{
        String name;
        double score;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getScore() {
            return score;
        }

        public void setScore(double score) {
            this.score = score;
        }

        public Student(String name, double score) {
            this.name = name;
            this.score = score;
        }
    }
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student[]{
                new Student("zhangsan",89d),
                new Student("lisi",89d),
                new Student("wangwu",98d),
        });
        List<String> names = map(students,t->t.getName());
        System.out.println(names);
    }
    public static <T,R> List<R> map(List<T> list, Function<T,R> mapper){
        List<R> retList = new ArrayList<>(list.size());
        for(T e:list){
            retList.add(mapper.apply(e));
        }
        return retList;
    }
}
