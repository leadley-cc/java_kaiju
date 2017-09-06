package com.example.michael.kaijuhomework;

/**
 * Created by michael on 06/09/2017.
 */

public interface UltimateAttacker {
    int getUltimateAttackValue();

    void ultimateAttack(Damageable target);

    int getCooldownCounter();

    void cooldownTick();
}
