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
        if (animal instanceof IFly) {
            animals.add(animal);
        } else {
            System.out.println("Only parrots in here thanks!");
        }
    }
}
