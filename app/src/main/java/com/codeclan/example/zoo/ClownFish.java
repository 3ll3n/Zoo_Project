package com.codeclan.example.zoo;

/**
 * Created by user on 03/03/2017.
 */

public class ClownFish extends Animal implements ISwim {

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

    @Override
    public void eat (IEdible food){
        if (food instanceof IPlant) {
            belly.add(food);
        }
        else{
            System.out.println("I can't eat that!");
        }
    }
}
