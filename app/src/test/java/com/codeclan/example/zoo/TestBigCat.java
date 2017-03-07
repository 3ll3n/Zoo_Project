package com.codeclan.example.zoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 06/03/2017.
 */

public class TestBigCat {

    Enclosure bigcat;
    Animal tiger;
    Animal clownfish;

    @Before
    public void before() {
        bigcat = new BigCat("Big Cats");
        tiger = new Tiger("Scar", 15);
        clownfish = new ClownFish("Coco", 7);
    }

    @Test
    public void testAddAnimals() {
        bigcat.addAnimal(tiger);
        assertEquals(1, bigcat.getNumberOfAnimals());
    }

    @Test
    public void testCantAddWrongAnimal() {
        bigcat.addAnimal(clownfish);
        assertEquals(0, bigcat.getNumberOfAnimals());
    }
}

