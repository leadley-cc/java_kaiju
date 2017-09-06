package com.example.michael.kaijuhomework;

/**
 * Created by michael on 06/09/2017.
 */

public class Mothra extends Kaiju {
    public Mothra() {
        super("Mothra", 800, 600);
    }

    @Override
    public String roar() {
        return "Gwoooooosh!";
    }

    public String fly() {
        return "Flap! Flap!";
    }
}
