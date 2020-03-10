package com.company;

import java.io.File;

public class Animal {
    String name;
    final String species;
    private Double weight = 30.0;
    File pic;
    static final Double DEFAULT_DOG_WEIGHT = 8.0;


    public Animal(String species) {
        this.species = species;
        if (species == "dog") {
            this.weight = DEFAULT_DOG_WEIGHT;
        }
        else if (species == "lion"){
            this.weight =180.0;

        }
    }

    void feed() {
        weight++;
        System.out.println("thx for food bro, my weight is now " + weight);

    }
}
