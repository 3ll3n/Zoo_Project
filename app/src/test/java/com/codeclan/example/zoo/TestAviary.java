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

    @Before
    public void before() {
        aviary = new Aviary("Aviary");
        parrot = new Parrot("Rio", 10);
    }

    @Test
    public void testAddAnimals() {
        animals.addAnimal(parrot);
        assertEquals(1, aviary.getNumberOfAnimals());
    }
}
