package com.manchesterdigital;

import java.util.ArrayList;
import java.util.List;

public class Scratch {

    // public static final String RED_COLOUR = "Red";

    public static void main(String[] args) {
       // System.out.println("Colour " + RED_COLOUR);

        System.out.println(RainbowColours.BLUE.toString());

        System.out.println(Countries.GERMANY.getIsoCode());

        OrderProcessor orderProcessor = new OrderProcessor(OrderStatus.DISPATCHED);

        orderProcessor.printOrderMessage();
        orderProcessor.obtainCurrentOrderStatus();

        // New instance of Dog type - Poodle
        Dog poodle = new Dog(DogSize.SMALL);
        poodle.setHungerLevel(100);
        poodle.hungry();

        // New instance of Dog type - Labrador
        Dog labrador = new Dog(DogSize.LARGE);
        labrador.bark();
        labrador.setHungerLevel(15);
        labrador.setAge(5);
        labrador.hungry();


        // New instance of Person. Spelt ADDRESS WRONG
        Address address = new Address("1st Street", "Manchester", "M23 4TT");
        //Person person = new Person("Jill", "Jones", 34, address);

        //person.printAddress();
        //System.out.println(person.toString());

        //Looking at student extension
        Student student = new Student("Jack", "Smith", 32, address);
        student.setUniversityName("Man Met");
        System.out.println(student);


        Person anotherStudent = new Student("Sonia", "Nothing", 20, address);
        //

        Lights lights = new Lights();
        Fan pelonisFan = new Fan();

        List<Controls> controls = new ArrayList<>();
        controls.add(lights);
        controls.add(pelonisFan);

        // master switch

        for (Controls controllableItem : controls) {
            controllableItem.switchOn();
            controllableItem.switchOff();
        }

        List<Controls> controlsList = new ArrayList<>();

        // Tesla tesla = new Tesla("Red", 5, TransmissionType.AUTO, 1.60d, "Tesla");




    }

}
