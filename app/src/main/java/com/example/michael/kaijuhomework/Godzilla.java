package com.example.michael.kaijuhomework;

/**
 * Created by michael on 06/09/2017.
 */

public class Godzilla extends Kaiju {
    public Godzilla() {
        super("Godzilla", 1000, 500);
    }

    @Override
    public String roar() {
        return "Skreeeonk!";
    }

    public String move() {
        return "Stomp! Stomp!";
    }
}
