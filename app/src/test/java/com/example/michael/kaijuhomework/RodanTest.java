package com.example.michael.kaijuhomework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by michael on 06/09/2017.
 */

public class RodanTest {
    Rodan rodan;

    @Before
    public void before() {
        rodan = new Rodan();
    }

    @Test
    public void hasName() {
        assertEquals("Rodan", rodan.getName());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(1500, rodan.getHealthValue());
    }

    @Test
    public void hasAttackValue() {
        assertEquals(400, rodan.getAttackValue());
    }

    @Test
    public void testRoar() {
        assertEquals("Graaaaaagh!", rodan.roar());
    }

    @Test
    public void canBeDamaged() {
        rodan.damage(800);
        assertEquals(700, rodan.getHealthValue());
    }
}
