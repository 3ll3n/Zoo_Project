package com.codeclan.example.zoo;

/**
 * Created by user on 03/03/2017.
 */

public abstract class Animal {

    private String name;
    private int age;

    public Animal(String name, int age) {
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

    public String canEat() {
        return "I can eat";
    }

    public String canBreathe() {
        return "I can breathe";
    }

    public String canPoop() {
        return "I can poop";
    }
}
