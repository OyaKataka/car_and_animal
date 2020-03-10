package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog");
        dog.name = "Akita";


        Animal lion = new Animal("species");
        lion.name = "lion";

        dog.feed();
        Human me = new Human();
        me.fristname = "Patryk";
        me.lastname = "Borsuk";
        me.pet = lion;

        me.pet.feed();

        System.out.println(me.pet.name);

    }
}
