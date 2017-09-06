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
    private int cooldownCounter;

    public Vehicle(String type, int healthValue, int attackValue, int ultimateAttackValue) {
        this.type = type;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
        this.ultimateAttackValue = ultimateAttackValue;
        this.cooldownCounter = 0;
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
    public int getCooldownCounter() {
        return cooldownCounter;
    }

    @Override
    public void damage(int damageValue) {
        if (damageValue >= healthValue) {
            healthValue = 0;
            System.out.println(getType() + " is completely destroyed!");
        } else {
            healthValue -= damageValue;
            System.out.println(getType() + " is now on " + getHealthValue() + " health.");
        }
    }

    @Override
    public void attack(Damageable target) {
        System.out.println(getType() + " attacks for " + getAttackValue() + " damage!");
        target.damage(attackValue);
    }

    @Override
    public void ultimateAttack(Damageable target) {
        System.out.println(getType() + " unleashes its ultimate attack for " +
                           getUltimateAttackValue() + " damage!");
        target.damage(ultimateAttackValue);
        cooldownCounter = 1;
    }

    @Override
    public void cooldownTick() {
        System.out.println(getType() + " needs to recharge this turn.");
        cooldownCounter--;
    }
}
