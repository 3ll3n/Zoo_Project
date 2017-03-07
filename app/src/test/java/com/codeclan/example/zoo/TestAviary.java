package com.codeclan.example.zoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 06/03/2017.
 */

public class TestAviary {

    Enclosure aviary;
    Animal parrot;
    Animal clownfish;

    @Before
    public void before() {
        aviary = new Aviary("Aviary");
        parrot = new Parrot("Rio", 10);
        clownfish = new ClownFish("Flipper", 3);

    }

    @Test
    public void testAddAnimals() {
        aviary.addAnimal(parrot);
        assertEquals(1, aviary.getNumberOfAnimals());
    }

    @Test
    public void testCantAddWrongAnimal() {
        aviary.addAnimal(clownfish);
        assertEquals(0, aviary.getNumberOfAnimals());
    }
}
