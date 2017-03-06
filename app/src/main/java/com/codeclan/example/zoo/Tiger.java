package com.codeclan.example.zoo;

/**
 * Created by user on 03/03/2017.
 */

public class Tiger extends Animal implements IPredator {

    private String name;
    private int age;

    public Tiger(String name, int age) {
       super(name, age);
    }

    public String roar() {
        return "Roooaaar";
    }

}
