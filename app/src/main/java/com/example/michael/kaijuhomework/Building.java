package com.example.michael.kaijuhomework;

/**
 * Created by michael on 06/09/2017.
 */

public class Building
        implements Damageable {

    private String name;
    private int healthValue;

    public Building(String name, int healthValue) {
        this.name = name;
        this.healthValue = healthValue;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getHealthValue() {
        return healthValue;
    }

    @Override
    public void damage(int damageValue) {
        if (damageValue >= healthValue) {
            healthValue = 0;
        } else {
            healthValue -= damageValue;
        }
    }
}
