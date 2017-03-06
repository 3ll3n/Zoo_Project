package com.codeclan.example.zoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 06/03/2017.
 */

public class TestAquarium {

    Enclosure fish;

    @Before
    public void before() {
        Animal fish = new ClownFish("Flounder", 7);
    }

    @Test
    public void testAddAnimals() {
        assertEquals(1, fish.getNumberOfAnimals());
    }

}
