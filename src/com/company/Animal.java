package com.company;

import java.io.File;

public class Animal {
    String name;
    final String species;
    private Double weight;
    File pic;
    static final Double DEFAULT_DOG_WEIGHT = 8.0;
    static final Double DEFAULT_LION_WEIGHT = 180.0;


    public Animal(String species) {
        this.species = species;
        if (species == "dog") {
            this.weight = DEFAULT_DOG_WEIGHT;
        }
        else if (species == "lion"){
            this.weight =DEFAULT_LION_WEIGHT;

        }
    }

    void feed() {
        weight++;
        System.out.println("thx for food bro, my weight is now " + weight);

    }
}
