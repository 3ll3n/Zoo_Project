package com.codeclan.example.zoo;

/**
 * Created by user on 06/03/2017.
 */

public class BigCat extends Enclosure {

    public BigCat(String name) {
        super(name);
    }

    @Override
    public void addAnimal(Animal animal){
        if (animal instanceof IPredator) {
            animals.add(animal);
            System.out.println(animal.getName() + " the tiger has been added to the enclosure!");
        } else {
        System.out.println("Only tigers in here thanks!");
        }
    }
}
