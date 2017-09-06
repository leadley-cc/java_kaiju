package com.example.michael.kaijuhomework;

/**
 * Created by michael on 06/09/2017.
 */

public abstract class Vehicle
        implements Damageable, Attacker, UltimateAttacker {

    private String type;
    private int healthValue;
    private int attackValue;
    private int ultimateAttackValue;

    public Vehicle(String type, int healthValue, int attackValue, int ultimateAttackValue) {
        this.type = type;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
        this.ultimateAttackValue = ultimateAttackValue;
    }

    public String getType() {
        return type;
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
    public int getUltimateAttackValue() {
        return ultimateAttackValue;
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

    @Override
    public void ultimateAttack(Damageable target) {
        target.damage(ultimateAttackValue);
    }
}
