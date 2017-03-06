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
    public void testSwim() {
        assertEquals("I live in the water and love to swim!", clownfish.swim());
    }

    @Test
    public void testBreathe() {
        assertEquals("I can breathe under water!", clownfish.breathe());
    }

    @Test
    public void testBlowBubbles() {
        assertEquals("I can blow bubbles!", clownfish.blowBubbles());
    }

    @Test
    public void testCanEatAlgae() {
        Algae algae = new Algae();
        clownfish.eat(algae);
        assertEquals(1, clownfish.foodCount());
    }

    @Test
    public void testCantEatSteak() {
        Steak steak = new Steak();
        clownfish.eat(steak);
        assertEquals(0, clownfish.foodCount());
    }
}


