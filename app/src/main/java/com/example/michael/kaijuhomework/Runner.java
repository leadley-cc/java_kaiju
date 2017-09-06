package com.example.michael.kaijuhomework;

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
    static MobileSAM mobileSAM = new MobileSAM();

    // Buildings
    static Building[] buildings = {
            new Building("Skyscraper", 1000),
            new Building("Landmark", 600),
            new Building("Army Base", 3000)
    };

    public static void main(String[] args) {
        // Battle Commence!
        godzilla.attack(buildings[0]);
        behemoth.attack(godzilla);
        rodan.attack(behemoth);
        mothra.attack(buildings[2]);
        mobileSAM.attack(godzilla);

        godzilla.attack(buildings[2]);
        mothra.attack(buildings[0]);
        rodan.attack(buildings[2]);
        System.out.println("Behemoth misses!");
        mobileSAM.attack(mothra);

        behemoth.attack(rodan);
        godzilla.attack(buildings[1]);
        mothra.attack(behemoth);
        rodan.attack(buildings[2]);
        System.out.println("MobileSAM is charging its ultimate attack!");

        mothra.attack(buildings[2]);
        godzilla.attack(behemoth);
        behemoth.attack(godzilla);
        rodan.attack(buildings[1]);
        mobileSAM.ultimateAttack(rodan);

        mothra.attack(mobileSAM);
        behemoth.attack(mothra);

        mothra.attack(buildings[2]);
        behemoth.attack(mothra);

        System.out.println("\nThe Kaiju are defeated, but at what cost?");
    }
}
