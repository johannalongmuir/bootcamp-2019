package com.manchesterdigital;

import com.sun.tools.corba.se.idl.InterfaceGen;

public abstract class Animal {

    private Integer age;
    private String gender;
    private Integer weightInLbs;


    public Animal(Integer age, String gender, Integer weightInLbs) {
        this.age = age;
        this.gender = gender;
        this.weightInLbs = weightInLbs;
    }

    // behaviours/actions want class to do
    public void eat() {
        System.out.println("Eating");
    }

    public void sleep (){
        System.out.println("Sleeping...zzz");
    }

    public abstract void move();

}
