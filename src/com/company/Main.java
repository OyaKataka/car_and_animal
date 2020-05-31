package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog");
        dog.name = "Akita";


        Animal lion = new Animal("lion");
        lion.name = "lion";

        Car gulia = new Car();
        gulia.model = "Gulia 2018";
        gulia.producer = "AlfaRomeo";
        gulia.color = "red";

        Human me = new Human();
        me.fristname = "Patryk";
        me.lastname = "Borsuk";
        me.pet = lion;
        me.auto = gulia;


        me.pet.feed();
        me.pet.feed();
        me.pet.feed();
        me.pet.feed();
        me.pet.feed();
me.pet.takeforwalk();
        me.pet.takeforwalk();
        me.pet.takeforwalk();
        me.pet.takeforwalk();

        System.out.println(me.pet.name);

    }
}
