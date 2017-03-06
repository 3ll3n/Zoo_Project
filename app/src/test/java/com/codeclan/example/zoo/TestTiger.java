package com.codeclan.example.zoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 03/03/2017.
 */

public class TestTiger {

    Tiger tiger;
    Steak steak;

    @Before
    public void before() {
        tiger = new Tiger("Tony", 8);
        steak = new Steak();
    }

    @Test
    public void testRoar() {
        assertEquals("Roooaaar", tiger.roar());
    }

    @Test
    public void testHunt() {
        assertEquals("I am a hunter", tiger.hunt());
    }

    @Test
    public void testCanEatSteak() {
        tiger.eat(steak);
        assertEquals(1, tiger.foodCount());
    }

//    @Test
//    public void testCantEatSeeds() {
//
//    }


}
