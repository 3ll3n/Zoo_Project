package com.codeclan.example.zoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 03/03/2017.
 */

public class TestEnclosure {

    Enclosure enclosure;

    Tiger tiger;
    Parrot parrot;


    @Before
    public void before() {
        enclosure = new BigCat("Big Cats");
        tiger = new Tiger("Tony", 8);
        parrot = new Parrot("Polymorphism", 20);
    }

    @Test
    public void testGetName() {
        assertEquals("Big Cats", enclosure.getName());
    }

    @Test
    public void testGetAnimals() {
        enclosure.addAnimal(new Tiger("Timmy", 8));
        enclosure.addAnimal(new Tiger("Theresa", 8));
        assertEquals(2, enclosure.getNumberOfAnimals());
    }

   @Test
    public void testNumberOfAnimals() {
       enclosure.addAnimal(tiger);
       assertEquals(1, enclosure.getNumberOfAnimals());
   }

   @Test
    public void testRemoveAnimal() {
       enclosure.addAnimal(tiger);
       enclosure.removeAnimal(tiger);
       assertEquals(0, enclosure.getNumberOfAnimals());
   }

    @Test
    public void testFeedAnimal() {
        Steak steak = new Steak();
        enclosure.addAnimal(tiger);

        Tiger tiger2 = new Tiger("Fluffy", 22);

        enclosure.addAnimal(tiger2);
        enclosure.feedAnimals(steak);

        assertEquals(1, tiger.foodCount());
        assertEquals(1, tiger2.foodCount());

    }
}
