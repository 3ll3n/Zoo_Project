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

    @Before
    public void before() {
        aquarium = new Aquarium("Aquarium");
        clownfish = new ClownFish("Flounder", 7);
    }

    @Test
    public void testAddAnimal() {
        aquarium.addAnimal(clownfish);
        assertEquals(1, aquarium.getNumberOfAnimals());
    }

}
