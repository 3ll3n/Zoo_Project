package com.codeclan.example.zoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 03/03/2017.
 */

public class TestClownFish {

    ClownFish clownfish;

    @Before
    public void before() {
        clownfish = new ClownFish("Nemo", 2);
    }

    @Test
    public void testCanSwim() {
        assertEquals("I live in the water and love to swim!", clownfish.canSwim());
    }

    @Test
    public void testGetName() {
        assertEquals("Nemo", clownfish.getName());
    }

    @Test
    public void testSetName() {
        clownfish.setName("NotNemo");
        assertEquals("NotNemo", clownfish.getName());
    }

    @Test
    public void testGetAge() {
        assertEquals(2, clownfish.getAge());
    }

    @Test
    public void testSetAge() {
        clownfish.setAge(5);
        assertEquals(5, clownfish.getAge());
    }

}
