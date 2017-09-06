package com.example.michael.kaijuhomework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by michael on 06/09/2017.
 */

public class BuildingTest {
    Building building;

    @Before
    public void before() {
        building = new Building("Skyscraper", 1000);
    }

    @Test
    public void hasName() {
        assertEquals("Skyscraper", building.getName());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(1000, building.getHealthValue());
    }

    @Test
    public void canBeDamaged() {
        building.damage(300);
        assertEquals(700, building.getHealthValue());
    }

    @Test
    public void healthLowerBoundedAtZero() {
        building.damage(5000);
        assertEquals(0, building.getHealthValue());
    }
}
