package com.codeclan.example.zoo;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by user on 03/03/2017.
 */

public abstract class Enclosure {

    private String name;
    protected ArrayList<Animal> animals;

    public abstract void addAnimal(Animal animal);

    public Enclosure(String name) {
        this.name = name;
        this.animals = new ArrayList<Animal>();
    }

    public String getName() {
        return name;
    }

    public int getNumberOfAnimals() {
        return animals.size();
    }

    public void removeAnimal(Animal animal) {
            animals.remove(animal);
    }

    public void feedAnimals(IEdible food) {
        for (Animal animal : animals) {
            animal.eat(food);
        }
    }
}
