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
        } else if (species == "lion") {
            this.weight = DEFAULT_LION_WEIGHT;

        }
    }

    void takeforwalk() {
        weight--;
        System.out.println("thx for walk bro, my weight is now " + weight);
        if (species == "lion") {
            if (weight < 100) {
                System.out.println("Your pet is death ");
            } else {
                System.out.println("Your pet is live");
            }
        } else {

            if (weight > 8) {
                System.out.println("Your pet is death ");
            } else {
                System.out.println("Your pet is live");
            }
        }
    }


    void feed() {
        weight++;
        System.out.println("thx for food bro, my weight is now " + weight);
        if (species == "lion") {
            if (weight > 184) {
                System.out.println("Your pet is death ");
            } else {
                System.out.println("Your pet is live");
            }
        } else {

            if (weight > 25) {
                System.out.println("Your pet is death ");
            } else {
                System.out.println("Your pet is live");
            }
        }
    }
}
