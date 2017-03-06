package com.codeclan.example.zoo;

/**
 * Created by user on 03/03/2017.
 */

public class ClownFish extends Animal implements Swimmable, Edible {

    private String name;
    private int age;

    public ClownFish(String name, int age) {
        super(name, age);
    }

    public String swim() {
        return "I live in the water and love to swim!";
    }

    public String breathe() {
        return "I can breathe under water!";
    }

    public String blowBubbles() {
        return "I can blow bubbles!";
    }
}
