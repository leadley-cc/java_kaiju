package com.example.michael.kaijuhomework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by michael on 06/09/2017.
 */

public class RodanTest {
    Rodan rodan;
    Damageable target;

    @Before
    public void before() {
        rodan = new Rodan();
        target = new BehemothTank();
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

    @Test
    public void healthLowerBoundedAtZero() {
        rodan.damage(5000);
        assertEquals(0, rodan.getHealthValue());
    }

    @Test
    public void canAttack() {
        rodan.attack(target);
        assertEquals(1600, target.getHealthValue());
    }

    @Test
    public void canFly() {
        assertEquals("Flap! Flap!", rodan.fly());
    }
}
