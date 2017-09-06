package com.example.michael.kaijuhomework;

import java.util.*;
import static java.util.Arrays.asList;

/**
 * Created by michael on 06/09/2017.
 */

public class Runner {
    // Kaiju
    static Godzilla godzilla = new Godzilla();
    static Rodan rodan = new Rodan();
    static Mothra mothra = new Mothra();

    // Military
    static BehemothTank behemoth = new BehemothTank();
    static MobileSAM mobileSAM1 = new MobileSAM();
    static MobileSAM mobileSAM2 = new MobileSAM();

    // Buildings
    static Building[] buildings = {
            new Building("Skyscraper", 1000),
            new Building("Landmark", 600),
            new Building("Army Base", 3000)
    };

    // Starting Lists
    private static final List<Kaiju> kaijuInstancesList =
            asList(godzilla, rodan, mothra);
    private static final List<Vehicle> humanAttackersList =
            asList(behemoth, mobileSAM1, mobileSAM2);
    private static final List<Damageable> humanDefendersList =
            asList(behemoth, mobileSAM1, mobileSAM2, buildings[0], buildings[1], buildings[2]);

    // ArrayLists
    static List<Kaiju> kaijuInstances = new ArrayList<>(kaijuInstancesList);
    static List<Vehicle> humanAttackers = new ArrayList<>(humanAttackersList);
    static List<Damageable> humanDefenders = new ArrayList<>(humanDefendersList);

    // Game State
    static int winningSide = 0;

    public static void main(String[] args) {
        randomBattle();
    }

    private static void randomBattle() {
        do {
            winningSide = randomBattleTurn();
        } while (winningSide == 0);

        switch (winningSide) {
            case 1 :
                System.out.println("\nThe Kaiju have defeated the humans!"); break;
            case 2 :
                System.out.println("\nThe Kaiju are defeated, but at what cost?"); break;
            default:
                System.out.println("\nSomething rather unexpected has occcured.");
        }
    }

    private static int randomBattleTurn() {
        Random random = new Random();

        // Kaiju turn
        Iterator<Kaiju> kaijuItr = kaijuInstances.iterator();
        while (kaijuItr.hasNext()) {
            Kaiju kaiju = kaijuItr.next();
            if (kaiju.getHealthValue() <= 0) {
                kaijuItr.remove();
                continue;
            }
            int choice = random.nextInt(humanDefenders.size());
            Damageable target = humanDefenders.get(choice);
            kaiju.attack(target);
        }

        // Human turn
        Iterator<Damageable> defenderItr = humanDefenders.iterator();
        while (defenderItr.hasNext()) {
            if (defenderItr.next().getHealthValue() <= 0) {
                defenderItr.remove();
            }
        }

        Iterator<Vehicle> attackerItr = humanAttackers.iterator();
        while (attackerItr.hasNext()) {
            Vehicle vehicle = attackerItr.next();
            if (vehicle.getHealthValue() <= 0) {
                attackerItr.remove();
                continue;
            }
            if (kaijuInstances.size() == 0) continue;
            if (vehicle.getCooldownCounter() > 0) {
                vehicle.cooldownTick();
                continue;
            }
            int choice = random.nextInt(kaijuInstances.size());
            Damageable target = kaijuInstances.get(choice);
            int attackRoll = random.nextInt(100);
            if (attackRoll >= 80) {
                vehicle.ultimateAttack(target);
            } else {
                vehicle.attack(target);
            }
        }

        // Check for winners
        if (humanDefenders.size() == 0) return 1;
        if (kaijuInstances.size() == 0) return 2;

        return 0;
    }

    private static void premadeBattle() {
        // Battle Commence!
        godzilla.attack(buildings[0]);
        behemoth.attack(godzilla);
        rodan.attack(behemoth);
        mothra.attack(buildings[2]);
        mobileSAM1.attack(godzilla);

        godzilla.attack(buildings[2]);
        mothra.attack(buildings[0]);
        rodan.attack(buildings[2]);
        System.out.println("Behemoth misses!");
        mobileSAM1.attack(mothra);

        behemoth.attack(rodan);
        godzilla.attack(buildings[1]);
        mothra.attack(behemoth);
        rodan.attack(buildings[2]);
        System.out.println("Mobile SAM is charging its ultimate attack!");

        mothra.attack(buildings[2]);
        godzilla.attack(behemoth);
        behemoth.attack(godzilla);
        rodan.attack(buildings[1]);
        mobileSAM1.ultimateAttack(rodan);

        mothra.attack(mobileSAM1);
        behemoth.attack(mothra);

        mothra.attack(buildings[2]);
        behemoth.attack(mothra);

        System.out.println("\nThe Kaiju are defeated, but at what cost?");
    }
}
