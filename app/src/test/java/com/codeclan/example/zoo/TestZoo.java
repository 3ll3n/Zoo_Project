package com.codeclan.example.zoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 03/03/2017.
 */

public class TestZoo {

    Zoo zoo;
    Enclosure enclosure1;
    Enclosure enclosure2;

    @Before
    public void before() {
        zoo = new Zoo("Animal Sanctuary");
        enclosure1 = new Enclosure("Big Cats");
        enclosure2 = new Enclosure("Aviary");
    }

    @Test
    public void testAddEnclosure() {
        zoo.addEnclosure(enclosure1);
        assertEquals(1, zoo.getNumberOfEnclosures());
    }

    @Test
    public void testNumberOfEnclosures() {
        zoo.addEnclosure(enclosure1);
        zoo.addEnclosure(enclosure2);
        assertEquals(2, zoo.getNumberOfEnclosures());
    }



}
