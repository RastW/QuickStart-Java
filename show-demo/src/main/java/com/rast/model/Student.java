package com.rast.model;

/**
 * @author goumang
 * @description
 * @date 2022/8/10 19:38
 */
public class Student {

    private String name;

    private int age;

    public Student() {}

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
