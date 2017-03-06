package com.codeclan.example.zoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 03/03/2017.
 */

public class TestParrot {

    Parrot parrot;
    Seeds seeds;

    @Before
    public void before() {
        parrot = new Parrot("Polymorphism", 20);
        seeds = new Seeds();
    }

    @Test
    public void testFly() {
        assertEquals("I can fly!", parrot.fly());
    }

    @Test
    public void testTalk() {
        assertEquals("I can talk!", parrot.talk());
    }

    @Test
    public void testCanEatSeeds() {
        parrot.eat(seeds);
        assertEquals(1, parrot.foodCount());
    }

//    @Test
//    public void testCantEatAlgae() {
//
//    }
}
