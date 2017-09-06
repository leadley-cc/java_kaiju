package com.example.michael.kaijuhomework;

/**
 * Created by michael on 06/09/2017.
 */

public abstract class Kaiju
        implements Damageable, Attacker {

    private String name;
    private int healthValue;
    private int attackValue;

    public Kaiju(String name, int healthValue, int attackValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getName() {
        return name;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public void damage(int damageValue) {
        if (damageValue >= healthValue) {
            healthValue = 0;
        } else {
            healthValue -= damageValue;
        }
    }

    public void attack(Damageable target) {
        target.damage(attackValue);
    }

    public abstract String roar();
}
