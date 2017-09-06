package com.example.michael.kaijuhomework;

/**
 * Created by michael on 06/09/2017.
 */

public abstract class Vehicle {
    private String type;
    private int healthValue;
    private int attackValue;

    public Vehicle(String type, int healthValue, int attackValue) {
        this.type = type;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getType() {
        return type;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public int getAttackValue() {
        return attackValue;
    }
}
