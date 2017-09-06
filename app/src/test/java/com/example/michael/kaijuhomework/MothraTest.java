package com.example.michael.kaijuhomework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by michael on 06/09/2017.
 */

public class MothraTest {
    Mothra mothra;

    @Before
    public void before() {
        mothra = new Mothra();
    }

    @Test
    public void hasName() {
        assertEquals("Mothra", mothra.getName());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(800, mothra.getHealthValue());
    }

    @Test
    public void hasAttackValue() {
        assertEquals(600, mothra.getAttackValue());
    }

    @Test
    public void testRoar() {
        assertEquals("Gwoooooosh!", mothra.roar());
    }

    @Test
    public void canBeDamaged() {
        mothra.damage(200);
        assertEquals(600, mothra.getHealthValue());
    }
}
