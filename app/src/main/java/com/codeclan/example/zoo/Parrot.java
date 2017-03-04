package com.codeclan.example.zoo;

/**
 * Created by user on 03/03/2017.
 */

public class Parrot extends Animal implements Flyable {

    private String name;
    private int age;

    public Parrot(String name, int age) {
        super(name, age);
    }

    public String fly() {
        return "I can fly!";
    }

    public String talk() {
        return "I can talk!";
    }
}
