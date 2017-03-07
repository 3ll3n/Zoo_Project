package com.codeclan.example.zoo;

/**
 * Created by user on 03/03/2017.
 */

public class Tiger extends Animal implements IPredator {

    public Tiger(String name, int age) {
       super(name, age);
    }

    public String roar() {
        return "Roooaaar";
    }

    public String hunt() {
        return "I am a hunter";
    }

    @Override
    public void eat(IEdible food) {
        if (food instanceof IMeat) {
            belly.add(food);
        }
    }
}
