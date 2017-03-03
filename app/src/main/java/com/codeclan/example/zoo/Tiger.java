package com.codeclan.example.zoo;

import static android.R.attr.name;

/**
 * Created by user on 03/03/2017.
 */

public class Tiger extends Animal implements Swimmable {

    private String name;
    private int age;

    public Tiger(String name, int age) {
       super(name, age);
    }

    public String canSwim() {
        return "I love to swim!";
    }

    public String canRoar() {
        return "Roooaaar";
    }

    @Override
    public String canEat() {
        return "I can eat meat";
    }
}
