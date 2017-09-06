package com.example.michael.kaijuhomework;

/**
 * Created by michael on 06/09/2017.
 */

public class Rodan extends Kaiju {
    public Rodan() {
        super("Rodan", 1500, 400);
    }

    @Override
    public String roar() {
        return "Graaaaaagh!";
    }

    public String fly() {
        return "Flap! Flap!";
    }
}
