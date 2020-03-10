package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog");
        dog.name = "Akita";


        Animal lion = new Animal("lion");
        lion.name = "lion";

        
        Human me = new Human();
        me.fristname = "Patryk";
        me.lastname = "Borsuk";
        me.pet = lion;


        me.pet.feed();
        me.pet.feed();
        me.pet.feed();
        me.pet.feed();

        System.out.println(me.pet.name);

    }
}
