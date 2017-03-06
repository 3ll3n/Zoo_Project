package com.codeclan.example.zoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 06/03/2017.
 */

public class TestAviary {

    Enclosure parrot;

    @Before
    public void before() {
        Animal parrot = new Parrot("Mabel", 4);
    }

    @Test
    public void testAddAnimals() {
        assertEquals(1, parrot.getNumberOfAnimals());
    }
}
