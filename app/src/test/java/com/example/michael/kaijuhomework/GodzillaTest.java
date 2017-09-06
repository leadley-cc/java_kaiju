package com.example.michael.kaijuhomework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by michael on 06/09/2017.
 */

public class GodzillaTest {
    Godzilla godzilla;
    Damageable target;

    @Before
    public void before() {
        godzilla = new Godzilla();
        target = new BehemothTank();
    }

    @Test
    public void hasName() {
        assertEquals("Godzilla", godzilla.getName());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(1000, godzilla.getHealthValue());
    }

    @Test
    public void hasAttackValue() {
        assertEquals(500, godzilla.getAttackValue());
    }

    @Test
    public void testRoar() {
        assertEquals("Skreeeonk!", godzilla.roar());
    }

    @Test
    public void canBeDamaged() {
        godzilla.damage(300);
        assertEquals(700, godzilla.getHealthValue());
    }

    @Test
    public void canAttack() {
        godzilla.attack(target);
        assertEquals(1500, target.getHealthValue());
    }
}
