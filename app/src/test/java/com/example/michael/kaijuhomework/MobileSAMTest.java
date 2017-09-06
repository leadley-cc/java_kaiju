package com.example.michael.kaijuhomework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by michael on 06/09/2017.
 */

public class MobileSAMTest {
    MobileSAM mobileSAM;

    @Before
    public void before() {
        mobileSAM = new MobileSAM();
    }

    @Test
    public void hasType() {
        assertEquals("MobileSAM", mobileSAM.getType());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(300, mobileSAM.getHealthValue());
    }

    @Test
    public void hasAttackValue() {
        assertEquals(500, mobileSAM.getAttackValue());
    }

    @Test
    public void canBeDamaged() {
        mobileSAM.damage(100);
        assertEquals(200, mobileSAM.getHealthValue());
    }
}
