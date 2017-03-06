package com.codeclan.example.zoo;

import java.util.ArrayList;

/**
 * Created by user on 03/03/2017.
 */

public abstract class Animal {

    private String name;
    private int age;
    private ArrayList<IEdible> belly;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        this.belly = new ArrayList<IEdible>();
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

    public String breathe() {
        return "I can breathe";
    }

    public int foodCount() {
        return belly.size();
    }

    public void eat(IEdible food){
    }

    public void poop() {
        belly.clear();
    }
}
