package com.codeclan.example.zoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 06/03/2017.
 */

public class TestBigCat {

    Enclosure tiger;

    @Before
    public void before() {
        Animal tiger = new Tiger("Pegasus", 3);
    }

    @Test
    public void testAddAnimals() {
        assertEquals(1, tiger.getNumberOfAnimals());
    }
}

