package com.codeclan.example.zoo;

/**
 * Created by user on 03/03/2017.
 */

public class ClownFish extends Animal implements Swimmable {

    private String name;
    private int age;

    public ClownFish(String name, int age) {
        super(name, age);
    }

    public String canSwim() {
        return "I live in the water and love to swim!";
    }

    public String canBreathe() {
        return "I can breathe under water!";
    }

    public String canBeFound() {
        return "I can be found!";
    }
}
