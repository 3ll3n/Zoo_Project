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
    public void testroar() {
        assertEquals("Roooaaar", tiger.roar());
    }


}
