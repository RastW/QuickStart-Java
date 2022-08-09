package com.rast.model;

/**
 * @author goumang
 * @description
 * @date 2022/8/9 22:53
 */
public class Person {

    private String name;

    private int age;

    private boolean student;

    private Person son;

    public Person(String name, int age, boolean student) {
        this.name = name;
        this.age = age;
        this.student = student;
    }

    public Person(String name, int age, boolean student, Person son) {
        this.name = name;
        this.age = age;
        this.student = student;
        this.son = son;
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

    public boolean isStudent() {
        return student;
    }

    public void setStudent(boolean student) {
        this.student = student;
    }

    public Person getSon() {
        return son;
    }

    public void setSon(Person son) {
        this.son = son;
    }
}
