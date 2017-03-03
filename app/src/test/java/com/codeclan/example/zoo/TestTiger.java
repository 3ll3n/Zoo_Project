package com.codeclan.example.zoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 03/03/2017.
 */

public class TestTiger {

    Tiger tiger;

    @Before
    public void before() {
        tiger = new Tiger("Tony", 8);
    }

    @Test
    public void testCanSwim() {
        assertEquals("I love to swim!", tiger.canSwim());
    }

    @Test
    public void testCanEat() {
        assertEquals("I can eat meat", tiger.canEat());
    }

    @Test
    public void testCanBreathe() {
        assertEquals("I can breathe", tiger.canBreathe());
    }

    @Test
    public void testCanPoop() {
        assertEquals("I can poop", tiger.canPoop());
    }

    @Test
    public void testCanRoar() {
        assertEquals("Roooaaar", tiger.canRoar());
    }


}
