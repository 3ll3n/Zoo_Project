package com.codeclan.example.zoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 03/03/2017.
 */

public class TestParrot {

    Parrot parrot;

    @Before
    public void before() {
        parrot = new Parrot("Polymorphism", 20);
    }

    @Test
    public void testFly() {
        assertEquals("I can fly!", parrot.fly());
    }
}
