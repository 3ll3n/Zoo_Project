package com.codeclan.example.zoo;

/**
 * Created by user on 06/03/2017.
 */

public class Aquarium extends Enclosure {

    public Aquarium(String name) {
        super(name);
    }

    @Override
    public void addAnimal(Animal animal){
        if (animal instanceof Aquarium) {
            animals.add(animal);
        } else {
            System.out.println("Only fish allowed in here!");
        }

    }

}
