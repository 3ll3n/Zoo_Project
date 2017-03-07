package com.codeclan.example.zoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 06/03/2017.
 */

public class TestAquarium {

    Enclosure aquarium;
    Animal clownfish;
    Animal tiger;

    @Before
    public void before() {
        aquarium = new Aquarium("Aquarium");
        clownfish = new ClownFish("Flounder", 7);
        tiger = new Tiger("Spartan", 5);
    }

    @Test
    public void testAddAnimal() {
        aquarium.addAnimal(clownfish);
        assertEquals(1, aquarium.getNumberOfAnimals());
    }

    @Test
    public void testCantAddWrongAnimal() {
        aquarium.addAnimal(tiger);
        assertEquals(0, aquarium.getNumberOfAnimals());
    }

}
