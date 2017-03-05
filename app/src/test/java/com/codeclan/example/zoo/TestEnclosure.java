package com.codeclan.example.zoo;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

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
        enclosure = new Enclosure("Big Cats");
        tiger = new Tiger("Tony", 8);
        parrot = new Parrot("Polymorphism", 20);
    }

    @Test
    public void testCanAddAnimal() {
        enclosure.addAnimal(tiger);
        assertEquals(1, enclosure.getNumberOfAnimals());
    }

   @Test
    public void testNumberOfAnimals() {
       enclosure.addAnimal(tiger);
       enclosure.addAnimal(parrot);
       assertEquals(2, enclosure.getNumberOfAnimals());
   }

   @Test
    public void testRemoveAnimal() {
       enclosure.addAnimal(tiger);
       enclosure.addAnimal(parrot);
       enclosure.removeAnimal(tiger);
       assertEquals(1, enclosure.getNumberOfAnimals());

   }
//
//    @Test
//    public void testFeedAnimal() {
//
//    }




}
