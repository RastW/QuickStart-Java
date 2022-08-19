package com.rast.model;

/**
 * @author goumang
 * @description
 * @date 2022/8/10 19:38
 */
public class Student {

    private String name;

    private int age;

    private int wallet;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, int wallet) {
        this.name = name;
        this.age = age;
        this.wallet = wallet;
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

    public int getWallet() {
        return wallet;
    }

    public Student setWallet(int wallet) {
        this.wallet = wallet;
        return this;
    }
}
