package com.codeclan.example.zoo;

/**
 * Created by user on 06/03/2017.
 */

public class Aviary extends Enclosure {

    public Aviary(String name) {
        super(name);
    }

    @Override
    public void addAnimal(Animal animal){
        if (animal instanceof Aviary) {
            animals.add(animal);
        } else {
            System.out.println("Only birds allowed in here!");
        }
    }

}
