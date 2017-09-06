package com.example.michael.kaijuhomework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by michael on 06/09/2017.
 */

public class BehemothTankTest {
    BehemothTank behemoth;
    Damageable target;

    @Before
    public void before() {
        behemoth = new BehemothTank();
        target = new Godzilla();
    }

    @Test
    public void hasType() {
        assertEquals("Behemoth Tank", behemoth.getType());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(2000, behemoth.getHealthValue());
    }

    @Test
    public void hasAttackValue() {
        assertEquals(300, behemoth.getAttackValue());
    }

    @Test
    public void canBeDamaged() {
        behemoth.damage(400);
        assertEquals(1600, behemoth.getHealthValue());
    }

    @Test
    public void healthLowerBoundedAtZero() {
        behemoth.damage(5000);
        assertEquals(0, behemoth.getHealthValue());
    }

    @Test
    public void canAttack() {
        behemoth.attack(target);
        assertEquals(700, target.getHealthValue());
    }
}
