package com.codeclan.example.zoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 03/03/2017.
 */

public class TestAnimal {

    Tiger tiger;
    ClownFish clownfish;

    @Before
    public void before() {
        tiger = new Tiger("Tony", 8);
        clownfish = new ClownFish("Nemo", 2);
    }

    @Test
    public void testGetName() {
        assertEquals("Tony", tiger.getName());
    }

    @Test
    public void testCanSetName() {
        tiger.setName("Khan");
        assertEquals("Khan", tiger.getName());
    }

    @Test
    public void testGetAge() {
        assertEquals(8, tiger.getAge());
    }

    @Test
    public void testSetAge() {
        tiger.setAge(5);
        assertEquals(5, tiger.getAge());
    }

    @Test
    public void testBreathe() {
        assertEquals("I can breathe", tiger.breathe());
    }

    @Test
    public void testpoop() {
        assertEquals("I can poop", tiger.poop());
    }

    @Test
    public void testeat() {
        assertEquals("I can eat", clownfish.eat());
    }
}
