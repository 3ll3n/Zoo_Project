package com.codeclan.example.zoo;

/**
 * Created by user on 03/03/2017.
 */

public class Parrot extends Animal implements IFly {

    public Parrot(String name, int age) {
        super(name, age);
    }

    public String fly() {
        return "I can fly!";
    }

    public String talk() {
        return "I can talk!";
    }

    @Override
    public void eat(IEdible food) {
        if (food instanceof IFruit) {
            belly.add(food);
        } else {
        System.out.println("I don't like that!");
        }
    }
}
