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

}
