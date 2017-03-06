package com.codeclan.example.zoo;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by user on 03/03/2017.
 */

public class Enclosure {

    private String name;
    private ArrayList<Animal> animals;


    public Enclosure(String name) {
        this.name = name;
        this.animals = new ArrayList<Animal>();
    }

    public void addAnimal(Animal animal) {
       animals.add(animal);
    }

    public int getNumberOfAnimals() {
        return animals.size();
    }

    public void removeAnimal(Animal animal) {
        for (Animal animalName : animals) {
            if (name.equals(animalName));
            animals.remove(animal);
        }
    }
}
