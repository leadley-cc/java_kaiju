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

    @Override
    public int getHealthValue() {
        return healthValue;
    }

    @Override
    public int getAttackValue() {
        return attackValue;
    }

    @Override
    public void damage(int damageValue) {
        if (damageValue >= healthValue) {
            healthValue = 0;
        } else {
            healthValue -= damageValue;
        }
    }

    @Override
    public void attack(Damageable target) {
        target.damage(attackValue);
    }

    public abstract String roar();
}
